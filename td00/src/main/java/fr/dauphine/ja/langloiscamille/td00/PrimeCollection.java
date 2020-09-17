package fr.dauphine.ja.langloiscamille.td00;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection {
	
	public ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		this.numbers=new ArrayList<>();
	}
	
	public void initRandom(int n, int m) {
		Random r = new Random();
		for(int i=0; i<n; i++) {
			this.numbers.add(r.nextInt(m));
		}
	}
	
	public boolean isPrime(int p) {
		if((p==0)||(p==1)||(p==2)) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(p); i++) {
			if(p%i==0) return false;
		}
		return true;
	}
	
	private void printPrimes() {
		int entier;
		ListIterator<Integer> list = this.numbers.listIterator();
		while(list.hasNext()) {
			entier = list.next();
			if(isPrime(entier)) {
				System.out.println(entier);
			}
		}
	}
	
	
    public static void main( String[] args )
    {
    	PrimeCollection pc = new PrimeCollection();
    	pc.initRandom(100, 2000);
    	pc.printPrimes();
    	System.out.println(pc.isPrime(4));
    }
}
