package TP3;



public class Episode {
	private int numero;
	private int numeroSaison;
	private int duree;
	private String titre;
	
	public Episode(int numeroSaison,int numero,String titre,int duree) {
		
	}

	// Getter
	  public int getNumero() {
	    return numero;
	  }
	  // Setter
	  public void setNumero(int nouvNumero) {
	    this.numero = nouvNumero;
	  }

	  // Getter
	  public int getNumeroSaison() {
	    return numero;
	  }
	  // Setter
	  public void setNumeroSaison(int nouvNumeroSaison) {
	    this.numeroSaison = nouvNumeroSaison;
	  }
	  
	  // Getter
	  public int getDuree() {
	    return duree;
	  }
	  // Setter
	  public void setDuree(int nouvDuree) {
	    this.duree = nouvDuree;
	  }
	  
	  // Getter
	  public String getTitre() {
	    return titre;
	  }
	  // Setter
	  public void setTitre(String nouvTitre) {
	    this.titre = nouvTitre;
	  }
	  
}

	

