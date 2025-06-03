import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.poll();
    }

    public int top() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
