package serveur;


import fold1.Libraire;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
public class ServeurRMI {

    public static void main(String[] args )  {
        try {
            LocateRegistry.createRegistry(1099);
            Libraire lib = new Libraire();
            Naming.rebind("REF",lib);
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("le serveur est pret yy");



    }
}
*/
public class ServeurRMI {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);//lancement du RMIRegistry

            Libraire objet=new Libraire();
            Naming.rebind("REF", objet);
            System.out.println("Le serveur est prêt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}