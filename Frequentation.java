package gtd;

import java.util.ArrayList;
import java.util.Collections;

public class Frequentation {
	
	/**
	 * retourne le jour de la semaine le moins frequente sur la periode consideree
	 * 
	 * @param journalDesentrees
	 * @return jour le moins frequente sous forme d'entier, -1 si le nombre de visiteurs minimal est superieur a 10 000 000
	 * @throws IllegalArgumentException si le parametre fourni n'implemente pas l'interface JournalInterface
	 */
	public int frequentationMin(JournalInterface journalDesEntrees) throws IllegalArgumentException{
		
		if (!(journalDesEntrees instanceof JournalInterface )) {
				throw new IllegalArgumentException("Parametre invalide");
		}
		
		int jour = -1;
		int nombreVisiteursMin = 10000001;
		
		do {
			
			EntreeJournal entrees = journalDesEntrees.getNextCount();
					
			if (entrees.getNombreVisiteur() < nombreVisiteursMin) {
				
				jour =  journalDesEntrees.getWeekDayFromDate(entrees.getDate());
				nombreVisiteursMin = entrees.getNombreVisiteur();
			}		
					
		} while (journalDesEntrees.hasCountNext());
				
		return jour;
	}
	
	
	/**
	 * Retourne les dates les plus frequentes sous forme d'un tableau de chaines de carcteres, la taille du tableau est definie dans les parametres
	 * 
	 * @param journalDesEntrees
	 * @param nombreDeResultats
	 * @return tableau de chaines de caracteres
	 * @throws IllegalArgumentException si le parametre fourni n'implemente pas l'interface JournalInterface
	 */
	public String[] datesLesPlusFrequentees(JournalInterface journalDesEntrees, int nombreDeResultats) throws IllegalArgumentException{
		
		if (!(journalDesEntrees instanceof JournalInterface )) {
				throw new IllegalArgumentException("Parametre invalide");
		}
		
		ArrayList<EntreeJournal> frequentation = triFrequentation(journalDesEntrees);
		
		String[] datesPlusFrequentees = null;
		
		if (nombreDeResultats > frequentation.size()) { nombreDeResultats = frequentation.size();}
		
		// extraction des dates de frequentation maximale sous forme de tableau
		for (int i=0; i < nombreDeResultats; i++ ) {
			
			datesPlusFrequentees[i] = frequentation.get(i).getDate();
		}		
				
		return datesPlusFrequentees;
	}
	
	private ArrayList<EntreeJournal> triFrequentation(JournalInterface journalDesEntrees) {
		
		// creation d'un objet de type liste
		ArrayList<EntreeJournal> frequentation = new ArrayList<>();
				
		// remplissage de la liste a partir des objets contenues dans le parametre fourni
		do {
					
			EntreeJournal entrees = journalDesEntrees.getNextCount();
			frequentation.add(entrees);				
						
		} while (journalDesEntrees.hasCountNext());
				
		// tri croissant de la liste
		Collections.sort(frequentation);
		
		return frequentation;
	}
	
	/**
	 * retourne le jour de la semaine le moins frequente sur la periode consideree
	 * 
	 * @param journalDesentrees
	 * @return jour le moins frequente sous forme d'entier 
	 * @throws IllegalArgumentException si le parametre fourni n'implemente pas l'interface JournalInterface
	 */
	public int newFrequentationMin(JournalInterface journalDesEntrees) throws IllegalArgumentException{
		
		if (!(journalDesEntrees instanceof JournalInterface )) {
				throw new IllegalArgumentException("Parametre invalide");
		}
		
		ArrayList<EntreeJournal> frequentation = triFrequentation(journalDesEntrees);
		
		int jour = journalDesEntrees.getWeekDayFromDate(frequentation.get(frequentation.size()-1).getDate());
				
		return jour;
	}
}