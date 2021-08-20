package com.example.api.customer.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    @DisplayName("Stream isEmpty() Count")
    @Test
    void streamIsEmptyTest()
    {
        Stream<String> stream =Arrays.asList("Apple", "Orange", "").stream(); // apple orange kiwi가 계속 도는 거 -> nonblocking
        // String.isEmpty()
        int emptyStrings = (int)stream.filter(String::isEmpty).count();
        assertThat(emptyStrings, is(equalTo(1)));
    }
}
