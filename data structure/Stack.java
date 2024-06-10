public class Stack {
    int size, top;
    int[] array;

    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }
    boolean isFull(){
        return (top == size - 1);
    }
    boolean isEmpty(){
        return (top == -1);
    }
    void push(int item){
        if (isFull()) {
            System.out.println("Stack Overflow");
        }else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop(){
        int prevTop = top;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else{
            top--;
            return array[prevTop];
        }
    }
    void printAll(){
        if (isEmpty()) {
            System.out.println("Array is empty");
        } else{
            System.out.println("Elements in the stack are below");
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
}
