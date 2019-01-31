package com.pruebautn.userlistexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pruebautn.userlistexample.R;
import com.pruebautn.userlistexample.entities.User;

import java.util.List;

/**
 * Created by evasquez on 30/1/19.
 */
public class RecyclerUserAdapter extends RecyclerView.Adapter<RecyclerUserAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // Elementos del row que utilizamos
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {
            users.get(getAdapterPosition());
        }
    }

    private List<User> users;

    public RecyclerUserAdapter(List<User> contacts) {
        users = contacts;
    }

    @Override
    public RecyclerUserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Infla la vista en la que agregamos la información
        View contactView = inflater.inflate(R.layout.row_user, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // LLena la información en la vista
    @Override
    public void onBindViewHolder(RecyclerUserAdapter.ViewHolder viewHolder, int position) {
        // Set item views based on your views and data model
        /*
        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
        Button button = viewHolder.messageButton;
        button.setText(contact.isOnline() ? "Message" : "Offline");
        button.setEnabled(contact.isOnline());*/
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return users.size();
    }
}
