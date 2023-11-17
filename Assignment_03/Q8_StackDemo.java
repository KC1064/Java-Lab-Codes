//Define a class Stack, which perform the basic operation of stack. Define another driver class to 
//demonstrate the basic operations.
import java.util.*;

class Stack {
    int top = -1;
    int st[];
    int x;

    void push(int arr[], int num) {
        st = arr;
        x = num;
        System.out.printf("Pushed the element: %d\n", num);
        arr[++top] = num;
    }

    void pop(int arr[]) {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.printf("Popped Element: %d\n", arr[top]);
            top--;
        }
    }

  void display(int arr[]) {
    if (top == -1) {
        System.out.println("Stack is empty");
    } 
	else {
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i]+" ");
			System.out.println();
        }
    }
}
}

class Q8_StackDemo {
    public static void main(String args[]) {
        Stack stackObj = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int choice;
        do {
            System.out.println("-------------------");
            System.out.println("Enter your choice:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.println("-------------------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int number = sc.nextInt();
                    stackObj.push(arr, number);
                    break;
                case 2:
                    stackObj.pop(arr);
                    break;
                case 3:
                    stackObj.display(arr);
                    break;
                case 4:
                    System.out.println("EXITING......");
                    break;
                default:
                    System.out.println("INVALID CHOICE...");
            }
        } while (choice != 4);
    }
}
