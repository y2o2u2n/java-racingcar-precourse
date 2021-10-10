package racinggame;

public class CarRecord {
	private static final String MESSAGE_FORMAT = "%s : %s";
	private static final String HYPHEN = "-";

	private final Name name;
	private final Position position;

	public CarRecord(Car car) {
		this.name = car.getName();
		this.position = car.getPosition();
	}

	public String toMessage() {
		return String.format(MESSAGE_FORMAT, name.getValue(), StringUtil.repeat(HYPHEN, position.getValue()));
	}
}
