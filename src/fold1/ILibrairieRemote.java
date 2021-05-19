package fold1;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ILibrairieRemote extends Remote{
    Livre creerLivre(String titre)throws RemoteException;
    float renvoyerPrix(Livre livre)throws RemoteException;
}
