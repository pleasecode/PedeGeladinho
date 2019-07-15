package com.pedegeladinho.Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "EMPRESA")
public class Empresa {

    @PrimaryKey
    @ColumnInfo(name = "COD_EMPRESA")
    private long codEmpresa;

    @ColumnInfo(name = "TELEFONE")
    private String telefone;

    @ColumnInfo(name = "CNPJ")
    private String cnpj;

    @ColumnInfo(name = "INS_MUNICIPAL")
    private String insMunicipal;

    @ColumnInfo(name = "ATIVO")
    private boolean ativo;

    public Empresa() {
    }

    public Empresa(long codEmpresa, String telefone, String cnpj, String insMunicipal, boolean ativo) {
        this.codEmpresa = codEmpresa;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.insMunicipal = insMunicipal;
        this.ativo = ativo;
    }

    public long getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsMunicipal() {
        return insMunicipal;
    }

    public void setInsMunicipal(String insMunicipal) {
        this.insMunicipal = insMunicipal;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "codEmpresa=" + codEmpresa +
                ", telefone='" + telefone + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", insMunicipal='" + insMunicipal + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
