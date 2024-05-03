// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
            GenericQueue<Integer> intQueue = new GenericQueue<>();
            intQueue.enqueue(1);
            intQueue.enqueue(2);
            intQueue.enqueue(3);

            System.out.println("Queue: " + intQueue);

            System.out.println("Dequeued: " + intQueue.dequeue());
            System.out.println("Dequeued: " + intQueue.dequeue());

            System.out.println("Queue after dequeuing: " + intQueue);


        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Rahul");
        stringQueue.enqueue("Ajay");
        stringQueue.enqueue("Rohit");

        System.out.println("Queue: " + stringQueue);

        System.out.println("Dequeued: " + stringQueue.dequeue());
        System.out.println("Dequeued: " + stringQueue.dequeue());

        System.out.println("Queue after dequeuing: " + stringQueue);
        }

}