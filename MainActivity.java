package com.example.gettaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String reg_name = "name";
    private static final String reg_surname = "surname";
    private static final String reg_phoneNumber = "telNumber";
    private Button registration, login;
    private EditText name, surname, phoneNumber;
    private SharedPreferences sPref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        loadText();
    }

    public void initialView() {
        login = findViewById(R.id.button2);
        registration = findViewById(R.id.button);
        name = findViewById(R.id.editTextTextPersonName);
        surname = findViewById(R.id.editTextTextPersonName2);
        phoneNumber = findViewById(R.id.editTextPhone);

        final Intent intent = new Intent(this, SecondActivity.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (phoneNumber.getText().toString().isEmpty() || name.getText().toString().isEmpty() || surname.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "You haven't entered something", Toast.LENGTH_SHORT).show();
                    return;
                }
                intent.putExtra("Phone", phoneNumber.getText().toString());
                intent.putExtra("Name", name.getText().toString());
                intent.putExtra("Surname", surname.getText().toString());
                startActivity(intent);
            }
        });
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (phoneNumber.getText().toString().isEmpty() || name.getText().toString().isEmpty() || surname.getText().toString().isEmpty()) {
                    Toast.makeText(v.getContext(), "You haven't entered something", Toast.LENGTH_SHORT).show();
                }
                intent.putExtra("Phone", phoneNumber.getText().toString());
                intent.putExtra("Name", name.getText().toString());
                intent.putExtra("Surname", surname.getText().toString());
                startActivity(intent);
                Toast.makeText(v.getContext(), "User data saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedUserName = sPref.getString(reg_name, "");
        name.setText(savedUserName);
        String savedSurname = sPref.getString(reg_surname, "");
        surname.setText(savedSurname);
        String savedPhone = sPref.getString(reg_phoneNumber, "");
        phoneNumber.setText(savedPhone);


        if (phoneNumber.getText().toString().isEmpty() || name.getText().toString().isEmpty() || surname.getText().toString().isEmpty()) {
            login.setVisibility(View.GONE);
            registration.setVisibility(View.VISIBLE);
        } else {
            login.setVisibility(View.VISIBLE);
            registration.setVisibility(View.GONE);
            Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();
        }
    }

    private void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sPref.edit();
        editor.putString(reg_name, name.getText().toString());
        editor.putString(reg_surname, surname.getText().toString());
        editor.putString(reg_phoneNumber, phoneNumber.getText().toString());
        editor.apply();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        //Uncomment to get back for registration menu.
        /*SharedPreferences.Editor editor = sPref.edit();
        editor.clear();
        editor.apply();*/
    }
}