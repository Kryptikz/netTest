import cs1.*;

public class runner {
    public static void main(String[] args) {
        System.out.println("Type 0 for client and 1 for server");
        int choice = Keyboard.readInt();
        if (choice == 0) {
            System.out.println("What IP: ");
            String ip = Keyboard.readString();
            System.out.println("What port: ");
            int port = Keyboard.readInt();
            MyClient.connect(ip, port);
        } else 
        if (choice == 1) {
            System.out.println("What port: ");
            int port2 = Keyboard.readInt();
            server.start(port2);
            int wait = Keyboard.readInt();
        }
    }
}
