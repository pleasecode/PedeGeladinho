package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "PEDIDO")
public class Pedido {

    @PrimaryKey
    @ColumnInfo(name = "COD_PEDIDO")
    private long codPedido;

    @ColumnInfo(name = "COD_EMPRESA")
    private long codEmpresa;

    @ColumnInfo(name = "COD_VENDEDOR")
    private long codVendedor;

    @ColumnInfo(name = "DATA")
    private String data;

    @ColumnInfo(name = "HORA")
    private String hora;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "TOTAL")
    private int total;

    @ColumnInfo(name = "STATUS")
    private String status;

    @ColumnInfo(name = "CANCELADO")
    private boolean cancelado;

    public Pedido() {

    }

    public Pedido(long codPedido, long codEmpresa, long codVendedor, String data, String hora,
                  String momento, int total, String status, boolean cancelado) {
        this.codPedido = codPedido;
        this.codEmpresa = codEmpresa;
        this.codVendedor = codVendedor;
        this.data = data;
        this.hora = hora;
        this.momento = momento;
        this.total = total;
        this.status = status;
        this.cancelado = cancelado;
    }

    public long getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(long codPedido) {
        this.codPedido = codPedido;
    }

    public long getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public long getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(long codVendedor) {
        this.codVendedor = codVendedor;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codPedido=" + codPedido +
                ", codEmpresa=" + codEmpresa +
                ", codVendedor=" + codVendedor +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", momento='" + momento + '\'' +
                ", total=" + total +
                ", status='" + status + '\'' +
                ", cancelado=" + cancelado +
                '}';
    }
}
