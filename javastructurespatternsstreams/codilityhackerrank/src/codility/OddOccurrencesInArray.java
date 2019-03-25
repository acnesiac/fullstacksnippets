package codility;

public class OddOccurrencesInArray {


    public static void main(String args[]){
        Printer p = new Printer();

        ThreadP one = new ThreadP(p);
        ThreadP two = new ThreadP(p);
        new Thread(one);
        new Thread(two);
    }

}

class ThreadP implements Runnable{

    Printer p = null;


    ThreadP( Printer p){
        this.p = p;
    }

    @Override
    public void run() {

    }
}

class Printer {

    public synchronized void even(){

    }

    public synchronized  void odd(){

    }
}