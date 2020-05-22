package at.campus02.musikanten;

public class Katze extends Musikant {
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB,i);
		this.kratzKraft = kratzKraft;
	}

	public double getKratzKraft() {
		return kratzKraft;
	}

	@Override
	public String toString() {
		return "Katze" + kratzKraft + super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		int v = 0;
		if(getAnzahlBeine() == 4)
			v = (int)kratzKraft;
		else if(getAnzahlBeine() == 3)
			v = (int)kratzKraft/2;
		else if(getAnzahlBeine() <=2)
			v=1;
		return v;
	}

	@Override
	public double spieleMusik() {
		return getInstrument().getLautstaerke();
	}
}
