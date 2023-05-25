package com.latife.bookapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latife.bookapplication.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class BookappAdapter extends RecyclerView.Adapter<BookappAdapter.BookHolder> {

    ArrayList<Bookapp> bookappArrayList;

    public BookappAdapter(ArrayList<Bookapp> bookappArrayList) {
        this.bookappArrayList = bookappArrayList;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new BookHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookappAdapter.BookHolder holder,int position) {
        holder.binding.recyclerViewTextView.setText(bookappArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailsActivity.class);
               // intent.putExtra("book",bookappArrayList.get(position));
                Singleton singleton=Singleton.getInstance();
                singleton.setSentBook(bookappArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookappArrayList.size();
    }

    public class BookHolder extends RecyclerView.ViewHolder{
        private  RecyclerRowBinding binding;


        public BookHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
