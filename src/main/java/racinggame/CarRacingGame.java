package racinggame;

import nextstep.utils.Console;

public class CarRacingGame {
	private static final String MESSAGE_ON_BEFORE_INPUT_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String MESSAGE_ON_BEFORE_INPUT_NUMBER_OF_ROUNDS = "시도할 회수는 몇회인가요?";

	private Player player;
	private Cars cars;
	private NumberOfRounds numberOfRounds;

	public void start() {
		prepare();
		play();
		end();
	}

	private void prepare() {
		player = new Player();
		View.out(MESSAGE_ON_BEFORE_INPUT_CAR_NAMES);
		cars = getCarsUntilValid();
		View.out(MESSAGE_ON_BEFORE_INPUT_NUMBER_OF_ROUNDS);
		numberOfRounds = getNumberOfRoundsUntilValid();
	}

	private void play() {
		for (int i = 0; i < numberOfRounds.getValue(); i++) {
			cars.drive(new RandomDrivingStrategy());
			Records records = new Records(cars);
			View.out(records.toMessage());
		}
	}

	private void end() {
		Winners winners = new Winners(cars);
		View.out(winners.toMessage());
	}

	private Cars getCarsUntilValid() {
		Cars cars;
		do {
			cars = getCars();
		} while (cars == null);
		return cars;
	}

	private Cars getCars() {
		try {
			return player.inputCarNames(Console.readLine());
		} catch (BadInputException e) {
			View.out(e);
			return null;
		}
	}

	private NumberOfRounds getNumberOfRoundsUntilValid() {
		NumberOfRounds numberOfRounds;
		do {
			numberOfRounds = getNumberOfRounds();
		} while (numberOfRounds == null);
		return numberOfRounds;
	}

	private NumberOfRounds getNumberOfRounds() {
		try {
			return player.inputNumberOfRounds(Console.readLine());
		} catch (BadInputException e) {
			View.out(e);
			return null;
		}
	}
}
