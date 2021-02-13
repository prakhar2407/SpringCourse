public class Main {
    public static void main(String[] args) {
        IWorker producer = new FastProducer();
        Consumer consumer = new Consumer(producer);
        consumer.takeDellivery();
    }
}
