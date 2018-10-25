package gtd;

public class EntreeJournal implements Comparable<EntreeJournal>{
	
	private String date;
	private int nombreVisiteur;
	
	public EntreeJournal(String date, int nombre) {
		this.date = date;
		this.nombreVisiteur = nombre;
	}

	public String getDate() {
		return date;
	}

	public int getNombreVisiteur() {
		return nombreVisiteur;
	}

	@Override
	public int compareTo(EntreeJournal comparable) {
		
		return this.nombreVisiteur - comparable.nombreVisiteur;
	}	
	
}
