package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private static final String DELIMITER = ",";

	private final List<Car> values;

	public Cars(String namesWithComma) {
		List<Car> values = new ArrayList<>();

		String[] names = namesWithComma.split(DELIMITER);
		for (String name : names) {
			values.add(new Car(new Name(name)));
		}

		this.values = values;
	}

	public List<Car> getValues() {
		return values;
	}
}
