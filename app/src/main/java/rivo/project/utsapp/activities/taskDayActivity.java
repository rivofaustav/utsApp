package rivo.project.utsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import rivo.project.utsapp.R;

public class taskDayActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_day);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, profileTaskActivity.class);


        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

        intent.putExtra(USERNAME_KEY, username);
        intent.putExtra(NAME_KEY, name);
        intent.putExtra(AGE_KEY, age);

        startActivity(intent);
    }
}
