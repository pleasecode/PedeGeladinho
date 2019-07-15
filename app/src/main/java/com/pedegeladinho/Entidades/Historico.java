package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "HISTORICO")
public class Historico {

    @PrimaryKey
    @ColumnInfo(name = "COD_HISTORICO")
    private long codHistorico;

    @ColumnInfo(name = "COD_AGENTE")
    private long codAgente;

    @ColumnInfo(name = "COD_ATIVIDADE")
    private long codAtividade;

    @ColumnInfo(name = "DESCRICAO")
    private String descricao;

    @ColumnInfo(name = "COD_PRODUTO")
    private long codProduto;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    public Historico() {

    }

    public Historico(long codHistorico, long codAgente, long codAtividade, String descricao,
                     long codProduto, String momento) {
        this.codHistorico = codHistorico;
        this.codAgente = codAgente;
        this.codAtividade = codAtividade;
        this.descricao = descricao;
        this.codProduto = codProduto;
        this.momento = momento;
    }

    public long getCodHistorico() {
        return codHistorico;
    }

    public void setCodHistorico(long codHistorico) {
        this.codHistorico = codHistorico;
    }

    public long getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(long codAgente) {
        this.codAgente = codAgente;
    }

    public long getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(long codAtividade) {
        this.codAtividade = codAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Historico{" +
                "codHistorico=" + codHistorico +
                ", codAgente=" + codAgente +
                ", codAtividade=" + codAtividade +
                ", descricao='" + descricao + '\'' +
                ", codProduto=" + codProduto +
                ", momento='" + momento + '\'' +
                '}';
    }
}
