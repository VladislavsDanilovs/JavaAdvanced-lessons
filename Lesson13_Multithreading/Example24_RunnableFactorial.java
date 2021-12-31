package Lesson13_Multithreading;

import java.util.concurrent.*;

public class Example24_RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//        executorService.execute(factorial);
        Future future = executorService.submit(factorial); //Future without generics, because method run() return
        // type is void
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(future.isDone());
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Incorrect number!");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        Example24_RunnableFactorial.factorialResult = result;
    }
}
