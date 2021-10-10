package racinggame;

public class Car {
	private static final int INITIAL_POSITION_VALUE = 0;
	private static final int AMOUNT_OF_POSITION_MOVE = 1;

	private final Name name;
	private Position position;

	public Car(Name name) {
		this.name = name;
		this.position = new Position(INITIAL_POSITION_VALUE);
	}

	public void drive(DrivingStrategy drivingStrategy) {
		if (drivingStrategy.movable()) {
			move();
		}
	}

	private void move() {
		position = position.increment(AMOUNT_OF_POSITION_MOVE);
	}

	public Name getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}
}
