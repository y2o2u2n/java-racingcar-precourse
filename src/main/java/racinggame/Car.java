package racinggame;

public class Car {
	private static final int AMOUNT_OF_POSITION_MOVE = 1;

	private final Name name;
	private Position position;

	public Car(Name name, Position position) {
		this.name = name;
		this.position = position;
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
