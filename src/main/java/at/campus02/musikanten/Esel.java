package at.campus02.musikanten;

public class Esel extends Musikant{
	protected double trittkraft;
	public Esel(int aB, Instrument i, double trittkraft) 
	{
		super(aB,i);
		this.trittkraft = trittkraft;
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override
	public String toString() {
		return "Esel" + trittkraft + super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		int v = (int)Math.floor(trittkraft * getAnzahlBeine());
		return v;
	}

	@Override
	public double spieleMusik() {
		return getInstrument().getLautstaerke();
	}
}
