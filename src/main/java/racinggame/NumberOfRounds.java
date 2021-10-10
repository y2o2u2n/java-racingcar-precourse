package racinggame;

import java.util.Objects;

public class NumberOfRounds {
	private static final int MIN_NUMBER = 0;
	private static final String MESSAGE_ON_NOT_NATURAL_NUMBER = "라운드 수는 자연수여야합니다.";

	private final int value;

	public NumberOfRounds(String numberStr) {
		validate(numberStr);
		this.value = Integer.parseInt(numberStr);
	}

	public int getValue() {
		return value;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object == null || getClass() != object.getClass()) {
			return false;
		}

		NumberOfRounds that = (NumberOfRounds)object;
		return value == that.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	private void validate(String numberStr) {
		try {
			Integer.parseInt(numberStr);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(MESSAGE_ON_NOT_NATURAL_NUMBER);
		}

		if (!(Integer.parseInt(numberStr) >= MIN_NUMBER)) {
			throw new IllegalArgumentException(MESSAGE_ON_NOT_NATURAL_NUMBER);
		}
	}
}
