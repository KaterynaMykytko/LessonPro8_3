package org.courses.ex8_3;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread priorityThread1 = new PriorityThread("firstPriorityThread");
        PriorityThread priorityThread2 = new PriorityThread("tenPriorityThread");
        PriorityThread priorityThread3 = new PriorityThread("fivePriorityThread");

        priorityThread1.setPriority(1);
        priorityThread2.setPriority(10);
        priorityThread3.setPriority(5);

        priorityThread1.start();
        priorityThread2.start();
        priorityThread3.start();
    }
}
