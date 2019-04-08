import java.rmi.*;

public class Client {
    public static void main(String args[]) {
        try {
            String Serverurl = "rmi://" + args[0] + "/Server";
            ServerIntf intf = (ServerIntf) Naming.lookup(Serverurl);
            String str = "Sample string";
            System.out.println("output from server is :" + intf.upper(str));
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
