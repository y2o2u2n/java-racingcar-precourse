package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Name {
	private static final int MIN_LENGTH = 1;
	private static final int MAX_LENGTH = 5;
	private static final String MESSAGE_ON_NAME_LENGTH_INVALID = "이름은 1자 이상 5자 이하입니다.";

	private final String value;

	public Name(String value) {
		if (value == null || !(value.length() >= MIN_LENGTH && value.length() <= MAX_LENGTH)) {
			throw new IllegalArgumentException(MESSAGE_ON_NAME_LENGTH_INVALID);
		}

		this.value = value;
	}

	public static String join(String delimiter, List<Name> names) {
		List<String> strings = new ArrayList<>();

		for (Name name : names) {
			strings.add(name.getValue());
		}

		return String.join(delimiter, strings);
	}

	public String getValue() {
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

		Name name = (Name)object;
		return Objects.equals(value, name.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
