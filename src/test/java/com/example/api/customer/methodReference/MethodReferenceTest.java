package com.example.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Comparator.comparingInt;

public class MethodReferenceTest {
    class MethodReferenceClass
    {
        Supplier<Date> newDate = Date::new;
        Consumer<String> print = System.out::print;
        Function<Object, String> objectToString = String::valueOf;

        // Integer.parseInt("10") -> 10
        Function<String, Integer> stringToInteger = Integer::parseInt;
        BiFunction<Integer, Integer, Integer> integerMax = Math::max; // input 두개일때 bi

    }
    @Test
    void listSortTest()
    {
        List<String> list = Arrays.asList("apple","orange","kiwi");
        list.sort(comparingInt(String::length)); //String::length = 스트링 길이
        list.forEach(System.out::println);
    }


}
