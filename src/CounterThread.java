import java.util.List;

public class CounterThread extends Thread{

    private List<String> list;

    public CounterThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                System.out.println("Current size is: " + list.size());
                if (list.size() == 5) {
                    System.out.println("Size is 5, notify");
                    list.notifyAll();
                }
                list.add("hi");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
