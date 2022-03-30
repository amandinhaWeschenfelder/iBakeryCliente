/**
 * NOME: Luana Kuntz e Amanda Weschenfelder
 * TURMA: INF4AT
 * DATA: 22/03/2022
 */
package view.util;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import modelDominio.Produto;

public class ComboboxProdutos {
    private String value; 
    private int id;      

    // Método construtor
    public ComboboxProdutos(int id, String value) {
        this.id = id;
        this.value = value;
    }
 
    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }
    
    public static int getSelectedIndex(JComboBox combo){
        Object obj = combo.getSelectedItem();
        if (obj == null)
            return -1; 
        else
            return ((ComboboxProdutos) obj).getId();// devolve o código da chave selecionada
    }
    
    public static void preencheComboBoxProduto(int SelCodigo, JComboBox combo, ArrayList<Produto> lista, Boolean addTodos){
        Vector vlista= new Vector();
        int x = 0;  
        int selecionarCodigo = -1; 
       
//        if (addTodos)
//            vlista.add(new ComboboxProdutos(-1,"Todas"));
            
        for (Produto produto: lista){ 
            ComboboxProdutos comboBox = new ComboboxProdutos(produto.getIdProduto(),produto.getNome());
            vlista.add(comboBox);
            if (comboBox.getId() == SelCodigo)
                selecionarCodigo = x;
                x++;
        }
        
        DefaultComboBoxModel modelocliente = new DefaultComboBoxModel(vlista);
        combo.setModel(modelocliente);
        if (selecionarCodigo >= 0)
            combo.setSelectedIndex(selecionarCodigo);
    }
}
