// Write a java program that will create a thread and set the thread name, display the thread name, get the thread id, check the thread is 
// currently alive or not.

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running....");
    }
}

class Q1_Thread_functions {
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.setName("UserDefinedThread");

        System.out.println("Thread Name: " + x.getName());

        
        System.out.println("Thread ID: " + x.getId());
        System.out.println("Is Thread Alive? " + x.isAlive());
        
        //x.start();

    
        try {
			for(int i=1;i<=5;i++){
				System.out.println(i);
				Thread.sleep(2000);
			}  
        } catch (InterruptedException e) {
            System.out.println("Thread is dead.");
        }
		x.start();
        System.out.println("Is Thread Alive? " + x.isAlive());
    }
}
