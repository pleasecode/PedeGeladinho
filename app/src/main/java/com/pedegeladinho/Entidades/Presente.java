package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PRESENTE")
public class Presente {

    @PrimaryKey
    @ColumnInfo(name = "COD_PRESENTE")
    private long codPresente;

    @ColumnInfo(name = "COD_AGENTE_EMISSOR")
    private long codAgenteEmissor;

    @ColumnInfo(name = "COD_AGENTE_RECEPTOR")
    private long codAgenteReceptor;

    @ColumnInfo(name = "COD_PRODUTO")
    private long codProduto;

    @ColumnInfo(name = "MOMENTO")
    private String momento;

    @ColumnInfo(name = "MOMENTO_ENTREGA")
    private String momentoEntrega;

    @ColumnInfo(name = "MOMENTO_RECEPCAO")
    private String momentoRecepcao;

    @ColumnInfo(name = "MOMENTO_RESGATE")
    private String momentoResgate;

    public Presente() {

    }

    public Presente(long codPresente, long codAgenteEmissor, long codAgenteReceptor, long codProduto,
                    String momento, String momentoEntrega, String momentoRecepcao, String momentoResgate) {
        this.codPresente = codPresente;
        this.codAgenteEmissor = codAgenteEmissor;
        this.codAgenteReceptor = codAgenteReceptor;
        this.codProduto = codProduto;
        this.momento = momento;
        this.momentoEntrega = momentoEntrega;
        this.momentoRecepcao = momentoRecepcao;
        this.momentoResgate = momentoResgate;
    }

    public long getCodPresente() {
        return codPresente;
    }

    public void setCodPresente(long codPresente) {
        this.codPresente = codPresente;
    }

    public long getCodAgenteEmissor() {
        return codAgenteEmissor;
    }

    public void setCodAgenteEmissor(long codAgenteEmissor) {
        this.codAgenteEmissor = codAgenteEmissor;
    }

    public long getCodAgenteReceptor() {
        return codAgenteReceptor;
    }

    public void setCodAgenteReceptor(long codAgenteReceptor) {
        this.codAgenteReceptor = codAgenteReceptor;
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

    public String getMomentoEntrega() {
        return momentoEntrega;
    }

    public void setMomentoEntrega(String momentoEntrega) {
        this.momentoEntrega = momentoEntrega;
    }

    public String getMomentoRecepcao() {
        return momentoRecepcao;
    }

    public void setMomentoRecepcao(String momentoRecepcao) {
        this.momentoRecepcao = momentoRecepcao;
    }

    public String getMomentoResgate() {
        return momentoResgate;
    }

    public void setMomentoResgate(String momentoResgate) {
        this.momentoResgate = momentoResgate;
    }

    @Override
    public String toString() {
        return "Presente{" +
                "codPresente=" + codPresente +
                ", codAgenteEmissor=" + codAgenteEmissor +
                ", codAgenteReceptor=" + codAgenteReceptor +
                ", codProduto=" + codProduto +
                ", momento='" + momento + '\'' +
                ", momentoEntrega='" + momentoEntrega + '\'' +
                ", momentoRecepcao='" + momentoRecepcao + '\'' +
                ", momentoResgate='" + momentoResgate + '\'' +
                '}';
    }
}
