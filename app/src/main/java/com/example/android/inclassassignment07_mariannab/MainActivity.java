package com.example.android.inclassassignment07_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView list;
    String typedData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (TextView) findViewById(R.id.people_summary);
        typedData = list.getText().toString();
    }

    public void addPerson(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, Keys.REQUEST_ADD_PERSON);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Keys.REQUEST_ADD_PERSON && resultCode == RESULT_OK) {
            Person person = (Person) data.getSerializableExtra(Keys.PERSON);
            typedData = typedData + person.toString() + "\n";
            list.setText(typedData);
        }
    }
}
