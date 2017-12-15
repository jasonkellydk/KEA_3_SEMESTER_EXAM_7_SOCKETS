package dk.kea.examples.ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client
{
    private final int Port = 9090;

    public void run() throws IOException
    {
        String ip = InetAddress.getLocalHost().getHostAddress();

        Socket socket = new Socket(ip, getPort());

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Type your client message:");
        System.out.println();

        while (true) {
            Scanner sc = new Scanner(System.in);
            String messageFromClient = sc.next();

            out.println(messageFromClient);
        }
    }

    public int getPort()
    {
        return Port;
    }
}
