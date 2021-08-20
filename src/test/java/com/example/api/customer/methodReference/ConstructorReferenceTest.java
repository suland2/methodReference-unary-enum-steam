package com.example.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorReferenceTest {

    @Test
    void main() {
        Function<Runnable, Thread> threadGenerator = Thread::new; // input(parameter) return
        Runnable t1 = () -> System.out.println("T1 excuted"); //input
        Runnable t2 = () -> System.out.println("T2 excuted"); //input
        Thread thread1 = threadGenerator.apply(t1); //return
        Thread thread2 = threadGenerator.apply(t2); //return
        thread1.start();
        thread2.start(); // 여기가지가 기존 방식

        threadGenerator
                .apply(()-> System.out.println("T3 excuted"))
                .start(); //이걸해야돼

    }
}