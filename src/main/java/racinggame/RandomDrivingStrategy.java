package racinggame;

import nextstep.utils.Randoms;

public class RandomDrivingStrategy implements DrivingStrategy {
	private static final int MOVABLE_MIN_NUMBER = 4;

	@Override
	public boolean movable() {
		int number = Randoms.pickNumberInRange(0, 9);
		return number >= MOVABLE_MIN_NUMBER;
	}
}
