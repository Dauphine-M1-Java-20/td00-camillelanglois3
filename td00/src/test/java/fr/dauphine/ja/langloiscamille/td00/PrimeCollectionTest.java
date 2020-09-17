package fr.dauphine.ja.langloiscamille.td00;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPrimeCollection()
    {
        test0IsPrime();
        testTwoIsPrime();
        tes9IsPrime();
    }
    
    public void test0IsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertFalse(pc.isPrime(0));
    }
    
    public void testTwoIsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertFalse(pc.isPrime(2));
    }
    
    public void tes9IsPrime() {
    	PrimeCollection pc = new PrimeCollection();
    	assertFalse(pc.isPrime(9));
    }
}
