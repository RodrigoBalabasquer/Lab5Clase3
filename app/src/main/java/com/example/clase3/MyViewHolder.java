package com.example.clase3;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {

    private MyOnItemClick listener;
    public TextView tvNombre;
    public TextView tvApellido;
    private int position;

    public MyViewHolder(View v,MyOnItemClick listener){
        super(v);
        v.setOnClickListener(this);
        tvNombre = (TextView) v.findViewById(R.id.tvNombre);
        tvApellido = (TextView) v.findViewById(R.id.tvApellido);
        this.listener = listener;
    }
    public void setPosition(int position)
    {
        this.position = position;
    }
    @Override
    public void onClick(View v) {
        listener.onItemClick(position);

    }
}
