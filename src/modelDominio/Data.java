/**
 * NOME: Luana Kuntz e Amanda Weschenfelder
 * TURMA: INF4AT
 * DATA: 22/03/2022
 */
package modelDominio;

import java.util.Calendar;

public class Data {
    private int dia, mes, ano;
    
    public Data(){
        Calendar cal = Calendar.getInstance();
        this.dia = cal.get(Calendar.DAY_OF_MONTH);
        this.mes = cal.get(Calendar.MONTH) +1;
        this.ano = cal.get(Calendar.YEAR);
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
