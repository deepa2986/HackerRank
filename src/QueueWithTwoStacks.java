import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStacks {

    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();

    public void enqueue(int num){
        stackOne.push(num);
    }

    public int dequeue(){
        peek();
        return stackTwo.pop();
    }
    public int peek(){
        if(stackTwo.empty())
            while (!stackOne.empty())
                stackTwo.push(stackOne.pop());
        return stackTwo.peek();
    }
    public boolean isEmpty(){
        return stackOne.empty() && stackTwo.empty();
    }

    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                System.out.println(queue.peek());
            }
        }
        sc.close();
    }
}

