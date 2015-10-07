package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.ActionHandler;

public class RunServer{

    public static void main(String[] args) {
        try {
            //Distributed object
            ActionHandler rmi_obj = new SendMessage();
            // Register the object in the RMI registry
            Registry r = LocateRegistry.getRegistry();
            r.bind("ActionHandler", rmi_obj);
            System.out.println("ActionHandler bound to registry!");
        } catch (Exception e) {
            System.out.println("Start Server error: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
