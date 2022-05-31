package com.examples.designpatterns.producerconsumer;

import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingQueue;

@AllArgsConstructor
public class Producer implements Runnable {
    private BlockingQueue<Command> tasks;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                tasks.put(new Task(i));
                System.out.println("Task " + i + " added to the queue");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
                e.printStackTrace();
            }
        }
    }
}
