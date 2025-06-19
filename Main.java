public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        stack.push(30); 
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}