package com.example.avto.retrofit_listobject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.avto.retrofit_listobject.R;
import com.example.avto.retrofit_listobject.model.User;

import java.util.List;

/**
 * Created by avto on 9/19/2016.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<User>userList;
    Context context;
    public UserAdapter(List<User>list,Context context){
        this.userList=list;
        this.context=context;
    }
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.userlist,parent,false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user=userList.get(position);
        holder.userId.setText(Integer.toString(user.getUserId()));
        holder.id.setText(Integer.toString(user.getId()));
        holder.title.setText(user.getTitle());
        holder.body.setText(user.getBody());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView userId,id,title,body;
        public UserViewHolder(View view){
            super(view);
            userId=(TextView)view.findViewById(R.id.tv_userId);
            id=(TextView)view.findViewById(R.id.tv_id);
            title=(TextView)view.findViewById(R.id.tv_title);
            body=(TextView)view.findViewById(R.id.tv_body);
        }
    }
}
