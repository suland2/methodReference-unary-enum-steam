package com.example.api.customer.lambda;

import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MyFunctionTest {

    @Test
    void main() {
        List<String> list = Arrays.asList("Bithumb", "Company", "Market");
        Function<String, Integer> function = String::length; // 안변해 > 기능
        List<Integer> newList = map(list, function);
        assertThat(newList.get(1), is(equalTo(7)));
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function)
    {
        List<R> newList = new ArrayList<>();
        for(T e: list)
        {
            newList.add(function.apply(e));
        }
        return newList;
    }


}