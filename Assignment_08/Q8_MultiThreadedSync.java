// Write a simple Java thread program to compute the sum of n natural numbers. The program should read 
// the number of threads m and value of n from the user. Each of the threads should add its share of 
// assigned number to a global variable. When all the threads are done, the global variable should contain
// the result. The program should use a Synchronized block to make sure that only one thread is updating 
// the global variable at a given time.

import java.util.*;

class Critical {
    int s = 0, i, global = 0;

    public void sum(int start, int end) {
        try {
            s = 0;
            for (i = start; i <= end; i++) {
                s = s + i;
            }
            Thread.sleep(500);
            global = global + s;
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class ThreadCreate implements Runnable {
    Thread t;
    Critical c;
    int start, end;

    ThreadCreate(Critical c, int start, int end) {
        this.start = start;
        this.end = end;
        this.c = c;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        System.out.println("Thread " + t.getName() + " calculating from " + start + " to " + end);
        synchronized (c) {
            c.sum(start, end);
            System.out.println("Sum of numbers for " + t.getName() + " " + c.s);
        }
    }
}

public class Q8_MultiThreadedSync {
    public static void main(String args[]) {
        Critical c = new Critical();
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter value of n and m");
        n = sc.nextInt();
        m = sc.nextInt();

        int numbersPerThread = n / m;
        int start = 1;
        int end = start + numbersPerThread - 1;

        ThreadCreate[] threadArray = new ThreadCreate[m];
        for (int i = 0; i < m; i++) {
            threadArray[i] = new ThreadCreate(c, start, end);

            start = end + 1;
            end = (i == m - 2) ? n : end + numbersPerThread;
        }

        
        for (ThreadCreate thread : threadArray) {
            try {
                thread.t.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupt ");
            }
        }


        System.out.println("Resulting Sum = " + c.global);
    }
}
      
		
