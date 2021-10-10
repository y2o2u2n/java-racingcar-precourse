package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarsRecord {
	private final List<CarRecord> values;

	public CarsRecord(Cars cars) {
		List<CarRecord> carRecords = new ArrayList<>();

		for (Car car : cars.getValues()) {
			carRecords.add(new CarRecord(car));
		}

		this.values = carRecords;
	}

	public String toMessage() {
		List<String> recordMessages = new ArrayList<>();

		for (CarRecord carRecord : values) {
			recordMessages.add(carRecord.toMessage());
		}

		return String.join(System.lineSeparator(), recordMessages);
	}
}
