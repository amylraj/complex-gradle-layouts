package com.caseoned;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DLibrary {
    private final Random random;

    public DLibrary() {
        random = new Random()
    }

    public List<Integer> generateRandomList(int maxSize) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        int listSize = random.nextInt(maxSize) + 1;
        for (int i = 0; i < listSize; i++) {
            randomNumbers.add(random.nextInt(100));
        }

        return randomNumbers;
    }
}
