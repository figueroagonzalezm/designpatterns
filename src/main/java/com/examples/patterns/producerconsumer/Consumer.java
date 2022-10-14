package com.examples.patterns.producerconsumer;

import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingQueue;

@AllArgsConstructor
public class Consumer implements Runnable {
    private BlockingQueue<Command> tasks;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                Command task = tasks.take();
                task.execute();
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer was interrupted");
            e.printStackTrace();
        }
    }
}
