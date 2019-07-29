package com.pedegeladinho.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.pedegeladinho.Entidades.Produto;
import com.pedegeladinho.R;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder> {

    private LayoutInflater inflater;
    private List<Produto> listaProdutos;

    public ProdutoAdapter(Context ctx) {
        inflater = LayoutInflater.from(ctx);
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_produto, parent, false);
        return new ProdutoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
        if (listaProdutos != null) {
            holder.setData(listaProdutos.get(position));
        }
    }

    @Override
    public int getItemCount() {
        int tamanhoLista = 0;
        if (listaProdutos != null)
            tamanhoLista = listaProdutos.size();

        return tamanhoLista;
    }

    class ProdutoViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProduto;
        TextView tvNomeProduto;

        ProdutoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduto = itemView.findViewById(R.id.imgProduto);
            tvNomeProduto = itemView.findViewById(R.id.tvNomeProduto);
        }

        void setData(Produto produto) {
            tvNomeProduto.setText(produto.getNome());
        }

    }

}
