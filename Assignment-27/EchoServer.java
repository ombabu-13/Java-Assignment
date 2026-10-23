import java.io.*;
import java.net.*;

public class EchoServer{
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(5001);
            System.out.println("Echo Server waiting...");
            Socket s=ss.accept();
            BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            String msg=in.readLine();
            System.out.println("Client message: "+msg);
            out.println(msg);
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}