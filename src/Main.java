import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("...");
        List<String> list = new ArrayList<String>();
        new WaitThread(list).start();

        Thread.sleep(1000);
        new CounterThread(list).start();
    }
}
