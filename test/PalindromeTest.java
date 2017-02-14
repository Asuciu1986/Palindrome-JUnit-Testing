import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {

        palindrome = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() throws Exception {

        String input = null;

        palindrome.isPalindrome(input.length(), input);

    }

    @Test
    public void emptyStringTest() throws Exception {

        String input = "";

        assertEquals(false, palindrome.isPalindrome(input.length(), input));

    }

    @Test
    public void punctuationTest() throws Exception {

        String input = "`abba`";

        assertEquals(false, palindrome.isPalindrome(input.length(), input));

    }

}