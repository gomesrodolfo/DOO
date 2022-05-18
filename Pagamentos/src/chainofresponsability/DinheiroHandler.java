
package chainofresponsability;

import static chainofresponsability.BoletoHandler.BOLETO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 20132BSI0079
 */
public class DinheiroHandler extends AbstractPagamentoHandler {
    
    public static final int DINHEIRO = 3;
    protected int  handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento com dinheiro?", valor);
        JOptionPane.showMessageDialog(null, "Pago em dinheiro. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }
    
}
