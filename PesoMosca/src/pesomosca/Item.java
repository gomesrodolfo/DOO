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
public class Item {
    String nome;
    String descricao;
    StatusItem item;

    public StatusItem getItem() {
        return item;
    }

    public void setItem(StatusItem item) {
        this.item = item;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
