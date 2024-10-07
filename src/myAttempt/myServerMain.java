package myAttempt;
import java.io.*;
import java.net.*;

public class myServerMain {
    

    public static void main(String[] args) throws IOException{
        int port = 5000;
        ServerSocket socket = new ServerSocket(port);


        while(true){
            System.out.println("Waiting for connections");
            Socket conn = socket.accept();
            System.out.println("User connected");
            

        }



    }
}
