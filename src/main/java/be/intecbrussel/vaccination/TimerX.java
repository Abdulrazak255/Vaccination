package be.intecbrussel.vaccination;

public class TimerX extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(15000);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
