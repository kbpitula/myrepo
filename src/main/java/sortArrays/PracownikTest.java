package sortArrays;

import java.util.Arrays;

public class PracownikTest {
	public static void main(String arg[]) {
		Pracownik krzychu = new Pracownik("Krzysiek", "Nowak", 29000);
		Pracownik kasia = new Pracownik("Kasia", "Kowal", 41212);
		Pracownik jacek = new Pracownik("Jacek", "Kowalski", 12311);
		
		Pracownik[] tab = {krzychu, kasia, jacek};
		
		Komparator komp = new Komparator();
		
		Arrays.sort(tab, komp);
		
		System.out.println("Pracownicy posortowani w zależności od wysokości wynagrodzenia:");
		for(Pracownik p: tab) {
 			System.out.println(p.getImie() + " " + p.getNazwisko());
		}
	}
}
