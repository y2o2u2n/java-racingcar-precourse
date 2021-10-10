package racinggame;

import java.util.Objects;

public class NumberOfRounds {
	private static final int MIN_NUMBER = 0;
	private static final String MESSAGE_ON_INVALID = "라운드 수는 0보다 같거나 커야 합니다.";

	private final int value;

	public NumberOfRounds(int value) {
		if (!(value >= MIN_NUMBER)) {
			throw new IllegalArgumentException(MESSAGE_ON_INVALID);
		}

		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		NumberOfRounds that = (NumberOfRounds)o;
		return value == that.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
