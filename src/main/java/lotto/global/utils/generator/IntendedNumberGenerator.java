package lotto.global.utils.generator;

import java.util.List;

public class IntendedNumberGenerator implements NumberGenerator {

    private final List<Integer> numbers;

    public IntendedNumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> generate() {
        return numbers;
    }
}
