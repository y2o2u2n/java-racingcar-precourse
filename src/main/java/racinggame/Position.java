package racinggame;

import java.util.Objects;

public class Position {
	private static final int INITIAL_VALUE = 0;

	private int value;

	public Position(int value) {
		this.value = value;
	}

	public void increment() {
		this.value++;
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
		Position position = (Position)o;
		return value == position.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
