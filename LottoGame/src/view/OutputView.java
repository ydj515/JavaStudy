package view;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import common.ConstantValue;
import domain.LottoTickets;

import java.util.HashMap;
import java.util.stream.IntStream;

public class OutputView {

    public static void printHowManyTickets(int handMadeTicketNumber, int computerMadeTicketNumber) {
        System.out.println("수동으로 " + handMadeTicketNumber + "장, 자동으로 " + computerMadeTicketNumber + "개를 구매했습니다.");
    }

    public static void printLottoTicket(LottoTickets lottoTickets) {
        lottoTickets.getLottoTickets().forEach(i -> System.out.println(i.getLottoNumbers()));
    }

    public static void printStatistics(HashMap<Integer, Integer> resultHashMap, HashMap<Integer, Integer> prizeMap) {
        System.out.println(ConstantValue.WINNING_STATISTICS);
        System.out.println(ConstantValue.HORIZONTAL_LINE);
        IntStream.range(3, resultHashMap.size() + 3).forEach(i -> System.out.println(i + "개 일치 (" + prizeMap.get(i) + "원)- " + resultHashMap.get(i) + "개"));
    }

    public static void printYield(int purchaseLottoMoney, int prize) {
        System.out.println(String.format(ConstantValue.TOTAL_BENEFIT_MESSAGE_FORMAT, ((float) prize / purchaseLottoMoney) * 100));
    }

}