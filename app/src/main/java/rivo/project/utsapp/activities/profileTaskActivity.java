package rivo.project.utsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import rivo.project.utsapp.R;

public class profileTaskActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_task);
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String u = extras.getString(taskDayActivity.USERNAME_KEY);
            String n = extras.getString(taskDayActivity.NAME_KEY);
            int a = extras.getInt(taskDayActivity.AGE_KEY);

            usernameText.setText(u);
            nameText.setText(n);
            ageText.setText(a+"");
            // TODO: display value here
        }
    }
}
