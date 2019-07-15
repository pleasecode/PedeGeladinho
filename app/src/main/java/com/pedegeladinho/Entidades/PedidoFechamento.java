package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "PEDIDO_FECHAMENTO",
        foreignKeys = {@ForeignKey(entity = Pedido.class,
                parentColumns = "COD_PEDIDO",
                childColumns = "COD_PEDIDO")})
public class PedidoFechamento {

    @PrimaryKey
    @ColumnInfo(name = "COD_PEDIDO_FECHAMENTO")
    private long codPedidoItens;

    @ColumnInfo(name = "COD_PEDIDO")
    private long codPedido;

    @ColumnInfo(name = "DATA")
    private String data;

    @ColumnInfo(name = "HORA")
    private String hora;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "TOTAL")
    private int total;

    @ColumnInfo(name = "ORDEM")
    private int ordem;

    @ColumnInfo(name = "TIPO")
    private int tipo;

    @ColumnInfo(name = "COD_FORMA_PAGTO")
    private long codFormaPagto;

    @ColumnInfo(name = "NOME_FORMA_PAGTO")
    private String nomeFormaPagto;

    public PedidoFechamento() {
    }

    public PedidoFechamento(long codPedidoItens, long codPedido, String data, String hora,
                            String momento, int total, int ordem, int tipo, long codFormaPagto, String nomeFormaPagto) {
        this.codPedidoItens = codPedidoItens;
        this.codPedido = codPedido;
        this.data = data;
        this.hora = hora;
        this.momento = momento;
        this.total = total;
        this.ordem = ordem;
        this.tipo = tipo;
        this.codFormaPagto = codFormaPagto;
        this.nomeFormaPagto = nomeFormaPagto;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public long getCodFormaPagto() {
        return codFormaPagto;
    }

    public void setCodFormaPagto(long codFormaPagto) {
        this.codFormaPagto = codFormaPagto;
    }

    public String getNomeFormaPagto() {
        return nomeFormaPagto;
    }

    public void setNomeFormaPagto(String nomeFormaPagto) {
        this.nomeFormaPagto = nomeFormaPagto;
    }

    @Override
    public String toString() {
        return "PedidoFechamento{" +
                "codPedidoItens=" + codPedidoItens +
                ", codPedido=" + codPedido +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", momento='" + momento + '\'' +
                ", total=" + total +
                ", ordem=" + ordem +
                ", tipo=" + tipo +
                ", codFormaPagto=" + codFormaPagto +
                ", nomeFormaPagto='" + nomeFormaPagto + '\'' +
                '}';
    }
}

