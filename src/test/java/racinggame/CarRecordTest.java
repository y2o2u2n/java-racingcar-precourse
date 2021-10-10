package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarRecordTest {

	@DisplayName("자동차 기록을 생성할 수 있다.")
	@ParameterizedTest
	@CsvSource(value = {"youn,10,youn : ----------", "pobi,2,pobi : --"})
	void toMessage(String name, int position, String message) {
		// given & when
		CarRecord carRecord = new CarRecord(new Car(name, position));

		// then
		assertThat(carRecord.toMessage()).isEqualTo(message);
	}
}
