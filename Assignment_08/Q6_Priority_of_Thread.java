// Write a java program that will create two threads. Set the 
// priority to each thread and display it.

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }
	
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

class Q6_Priority_of_Thread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.setPriority(Thread.MIN_PRIORITY); 
        thread2.setPriority(Thread.MAX_PRIORITY); 
        System.out.println(thread1.getName() + " Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());
        thread1.start();
        thread2.start();
    }
}
