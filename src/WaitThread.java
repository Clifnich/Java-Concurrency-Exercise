import java.util.List;

public class WaitThread extends Thread {

    private List<String> list;

    public WaitThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            try {
                System.out.println("Wait begins");
                list.wait();
                System.out.println("Wait thread is now ended.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
