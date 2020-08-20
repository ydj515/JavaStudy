package view;

import java.util.List;
import java.util.stream.IntStream;

import model.Ladder;

public class LadderrGameOutputView {
	
	private final static String TAB = "     ";

	public static void printProcess(int height, List<String> players, Ladder ladder) {
		System.out.println(String.join(TAB, players));
		printLadder(height, ladder);
	}

	private static void printLadder(int height, Ladder ladder) {
		IntStream.range(0, height).forEach(i -> printLine(i, ladder));
	}

	private static void printLine(int i, Ladder ladder) {
		for (int j = 0; j < ladder.getLines().get(i).getPoints().size(); j++) {
			System.out.print(ladder.getLines().get(i).getPoints().get(j));
		}
		System.out.println();
	}
}
