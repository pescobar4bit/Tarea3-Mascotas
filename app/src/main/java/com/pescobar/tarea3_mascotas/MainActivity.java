package com.pescobar.tarea3_mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas= (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm= new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        InicializarListadeMascotas();
        InicializarAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btnFavoritos:
                Intent intent= new Intent(this,MascotasFavoritas.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void InicializarAdaptador(){
        MascotaAdaptador adaptador= new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarListadeMascotas(){
        mascotas= new ArrayList<>();
        mascotas.add(new Mascota("Vegas",R.drawable.perro1,0));
        mascotas.add(new Mascota("Rocky",R.drawable.perro2,0));
        mascotas.add(new Mascota("Arturo",R.drawable.perro3,0));
        mascotas.add(new Mascota("Gofy",R.drawable.perro4,5));
        mascotas.add(new Mascota("Marshall",R.drawable.perro5,0));
        mascotas.add(new Mascota("Rufo",R.drawable.perro6,0));
        mascotas.add(new Mascota("Madrid",R.drawable.perro7,10));
        mascotas.add(new Mascota("Lupa",R.drawable.perro8,0));
    }
}
