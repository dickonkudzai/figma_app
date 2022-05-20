package com.figjam.figjam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.figjam.figjam.adapters.UserAdapter;
import com.figjam.figjam.clients.UserRestClient;
import com.figjam.figjam.models.User;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.message.BasicHeader;

public class DatabaseUsers extends AppCompatActivity {
    private ListView userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_users);

        getUsers();
    }

    private void getUsers(){
        List<Header> headers = new ArrayList<Header>();
        headers.add(new BasicHeader("Accept", "application/json"));

        UserRestClient.get(DatabaseUsers.this, "user", headers.toArray(new Header[headers.size()]), null, new JsonHttpResponseHandler(){

            //@Override
            public void onSuccess(Boolean statusCode, Header[] headers, JSONArray response){
                ArrayList<User> userArray = new ArrayList<User>();
                UserAdapter userAdapter = new UserAdapter(DatabaseUsers.this, userArray);

                //looping through the response to display
                for(int i = 0; i < response.length(); i++){
                    try {
                        userAdapter.add(new User(response.getJSONObject(i)));
                    } catch (JSONException e){
                        e.printStackTrace();
                    }
                }

                userList = (ListView) findViewById(R.id.list_users);
                userList.setAdapter(userAdapter);
            }
        });
    }
}
