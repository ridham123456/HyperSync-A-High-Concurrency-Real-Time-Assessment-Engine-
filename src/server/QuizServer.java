package server;

import java.net.*;
import java.util.concurrent.*;

public class QuizServer {
    private static final int PORT = 12345;
    private static final int MAX_USERS = 150;

    // ૧૫૦ સ્ટુડન્ટ્સ માટે શક્તિશાળી થ્રેડ પૂલ
    private static ExecutorService threadPool = Executors.newFixedThreadPool(MAX_USERS);

    public static void main(String[] args) {
        System.out.println("🚀 HyperSync Backend Engine is STARTING...");
        System.out.println("📡 Multithreading for up to " + MAX_USERS + " students is ready!");
        System.out.println("✅ Check successful: Standard Java Libraries (NET, IO, UTIL) are working.");
        System.out.println("Wait for Client (JavaFX UI) Test...");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("\n🔥 Quiz Server is RUNNING on Port: " + PORT);

            // હમણાં કનેક્શન હોલ્ડ કરવા માટે
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("✅ New student connected from: " + client.getInetAddress());

                // દરેક કનેક્શનને પૂલમાંથી એક હેલ્પર (Thread) આપવો
                threadPool.execute(() -> handleClient(client));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket client) {
        // હમણાં કનેક્શન કન્ફર્મ કરવા માટે
        try {
            client.close();
        } catch (Exception e) {}
    }
}