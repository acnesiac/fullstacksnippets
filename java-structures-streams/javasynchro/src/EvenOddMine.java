public class EvenOddMine {
    public static void main(String... args) {
        PrinterMine print = new PrinterMine();
        Thread t1 = new Thread(new ThreadPrinter(print, 10, true), "Odd");
        Thread t2 = new Thread(new ThreadPrinter(print, 10, false), "Even");
        t1.start();
        t2.start();
    }
}

class ThreadPrinter implements Runnable{
    private final PrinterMine print;
    int max;
    private final boolean isEvenNumber;
    
    public ThreadPrinter(PrinterMine print, int max, boolean isEvenNumber){
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
class PrinterMine{

//    public void printEven(int i ){
//        System.out.println(i);
//    }
//
//    public void printOdd(int i ){
//        System.out.println(i);
//
//    }

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