package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private static final String DELIMITER = ",";
	private static final int INITIAL_POSITION_VALUE = 0;

	private final List<Car> values;

	public Cars(String namesWithComma) {
		List<Car> values = new ArrayList<>();

		String[] names = namesWithComma.split(DELIMITER);
		for (String name : names) {
			values.add(new Car(new Name(name), new Position(INITIAL_POSITION_VALUE)));
		}

		this.values = values;
	}

	// For Test Code
	Cars(List<Car> values) {
		this.values = values;
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}

	public List<Car> getValues() {
		return values;
	}
}
