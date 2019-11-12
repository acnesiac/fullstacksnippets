
public class EvenOddListSync {

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(print, false), "Odd");
        Thread t2 = new Thread(new TaskEvenOdd(print, true), "Even");
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {
    private final Printer print;
    private final boolean isEvenNumber;

    TaskEvenOdd(Printer print,  boolean isEvenNumber) {
        this.print = print;

        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= 10) {
            if (number %2 == 0) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}

class Printer {
    private volatile boolean isOdd;

    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }

}