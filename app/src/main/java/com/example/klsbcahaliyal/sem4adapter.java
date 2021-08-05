package com.example.klsbcahaliyal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class sem4adapter extends FirebaseRecyclerAdapter<sem4model,sem4adapter.myviewholder>
{

    public sem4adapter(@NonNull  FirebaseRecyclerOptions<sem4model> options4)
    {
        super(options4);
    }

    @Override
    protected void onBindViewHolder(@NonNull sem4adapter.myviewholder holder, int position, @NonNull  sem4model model) {
        holder.title.setText(model.getTitle());
        holder.year.setText(String.valueOf(model.getYear()));

        holder.imgsem1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.imgsem1.getContext(),viewpdf.class);
                intent.putExtra("fileurl",model.getFileurl());
                intent.putExtra("title",model.getTitle());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                holder.imgsem1.getContext().startActivity(intent);

            }
        });
    }

    @NonNull

    @Override
    public myviewholder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.semi1design,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView imgsem1;
        TextView title;
        TextView year;

        public myviewholder(@NonNull  View itemView) {
            super(itemView);

            imgsem1=itemView.findViewById(R.id.imgsem);
            title=itemView.findViewById(R.id.tit);
            year=itemView.findViewById(R.id.year);
        }
    }
}
