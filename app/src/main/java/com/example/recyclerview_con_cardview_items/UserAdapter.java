package com.example.recyclerview_con_cardview_items;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_con_cardview_items.Models.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;
    private Context context;
    private String prueba;
    public UserAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);

        holder.userName.setText(user.getUsername());
        holder.userFullName.setText(user.getFirstName() + " " + user.getLastName());
        holder.userEmail.setText(user.getEmail());
        Picasso.get()
                .load(user.getImage())
                .placeholder(R.drawable.placeholder_image)
                .into(holder.userImage);

        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(context, UserDetailsActivity.class);
            intent.putExtra("user", user);
            context.startActivity(intent);
        });

        // Set other user details
        // ...
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView userImage;
        TextView userName;
        TextView userFullName;
        TextView userEmail;
        CardView cardView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userImage = itemView.findViewById(R.id.userImage);
            userName = itemView.findViewById(R.id.userName);
            userFullName = itemView.findViewById(R.id.userFullName);
            userEmail =itemView.findViewById(R.id.userEmails);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
