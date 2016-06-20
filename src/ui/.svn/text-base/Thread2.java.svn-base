package ui;

public class Thread2 implements Runnable {

    public static FileManagerForm refresh;

    @Override
    public void run() {
        refresh = new FileManagerForm();
        while (true) {
            refresh.update_Table();
            System.out.println("pppp");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {

            }
        }
    }

}
