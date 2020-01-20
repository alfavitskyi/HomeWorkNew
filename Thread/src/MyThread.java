import java.util.Scanner;

public class MyThread extends Thread {
    Scanner sc = new Scanner(System.in);
    int fib = 0;
    int count = 0;
    int currentNum = 1;
    int changeNumber = 0;
    public static int number;

    public int getNumber () {
        return number;
    }

    public void setNumber () {
        this.number = sc.nextInt();
    }



//    public int ask (){
//        System.out.println("Enter your number");
//        int number = sc.nextInt();
//        return number;
//    }

    @Override
    public void run () {
        System.out.println("Enter your number");
        setNumber();
        //int number = sc.nextInt();
        //ask();
        Thread runnableThread = new Thread(new RunnableThread());
        System.out.print("Thread "+currentNum+" ");
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (count != number){
            fib = changeNumber + currentNum;
            System.out.print(fib+" ");

            changeNumber = currentNum;
            currentNum = fib;
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
        runnableThread.start();

    }

}
