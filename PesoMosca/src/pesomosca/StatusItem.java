/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesomosca;

/**
 *
 * @author 20132bsi0079
 */
public class StatusItem {
    Estado status;

    public Estado getStatus() {
        return status;
    }

    public void setStatus(Estado status) {
        this.status = status;
    }

    StatusItem(Estado estado, boolean b, boolean b0) {
        this.status = estado;
    }

    enum Estado {
        CARRINHO, FECHADO, PAGO, ENVIADO, ENTREGUE;
    }
    boolean podeCancelar;
    boolean compraConcluida;

    public boolean isPodeCancelar() {
        return podeCancelar;
    }

    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }

    public boolean isCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }
    
    
}
