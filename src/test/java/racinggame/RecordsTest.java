package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecordsTest {

	@DisplayName("기록들을 생성할 수 있다.")
	@Test
	void constructor() {
		// given
		Cars cars = new Cars(Arrays.asList(
			new Car("youn", 10),
			new Car("pobi", 2)));

		// when
		Records records = new Records(cars);

		// then
		assertThat(records.toMessage()).isEqualTo("youn : ----------" + System.lineSeparator() + "pobi : --");
	}
}
