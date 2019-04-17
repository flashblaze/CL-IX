## [Tutorial Link 1A](https://www.youtube.com/watch?v=fWKsNYc1dYo)

## [Tutorial Link 1B](https://www.youtube.com/watch?v=IKsHhaI1mdg)

### 1A

1. Compile all files by `javac *.java`
2. Run server by `java TCPserver.java`
3. Run client by `java TCPclient.java`
4. Send message from client to see response from server.

Follow steps 2-4 for UDP

### 1B

1. Create all java files and compile using javac command , it will generate .class files
2. Generate stubs invoking rmic AddServerImpl it will generate AddServerImpl_Stub.class file.
3. Copy AddClient.class, AddServerImpl_Stub.class, and AddServerIntf.class to a directory on the client machine.
4. Copy AddServerIntf.class, AddServerImpl.class, AddServerImpl\_ Stub.class, and AddServer.class to a directory on the server machine.
5. Start the RMI Registry on the Server Machine using rmiregistry
6. Start the Server using java AddServer in new terminal
7. Start the Client java AddClient servername/ip_address 8 9 in new terminal where servername is first arguement and 8 , 9 are second & third arguement respectively.
