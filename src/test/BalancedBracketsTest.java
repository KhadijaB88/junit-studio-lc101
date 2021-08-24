package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    // check if only [and] returns true "[]"
    //check if brackets in between return true "[LaunchCode]"
    //check if "Launch[Code]" return true
    //check if "[]LaunchCode" return true
    //check if "[LaunchCode" return false
    //check if "Launch]Code[" return false
    //check if "[" return false
    //check if "][" return false


    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsOnEachSideOfWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void balancedBracketsAtTheStartOfWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void extraBalancedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }


    @Test
    public void BracketAtTheStartOfWordOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void UnBalancedBracketInWordReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void RightAngleBracketOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void LeftAngleBracketOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void OppositeAngleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
