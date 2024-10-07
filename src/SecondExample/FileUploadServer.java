package SecondExample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUploadServer {
    //java -cp classes day04.FileUploadServer 3000
    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(args[0]);
        ServerSocket server = new ServerSocket(port);
        System.out.printf("Upload server is listening on port %d \n", port);
        while(true){
            Socket conn = server.accept();
            System.out.println("New connection made");
            
            
        }
    }
    
}
