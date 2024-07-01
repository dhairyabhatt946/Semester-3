import java.util.Scanner;

class Stack {
    int top = -1;
    int size = 0;
    char[] stack;
    
    public Stack(int size) {
        this.size = size;
        stack = new char[size];
    }

    public void push(char ch) {
        if(top >= size-1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = ch;
    }

    public char pop() {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        top--;
        return stack[top+1];
    }
}

public class Lab7_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase().trim();
        if(str.length() % 2 == 0) {
            System.out.println("Invalid String");
            return;
        }
        if(str.charAt(str.length()/2 + 1) != 'c') {
            System.out.println("Invalid String");
            return;
        }
        Stack stack = new Stack(str.length()/2 + 1);
        stack.push('c');
        int index = 0;
        while(str.charAt(index) != 'c') {
            stack.push(str.charAt(index));
            index++;
        }
        index++;
        while(index < str.length()) {
            if(str.charAt(index) != stack.pop()) {
                System.out.println("Invalid String");
                return;
            }
        }
        System.out.println("Valid String");
        sc.close();
    }
}
