package calleable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {

    public static void main(String args[]){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        executorService.submit(new Callable<>(){
//            public Object call() throws Exception {
//                System.out.println("Asynchronous Callable");
//                return "Callable Result";
//            }
//        });

//        System.out.println("future.get() = " + ((java.util.concurrent.Future) future).get());
    }


}
