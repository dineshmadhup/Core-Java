/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechat;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame implements Runnable {
  // Text field for chat
  private JTextField jtf = new JTextField();

  // Text field for name
  private JTextField jtfName = new JTextField("Enter a name");

  // Text area to display contents
  private JTextArea jta = new JTextArea();

  // Socket
  private Socket socket;

  // IO streams
  private DataOutputStream outputToServer;
  private DataInputStream inputFromServer;

  public static void main(String[] args) {
    new Client();
  }

  public Client() {
    // Panel p1 to hold the label and text field
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.add(new JLabel("Enter text"), BorderLayout.WEST);
    p1.add(jtf, BorderLayout.CENTER);

    // Panel p2 to hold the label and name field
    JPanel p2 = new JPanel();
    p2.setLayout(new BorderLayout());
    p2.add(new JLabel("Name"), BorderLayout.WEST);
    p2.add(jtfName, BorderLayout.CENTER);

    // Panel p to hold p1 and p2
    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(p1, BorderLayout.SOUTH);
    p.add(p2, BorderLayout.NORTH);

    setLayout(new BorderLayout());
    add(p, BorderLayout.NORTH);
    add(new JScrollPane(jta), BorderLayout.CENTER);
    jtf.addActionListener(new ButtonListener()); // Register listener
    jta.setEditable(false); // Disable editing of chat area
    setTitle("Client");
    setSize(500, 300);
    
    //Added code to notify the server that client quit converstaion
    this.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        String name = jtfName.getText().trim();
        try {
            outputToServer.writeUTF(name + " quit from conversation.");
        } catch (IOException ex) {
            ex.printStackTrace();
          }
        }
    });

    setLocationRelativeTo(null); // Center the frame
    setVisible(true); // It is necessary to show the frame here!

    try {
        // Create a socket to connect to the server
        socket = new Socket("localhost", 8000);

        // Create an input stream to receive data from the server
        inputFromServer = new DataInputStream(socket.getInputStream());

        // Create an output stream to send data to the server
        outputToServer = new DataOutputStream(socket.getOutputStream());

        // Start a new thread for receiving messages
        new Thread(this).start();
    }
//    catch (IOException ex) {
//        jta.append(ex.toString() + '\n');
//    }
    catch (UnknownHostException e) {
        System.err.println("Don't know about host");
    }
    catch (IOException e) {
        System.err.println("Couldn't get I/O for the connection");
    }
    System.out.println("Client Connected");
    
  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        // Get the text from the text field
        String string = jtfName.getText().trim() + ": " + jtf.getText().trim();
        // Send the text to the server
        outputToServer.writeUTF(string);
        // Clear jtf
        jtf.setText("");
      }
      catch (IOException ex) {
        System.err.println(ex);
      }
    }
  }

  // Gets mesages from other clients
  @Override
  public void run(){
      try{
          while(true){
              // Get message
              String text = inputFromServer.readUTF();

              // Display to the text area
              jta.append(text + '\n');
          }
      } catch (IOException ex) {
          System.err.println(ex);
      }
  }
  
}

