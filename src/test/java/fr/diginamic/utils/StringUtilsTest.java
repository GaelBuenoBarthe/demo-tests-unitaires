package fr.diginamic.utils;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistanceCasNominaux() {
        assertEquals(3, StringUtils.levenshteinDistance("chien", "chiennes"));
        assertEquals(3, StringUtils.levenshteinDistance("barbu", "barbare"));
        assertEquals(3, StringUtils.levenshteinDistance("pizza", "pasta"));
    }

    @Test
    public void testLevenshteinDistanceCasLimites() {
        assertEquals(0, StringUtils.levenshteinDistance("", ""));
        assertEquals(7, StringUtils.levenshteinDistance("", "bonjour"));
        assertEquals(7, StringUtils.levenshteinDistance("bonjour", ""));
        assertEquals(3, StringUtils.levenshteinDistance("pareil", "portail"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistanceParametreNull() {
        StringUtils.levenshteinDistance(null, "test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLevenshteinDistanceDeuxParametresNull() {
        StringUtils.levenshteinDistance(null, null);
    }
}