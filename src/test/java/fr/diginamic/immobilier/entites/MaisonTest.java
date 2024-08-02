package fr.diginamic.immobilier.entites;

import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Chambre;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaisonTest {

    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();
        Chambre chambre = new Chambre(1, 15.0);
        maison.ajouterPiece(chambre);
        assertEquals(1, maison.getPieces().length);
        assertEquals(chambre, maison.getPieces()[0]);
    }

    @Test
    public void testSuperficieTotale() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(2, 20.0));
        assertEquals(35.0, maison.superficieTotale(), 0.01);
    }

    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(2, 20.0));
        assertEquals(15.0, maison.superficieEtage(1), 0.01);
        assertEquals(20.0, maison.superficieEtage(2), 0.01);
    }

    @Test
    public void testNbPieces() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 15.0));
        maison.ajouterPiece(new Chambre(2, 20.0));
        assertEquals(2, maison.nbPieces());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAjouterPieceNull() {
        Maison maison = new Maison();
        maison.ajouterPiece(null);
    }
}