/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 13/02/2022
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Produto;

public class ProducaoTableModel  extends AbstractTableModel{
    
    private final ArrayList<Produto> lista;    
    
    public ProducaoTableModel(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size(); // tamanho da lista
    }

    @Override
    public int getColumnCount() {
        return 2; // Nome e qtd
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = lista.get(rowIndex);
                
        switch(columnIndex) {
            case 0:
                return produto.getNome();
            case 1:
                return produto.getEstoque();            
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column) {
            case 0:
                return "Nome";
            case 1:
                return "Qtd";
            default:
                return "NoName";
        }
    }
    
    public Produto getProduto(int row) {
        return lista.get(row);        
    } 
}
