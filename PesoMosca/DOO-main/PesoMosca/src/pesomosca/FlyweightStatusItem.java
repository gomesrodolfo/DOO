
package pesomosca;

import java.util.HashMap;
import pesomosca.StatusItem.Estado;

public class FlyweightStatusItem {
    
    HashMap<StatusItem.Estado, StatusItem> status = new HashMap();
    
    public FlyweightStatusItem(){
        
        status.put(Estado.CARRINHO, new StatusItem(Estado.CARRINHO, true, false));
        status.put(Estado.FECHADO, new StatusItem(Estado.FECHADO, true, false));
        status.put(Estado.PAGO, new StatusItem(Estado.PAGO, true, true));
        status.put(Estado.ENVIADO, new StatusItem(Estado.ENVIADO, false, true));
        status.put(Estado.ENTREGUE, new StatusItem(Estado.ENTREGUE, false, true));
    }

    public StatusItem get(Estado estado) {
       return status.get(estado);
    }
        
}
