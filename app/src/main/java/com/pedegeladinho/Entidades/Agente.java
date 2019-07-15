package com.pedegeladinho.Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "AGENTE")
public class Agente {

    @PrimaryKey
    @ColumnInfo(name = "COD_AGENTE")
    private long codAgente;

    @ColumnInfo(name = "COD_EMPRESA")
    private long codEmpresa;

    @ColumnInfo(name = "NOME")
    private String nome;

    @ColumnInfo(name = "ATIVO")
    private boolean ativo;

    @ColumnInfo(name = "EH_CLIENTE")
    private boolean ehCliente;

    @ColumnInfo(name = "EH_FUNCIONARIO")
    private boolean ehFuncionario;

    @ColumnInfo(name = "TELEFONE")
    private String telefone;


    public Agente() {
    }

    public Agente(long codAgente, long codEmpresa, boolean ativo, boolean ehCliente, boolean ehFuncionario,
                  String telefone) {
        this.codAgente = codAgente;
        this.codEmpresa = codEmpresa;
        this.ativo = ativo;
        this.ehCliente = ehCliente;
        this.ehFuncionario = ehFuncionario;
        this.telefone = telefone;
    }

    public long getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(long codAgente) {
        this.codAgente = codAgente;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isEhCliente() {
        return ehCliente;
    }

    public void setEhCliente(boolean ehCliente) {
        this.ehCliente = ehCliente;
    }

    public boolean isEhFuncionario() {
        return ehFuncionario;
    }

    public void setEhFuncionario(boolean ehFuncionario) {
        this.ehFuncionario = ehFuncionario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "codAgente=" + codAgente +
                ", codEmpresa=" + codEmpresa +
                ", ativo=" + ativo +
                ", ehCliente=" + ehCliente +
                ", ehFuncionario=" + ehFuncionario +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
