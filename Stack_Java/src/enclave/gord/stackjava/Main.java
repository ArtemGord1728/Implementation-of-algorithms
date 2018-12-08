package enclave.gord.stackjava;



public class Main
{
    // Test
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.add(4);
        s.add(2);
        s.add(3);
        s.add(3);
        s.printElements();

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(3);
        stack.add(5);
        stack.add(7);
        stack.pop();
        stack.printElements();
    }
}
