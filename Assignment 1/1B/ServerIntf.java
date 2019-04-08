import java.rmi.*;

public interface ServerIntf extends Remote {
    String upper(String s) throws RemoteException;
}
