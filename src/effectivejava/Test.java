package effectivejava;

import java.math.BigInteger;
import java.util.Random;
import java.util.*;
public class Test {
    private static BigInteger bigInteger;

    public enum Rank {
        JACK,
        QUEEN,
        KING
    }

    public static void main(String[] args) {
        bigInteger = BigInteger.probablePrime(3, new Random());
        System.out.println(bigInteger);
        System.out.println(Boolean.valueOf(true) == Boolean.TRUE);
        System.out.println(Boolean.TRUE == Boolean.TRUE);
        System.out.println(Boolean.TRUE);
        System.out.println(EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING));
    }
}
