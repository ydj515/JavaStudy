package controller;

import domain.LottoTicket;
import domain.LottoTickets;
import domain.Prize;
import domain.Result;
import lottoGame.LottoGameProgress;
import view.InputView;
import view.OutputView;

import java.util.List;

public class LottoController {

    public void run() {

        // 구매금액
        int purchaseLottoMoney = InputView.inputMoney();

        // 수동으로 구매할 티켓 갯수
        int handMadeTicketNumber = InputView.inputHandMadeLottoTicketsNumber();

        // 수동으로 구매하는 티켓 입력
        InputView.inputHandMadeTicketMessage();

        LottoGameProgress lottoGameProgress = new LottoGameProgress(purchaseLottoMoney, handMadeTicketNumber);
        List<LottoTicket> handMadeLottoTickets = lottoGameProgress.getHandMadeLottoTickets();

        // ~개를 구매했습니다
        OutputView.printHowManyTickets(lottoGameProgress.getHandMadeTicketNumber(), lottoGameProgress.getComputerMadeTicketNumber());

        // 자동과 수동으로 뽑은 로또 티켓모두
        LottoTickets lottoTickets = lottoGameProgress.makeLottoTickets(handMadeLottoTickets);

        // 구매 로또 티켓들
        OutputView.printLottoTicket(lottoTickets);

        // 지난주 당첨번호 입력
        List<Integer> lastWeekWinningNumbers = InputView.inputLastWeekWinningNumbers();

        // 보너스볼 추가
        lastWeekWinningNumbers.add(InputView.inputBonusBall());

        Result result = new Result(lottoTickets, lastWeekWinningNumbers);
        Prize prize = new Prize(result.getResult());

        // 당첨 통계
        OutputView.printStatistics(result.getResult(), prize.getPrizeMap());

        // 수익률
        OutputView.printYield(purchaseLottoMoney, prize.getPrize());
    }

}