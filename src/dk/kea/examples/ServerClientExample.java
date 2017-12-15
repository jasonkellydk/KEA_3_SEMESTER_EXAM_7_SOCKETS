package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.ServerClient.Client;
import dk.kea.examples.ServerClient.Server;

import java.io.IOException;

public class ServerClientExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "In this example we will create a server an and client";
    }

    @Override
    public String getName()
    {
        return "Server / Client";
    }

    @Override
    public void runExample()
    {
        Server server = new Server();
        Client client = new Client();

        try {
            server.start();
            client.run();
        } catch (IOException exception) {
            System.out.println("Server client connection failed");
        }
    }
}
