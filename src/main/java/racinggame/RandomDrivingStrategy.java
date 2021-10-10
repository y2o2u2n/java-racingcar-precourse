package racinggame;

import nextstep.utils.Randoms;

public class RandomDrivingStrategy implements DrivingStrategy {
	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 9;
	private static final int MOVABLE_MIN_NUMBER = 4;

	@Override
	public boolean movable() {
		int number = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
		return number >= MOVABLE_MIN_NUMBER;
	}
}
