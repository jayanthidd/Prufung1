package at.campus02.musikanten;

public class Hund extends Musikant{
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB,i);
		this.bellLautstaerke = bellLautstaerke;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	@Override
	public String toString() {
		return "Hund" + bellLautstaerke + super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		int v =0;
		if (bellLautstaerke > getInstrument().getLautstaerke()) {
			v = (int) bellLautstaerke;
		}
		else {
			v = (int) getInstrument().getLautstaerke();
		}
		return v;
	}

	@Override
	public double spieleMusik() {
		return (getInstrument().getLautstaerke() + bellLautstaerke)/2;
	}
}
