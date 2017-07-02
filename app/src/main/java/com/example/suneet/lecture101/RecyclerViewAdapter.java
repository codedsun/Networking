package com.example.suneet.lecture101;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by suneet on 2/7/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<User> userArrayList;
    Context c;
    TextView tid;
    TextView tuserId;
    TextView tbody;
    TextView ttitle;
    public RecyclerViewAdapter(ArrayList<User> userArrayList, Context c) {
        this.userArrayList = userArrayList;
        this.c = c;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(c).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            User user=userArrayList.get(position);
            tid.setText(user.getId());
            tuserId.setText(user.getUserId());
        tbody.setText(user.getBody());
        ttitle.setText(user.getTitle());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }
    public   class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
            tid= (TextView) itemView.findViewById(R.id.tid);
            tuserId= (TextView) itemView.findViewById(R.id.tuserId);
            ttitle= (TextView) itemView.findViewById(R.id.ttitle);
            tbody= (TextView) itemView.findViewById(R.id.tbody);

        }
    }
}
