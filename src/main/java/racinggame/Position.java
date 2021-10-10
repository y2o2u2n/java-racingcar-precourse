package racinggame;

import java.util.Objects;

public class Position implements Comparable<Position> {
	private final int value;

	public Position(int value) {
		this.value = value;
	}

	public Position increment(int amount) {
		return new Position(value + amount);
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

	@Override
	public int compareTo(Position position) {
		return Integer.compare(this.value, position.value);
	}
}
