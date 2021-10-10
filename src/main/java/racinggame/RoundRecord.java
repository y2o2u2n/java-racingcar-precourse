package racinggame;

public class RoundRecord {
	private final Round round;
	private final CarsRecord carsRecord;

	public RoundRecord(int round, Cars cars) {
		this.round = new Round(round);
		this.carsRecord = new CarsRecord(cars);
	}

	public String toMessage() {
		return carsRecord.toMessage() + System.lineSeparator();
	}
}
