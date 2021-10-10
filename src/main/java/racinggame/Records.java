package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Records {
	private static final String NEW_LINE = System.lineSeparator();

	private final List<Record> values;

	public Records(Cars cars) {
		List<Record> records = new ArrayList<>();

		for (Car car : cars.getValues()) {
			records.add(new Record(car));
		}

		this.values = records;
	}

	public String toMessage() {
		List<String> recordMessages = new ArrayList<>();

		for (Record record : values) {
			recordMessages.add(record.toMessage());
		}

		return String.join(NEW_LINE, recordMessages);
	}
}
