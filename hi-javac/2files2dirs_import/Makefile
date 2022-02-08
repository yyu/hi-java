all: Foo Main
	java Main

clean:
	rm subfolder/*.class *.class

Foo: subfolder/Foo.java
	javac $<

Main: Main.java
	javac $<

