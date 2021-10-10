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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Round round = (Round)o;
		return value == round.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
