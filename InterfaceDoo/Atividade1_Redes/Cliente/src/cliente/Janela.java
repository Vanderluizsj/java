package cliente;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;

public class Janela implements ActionListener{
    public static String Nome;
    public  int statusOp;
    public int saida;
    private JFrame janela;
    private JTabbedPane chats;
    private JPanel painel;
    private ArrayList<JTextArea> chatPessoa;
    private ArrayList<String> contatos;
    private ArrayList<String> contatosChat;
    private ArrayList<JTextField> textoEnviar;
    private ArrayList<JButton> botaoEnviar;
    
    public Janela(int operacion){
        statusOp = operacion;
        saida = 0;
        Nome = "Usuario: " + JOptionPane.showInputDialog("Insira o seu nome:");
        while(Nome.isEmpty()){
            Nome = "Usuario: " + JOptionPane.showInputDialog("Insira o seu nome:");
        }
        janela = new JFrame();
        
        janela.setSize(500, 500);
        janela.setTitle(Nome + ": Chat multicast");
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setDefaultCloseOperation(3);
        janela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                statusOp = 1;
                saida = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        chatPessoa = new ArrayList();
        contatosChat = new ArrayList();
        contatos = new ArrayList();
        textoEnviar = new ArrayList();
        botaoEnviar = new ArrayList();
        
        inicializarComponentes();
        janela.setVisible(true);
    }
    
    private void inicializarComponentes(){
        painel = new JPanel();
        JLabel titulo = new JLabel("Seus chats: " + Nome);
        
        painel.setLayout(null);
        janela.getContentPane().add(painel);
        titulo.setBounds(10, 10, 180, 30);
        painel.add(titulo);
        
        setButtons();
        setGeneral();
    }
    
    private void setButtons(){
        JButton newChat = new JButton();
        newChat.addActionListener(this);
        newChat.setText("Novo chat privado");
        newChat.setBounds(290, 10, 200, 30);
        painel.add(newChat);
    }
    
    private void setGeneral(){
        chats = new JTabbedPane();
        chats.setBounds(10, 50, 480, 400);
        newChat("General");
        
        painel.add(chats);
    }
    
    private void newChat(String nome){
        JPanel newPanel = new JPanel();
        newPanel.setLayout(null);
        chats.addTab(nome, newPanel);
        
        JTextArea conversacion = new JTextArea();
        conversacion.setEditable(false);
        conversacion.setForeground(Color.BLACK);
        chatPessoa.add(conversacion);
        JScrollPane scroll = new JScrollPane(chatPessoa.get(chatPessoa.size() - 1));
        scroll.setBounds(10,10,455,300);
        newPanel.add(scroll);
        
        JTextField texto = new JTextField();
        textoEnviar.add(texto);
        textoEnviar.get(textoEnviar.size() - 1).setBounds(10, 320, 350, 39);
        newPanel.add(textoEnviar.get(textoEnviar.size() - 1));
        
        JButton enviar = new JButton("Enviar");
        botaoEnviar.add(enviar);
        botaoEnviar.get(botaoEnviar.size() - 1).setBounds(370, 320, 95, 38);
        botaoEnviar.get(botaoEnviar.size() - 1).setText("Enviar");
        botaoEnviar.get(botaoEnviar.size() - 1).addActionListener(this);
        String butname = "Enviar" + (botaoEnviar.size() - 1);
        System.out.println(butname);
        botaoEnviar.get(botaoEnviar.size() - 1).setName(butname);
        newPanel.add(botaoEnviar.get(botaoEnviar.size() - 1));
        
        contatosChat.add(nome);
    }
    
    public int getStatus(){
        return statusOp;
    }
    
    public int getSaida(){
        return saida;
    }
    
    public void setStatus(int newStatus){
        statusOp = newStatus;
    }
    
    public String getActiveMessage(){
        int selectedIndex = chats.getSelectedIndex();
        Date dataAtual = new Date();
            DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date hora = Calendar.getInstance().getTime();
        String texto = "\n" + "Data: " + dfl.format(dataAtual) + "\n" + "Hora: " + sdf.format(hora) + 
                "\n" +"Mensagem: "+ textoEnviar.get(selectedIndex).getText() + "\n";
        textoEnviar.get(selectedIndex).setText("");
        return texto;
    }
    
    public int getActiveTab(){
        
        return chats.getSelectedIndex();
    }
    
    public String getContactosChat(int indice){
        return contatosChat.get(indice);
    }
    
    public void setNewMenssagem(String mensagem){
        if(mensagem.contains("<contatos>")){
            String contato = "";
            contatos.clear();
            for(int i = 12; i < mensagem.length(); i++){
                System.out.println("|" + mensagem.charAt(i) + "|");
                //Thread.sleep(1000);
                if(Character.isLetter(mensagem.charAt(i))){                    
                    contato += mensagem.charAt(i);
                }else if(mensagem.charAt(i) == ','){
                    contatos.add(contato);
                    contato = "";
                }else{
                    //break;
                }
            }
            contatos.add(contato);
            System.out.println(contatos);
            //contatos.remove(Nome);
        }else if(mensagem.startsWith("S<msj>")){
            String remetente = "";
            mensagem = mensagem.substring(6);
            
            //char feliz = (char) "\u1F600";
            
            mensagem = mensagem.replace(":)", "\uD83D\uDE04");
            mensagem = mensagem.replace(":D", "\uD83D\uDE03");
            mensagem = mensagem.replace(":3", "\uD83D\uDE0A");
            mensagem = mensagem.replace(":P", "\uD83D\uDE1C");
            mensagem = mensagem.replace(":(", "\uD83D\uDE14");
            mensagem = mensagem.replace(":'(", "\uD83D\uDE22");
            mensagem = mensagem.replace("D:", "\uD83D\uDE29");
            mensagem = mensagem.replace(">:c", "\uD83D\uDE21");
            
            
            if(mensagem.contains("<privado>")){
                String destinatario = "";
                int i = 1;
                
                mensagem = mensagem.substring(9);
                while(Character.isLetter(mensagem.charAt(i))){
                    remetente = remetente + mensagem.charAt(i);
                    i++;
                }
                mensagem = mensagem.substring(i + 1);
                
                i = 1;
                System.out.println(mensagem);
                while(Character.isLetter(mensagem.charAt(i))){
                    destinatario = destinatario + mensagem.charAt(i);
                    i++;
                }
                mensagem = mensagem.substring(i + 1);
                System.out.println(mensagem);
                System.out.println("Remetente: " + remetente + " destinatario: " + destinatario);
                
                if(Nome.equals(destinatario)){
                    if(contatosChat.contains(remetente)){
                        int selectedIndex = contatosChat.indexOf(remetente);
                        textoEnviar.get(selectedIndex).setText("");
                        chatPessoa.get(selectedIndex).setText(chatPessoa.get(selectedIndex).getText() + "\n" + remetente + ":" + mensagem );
                    }else{
                        newChat(remetente);
                        chats.setSelectedIndex(contatosChat.indexOf(remetente));
                        int selectedIndex = chats.getSelectedIndex();
                        textoEnviar.get(selectedIndex).setText("");
                        chatPessoa.get(selectedIndex).setText(chatPessoa.get(selectedIndex).getText() + "\n" + remetente + ":" + mensagem);
                    }
                }else if(Nome.equals(remetente)){
                    int selectedIndex = chats.getSelectedIndex();
                    textoEnviar.get(selectedIndex).setText("");
                    chatPessoa.get(selectedIndex).setText(chatPessoa.get(selectedIndex).getText() + "\n" + remetente + ":" + mensagem);
                }
            }else{
                int selectedIndex = 0;
                textoEnviar.get(selectedIndex).setText("");
                chatPessoa.get(selectedIndex).setText(chatPessoa.get(selectedIndex).getText() + "\n" + mensagem);
            }
        }
    }
    
    public String getNome(){
        return Nome;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton boton = (JButton) ae.getSource();
        
        if(boton.getActionCommand().equals("Novo chat privado")){
            if(contatos.toArray().length == 0){
                JOptionPane.showMessageDialog(null, "Neste momento não há contatos na linha", "Contatos", JOptionPane.ERROR_MESSAGE);
            }else{
                ArrayList<String> contatosMostrar = contatos;
                contatosMostrar.remove(Nome);
                String seleccion = (String) JOptionPane.showInputDialog(null, "Novo chat", "Selecione o usuario que quer criar um chat", JOptionPane.INFORMATION_MESSAGE, null, contatosMostrar.toArray(), contatosMostrar.toArray()[0]);
                if(contatosChat.contains(seleccion)){
                    chats.setSelectedIndex(contatosChat.indexOf(seleccion));
                }else{
                    newChat(seleccion);
                    chats.setSelectedIndex(contatosChat.indexOf(seleccion));
                }
                statusOp = 0;
            }
        }else if(boton.getActionCommand().equals("Enviar")){
            statusOp = 1;
        }
    }
}
