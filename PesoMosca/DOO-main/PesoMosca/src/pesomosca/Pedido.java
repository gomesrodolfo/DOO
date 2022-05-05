/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesomosca;

import pesomosca.StatusItem.Estado;

/**
 *
 * @author 20132bsi0079
 */
public class Pedido {
    Item item;
    
    public void addItemPedido(Item item){
        this.item = item;
    }
}
