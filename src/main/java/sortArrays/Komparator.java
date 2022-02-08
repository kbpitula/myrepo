package sortArrays;

import java.util.Comparator;

public class Komparator implements Comparator<Pracownik>{

	@Override
	public int compare(Pracownik o1, Pracownik o2) {
		if (o2 == null) {
			return -1;
		}
		if (o1.getWyplata() < o2.getWyplata()) {
			return 1;
		} else if(o1.getWyplata() > o2.getWyplata()) {
			return -1;
		} else {
			return 0;
		}
	}

}
