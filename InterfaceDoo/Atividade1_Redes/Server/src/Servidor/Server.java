package Servidor;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server extends Thread {

    public static final String MCAST_ADDR = "230.1.1.1";//dir class D valida, grupo al que nos vamos nos unir
    public static final int MCAST_PORT = 4000;
    public static final int DGRAM_BUF_LEN = 4000;
    private ArrayList<String> contatos;

    public void run() {
        contatos = new ArrayList();
        String msg = "";
        InetAddress group = null;
        try {
            group = InetAddress.getByName(MCAST_ADDR);	
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.exit(1);
        }
        for (;;) {
            try {
                MulticastSocket socket = new MulticastSocket(MCAST_PORT);
                socket.joinGroup(group);
                
                //Espera para receber os dados de algum cliente
                
                byte[] buf = new byte[DGRAM_BUF_LEN];
                DatagramPacket recv = new DatagramPacket(buf,buf.length);
                socket.receive(recv);
                byte [] data = recv.getData();
                msg = new String(data);
                System.out.println("Dados recebidos: " + msg);
                
                if(msg.contains("<inicio>")){
                    msg = msg.substring(8);
                    String nome = "";
                    int i = 0;
                    while(Character.isLetter(msg.charAt(i))){
                        nome = nome + msg.charAt(i);
                        i++;
                    }
                    contatos.add(nome);
                    String cont = "Usuario: " + contatos.toString();
                    //Envio dos contatos
                    System.out.println("Enviando: " + cont);
                    DatagramPacket packet = new DatagramPacket( cont.getBytes(), cont.length(), group, MCAST_PORT);
                    System.out.println("Enviando: " + msg + "  con un TTL= " + socket.getTimeToLive());
                    socket.send(packet);
                    socket.close();
                }else if(msg.contains("C<msj>")){
                    msg = msg.substring(1);
                    msg = "S" + msg;
                    DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, MCAST_PORT);
                    
                    socket.send(packet);
                    socket.close();
                }else if(msg.contains("<saida>")){
                    String saida = "";
                    int i = 8;
                    while(Character.isLetter(msg.charAt(i))){
                        saida = saida + msg.charAt(i);
                        i++;
                    }
                    contatos.remove(saida);
                    String cont = "Usuario: " + contatos.toString();
                    //Envio dos contatos
                    System.out.println("Enviando: " + cont);
                    DatagramPacket packet = new DatagramPacket( cont.getBytes(), cont.length(), group, MCAST_PORT);
                    
                    socket.send(packet);
                    socket.close(); 
                }
                //Envio dos dados recebidos a todos do grupo
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(2);
            }

            try {
                Thread.sleep(1000 * 5);
            } catch (InterruptedException ie) {
            }
        }
    }

    public static void main(String[] args) {

        try {
            Server mc2 = new Server();
            mc2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

