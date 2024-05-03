// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popping elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Popping elements from stack:");
        Stack<Double> doubleStack = new Stack<>();
        longStack.push(10.5);
        longStack.push(20.5);

        System.out.println("Popping elements from string stack:");
        while (!longStack.isEmpty()) {
            System.out.println(longStack.pop());
        }

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Popping elements from string stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}