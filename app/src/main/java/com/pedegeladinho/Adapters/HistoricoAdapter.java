package com.pedegeladinho.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.pedegeladinho.Entidades.Historico;
import com.pedegeladinho.R;

import java.util.List;

public class HistoricoAdapter extends RecyclerView.Adapter<HistoricoAdapter.HistoricoViewHolder> {
    private String TAG = this.getClass().getSimpleName();
    private LayoutInflater inflater;
    List<Historico> listaHistorico;

    public HistoricoAdapter(Context ctx) {
        Log.i(TAG, "Criando inflater");
        inflater = LayoutInflater.from(ctx);
    }

    public void setListaHistorico(List<Historico> lista) {
        this.listaHistorico = lista;
        Log.i(TAG, "sentando lista historico");
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HistoricoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(TAG, "Inflando item");
        View itemView = inflater.inflate(R.layout.item_historico, parent, false);
        return new HistoricoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoricoViewHolder holder, int position) {
        if (listaHistorico != null) {
            Log.i(TAG, "sentando dados do historico na posicao" + String.valueOf(position));
            holder.setData(listaHistorico.get(position));
        }
    }

    @Override
    public int getItemCount() {
        int tamanhoLista = 0;
        if (listaHistorico != null) {
            tamanhoLista = listaHistorico.size();
        }
        return tamanhoLista;
    }

    class HistoricoViewHolder extends RecyclerView.ViewHolder {
        private TextView tvProprietarioAcao;
        private TextView tvEvento;
        private TextView tvObjetoDaAcao;

        public HistoricoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProprietarioAcao = (TextView) itemView.findViewById(R.id.tvProprietarioDaAcao);
            tvEvento = (TextView) itemView.findViewById(R.id.tvEvento);
            tvObjetoDaAcao = (TextView) itemView.findViewById(R.id.tvObjetoAdicionado);
            Log.i(TAG, "criando holder historico");
        }

        public void setData(Historico historico) {
            Log.i(TAG, "Setando dados do historico");
            if (historico != null) {
                tvProprietarioAcao.setText(String.valueOf(historico.getCodAgente()));
                tvEvento.setText("Adicionou");
                tvObjetoDaAcao.setText(historico.getDescricao());
            }
        }
    }
}
