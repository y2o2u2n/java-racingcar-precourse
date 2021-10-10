package racinggame;

public class StringUtil {
	public static String repeat(String word, int times) {
		StringBuilder builder = new StringBuilder();

		for (int time = 0; time < times; time++) {
			builder.append(word);
		}

		return builder.toString();
	}
}
