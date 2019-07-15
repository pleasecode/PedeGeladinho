package com.pedegeladinho.Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "FORMA_PAGTO")
public class FormaPagto {

    @PrimaryKey
    @ColumnInfo(name = "COD_FORMA_PAGTO")
    private long codFormaPagto;

    @ColumnInfo(name = "COD_EMPRESA")
    private long codEmpresa;

    @ColumnInfo(name = "NOME")
    private String nome;

    @ColumnInfo(name = "TIPO")
    private int tipo;

    @ColumnInfo(name = "PARCELAS")
    private int parcelas;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "ATIVO")
    private boolean ativo;

    public FormaPagto() {

    }

    public FormaPagto(long codFormaPagto, long codEmpresa, String nome, int tipo, int parcelas,
                      String momento, boolean ativo) {
        this.codFormaPagto = codFormaPagto;
        this.codEmpresa = codEmpresa;
        this.nome = nome;
        this.tipo = tipo;
        this.parcelas = parcelas;
        this.momento = momento;
        this.ativo = ativo;
    }

    public long getCodFormaPagto() {
        return codFormaPagto;
    }

    public void setCodFormaPagto(long codFormaPagto) {
        this.codFormaPagto = codFormaPagto;
    }

    public long getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "FormaPagto{" +
                "codFormaPagto=" + codFormaPagto +
                ", codEmpresa=" + codEmpresa +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", parcelas=" + parcelas +
                ", momento='" + momento + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
