import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {
    public ServerImpl() throws RemoteException {
    }

    public String upper(String s) throws RemoteException {
        return s.toUpperCase();
    }
}
