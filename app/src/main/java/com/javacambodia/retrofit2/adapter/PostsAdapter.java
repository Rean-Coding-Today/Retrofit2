package com.javacambodia.retrofit2.adapter;


import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javacambodia.retrofit2.wp.BasicPostVO;
import com.javacambodia.retrofit2.R;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostViewHolder>{

    private Context context;
    private List<BasicPostVO> apiObjectList;

    public PostsAdapter(Context context, List<BasicPostVO> apiObjects){
        this.context = context;
        this.apiObjectList =  apiObjects;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        BasicPostVO apiObject = apiObjectList.get(position);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            holder.title.setText(Html.fromHtml(apiObject.getTitle(), Html.FROM_HTML_MODE_COMPACT));
            holder.description.setText(Html.fromHtml(apiObject.getDescription(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            holder.title.setText(Html.fromHtml(apiObject.getTitle()));
            holder.description.setText(Html.fromHtml(apiObject.getDescription()));
        }
    }

    @Override
    public int getItemCount() {
        return apiObjectList.size();
    }
}
