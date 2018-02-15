import java.net.*;
import java.io.*;
public class server {
    public static void start(int port) {
        ServerSocket MyService = null;
        String line;
        DataInputStream is;
        PrintStream os;
        Socket clientSocket = null;
        try {
            MyService = new ServerSocket(port);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        try {
            //clientSocket = MyService.accept();
            //DataInputStream ins = new DataInputStream(clientSocket.getInputStream());
            while (true) {
                clientSocket = MyService.accept();
                DataInputStream ins = new DataInputStream(clientSocket.getInputStream());     
                //if (ins.readUTF() != null) 
                System.out.println(ins.readUTF());
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
