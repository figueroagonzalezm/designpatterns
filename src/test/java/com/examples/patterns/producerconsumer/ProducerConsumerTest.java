package com.examples.patterns.producerconsumer;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest {

    @Test
    public void testProducerConsumer(){
        BlockingQueue<Command> tasks = new ArrayBlockingQueue<>(10);

        Thread producerThread = new Thread(new Producer(tasks));
        Thread consumerThread1 = new Thread(new Consumer(tasks));
        Thread consumerThread2 = new Thread(new Consumer(tasks));

        producerThread.start();
//        consumerThread1.start();
//        consumerThread2.start();

    }
}
