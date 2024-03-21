package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public void send(View view){
        EditText edtName = (EditText) findViewById(R.id.edtName);
        String string2send = edtName.getText().toString();

        Intent intent = new Intent(this, DisplayStringActivity.class);
        intent.putExtra("userName", string2send);
        startActivity(intent);
    }
}