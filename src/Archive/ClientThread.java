package Archive;

import java.security.SecureRandom;

public class ClientThread implements Runnable {

    private String message;
    public ClientThread(String msg){
        message = msg;
    }

    @Override
    public void run(){
        //Thread body
        System.out.printf("%s \n",message);
        String threadName = Thread.currentThread().getName();
        int sleepTime = (new SecureRandom().nextInt(5) + 1);
        try{
            Thread.sleep(sleepTime + 1000);

        }catch(InterruptedException ex){ }
        System.out.printf("Thread %s", threadName);
    }
    
}
