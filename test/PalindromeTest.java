import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private String input;

    @Before
    public void setUp() throws Exception {

        input = null;

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() throws Exception {

        Palindrome.isPalindrome(null);

    }

    @Test
    public void emptyStringTest() throws Exception {

        input = "";

        assertTrue(Palindrome.isPalindrome(input));

    }

    @Test
    public void punctuationTest() throws Exception {

        input = "Eva, can I see bees in a cave?";

        assertFalse(Palindrome.isPalindrome(input));

    }

    @Test
    public void unicodeTest() throws Exception {

        input = "\u20A9 My gym \u20A9";

        assertFalse(Palindrome.isPalindrome(input));

    }

    @Test
    public void validPalindromeTest() throws Exception {

        input = "No lemon no melon";

        assertTrue(Palindrome.isPalindrome(input));
    }

}