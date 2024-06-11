public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1);
    }
    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow!!!");
        } else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop() {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
        return array[previousTop];
    } 

    // Print items in the stack
    void printItems() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements in the stack are: ");
            printElementsInRecursive(0);
            System.out.println();
        }
    }

    void printElementsInRecursive(int index) {
        if (index > top) {
            return;
        }
        System.out.println(array[index] + " ");
        printElementsInRecursive(index + 1);
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(34);        
        myStack.push(67);        
        myStack.push(10);
        myStack.pop();
        System.out.println(myStack.size);
        myStack.printItems();
    }
}
