package racinggame;

public class Car {
	private static final int INITIAL_POSITION_VALUE = 0;

	private final Name name;
	private final Position position;

	public Car(Name name) {
		this.name = name;
		this.position = new Position(INITIAL_POSITION_VALUE);
	}

	public Name getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}
}
