package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RoundRecordsTest {

	@DisplayName("라운드 기록들을 생성할 수 있다.")
	@Test
	void toMessage() {
		// given
		Cars cars1 = new Cars(Arrays.asList(
			new Car("youn", 0),
			new Car("pobi", 0)));

		Cars cars2 = new Cars(Arrays.asList(
			new Car("youn", 1),
			new Car("pobi", 0)));

		// when
		RoundRecords roundRecords = new RoundRecords();
		roundRecords.record(0, cars1);
		roundRecords.record(1, cars2);

		// then
		assertThat(roundRecords.toMessage())
			.isEqualTo(
				"실행 결과"
					+ System.lineSeparator()
					+ "youn : "
					+ System.lineSeparator()
					+ "pobi : "
					+ System.lineSeparator()
					+ System.lineSeparator()
					+ "youn : -"
					+ System.lineSeparator()
					+ "pobi : "
					+ System.lineSeparator()
			);
	}
}
