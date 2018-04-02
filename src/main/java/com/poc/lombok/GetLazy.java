package com.poc.lombok;

import lombok.Getter;

public class GetLazy {
    @Getter(lazy = true)
    private final double[] lazyValue = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }
}
