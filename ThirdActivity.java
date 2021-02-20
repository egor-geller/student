package com.example.gettaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    private EditText fromStreet, fromHouse, fromFlat, toStreet, toHouse, toFlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initViews();

    }

    public void initViews() {
        fromStreet = findViewById(R.id.editTextTextPersonName3);
        fromHouse = findViewById(R.id.editTextTextPersonName4);
        fromFlat = findViewById(R.id.editTextTextPersonName5);
        toStreet = findViewById(R.id.editTextTextPersonName6);
        toHouse = findViewById(R.id.editTextTextPersonName7);
        toFlat = findViewById(R.id.editTextTextPersonName8);
        Button okButton = findViewById(R.id.button5);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fromStreet.getText().toString().isEmpty() || fromHouse.getText().toString().isEmpty() || fromFlat.getText().toString().isEmpty()
                        || toStreet.getText().toString().isEmpty() || toHouse.getText().toString().isEmpty() || toFlat.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "Fill the fields!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent();
                intent.putExtra("StreetFrom", fromStreet.getText().toString());
                intent.putExtra("HouseFrom", fromHouse.getText().toString());
                intent.putExtra("FlatFrom", fromFlat.getText().toString());

                intent.putExtra("StreetTo", toStreet.getText().toString());
                intent.putExtra("HouseTo", toHouse.getText().toString());
                intent.putExtra("FlatTo", toFlat.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
