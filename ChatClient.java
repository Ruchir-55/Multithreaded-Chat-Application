import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private static Socket socket;
    private static PrintWriter out;
    private static BufferedReader in;
    private static BufferedReader userInput;

    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            userInput = new BufferedReader(new InputStreamReader(System.in));
                       // Start a thread to listen for messages from the server
                       Thread listenerThread = new Thread(new MessageListener());
                       listenerThread.start();
           
                       // Main loop to read user input and send messages to the server
                       String message;
                       while (true) {
                           message = userInput.readLine();
                           if (message.equalsIgnoreCase("exit")) {
                               break;
                           }
                           out.println(message); // Send the message to the server
                       }
           
                       // Close connections when finished
                       socket.close();
                       System.out.println("Connection closed.");
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           
    // Listener thread to listen for messages from the server
    static class MessageListener implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = in.readLine()) != null) {
                    System.out.println("Message from server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

           
