package Lesson13_Multithreading;

public class Example15 {
//    static final Object lock = new Object();
    static final Communication communication = new Communication();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall() {
        synchronized (communication) {
//            System.out.println(this);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

     void skypeCall() {
        synchronized (communication) {
//            System.out.println(this);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

     void whatsAppCall() {
         synchronized (communication) {
//             System.out.println(this);
             System.out.println("WhatsApp call starts");
             try {
                 Thread.sleep(7000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("WhatsApp call ends");
         }
     }

}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Example15().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Example15().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable {
    @Override
    public void run() {
        new Example15().whatsAppCall();
    }
}

class Communication {
//We are using monitor of communication class to synchronize all methods
//In real world tasks, people mostly use bellow mentioned statement for synchronization:
//static final Object lock = new Object();
}
