package maven;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class MyFirstTest {

    //Create a test method that uses assertEquals or assertNotEquals to verify if
    // the String Codeup is the same as CodeUp.
    @Test
    public void testIfSameString (){
        String expected = "Codeup";
        String actual = "CodeUp";

        assertEquals(expected.toLowerCase(), actual.toLowerCase());
    }


    //Create a test method that uses assertNotSame to verify that the following
    // ArrayLists are not the same:
    @Test
    public void testifSameArrayList (){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    //Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    @Test
    public void testIfArraysEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    //Create a test method that uses both assertFalse and assertTrue to verify the following statements:
    @Test
    public void testIfTrueOrFalse(){
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }









}
