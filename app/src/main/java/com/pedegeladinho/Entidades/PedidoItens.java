package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PEDIDO_ITENS")
public class PedidoItens {

    @PrimaryKey
    @ColumnInfo(name = "COD_PEDIDO_ITENS")
    private long codPedidoItens;

    @ColumnInfo(name = "COD_PEDIDO")
    private long codPedido;

    @ColumnInfo(name = "COD_PRODUTO")
    private long codProduto;

    @ColumnInfo(name = "DATA")
    private String data;

    @ColumnInfo(name = "HORA")
    private String hora;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "ITEM")
    private int item;

    @ColumnInfo(name = "PRECO")
    private int preco;

    @ColumnInfo(name = "QUANTIDADE")
    private int quantidade;

    @ColumnInfo(name = "TOTAL")
    private int total;

    @ColumnInfo(name = "DESCONTO_ACRESCIMO")
    private int descontoAcrescimo;

    public PedidoItens() {

    }

    public PedidoItens(long codPedidoItens, long codPedido, long codProduto, String data, String hora,
                       String momento, int item, int preco, int quantidade, int total, int descontoAcrescimo) {
        this.codPedidoItens = codPedidoItens;
        this.codPedido = codPedido;
        this.codProduto = codProduto;
        this.data = data;
        this.hora = hora;
        this.momento = momento;
        this.item = item;
        this.preco = preco;
        this.quantidade = quantidade;
        this.total = total;
        this.descontoAcrescimo = descontoAcrescimo;
    }

    public long getCodPedidoItens() {
        return codPedidoItens;
    }

    public void setCodPedidoItens(long codPedidoItens) {
        this.codPedidoItens = codPedidoItens;
    }

    public long getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(long codPedido) {
        this.codPedido = codPedido;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDescontoAcrescimo() {
        return descontoAcrescimo;
    }

    public void setDescontoAcrescimo(int descontoAcrescimo) {
        this.descontoAcrescimo = descontoAcrescimo;
    }

    @Override
    public String toString() {
        return "PedidoItens{" +
                "codPedidoItens=" + codPedidoItens +
                ", codPedido=" + codPedido +
                ", codProduto=" + codProduto +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", momento='" + momento + '\'' +
                ", item=" + item +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", total=" + total +
                ", descontoAcrescimo=" + descontoAcrescimo +
                '}';
    }
}
