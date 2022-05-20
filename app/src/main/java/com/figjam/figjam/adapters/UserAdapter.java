package com.figjam.figjam.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import com.figjam.figjam.R;
import com.figjam.figjam.models.User;

public class UserAdapter extends  ArrayAdapter<User>{
    private static class ViewHolder{
        TextView id;
        TextView name;
    }

    public UserAdapter(Context context, ArrayList<User> users){
        super(context, R.layout.activity_create_user, users);
    }

    @Override
    //method to set view on activity
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_create_user, parent, false);

            viewHolder.id = (TextView) convertView.findViewById(R.id.id);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);

            convertView.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.id.setText(user.getId());
        viewHolder.name.setText(user.getName());

        return convertView;
    }
}
