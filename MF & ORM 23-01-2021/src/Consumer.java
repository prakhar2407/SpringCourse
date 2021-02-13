public class Consumer {
    IWorker iWorker;

    public Consumer(IWorker iWorker){
        this.iWorker = iWorker;
    }

    public void takeDellivery(){
        this.iWorker.first();
    }
}
