package com.example.klsbcahaliyal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter1 extends FirebaseRecyclerAdapter<model1,myadapter1.myviewholder1>
{

    public myadapter1(@NonNull  FirebaseRecyclerOptions<model1> options) {

        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull  myadapter1.myviewholder1 holder, int position, @NonNull  model1 model) {

        holder.Dis.setText(model.getDis());
        holder.Title.setText(model.getTitle());
        Glide.with(holder.img3.getContext()).load(model.getUrls()).into(holder.img3);
    }

    @NonNull
    @Override
    public myviewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.camplayout,parent,false);
        return new myviewholder1(view);
    }

    class myviewholder1 extends RecyclerView.ViewHolder{
      ImageView img3;
      TextView Dis;
      TextView Title;

        public myviewholder1(@NonNull View itemView) {
            super(itemView);
            img3=itemView.findViewById(R.id.im);
            Dis=itemView.findViewById(R.id.header1);
            Title=itemView.findViewById(R.id.title);
        }
    }
}
