import java.util.HashMap;

public class RunnableThread implements Runnable {
    int fib = 0;
    int count = 1;
    int currentNum = 1;
    int changeNumber = 0;
    int number1 = MyThread.number;
    int key = number1;
     @Override
    public void run () {
         HashMap <Integer, Integer> hashMap = new HashMap<>();
         System.out.print("Runnable ");
         hashMap.put(number1, 1);
         while (count != number1){
             fib = changeNumber + currentNum;
             key--;
             hashMap.put(key, fib);
             changeNumber = currentNum;
             currentNum = fib;
             count++;
    }

         for (Integer val:hashMap.values()) {
             System.out.print(val+" ");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
}}
