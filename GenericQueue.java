import java.util.ArrayList;

public class GenericQueue<E> {
    private ArrayList<E> queue;

    public GenericQueue() {
        queue = new ArrayList<>();
    }
    public void enqueue(E element) {
        queue.add(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

}