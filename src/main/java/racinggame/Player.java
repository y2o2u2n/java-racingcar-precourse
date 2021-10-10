package racinggame;

public class Player {
	Cars inputCarNames(String input) {
		try {
			return new Cars(input);
		} catch (IllegalArgumentException e) {
			throw new BadInputException(e.getMessage());
		}
	}

	public NumberOfRounds inputNumberOfRounds(String input) {
		try {
			return new NumberOfRounds(input);
		} catch (IllegalArgumentException e) {
			throw new BadInputException(e.getMessage());
		}
	}
}
