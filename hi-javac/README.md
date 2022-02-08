
```
$ ls
Foo.java  Main.java
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

