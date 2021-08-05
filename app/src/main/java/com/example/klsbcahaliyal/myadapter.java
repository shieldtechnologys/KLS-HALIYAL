package com.example.klsbcahaliyal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position,model model)
    {

        holder.Name.setText(model.getName());
        holder.Designation.setText(model.getDesignation());
        holder.Description.setText(model.getDescription());
        Glide.with(holder.img.getContext()).load(model.getPurl()).into(holder.img);

        holder.Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView  Description,Designation,Name;
        public myviewholder(@NonNull  View itemView) {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            Description=(TextView)itemView.findViewById(R.id.distext);
            Designation=(TextView)itemView.findViewById(R.id.dtext);
            Name=(TextView)itemView.findViewById(R.id.nametext);
        }
    }

}
