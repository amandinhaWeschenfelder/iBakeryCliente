/**
NOME: Luana Kuntz e Amanda Weschenfelder
TURMA: INF4AT
DATA: 21/02/2022
 */
package view.tableModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Usuario;

public class UsuarioTableModel extends AbstractTableModel{
    
    private final ArrayList<Usuario> lista;
    
    public UsuarioTableModel(ArrayList<Usuario> lista) {
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
        Usuario usuario = lista.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return usuario.getIdUsuario();
            case 1:
                return usuario.getNome();
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
    
    public Usuario getUsuario(int row) {
        return lista.get(row);
    }   
}