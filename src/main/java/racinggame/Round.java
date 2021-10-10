package racinggame;

import java.util.Objects;

public class Round {
	private final int value;

	public Round(int value) {
		this.value = value;
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

		Round round = (Round)object;
		return value == round.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
