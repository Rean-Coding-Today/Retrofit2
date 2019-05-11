package com.javacambodia.retrofit2.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.javacambodia.retrofit2.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;

    public PostViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.post_title);
        description = (TextView) itemView.findViewById(R.id.post_description);
    }
}
