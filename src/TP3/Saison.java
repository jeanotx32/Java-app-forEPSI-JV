package TP3;
import java.util.*;
public class Saison {
	int dureeTotale;
	private ArrayList<Episode> listeEpisodes;
	
	public Saison() {
		
		
	}

	
	
	
	public void addEpisode(Episode episode) {
		ArrayList<Episode> listeEpisodes = new ArrayList<Episode>();
		listeEpisodes.add(episode);
		
	}
	
	public int getDureeTotale() {
		
		
		
		
		return dureeTotale;
	}
}
