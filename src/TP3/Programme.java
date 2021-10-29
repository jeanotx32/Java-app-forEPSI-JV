package TP3;
import java.util.*;
import java.io.*;

public class Programme {
	public static void main(String args[]) {
		//---- series
		Collection maCollection = new Collection();
		Series x = new Series(87739, "Le Jeu de la dame");

		Saison s = new Saison();
		s.addEpisode(new Episode(1, 1, "Ouvertures", 60));
		s.addEpisode(new Episode(1, 2, "Échanges", 60));
		s.addEpisode(new Episode(1, 3, "Pions doublés", 60));
		s.addEpisode(new Episode(1, 4, "Milieu de jeu", 60));
		s.addEpisode(new Episode(1, 5, "Fourchette", 60));
		s.addEpisode(new Episode(1, 6, "Ajournement", 60));
		s.addEpisode(new Episode(1, 7, "Finale", 60));

		x.addSaison(s);
		maCollection.addSerie(x);
		
		// ------ 
		x = new Series(76479, "The Boys");
		s = new Saison();
		s.addEpisode(new Episode(1, 1, "La Règle du jeu", 60));
		s.addEpisode(new Episode(1, 2, "Cerise", 60));
		s.addEpisode(new Episode(1, 3, "Prends ça", 60));
		s.addEpisode(new Episode(1, 4, "La Fille", 60));
		s.addEpisode(new Episode(1, 5, "Des bleus à l'âme", 60));
		s.addEpisode(new Episode(1, 6, "Les Innocents", 60));
		s.addEpisode(new Episode(1, 7, "Question de survie", 60));
		s.addEpisode(new Episode(1, 8, "On ne prend plus de gants", 60));
		x.addSaison(s);

		s = new Saison();
		s.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
		s.addEpisode(new Episode(1, 2, "Préparation propre et planification", 60));
		s.addEpisode(new Episode(1, 3, "La Charge de la brigade légère", 60));
		s.addEpisode(new Episode(1, 4, "Rien de tel dans le monde entier", 60));
		s.addEpisode(new Episode(1, 5, "Quand faut y aller, faut y aller", 60));
		s.addEpisode(new Episode(1, 6, "On ne prend plus de gants", 60));
		s.addEpisode(new Episode(1, 7, "Le Fils du boulanger", 60));
		s.addEpisode(new Episode(1, 8, "Les Innocents", 60));
		x.addSaison(s);

		maCollection.addSerie(x);
		
		
		String lettreReponse;
		Scanner scanner = new Scanner(System.in);
		System.out.println("******************");
		System.out.println("* Ma Serietheque *");
		System.out.println("******************");
		System.out.println("s : Statistiques");
		System.out.println("l : Liste des séries");
		System.out.println("d : Détail d'une série");
		System.out.println("r : Rechercher une série");
		System.out.println("a : Ajouter une série");
		System.out.println("q : Quitter l'application");
		
		lettreReponse = scanner.nextLine();
		
		if(lettreReponse.equalsIgnoreCase("l")) {
			maCollection.getSeries();
			
		}
	}
}
