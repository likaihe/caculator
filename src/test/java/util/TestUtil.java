package util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class TestUtil {
    public static double randomDouble(int min, int max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    public static double randomDouble() {
        return randomDouble(-10000, 10000);
    }

    public static double randomNonZeroDouble() {
        double r = randomDouble();
        return r == 0 ? randomDouble() : r;
    }

    public static String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122;// letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
