package com.scrumcenter.csd.refactoring.simple;

public class Primes {
    public static int[] generate(int maxValue) {
        if (maxValue >= 2) {
            int s = maxValue + 1;
            boolean[] flags = getFlags(s);

            // count the number of primes
            int count = getCount(s, flags);
            int[] primes = getPrimes(count, s, flags);
            return primes;
        } else
            return new int[0];
    }

    private static int[] getPrimes(int count, int s, boolean[] flags) {
        int j;
        int i;
        int[] primes = new int[count];
        // move the primes into the result
        for (i = 0, j = 0; i < s; i++) {
            if (flags[i])
                primes[j++] = i;
        }
        return primes;
    }

    private static int getCount(int s, boolean[] flags) {
        int i;
        int count = 0;
        for (i = 0; i < s; i++) {
            if (flags[i])
                count++; // increase count
        }
        return count;
    }

    private static boolean[] getFlags(int s) {
        boolean[] flags = new boolean[s];
        int i;
        for (i = 0; i < s; i++)
            flags[i] = true;
        flags[0] = flags[1] = false;
        int j;
        for (i = 2; i < Math.sqrt(s) + 1; i++) {
            if (flags[i]) {
                for (j = 2 * i; j < s; j += i)
                    flags[j] = false; // not prime
            }
        }
        return flags;
    }
}