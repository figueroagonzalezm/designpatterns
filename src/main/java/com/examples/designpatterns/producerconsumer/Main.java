package com.examples.designpatterns.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Command> tasks = new ArrayBlockingQueue<>(10);

        Thread producerThread = new Thread(new Producer(tasks));
        Thread consumerThread1 = new Thread(new Consumer(tasks));
        Thread consumerThread2 = new Thread(new Consumer(tasks));

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();

    }
}
