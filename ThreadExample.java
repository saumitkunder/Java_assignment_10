public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String args[]) {
        ThreadExample thread = new ThreadExample();
        thread.start(); // start the thread
        try {
            thread.sleep(1000); // pause the thread for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state: " + thread.getState()); // get the state of the thread
        System.out.println("Thread priority: " + thread.getPriority()); // get the priority of the thread
        thread.setName("Example Thread"); // set the name of the thread
        System.out.println("Thread name: " + thread.getName());
    }
}