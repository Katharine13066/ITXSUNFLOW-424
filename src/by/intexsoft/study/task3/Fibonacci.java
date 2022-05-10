package by.intexsoft.study.task3;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, BigInteger> cache = new HashMap<>();
    int counter;

    private BigInteger fibonacci(int n){
        counter++;

        if(n < 2){
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)){
            return cache.get(n);
        } else {
            BigInteger result = fibonacci(n-1).add(fibonacci(n-2));
            cache.put(n, result);
            return  result;
        }
    }

    private void  run(int n){
        System.out.println("Number "+ n + ": " + fibonacci(n));
        System.out.println("Counter: " +counter );
    }

    public  static void main (String[] args){
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(1000);
        long finishTime = System.currentTimeMillis();
        System.out.println("Time: " + (finishTime-startTime) + " ms");
    }


}
