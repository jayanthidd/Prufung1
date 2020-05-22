package at.campus02.musikanten;

public class Instrument {
	private String name;
	private double lautstaerke;

	public Instrument(String name, double lautstaerke) {
		this.name = name;
		this.lautstaerke = lautstaerke;
	}

	public String getName() {
		return name;
	}

	public double getLautstaerke() {
		return lautstaerke;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLautstaerke(double lautstaerke) {
		this.lautstaerke = lautstaerke;
	}

}
