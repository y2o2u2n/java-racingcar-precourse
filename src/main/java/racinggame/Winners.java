package racinggame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Winners {
	private static final String DELIMITER = ",";
	private static final String MESSAGE_FORMAT = "최종 우승자는 %s 입니다";

	private final List<Car> values;

	public Winners(Cars cars) {
		if (cars.isEmpty()) {
			this.values = new ArrayList<>();
			return;
		}

		this.values = getWinners(cars);
	}

	public List<Car> getValues() {
		return values;
	}

	private List<Car> getWinners(Cars cars) {
		Position topPosition = getTopPosition(cars);
		List<Car> winners = new ArrayList<>();

		for (Car car : cars.getValues()) {
			addWinner(car, topPosition, winners);
		}

		return winners;
	}

	private void addWinner(Car car, Position topPosition, List<Car> winners) {
		if (car.getPosition().equals(topPosition)) {
			winners.add(car);
		}
	}

	private Position getTopPosition(Cars cars) {
		List<Position> positions = new ArrayList<>();

		for (Car car : cars.getValues()) {
			positions.add(car.getPosition());
		}

		positions.sort(Comparator.reverseOrder());
		return positions.get(0);
	}

	public String toMessage() {
		List<Name> names = new ArrayList<>();

		for (Car car : values) {
			names.add(car.getName());
		}

		return String.format(MESSAGE_FORMAT, Name.join(DELIMITER, names));
	}
}
