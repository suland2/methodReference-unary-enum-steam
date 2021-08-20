package com.example.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class LengthOfStringTest {

    @Test
    void main() {
        LengthOfString len = str -> {
            int l = str.length();
            System.out.println("The length of the given String is "+l);
            return l;
        };
        assertThat(len.main("bithumb"), is(equalTo(7)));

    }
}