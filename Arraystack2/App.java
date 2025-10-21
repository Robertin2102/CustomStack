public class App {
    public static void main(String[] args) {
        System.out.println("Hello mundo");
        ArrayStack<Integer> myStack=new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        //imprimen
      myStack.println();
       
        myStack.pop();
        
        myStack.println();
    }
}