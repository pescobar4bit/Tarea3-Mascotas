package com.pescobar.tarea3_mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(miActionBar);

       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas= (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        InicializarListadeMascotas();
        InicializarAdaptador();

    }



    public void InicializarAdaptador(){
        MascotaAdaptador adaptador= new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarListadeMascotas(){
        mascotas= new ArrayList<>();
        mascotas.add(new Mascota("Vegas",R.drawable.perro7,10));
        mascotas.add(new Mascota("Rocky",R.drawable.perro2,21));
        mascotas.add(new Mascota("Arturo",R.drawable.perro6,8));
        mascotas.add(new Mascota("Gofy",R.drawable.perro4,5));
        mascotas.add(new Mascota("Marshall",R.drawable.perro5,1));
    }
}
