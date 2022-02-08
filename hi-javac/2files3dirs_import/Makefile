all: Foo Main
	java Main

Foo: sub/subsub/Foo.java
	javac $<

Main: Main.java
	javac $<

