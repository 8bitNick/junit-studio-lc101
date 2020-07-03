package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void returnsTrueIfSingleBracketsAreBalancedAroundString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void returnsTrueIfMultipleBracketsAreBalancedAroundString () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[test]]]"));
    }

    @Test
    public void returnsFalseIfOnlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    @Test
    public void returnsFalseIfOnlyClosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }

    @Test
    public void returnsFalseIfClosedBracketBeforeOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }
}
