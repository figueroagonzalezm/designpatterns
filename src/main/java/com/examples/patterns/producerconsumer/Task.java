package com.examples.patterns.producerconsumer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements Command {

    private int id;

    @Override
    public void execute() {
        String text = Thread.currentThread().getName() + " | Executing task "+ id;
        System.out.println(text);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
