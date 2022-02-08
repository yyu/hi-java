all: Foo Main
	java -cp .:subfolder Main

clean:
	rm subfolder/*.class *.class

Foo: subfolder/Foo.java
	javac $<

Main: Main.java
	javac -cp subfolder $<

