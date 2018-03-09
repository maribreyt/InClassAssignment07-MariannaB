package com.example.android.inclassassignment07_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText name;
    EditText age;
    CheckBox glasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        glasses = (CheckBox) findViewById(R.id.glasses_checkbox);
    }

    public void submit(View view) {
        String nameEntered = name.getText().toString();
        int ageEntered = Integer.parseInt(age.getText().toString());
        boolean wearingGlasses = glasses.isChecked();

        Person person = new Person(nameEntered, ageEntered, wearingGlasses);
        Intent data = new Intent();
        data.putExtra(Keys.PERSON, person);
        setResult(RESULT_OK, data);
        finish();
    }
}
