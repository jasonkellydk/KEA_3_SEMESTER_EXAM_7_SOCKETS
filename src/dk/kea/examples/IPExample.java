package dk.kea.examples;

import dk.kea.ExampleInterface;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will get the current network IP and print it out";
    }

    @Override
    public String getName()
    {
        return "Network IP example";
    }

    @Override
    public void runExample()
    {
        try {
            System.out.println("Your local address is: " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException exception) {
            System.out.println("Could not get IP");
        }

    }
}
