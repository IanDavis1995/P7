package edu.ceg3900.ian;

import java.io.IOException;

/**
 * Entry-point into the application, start and run the dispatch server.
 */
public class Main {
    public static void main(String[] args) {
        DispatchServer server;
        try {
            server = new DispatchServer();
        } catch (IOException err) {
            err.printStackTrace();
            System.exit(1);
            return;
        }

        server.run();

        System.exit(0);
    }
}
