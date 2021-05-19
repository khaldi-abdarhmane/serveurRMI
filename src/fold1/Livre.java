package fold1;
import java.io.Serializable;
public class Livre implements Serializable {
    private   String titre;
    private float prix;
    public Livre(){
        super();
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public Livre(String titre, float prix) {
        this.titre = titre;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

}
