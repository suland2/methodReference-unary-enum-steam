package com.example.api.customer.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class MyPredicateTest {

    @Test
    void test1() {
        List<String> list = new ArrayList<>();
        list.add("Bithumb"); // !empty
        list.add("");
        list.add("KakaoTalk");
        list.add("");
        list.add("Bitcamp");
        Predicate<String> predicate = s -> !s.isEmpty(); //s.isEmpty(); 둘중하나 > 애가 리턴
        List<String> newList = filterList( list, predicate);
        assertThat(newList, is(equalTo(Arrays.asList("Bithumb", "KakaoTalk", "Bitcamp"))));

        Predicate<String> filter = s -> s.contains("Talk"); // talk을 포함하고 있는
        List<String> talkList = filterList( list, filter);
        assertThat(talkList, is(equalTo(Arrays.asList("KakaoTalk"))));

        Predicate<Integer> integerFilter = e -> e % 2 == 0; // 리턴값에 항상 포함되어있어야 || 기능
        List<Integer> intList = Arrays.asList(1,4,6,7,8); //데이터
        List<Integer> evens = filterList( intList, integerFilter);
        assertThat(evens, is(equalTo(Arrays.asList(4,6,8))));


    }
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) //List<T>가 리턴,나가는 애 & <T>는 들어오는 애 || (데이터(속성), 기능(함수))
    {
        List<T> newList = new ArrayList<>();
        for(T str : list)
        {
            if(predicate.test(str))
            {
                newList.add(str);
            }
        }
        return newList;
    }
 }