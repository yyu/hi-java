all: Foo Main
	java Main

clean:
	rm sub/subsub/*.class *.class

Foo: sub/subsub/Foo.java
	javac $<

Main: Main.java
	javac $<

