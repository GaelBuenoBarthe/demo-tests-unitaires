package fr.diginamic.enumerations;

import static org.junit.Assert.*;
import org.junit.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibelleCasNominaux() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    public void testValueOfLibelleCasLimites() {
        assertNull(Saison.valueOfLibelle("printemps"));
        assertNull(Saison.valueOfLibelle("ETE"));
        assertNull(Saison.valueOfLibelle(""));
        assertNull(Saison.valueOfLibelle(null));
        assertNull(Saison.valueOfLibelle("NonExistent"));
    }
}