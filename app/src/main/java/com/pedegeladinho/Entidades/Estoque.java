package com.pedegeladinho.Entidades;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ESTOQUE")
public class Estoque {

    @PrimaryKey
    @ColumnInfo(name = "COD_ESTOQUE")
    private long codEstoque;

    public Estoque() {

    }

    public long getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(long codEstoque) {
        this.codEstoque = codEstoque;
    }
}
