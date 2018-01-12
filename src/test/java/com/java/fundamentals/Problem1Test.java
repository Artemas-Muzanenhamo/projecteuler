package com.java.fundamentals;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1Test {

    private Problem1 problem;

    @Before
    public void setup(){
        problem = new Problem1();
    }

    @Test
    public void should_return_sum_of_all_multiple_of_3_and_5(){
        assertThat(23).isEqualTo(problem.getMultiples(3, 5, 10));
        assertThat(2318).isEqualTo(problem.getMultiples(3, 5, 100));
        assertThat(233168).isEqualTo(problem.getMultiples(3, 5, 1000));
    }

}
