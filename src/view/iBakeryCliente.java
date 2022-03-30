/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 13/02/2022
 */
package view;

import controller.Conexao;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class iBakeryCliente {
  
    public static Conexao conexaoController;

    public static void main(String[] args) {
        Socket socket;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try {
            socket = new Socket("127.0.0.1", 12345);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            System.out.println("Erro de conexão do cliente: "
                    + ex.getMessage() + ".");
        }
        // criando o controller geral e a tela do form principal
        conexaoController = new Conexao(in, out);
        formLogin form = new formLogin();
        form.setVisible(true);
    }
}  

