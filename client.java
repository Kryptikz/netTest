import java.net.*;
import java.io.*;
public class client {
    private static Socket MyClient;
    public static void connect(String ip, int port) {
        try {
            MyClient = new Socket(ip, port);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void send(String message) {
        PrintStream output;
        try {
            output = new PrintStream(MyClient.getOutputStream());
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
} 