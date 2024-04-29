/* The following program reverses an input string using a 
 * stack data strcuture. The input string data is "popped" when the 
 * a new string needs to print in reverse (data from pop returned)
 */

public class Sager_Problem1 {
    static class Stack { //Stack class for implementation
        private char[] array;
        private int top;
        
        public Stack(int capacity) {
            array = new char[capacity];
            top = -1;
        }
        
        public void push(char item) {
            if (top == array.length - 1) {
                System.out.println("Stack is full");
            }
            array[++top] = item; //add item to the top
        }
        
        public char pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return '\0';
            }
            return array[top--]; //return then decrement
        }
        
        public boolean isEmpty() {
            return top == -1;
        }
    }
    
    public static String reverseString(String input) { //reverse string using stack inside
        int length = input.length();
        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }

        char[] reversedArray = new char[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = stack.pop();
        }

        return new String(reversedArray);
    }
    
    public static void main(String[] args) {
        String input = "Go Pokes!";
        System.out.println("Original string: " + input);
        
        String reversedString = reverseString(input);
        
        System.out.println("Reversed string: " + reversedString);
    }
}
