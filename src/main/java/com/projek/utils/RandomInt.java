package com.projek.utils;

import java.util.Random;
public class RandomInt implements  IRandom{
    @Override
    public String Random() {
        Random rand = new Random();
        int upperbound = 1000000;
        int int_random = rand.nextInt(upperbound);
        return String.valueOf(int_random);
    }
}
