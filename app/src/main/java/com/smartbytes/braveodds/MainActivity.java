package com.smartbytes.braveodds;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText tb_username, tb_password;
    ImageButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb_username = findViewById(R.id.tb_username);
        tb_password = findViewById(R.id.tb_password);
        submit = findViewById(R.id.submit_button_image);
    }

    public void Submit_clicked(View view) {
        Toast.makeText(MainActivity.this, "Password Submitted", Toast.LENGTH_SHORT).show();
    }
}
