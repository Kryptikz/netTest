import java.net.*;
import java.io.*;
public class server {
    public static void start(int port) {
        Socket MyService;
        try {
            MyService = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println(e);
        }
        Socket clientSocket = null;
        try {
            clientSocket = MyService.accept();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        while(true) {
            DataInputStream input;
            try {
                input = new DataInputStream(MyService.getInputStream());
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }   
    }
}