package com.riosgame.petshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animales>animales;
    private RecyclerView ListaAnimales;
  private ImageView estrella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mytulbar = (Toolbar) findViewById(R.id.myactionbar);
        setSupportActionBar(mytulbar);

        estrella = (ImageView) findViewById(R.id.estrella) ;

        ListaAnimales = (RecyclerView) findViewById(R.id.rvanimales);
      // LinearLayoutManager llm = new LinearLayoutManager(this);
     //   llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(this, 2);

        ListaAnimales.setLayoutManager(glm);
        InicializarListaAnimales();
        InicializarAdapter();

        getSupportActionBar().setTitle(null);

        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adelante = new Intent(MainActivity.this, MascotasSeleccionadas.class);
                startActivity(adelante);

            }
        });
    }

    public void InicializarAdapter(){
        ContactoAdapter adaptador = new ContactoAdapter(animales);
        ListaAnimales.setAdapter(adaptador);
    }
    public void InicializarListaAnimales(){
        animales = new ArrayList<Animales>();

        animales.add(new Animales(R.drawable.conejo,"Bunny"));
        animales.add(new Animales(R.drawable.perrito_blanco,"Toby"));
        animales.add(new Animales(R.drawable.gato_1,"Katy"));
        animales.add(new Animales(R.drawable.loros,"Lorenzo y Laura"));
        animales.add(new Animales(R.drawable.pecesito,"Susos"));
        animales.add(new Animales(R.drawable.perro_buldo,"Rambo"));
        animales.add(new Animales(R.drawable.gatito_en_el_pasto,"Danna"));
        animales.add(new Animales(R.drawable.gatos_blancos,"Dory y Dora"));
        animales.add(new Animales(R.drawable.perro_bestido,"Pety"));
        animales.add(new Animales(R.drawable.perrito_y_gatito,"Godo"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.setting){
            Toast.makeText(this, "El mundo esta loco", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}
