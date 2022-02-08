all: Foo Main
	java -cp .:sub Main

clean:
	rm *.class sub/bar/*.class

Foo: sub/bar/Foo.java
	javac $<

Main: Main.java
	javac -cp sub $<

