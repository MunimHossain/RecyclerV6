package com.example.recyclerv5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {


    Context context;
    ArrayList<ContactModel> arrayContact;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel>arrayContact){
        this.context = context;
        this.arrayContact = arrayContact;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageContact.setImageResource(arrayContact.get(position).img);
        holder.textName.setText(arrayContact.get(position).name);
        holder.textNumber.setText(arrayContact.get(position).number);


    }

    @Override
    public int getItemCount() {
        return arrayContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView textName,textNumber;
        ImageView imageContact;
        public ViewHolder(View itemView)
        {
            super(itemView);
            textName = itemView.findViewById(R.id.txtNameId);
            textName = itemView.findViewById(R.id.txtNumberId);
            imageContact = itemView.findViewById(R.id.imageContactId);

        }

    }
}
