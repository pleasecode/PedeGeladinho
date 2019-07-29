package com.pedegeladinho.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pedegeladinho.Adapters.HistoricoAdapter;
import com.pedegeladinho.Adapters.ProdutoAdapter;
import com.pedegeladinho.Entidades.Historico;
import com.pedegeladinho.Entidades.Produto;
import com.pedegeladinho.R;
import com.pedegeladinho.ViewModel.HistoricoViewModel;
import com.pedegeladinho.ViewModel.ProdutoViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();
    private HistoricoViewModel historicoViewModel;
    private ProdutoViewModel produtoViewModel;
    private HistoricoAdapter historicoAdapter;
    private ProdutoAdapter produtoAdapter;
    private RecyclerView recyclerViewHistorico;
    private RecyclerView recyclerViewProdutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHistorico = findViewById(R.id.recycleViewHistorico);
        historicoAdapter = new HistoricoAdapter(this);
        recyclerViewHistorico.setAdapter(historicoAdapter);
        recyclerViewHistorico.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewProdutos = findViewById(R.id.recycleViewProdutos);
        produtoAdapter = new ProdutoAdapter(this);
        recyclerViewProdutos.setAdapter(produtoAdapter);
        recyclerViewProdutos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false));

        historicoViewModel = ViewModelProviders.of(this).get(HistoricoViewModel.class);
        historicoViewModel.getAllHistorico().observe(this, new Observer<List<Historico>>() {
            @Override
            public void onChanged(List<Historico> historicos) {
                historicoAdapter.setListaHistorico(historicos);
            }
        });

        produtoViewModel = ViewModelProviders.of(this).get(ProdutoViewModel.class);
        produtoViewModel.getAllProdutos().observe(this, new Observer<List<Produto>>() {
            @Override
            public void onChanged(List<Produto> produtos) {
                produtoAdapter.setListaProdutos(produtos);
            }
        });

        FloatingActionButton bt = findViewById(R.id.btTeste);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Historico historico;

                for (int i = 5; i < 20; i++) {
                    historico = new Historico();
                    historico.setCodHistorico(i);
                    historico.setCodAgente(3);
                    historicoViewModel.insert(historico);
                }

//                Produto p = new Produto();
//
//                p.setCodProduto(11);
//                p.setNome("Ameixa");
//                p.setAtivo(true);
//
//                produtoViewModel.insert(p);
//                p = new Produto();
//                p.setCodProduto(12);
//                p.setNome("Morango");
//                p.setAtivo(true);
//
//                produtoViewModel.insert(p);
            }
        });

    }
}
