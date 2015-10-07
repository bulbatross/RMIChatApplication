package common;

/**
 * Created by bulbatross on 2015-09-29.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ActionHandler extends Remote{

    String getHelp() throws RemoteException;
    public void sendMessage(String msg) throws RemoteException;

    public void registerForNotification(Notifiable n) throws RemoteException;
    public void deRegisterForNotification(Notifiable n) throws RemoteException;
    public String who() throws RemoteException;
    //String setNick(String nickname) throws RemoteException;
}