# Assignment 3

## [Tutorial Link](https://www.youtube.com/watch?v=FRfF3WbkZqQ)

Check java path by typing `which java` and inspect whether `idlj` exists in that directory or not.

Mine was in `/usr/lib/jvm/java-8-openjdk/bin`

Paste the path in `.bashrc` or `.zshrc` like so:
`export $IDL_PATH=/usr/lib/jvm/java-8-openjdk/bin`

Next, type the below commands sequentially to run the code

1. `$IDL_PATH/idlj -fall ReverseModule.idl`
2. `javac *.java ReverseModule/*.java`
3. `orbd -ORBInitialPort 1050&`
4. `java ReverseServer -ORBInitialPort 1050& -ORBInitialHost localhost&`
5. `java ReverseClient -ORBInitialPort 1050 -ORBInitialHost localhost`
6. Type in client to get the result from server.
