package Stack;

import java.util.LinkedList;

/**
 * Created by guangshuozang on 10/8/15.
 */
public class ImplementStackUsingQueues_225 {
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        queue1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=1;i<queue1.size();i++)
            queue1.add(queue1.remove());
        queue1.remove();
    }

    // Get the top element.
    public int top() {
        for(int i=1;i<queue1.size();i++)
            queue1.add(queue1.remove());
        int temp = queue1.remove();
        queue1.add(temp);
        return temp;

    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(queue1.size()==0)
            return true;
        return false;
    }

}
