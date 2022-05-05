
package pesomosca;

public class StatusItem {
    Estado status;

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
    
     public Estado getStatus() {
        return status;
    }

    public void setStatus(Estado status) {
        this.status = status;
    }
    
    StatusItem(Estado estado, boolean podeCancelar, boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
        this.podeCancelar = podeCancelar;
        this.status = estado;
    }
    
}
