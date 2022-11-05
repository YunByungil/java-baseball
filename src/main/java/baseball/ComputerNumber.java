package baseball;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;
public class ComputerNumber {

    private List<Integer> computerNumber;

    public ComputerNumber() {
        computerNumber = new ArrayList<>();
    }

    public List<Integer> getComputerNumber() {
        return computerNumber;
    }

    public void makeRandomNumber() {
        Set<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() < SystemMessage.NUMBER_SIZE) {
            int number = Randoms.pickNumberInRange(1, 9);
            numbers.add(number);
        }
        computerNumber = new ArrayList<>(numbers);
    }
}
