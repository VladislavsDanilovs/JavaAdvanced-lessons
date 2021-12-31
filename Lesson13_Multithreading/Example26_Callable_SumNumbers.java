package Lesson13_Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Example26_Callable_SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDivededBy10 = value/10;
        for (int i=0; i<10; i++) {
            long from = valueDivededBy10 * i + 1;
            long to = valueDivededBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);

            /*
            First thread will count from 0 to 100mil.
            When i will be 1, program will count from 101mil. to 200mill. and etc.

            We creating 10 tasks for our ExecutorService, then submiting and getting result
            into futureParSum variable. After that we're inserting this result into ArrayList, which will contains of
            10 different results.
             */
        }
        for(Future<Long> result: futureResults){
            sum+= result.get();
        }
        executorService.shutdown();
        System.out.println("Total sum = " + sum);
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}