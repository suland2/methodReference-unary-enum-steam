package com.example.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
class MathOperationTest {


    @Test
    void main() {
        MathOperation plus = (a,b) -> a+b;
        MathOperation times = (a,b) -> a*b;

        assertThat(plus.main(1,2), is(equalTo(3)));
        assertThat(times.main(2,3), is(equalTo(7)));

    }

}