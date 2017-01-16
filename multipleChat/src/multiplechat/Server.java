/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechat;
import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dinesh
 */
public class Server extends JFrame {
  // Text area for displaying contents
  private JTextArea jta = new JTextArea();

  // Mapping of sockets to output streams
  private Hashtable outputStreams = new Hashtable();

  // Server socket
  private ServerSocket serverSocket;


  public static void main(String[] args) {
    new Server();
  }
  
  public Server() {
    // Place text area on the frame
    setLayout(new BorderLayout());
    add(new JScrollPane(jta), BorderLayout.CENTER);

    setTitle("MultiThreadServer for Chat Between Multiple Client");
    setSize(500, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); // Center the frame
    setVisible(true); // make the frame visible

    jta.setEditable(false); // Disable editing of server log

    // Listen for connections
    listen();
  }

  private void listen() {
      try {
        // Create a server socket
        serverSocket = new ServerSocket(8000);
        jta.append("Listen and MultiThreadServer started at " + new Date() + '\n');
      }catch(IOException e){
          System.err.println("Could not listen and start server on port: 8000.");
          System.exit(1);
       }
        
      while (true) {
        try{
        //waiting.....
        // Listen for a new connection request
         
        Socket socket = serverSocket.accept();

        // Display the client number
        jta.append("Successful Connection from " + socket + " at " + new Date() + '\n');

        // Create output stream
        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

        // Save output stream to hashtable
        outputStreams.put(socket, outputToClient);
    
        // Create a new thread for the connection
        new ServerThread(this, socket);
        
       
        }catch(IOException ex) {
            System.err.println("Accept Failed! Try Again.");
        }
      }       
  }

  // Used to get the output streams
  Enumeration getOutputStreams(){
      return outputStreams.elements();
  }

  // Used to send message to all clients
  void sendToAll(String message){
      // Go through hashtable and send message to each output stream
      for (Enumeration e = getOutputStreams(); e.hasMoreElements();){
          DataOutputStream dout = (DataOutputStream)e.nextElement();
          try {
              // Write message
              dout.writeUTF(message);
          } catch (IOException ex) {
              System.err.println(ex);
          }
      }
  }
  class ServerThread extends Thread {
      private Server server;
      private Socket socket;

      /** Construct a thread */
      public ServerThread(Server server, Socket socket) {
          this.socket = socket;
          this.server = server;
          start();
      }

      /** Run a thread */
      public void run() {
          try {
              // Create data input and output streams
              DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
              // Continuously serve the client
              while (true) {
                  String string = inputFromClient.readUTF();
                
                  // Send text back to the clients
                  server.sendToAll(string);
                 
                  // Add chat to the server jta
                  jta.append(string + '\n');
                  
              }
          }
          catch(IOException e) {
              System.err.println(e);
          }
      }
  }
}
