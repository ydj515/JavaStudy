package lottoGame;

import common.ConstantValue;
import domain.LottoTicket;
import domain.LottoTickets;
import view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LottoGameProgress {

    private int purchaseLottoMoney; // 구매금액
    private int handMadeTicketNumber; // 수동으로 구매할 티켓 갯수
    private int computerMadeTicketNumber; // 자동으로 구매할 티켓 수
    private int totalTicketNumber; // 총 로또표 갯수

    public LottoGameProgress(int purchaseLottoMoney, int handMadeTicketNumber) {
        this.purchaseLottoMoney = purchaseLottoMoney;
        this.handMadeTicketNumber = handMadeTicketNumber;
        setInitGameCondition();
    }

    private void setInitGameCondition() {
        totalTicketNumber = purchaseLottoMoney / ConstantValue.LOTTO_TICKET_PRICE;
        computerMadeTicketNumber = totalTicketNumber - handMadeTicketNumber;
    }

    public int getHandMadeTicketNumber() {
        return handMadeTicketNumber;
    }

    public int getComputerMadeTicketNumber() {
        return computerMadeTicketNumber;
    }

    public LottoTickets makeLottoTickets(List<LottoTicket> handMadeLottoTickets) {
        return new LottoTickets(handMadeLottoTickets, computerMadeTicketNumber);
    }

    public List<LottoTicket> getHandMadeLottoTickets() {
        List<LottoTicket> handMadeLottoTickets = new ArrayList<>();
        IntStream.range(0, handMadeTicketNumber).forEach(i -> handMadeLottoTickets.add(new LottoTicket(InputView.inputHandMadeTicket())));

        return handMadeLottoTickets;
    }
}
