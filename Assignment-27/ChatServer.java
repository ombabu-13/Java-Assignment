import java.net.*;
import java.io.*;

public class ChatServer{
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(5000);
            System.out.println("Server waiting for client...");
            Socket s=ss.accept();
            System.out.println("Client connected.");
            BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
            String msg;
            while(true){
                msg=in.readLine();
                if(msg.equalsIgnoreCase("bye"))break;
                System.out.println("Client: "+msg);
                System.out.print("Server: ");
                out.println(keyboard.readLine());
            }
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}