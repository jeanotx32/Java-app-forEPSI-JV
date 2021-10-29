package TP3;
//import java.util.ArrayList;
import java.util.*;

public class Series {
    private int id;
    private String titre;
    private ArrayList<Saison> listSaison;

    public Series (int id, String titre) {
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int nouvId) {
        this.id = nouvId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String nouvTitre) {
        this.titre = nouvTitre;
    }

	public void addSaison(Saison s) {
		ArrayList<Saison> listSaison = new ArrayList<Saison>();
		listSaison.add(s);
		
	}
}