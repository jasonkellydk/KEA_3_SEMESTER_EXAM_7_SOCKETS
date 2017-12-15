package dk.kea.examples.ServerClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server extends Thread
{
    private final int Port = 9090;

    public void run()
    {
        try {
            startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Runs the server.
     */
    public void startServer() throws IOException
    {
        ServerSocket listener = new ServerSocket(getPort());

        Socket socket = listener.accept();

        while (true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String output = input.readLine();

            System.out.println("From client: " + output);
        }
    }

    public int getPort() {
        return this.Port;
    }
}
