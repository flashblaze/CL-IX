import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerImpl impl = new ServerImpl();
        Naming.rebind("Server", impl);
    }
}
