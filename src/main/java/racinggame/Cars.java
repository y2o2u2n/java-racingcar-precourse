package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final List<Car> values;

	public Cars(String namesWithComma) {
		List<Car> values = new ArrayList<>();

		String[] names = namesWithComma.split(",");
		for (String name : names) {
			values.add(new Car(new Name(name)));
		}

		this.values = values;
	}

	public List<Car> getValues() {
		return values;
	}
}
