package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsRecordTest {

	@DisplayName("자동차들 기록들을 생성할 수 있다.")
	@Test
	void toMessage() {
		// given
		Cars cars = new Cars(Arrays.asList(
			new Car("youn", 10),
			new Car("pobi", 2)));

		// when
		CarsRecord carsRecord = new CarsRecord(cars);

		// then
		assertThat(carsRecord.toMessage()).isEqualTo("youn : ----------" + System.lineSeparator() + "pobi : --");
	}
}
