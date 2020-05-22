package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {
	private ArrayList<Musikant> musicians;

	public Quartett() {
		this.musicians = new ArrayList<>();
	}

	public void add(Musikant m) {
		musicians.add(m);
	}

	public boolean istQuartett()
	{
		if (musicians.size() == 4)
			return true;
		return false;
	}
	
	public int gemeinsamRaeuberVerscheucht()
	{
		int gem = 0;
		for (Musikant m : musicians)
			gem += m.verscheucheRaeuber();
		return gem;
	}

	public double durchschnittlicheLautstaerke()
	{
		double sum = 0;
		for (Musikant m : musicians)
			sum += m.spieleMusik();
		return sum / musicians.size();
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{ 
		ArrayList<Musikant> loud = new ArrayList<>();
		for (Musikant m : musicians){
			if (m.spieleMusik() >= von && m.spieleMusik() <= bis)
				loud.add(m);
		}
		return loud;
	}
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		HashMap<Integer, Integer> legsCount = new HashMap<>();
		for (Musikant m : musicians){
			if (legsCount.containsKey(m.getAnzahlBeine())){
				Integer animalcount = legsCount.get(m.getAnzahlBeine())+1;
				legsCount.put(m.getAnzahlBeine(), animalcount);
			}
			else {
				legsCount.put(m.getAnzahlBeine(), 1);
			}
		}
		return legsCount;
	}
	public void printLautStaerkeAbsteigend()
	{
		Collections.sort(musicians,new LautstaerkeComparator());
		System.out.println(musicians);
	}
}
