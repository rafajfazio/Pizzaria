
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class Pedido {
    
    Cliente cliente;
    private float valorTot;
    private String formaPagamento;
    Entregador entregador;
    ArrayList<ProdutoPedido> ListaProdutos = new ArrayList();

    public Pedido(Cliente cliente, float valorTot, String formaPagamento, Entregador entregador) {
        this.cliente = cliente;
        this.valorTot = valorTot;
        this.formaPagamento = formaPagamento;
        this.entregador = entregador;
    } 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTot() {
        return valorTot;
    }

    public void setValorTot(float valorTot) {
        this.valorTot = valorTot;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public ArrayList<ProdutoPedido> getListaProdutos() {
        return ListaProdutos;
    }

    public void setListaProdutos(ArrayList<ProdutoPedido> ListaProdutos) {
        this.ListaProdutos = ListaProdutos;
    } 
}