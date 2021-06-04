package cliente;

import cliente.Janela;
import java.io.*;
import java.net.*;

public class Client extends Thread {

    public static final String MCAST_ADDR = "230.1.1.1";
    public static final int MCAST_PORT = 4000;
    public static final int DGRAM_BUF_LEN = 2048;
    Janela v = new Janela(0);

    public void run() {
        InetAddress group = null;
        try {
            group = InetAddress.getByName(MCAST_ADDR);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.exit(1);
        }

        boolean pular = true;

        try {
            MulticastSocket socket = new MulticastSocket(MCAST_PORT);
            socket.joinGroup(group);
            DatagramPacket contato = new DatagramPacket(("<inicio>" + v.getNome()).getBytes(), ("<inicio>" + v.getNome()).length(), group, MCAST_PORT);
            socket.send(contato);
            while (pular) {
                //System.out.println("entrou");
                if (v.getStatus() == 0) {     //Leitura
                    //System.out.println("entrou leitura");
                    socket.setSoTimeout(100);
                    try {
                        byte[] buf = new byte[DGRAM_BUF_LEN];
                        DatagramPacket recv = new DatagramPacket(buf, buf.length);
                        socket.receive(recv);
                        byte[] data = recv.getData();
                        String mensagem = new String(data);
                        System.out.println("Dados recebidos: " + mensagem);
                        v.setNewMenssagem(mensagem);
                    } catch (Exception e) {
                    }
                } else if (v.getStatus() == 1) {   //Escrevendo
                    //System.out.println("entrou mensagem");
                    String mensagem = "";
                    
                    if(v.getSaida() == 1){
                        mensagem = "<saida>" + v.getNome();
                    }else{
                        if(v.getActiveTab() != 0){
                            mensagem = "C<msj><privado><" + v.getNome() + "><" + v.getContactosChat(v.getActiveTab()) + ">" + v.getActiveMessage();
                        }else if(v.getActiveTab() == 0){
                            mensagem = "C<msj><" + v.getNome() + ">" + v.getActiveMessage();
                        }
                    }
                    DatagramPacket packet = new DatagramPacket(mensagem.getBytes(), mensagem.length(), group, MCAST_PORT);
                    System.out.println("Enviando: " + mensagem + "  con un TTL= " + socket.getTimeToLive());
                    socket.send(packet);
                    v.setStatus(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }

    }//run

    public static void main(String[] args) {

        try {
            Client cliente = new Client();
            cliente.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//main
}//class
