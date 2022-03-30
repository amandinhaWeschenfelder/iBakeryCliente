/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 13/02/2022
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Produto;

public class ProdutosTableModel extends AbstractTableModel{
    
    private final ArrayList<Produto> lista;    
    
    public ProdutosTableModel(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size(); // tamanho da lista
    }

    @Override
    public int getColumnCount() {
        return 2; //ID e nome
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = lista.get(rowIndex);
                
        switch(columnIndex) {
            case 0:
                return produto.getIdProduto();
            case 1:
                return produto.getNome();            
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            default:
                return "NoName";
        }
    }
    
    public Produto getProduto(int row) {
        return lista.get(row);        
    } 
    
    public Produto getProdutoCompleto(int idProduto) {
        Produto produto = lista.get(idProduto);
        return produto;        
    } 
}
