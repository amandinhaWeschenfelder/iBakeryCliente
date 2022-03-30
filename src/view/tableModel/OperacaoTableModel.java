/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 21/02/2022
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Operacao;

public class OperacaoTableModel extends AbstractTableModel{
    
    private final ArrayList<Operacao> lista;
    
    public OperacaoTableModel(ArrayList<Operacao> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size(); // tamanho da lista
    }

    @Override
    public int getColumnCount() {
        return 4; //ID e cliente ou vendedor, valor total e data
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Operacao operacao = lista.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return operacao.getIdOperacao();
            case 1:
                return operacao.getIdUsuario();
            case 2:
                return operacao.getValorTotal();
            case 3:
                return operacao.getDataRetirada();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column) {
            case 0:
                return "id";
            case 1:
                return "Nome";
            case 2:
                return "ValorTotal";
            case 3:
                return "Data";    
            default:
                return "NoName";
        }
    }
    
    public Operacao getOperacao(int row) {
        return lista.get(row);
    }   
}
