all: Foo Main
	java -cp .:subfolder Main

Foo: subfolder/Foo.java
	javac $<

Main: Main.java
	javac -cp subfolder $<

