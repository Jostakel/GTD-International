package gtd;

public class Abreviation {
	
	/**
	 * abrege un mot en indiquant le nombre de lettre contenues dans celui-ci moins deux encadre par la premiere et la derniere lettre du mot 
	 * 
	 * @param motComplet
	 * @return motAbrege si mot complet > 2 sinon @return motComplet
	 */
	
	public String abreger(String motComplet) {
		
		motComplet = motComplet.trim();
		
		// Si le mot fait 2 lettres ou moins, on retourne le mot
		if (motComplet.length() <= 2) {
		
			return motComplet;
		} else {
			String motAbrege = motComplet.charAt(0) + String.valueOf(motComplet.length() - 2) + motComplet.charAt(motComplet.length()-1);
			return motAbrege;
		}	
	}

}
