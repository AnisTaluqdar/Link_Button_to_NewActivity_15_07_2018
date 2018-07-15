package com.abhi.www.abhi4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myBtn2 = (Button) findViewById(R.id.BT2) ;

        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent my1Intent = new Intent(getApplicationContext(),MyActivity.class);
                startActivity(my1Intent);
            }
        });


    }
}
