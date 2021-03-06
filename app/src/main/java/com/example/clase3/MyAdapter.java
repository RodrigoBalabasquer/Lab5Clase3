package com.example.clase3;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<PersonaModel> personas;
    private MyOnItemClick listener;
    public MyAdapter(List<PersonaModel> personas,MyOnItemClick listener){
        this.personas = personas;
        this.listener = listener;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy,parent,false);

        MyViewHolder myViewHoleder = new MyViewHolder(v,listener);
        return myViewHoleder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PersonaModel p = this.personas.get(position);

        holder.tvApellido.setText(p.getApellido());
        holder.tvNombre.setText(p.getNombre());
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}

