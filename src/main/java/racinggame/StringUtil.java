package racinggame;

public class StringUtil {
	public static String repeat(String word, int times) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < times; i++) {
			builder.append(word);
		}

		return builder.toString();
	}
}
