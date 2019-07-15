package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PRODUTO")
public class Produto {

    @PrimaryKey
    @ColumnInfo(name = "COD_PRODUTO")
    private long codProduto;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "COD_EMPRESA")
    private long codEmpresa;

    @ColumnInfo(name = "NOME")
    private String nome;

    @ColumnInfo(name = "UNIDADE")
    private String unidade;

    @ColumnInfo(name = "PESO")
    private double peso;

    @ColumnInfo(name = "ATIVO")
    private boolean ativo;

    @ColumnInfo(name = "PRECO")
    private int preco;

    @ColumnInfo(name = "PVENDA")
    private int pvenda;

    public Produto() {

    }

    public Produto(long codProduto, String momento, long codEmpresa, String nome, String unidade,
                   double peso, boolean ativo, int preco, int pvenda) {
        this.codProduto = codProduto;
        this.momento = momento;
        this.codEmpresa = codEmpresa;
        this.nome = nome;
        this.unidade = unidade;
        this.peso = peso;
        this.ativo = ativo;
        this.preco = preco;
        this.pvenda = pvenda;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPvenda() {
        return pvenda;
    }

    public void setPvenda(int pvenda) {
        this.pvenda = pvenda;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", momento='" + momento + '\'' +
                ", codEmpresa=" + codEmpresa +
                ", nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", peso=" + peso +
                ", ativo=" + ativo +
                ", preco=" + preco +
                ", pvenda=" + pvenda +
                '}';
    }
}
