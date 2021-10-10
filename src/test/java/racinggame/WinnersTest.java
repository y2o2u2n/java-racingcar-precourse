package racinggame;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnersTest {

	@DisplayName("우승자들을 추려낼 수 있다.")
	@Test
	void getWinners() {
		// given
		Cars cars = new Cars(
			Arrays.asList(
				new Car("pobi", 7),
				new Car("crong", 7),
				new Car("honux", 5)
			)
		);

		// when
		Winners winners = new Winners(cars);

		// then
		assertAll(
			() -> assertThat(winners).isNotNull(),
			() -> assertThat(winners.getValues()).hasSize(2),
			() -> {
				List<Name> names = new ArrayList<>();
				for (Car car : winners.getValues()) {
					names.add(car.getName());
				}
				assertThat(names).isEqualTo(Arrays.asList(new Name("pobi"), new Name("crong")));
			}
		);
	}

}
