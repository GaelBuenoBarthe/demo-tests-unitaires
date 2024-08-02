package fr.diginamic.immobilier.entites;

public class Maison {

	private Piece[] pieces = new Piece[0];

	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			throw new IllegalArgumentException("La pièce ne peut pas être nulle");
		}
		Piece[] newPieces = new Piece[pieces.length + 1];
		System.arraycopy(pieces, 0, newPieces, 0, pieces.length);
		newPieces[pieces.length] = piece;
		pieces = newPieces;
	}

	public double superficieEtage(int etage) {
		double superficie = 0;
		for (Piece piece : pieces) {
			if (piece.getNumEtage() == etage) {
				superficie += piece.getSuperficie();
			}
		}
		return superficie;
	}

	public int nbPieces() {
		return pieces.length;
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public double superficieTotale() {
		double superficie = 0;
		for (Piece piece : pieces) {
			superficie += piece.getSuperficie();
		}
		return superficie;
	}
}