## [Tutorial Link 1A](https://www.youtube.com/watch?v=fWKsNYc1dYo)

## [Tutorial Link 1B](https://www.youtube.com/watch?v=IKsHhaI1mdg)

### 1A

1. Compile all files by `javac *.java`
2. Run server by `java TCPserver.java`
3. Run client by `java TCPclient.java`
4. Send message from client to see response from server.

Follow steps 2-4 for UDP

### 1B

1. Create all java files and compile using `javac *.class`
2. Generate stubs invoking `rmic ServerImpl` it will generate **ServerImpl_Stub.class** file.
3. Copy **Client.class**, **ServerImpl_Stub.class**, and **ServerIntf.class** to a directory on the client machine.
4. Copy **ServerIntf.class**, **ServerImpl.class**, **ServerImpl_Stub.class**, and **Server.class** to a directory on the server machine.
5. Start the RMI Registry on the Server Machine using `rmiregistry`
6. Start the Server using `java Server` in new terminal
7. Start the Client `java Client servername/ip_address 8 9` in new terminal where **servername** is first arguement and **8** , **9** are second & third arguement respectively.
