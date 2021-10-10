package racinggame;

import java.util.ArrayList;
import java.util.List;

public class RoundRecords {
	private static final String MESSAGE_TITLE = "실행 결과";

	private final List<RoundRecord> values;

	public RoundRecords() {
		this.values = new ArrayList<>();
	}

	public void record(int round, Cars cars) {
		values.add(new RoundRecord(round, cars));
	}

	public String toMessage() {
		List<String> roundRecordMessages = new ArrayList<>();

		for (RoundRecord roundRecord : values) {
			roundRecordMessages.add(roundRecord.toMessage());
		}

		return MESSAGE_TITLE + System.lineSeparator() + String.join(System.lineSeparator(), roundRecordMessages);
	}
}
