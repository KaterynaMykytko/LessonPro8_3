package org.courses.ex8_3;

public class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            System.out.println("i = " + i + " " + Thread.currentThread().getName());
        }
    }
}
