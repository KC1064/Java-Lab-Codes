// Write a Java thread program to search the minimum number in a given array. The program should read 
// the number of elements in the array, number of threads to be created and the array elements from the 
// user. Each thread should find minimum element in an assigned block of elements and compare to global 
// minimum element. When all the threads are done, the global variable should contain the minimum element.
// It should use a Synchronized block to make sure that only one thread is updating the global minimum 
// variable at any given time

import java.util.Scanner;

class Minimum {
    int gmin, n;
    int a[];
    Scanner sc;

    Minimum(int n) {
        this.n = n;
        a = new int[n];
        sc = new Scanner(System.in);
    }

    public synchronized void findMin(int start, int end) {
        System.out.println("Enter array elements for thread " + Thread.currentThread().getName());
        for (int i = start; i < end; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[start];
        for (int i = start + 1; i < end; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        if (min < gmin) {
            gmin = min;
        }

        System.out.println("Minimum value in " + Thread.currentThread().getName() + " is " + min);
    }
}

class ThreadArray implements Runnable {
    Thread t;
    Minimum b;
    int start, end;

    ThreadArray(Minimum c, int start, int end) {
        this.start = start;
        this.end = end;
        b = c;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (b) {
            b.findMin(start, end);
        }
    }
}

class SynchArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, numThreads;
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the number of threads: ");
        numThreads = sc.nextInt();

        Minimum mn = new Minimum(n);
        //mn.gmin = Integer.MAX_VALUE;

        int elementsPerThread = n / numThreads;
        int start = 0;
        int end = start + elementsPerThread;

        ThreadArray[] threadArray = new ThreadArray[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threadArray[i] = new ThreadArray(mn, start, end);

            start = end;
            end = (i == numThreads - 2) ? n : end + elementsPerThread;
        }

        for (ThreadArray thread : threadArray) {
            try {
                thread.t.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupt ");
            }
        }

        System.out.println("Minimum element from the threads = " + mn.gmin);
    }
}
