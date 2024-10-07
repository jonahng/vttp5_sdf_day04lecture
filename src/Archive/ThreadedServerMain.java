package Archive;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedServerMain {
    public static void main(String[] args){
        ExecutorService thrPool =  Executors.newFixedThreadPool(2);
        for(int i = 0; i<10; i++){
            System.out.println(">>Creating Thread");
            ClientThread t = new ClientThread("number"+ i);
            thrPool.submit(t);

        }


       
    }
    
}
