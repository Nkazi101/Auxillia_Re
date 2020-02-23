package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class vendoravail extends AppCompatActivity {
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendoravail);
        txt =(TextView)findViewById(R.id.mytext);
        btn=(Button)findViewById(R.id.mybutton);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText("Excess food available for pick-up");
            }
        });
    }
}
