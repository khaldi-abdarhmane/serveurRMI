package fold1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

public class Libraire extends UnicastRemoteObject implements ILibrairieRemote

{



    public Libraire() throws RemoteException {
        super();
        remplire();
    }

    @Override
    public Livre creerLivre(String titre) throws RemoteException {
        return new Livre(titre);
    }


    @Override
    public float renvoyerPrix(Livre livre) {
        return prixLivre(livre);
    }



         private   Set<Livre> livres =new HashSet<Livre>();
         public Void remplire() {
            for (int i = 0; i < 100; i++) {
                 String titre ="/khaldi/"+ (i/10)  +"/abdarhmane/" + i%10 +"/"+ i;
                 float prix= i+15;
                 livres.add(new Livre(titre,prix));

            }


            return null;
        }
         public float prixLivre(Livre livre ) {
            for (Livre l:livres){
                if(l.getTitre().equals(livre.getTitre()))
                    return l.getPrix();

            }
          return -1;
        }




}
/*
public class Librairie extends UnicastRemoteObject implements
        ILibrairieRemote {
    public Librairie() throws RemoteException {
        super();
    }
    @Override
    public float renvoyerPrix(Livre livre)throws RemoteException
    {

        Set<Livre> livres=new HashSet<Livre>();
        String titre = "java";
        float prix=12300;
        Livre livreDispo1=new Livre(titre,prix);
        livres.add(livreDispo1);
        titre = "eclipse";
        prix=45000;
        Livre livreDispo2=new Livre(titre,prix);
        livres.add(livreDispo2);
        titre = "PHP";
        prix=8900;
        Livre livreDispo3=new Livre(titre,prix);
        livres.add(livreDispo3);
        for (Livre l:livres){if (l.getTitre().equals(livre.getTitre()))
            prix=l.getPrix();
        }

        return prix;

    }
    @Override
    public Livre creerLivre(String titre) throws RemoteException{
        return (new Livre(titre));
    }
}*/