package com.riosgame.petshop;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jose on 3/6/2018.
 */

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.AnimalesViewHolder>{
    ArrayList<Animales> animales;
    public ContactoAdapter(ArrayList<Animales> animales){
        this.animales=animales;
    }

    @Override
    public AnimalesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_animales,parent,false);
        return new AnimalesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimalesViewHolder animalesViewholder, int position) {
        Animales animal = animales.get(position);
        animalesViewholder.imagen1.setImageResource(animal.getFoto());
        animalesViewholder.hueso_amarillo.setImageResource(animal.getFoto());
        animalesViewholder.hueso_blanco.setImageResource(animal.getFoto());
        animalesViewholder.tv_nombre.setText(animal.getNombre());
        animalesViewholder.tv_cantidad.setText(animal.getCantidad());

    }

    @Override
    public int getItemCount() {
        return animales.size();//esto muestra la cantidad e elementos que contiene mi lista de animales
    }

    public static class AnimalesViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;
        private ImageView imagen1;
        private ImageView hueso_blanco;
        private ImageView hueso_amarillo;
        private TextView tv_nombre;
        private TextView tv_cantidad;

        public AnimalesViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv_contacto);
            imagen1 = (ImageView) itemView.findViewById(R.id.imagen1);
            hueso_blanco = (ImageView) itemView.findViewById(R.id.hueso_blanco);
            hueso_amarillo = (ImageView) itemView.findViewById(R.id.hueso_amarillo);
            tv_nombre = (TextView) itemView.findViewById(R.id.tv_nombre);
            tv_cantidad = (TextView) itemView.findViewById(R.id.tv_cantidad);
        }
    }{

    }
}
