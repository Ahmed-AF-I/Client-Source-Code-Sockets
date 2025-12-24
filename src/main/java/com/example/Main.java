package com.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String serverIp = "192.168.0.199";
        int port = 7777;

        System.out.println("Connecting to server at " + serverIp + "...");

        try (
            Socket mySocket = new Socket(serverIp, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
            PrintWriter out = new PrintWriter(mySocket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Connected successfully! Type your message (or 'exit' to quit):");

            while (true) {
                System.out.print("You: ");
                String userInput = scanner.nextLine();

                out.println(userInput);

                String response = in.readLine();
                
                if (response == null) {
                    System.out.println("Server disconnected.");
                    break;
                }

                System.out.println("Server: " + response);

                if (response.equalsIgnoreCase("exit") || userInput.equalsIgnoreCase("exit")) {
                    System.out.println("Closing the connection...");
                    break;
                }
            }

        } catch (IOException ex) {
            System.err.println("Network Error: " + ex.getMessage());
        }
    }
}