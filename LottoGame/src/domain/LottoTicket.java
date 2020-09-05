package domain;

import common.RandomLottoNumberGenerator;

import java.util.List;

public class LottoTicket {

    private RandomLottoNumberGenerator randomLottoNumberGenerator;
    private List<Integer> lottoNumbers;

    public LottoTicket() {
        randomLottoNumberGenerator = new RandomLottoNumberGenerator();
        createLottoTicket();
    }

    public LottoTicket(List<Integer> handlottoNumbers) {
        this.lottoNumbers = handlottoNumbers;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    private void createLottoTicket() {
        lottoNumbers = randomLottoNumberGenerator.createLottoNumbers();
    }
}