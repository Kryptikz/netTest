import java.io.*;
import java.net.*;
import cs1.*;
public class MyClient {
    public static void connect(String ip, int port) {
 
        Socket mainSocket = null;  
        DataOutputStream os = null;
        DataInputStream is = null;
 
        try {
            mainSocket = new Socket(ip, port);
            os = new DataOutputStream(mainSocket.getOutputStream());
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }
        System.out.println("What message do you want to send");
        String message = Keyboard.readString();
        try {
            //DataOutputStream dOut = new DataOutputStream(mainSocket.getOutputStream());
            while(true) {
                message = Keyboard.readString();
                os.writeUTF(message);
                os.flush();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }           
}
