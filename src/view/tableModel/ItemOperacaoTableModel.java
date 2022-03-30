/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 28/03/2022
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.ItensOperacao;

public class ItemOperacaoTableModel extends AbstractTableModel{
    
    private final ArrayList<ItensOperacao> lista;
    
    public ItemOperacaoTableModel(ArrayList<ItensOperacao> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size(); // tamanho da lista
    }

    @Override
    public int getColumnCount() {
        return 3; // Nome do produto, quantidade e valor venda
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ItensOperacao itensOperacao = lista.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return itensOperacao.getIdProduto().getNome();
            case 1:
                return itensOperacao.getQtdProduto();
            case 2:
                return itensOperacao.getValorItemProduto();            
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
            case 2:
                return "R$";            
            default:
                return "NoName";
        }
    }
    
    public ItensOperacao getItemOperacao(int row) {
        return lista.get(row);
    }  
}
