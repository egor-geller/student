package com.example.gettaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView nameField, numberField, pathField;
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        Intent intent = getIntent();
        nameField.setText(getString(R.string._savedPar, intent.getStringExtra("Name"), intent.getStringExtra("Surname")));
        numberField.setText(intent.getStringExtra("Phone"));
    }

    public void initViews() {
        nameField = findViewById(R.id.textView);
        numberField = findViewById(R.id.textView2);
        pathField = findViewById(R.id.textView3);
        Button setPath = findViewById(R.id.button3);
        call = findViewById(R.id.button4);

        setPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ThirdActivity.class);
                startActivityForResult(intent, 1);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Wait for Taxi. Good Luck!", Toast.LENGTH_SHORT).show();
            }
        });
        call.setEnabled(false);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null) {
            Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show();
            return;
        }

        String StreetFrom = data.getStringExtra("StreetFrom");
        String HouseFrom = data.getStringExtra("HouseFrom");
        String FlatFrom = data.getStringExtra("FlatFrom");
        String StreetTo = data.getStringExtra("StreetTo");
        String HouseTo = data.getStringExtra("HouseTo");
        String FlatTo = data.getStringExtra("FlatTo");

        pathField.setText(getString(R.string._full_path, StreetFrom, HouseFrom, FlatFrom, StreetTo, HouseTo, FlatTo));
        call.setEnabled(true);

    }
}
