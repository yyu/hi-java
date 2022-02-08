
```
$ tree
.
├── Foo.java
└── Main.java

0 directories, 2 files
$ cat Foo.java
public class Foo {
    public static int add(int i, int j) {
        return i + j;
    }
}
$ cat Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("blah");
        System.out.println(Foo.add(2, 3));
    }
}
$ javac Main.java && java Main
blah
5
```

```
$ tree
.
├── Main.java
└── subfolder
    └── Foo.java

1 directory, 2 files
$ cat subfolder/Foo.java
public class Foo {
    public static int add(int i, int j) {
        return i + j;
    }
}
$ cat Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("blah");
        System.out.println(Foo.add(2, 3));
    }
}
$ javac subfolder/Foo.java         ## this line compiles Foo.java, nothing fancy
$ javac -cp subfolder Main.java    ## this line compiles Main.java, note the use of "-cp" aka "-classpath"
$ java -cp .:subfolder Main        ## this line runs Main.java, note we used "-cp" again
blah
5
```

```
$ tree
.
├── Main.java
└── subfolder
    └── Foo.java

1 directory, 2 files
$ cat subfolder/Foo.java 
package subfolder;

public class Foo {
    public static int add(int i, int j) {
        return i + j;
    }
}

$ cat Main.java 
import subfolder.Foo;

public class Main {
    public static void main(String[] args) {
        System.out.println("blah");
        System.out.println(subfolder.Foo.add(2, 3));
    }
}

$ javac subfolder/Foo.java
$ javac Main.java
$ java Main
blah
5
```

```
$ tree
.
├── Main.java
└── sub
    └── subsub
        └── Foo.java

2 directories, 2 files
$ vimcat sub/subsub/Foo.java 
package sub.subsub;

public class Foo {
    public static int add(int i, int j) {
        return i + j;
    }
}

$ vimcat Main.java 
import sub.subsub.Foo;

public class Main {
    public static void main(String[] args) {
        System.out.println("blah");
        System.out.println(Foo.add(2, 3));
    }
}

$ javac sub/subsub/Foo.java
$ javac Main.java 
$ java Main
blah
5
```
