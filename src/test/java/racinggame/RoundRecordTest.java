package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RoundRecordTest {
	@DisplayName("라운드 기록을 생성할 수 있다.")
	@Test
	void toMessage() {
		// given
		Cars cars = new Cars(Arrays.asList(
			new Car("youn", 1),
			new Car("pobi", 0)));

		// when
		RoundRecord roundRecord = new RoundRecord(0, cars);

		// then
		assertThat(roundRecord.toMessage())
			.isEqualTo(
				"youn : -"
					+ System.lineSeparator()
					+ "pobi : "
					+ System.lineSeparator()
			);
	}
}
