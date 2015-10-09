package Stack;

import java.util.Stack;

/**
 * Created by guangshuozang on 10/8/15.
 */
public class ImplementQueueWithStacks_232 {
    Stack<Integer> d1 = new Stack();
    Stack<Integer> d2 = new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        d1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!d1.empty()){
            d2.push(d1.pop());
        }
        d2.pop();
        while(!d2.empty()){
            d1.push(d2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(!d1.empty()){
            d2.push(d1.pop());
        }
        int temp = d2.pop();
        d1.push(temp);
        while(!d2.empty()){
            d1.push(d2.pop());
        }
        return temp;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return d1.empty();
    }
}
