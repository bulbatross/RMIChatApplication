package common; /**
 * Created by bulbatross on 2015-09-30.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Notifiable extends Remote {

    public void notifyNewMessage(String msg) throws RemoteException;
    public void setNick(String nick) throws RemoteException;
    public String getNick() throws  RemoteException;
    public String getIP() throws RemoteException;

}