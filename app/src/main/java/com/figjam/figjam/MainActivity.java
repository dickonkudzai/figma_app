package com.figjam.figjam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    Button btnViewLinkUsers;

    Button btnViewDatabaseUsers;

    Button btnCreateUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnViewLinkUsers = (Button) findViewById(R.id.btnViewLinkUsers);

        btnViewDatabaseUsers = (Button) findViewById(R.id.btnViewDatabaseUsers);

        btnCreateUser = (Button) findViewById(R.id.btnCreateUser);

        btnViewLinkUsers.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                // Launching link users  Activity

                Intent i = new Intent(getApplicationContext(), LinkUsers.class);

                startActivity(i);
            }

        });

        btnViewDatabaseUsers.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                // Launching database users  Activity

                Intent i = new Intent(getApplicationContext(), DatabaseUsers.class);

                startActivity(i);
            }

        });

        btnCreateUser.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                // Launching create users  Activity

                Intent i = new Intent(getApplicationContext(), CreateUser.class);

                startActivity(i);
            }

        });
    }
}
