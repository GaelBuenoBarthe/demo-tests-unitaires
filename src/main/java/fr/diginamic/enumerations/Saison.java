package fr.diginamic.enumerations;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public static Saison valueOfLibelle(String libelle) {
		if (libelle == null) {
			return null;
		}
		for (Saison saison : Saison.values()) {
			if (libelle.equals(saison.getLibelle())) {
				return saison;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return ordre + ". " + libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}
}