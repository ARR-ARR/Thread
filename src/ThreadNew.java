import java.sql.SQLOutput;

public class ThreadNew extends Thread {

    @Override
    public void run() {

        System.out.println("Something's going on");


        try {
            Thread.sleep(90000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is finished");
    }
}
