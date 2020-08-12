package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Result {
    private final int MATCH_THREE = 3;
    private final int MATCH_FOUR = 4;
    private final int MATCH_FIVE = 5;
    private final int MATCH_SIX = 6;
    private LottoTickets lottoTickets;
    private List<Integer> lastWeekWinningNumbers;
    private List<Integer> resultList;
    private HashMap<Integer, Integer> resultHashMap;

    public Result(LottoTickets lottoTickets, List<Integer> lastWeekWinningNumbers) {
        this.lottoTickets = lottoTickets;
        this.lastWeekWinningNumbers = lastWeekWinningNumbers;
        resultList = new ArrayList<>();
        resultHashMap = new HashMap<>();
        checkSum();
    }

    private void checkSum() {
        IntStream.range(0, lottoTickets.getLottoTickets().size()).forEach(i -> { // 로또 티켓 갯수
            int howManyMatch = 0;
            for (int j = 0; j < 6; j++) {
                if (lastWeekWinningNumbers.contains(lottoTickets.getLottoTickets().get(i).getLottoNumbers().get(j))) {
                    howManyMatch++;
                }
            }
            resultList.add(howManyMatch);
        });

        getPrize();
    }

    private void getPrize() {
        resultHashMap.put(MATCH_THREE, (int) resultList.stream().filter(i -> (i == 3)).count());
        resultHashMap.put(MATCH_FOUR, (int) resultList.stream().filter(i -> (i == 4)).count());
        resultHashMap.put(MATCH_FIVE, (int) resultList.stream().filter(i -> (i == 5)).count());
        resultHashMap.put(MATCH_SIX, (int) resultList.stream().filter(i -> (i == 6)).count());
    }

    public HashMap<Integer, Integer> getResult() {
        return resultHashMap;
    }

}