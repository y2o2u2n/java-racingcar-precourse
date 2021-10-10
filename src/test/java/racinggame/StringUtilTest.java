package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilTest {

	@DisplayName("문자열을 반복할 수 있다.")
	@ParameterizedTest
	@CsvSource(value = {"a,2,aa", "-,5,-----"})
	public void repeat(String word, int times, String expected) {
		Assertions.assertThat(StringUtil.repeat(word, times)).isEqualTo(expected);
	}
}
