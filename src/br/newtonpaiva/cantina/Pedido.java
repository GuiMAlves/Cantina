package br.newtonpaiva.cantina;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Massa massa;

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private List<Ingrediente> ingredientes;

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Pedido (){
        this.cliente = new Cliente();
        this.massa = new Massa();
        this.ingredientes = new ArrayList<Ingrediente>();
    }

    public Double calculaPedido() {
        Double valorMassa = massa.getValor();
        Double valorIngredientes = ingredientes.size() * 2.0;
        Double valorTotal = valorMassa + valorIngredientes;
        return valorTotal;
    }
}
