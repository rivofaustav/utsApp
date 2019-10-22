package rivo.project.utsapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import android.view.View;
import android.app.DialogFragment;

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

        final LinearLayout lr = (LinearLayout) findViewById(R.id.lr);
        Button btn = (Button) findViewById(R.id.btn);
        final TextView tv = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize a new time picker dialog fragment
                DialogFragment dFragment = new TimePickerFragment();

                // Show the time picker dialog fragment
                dFragment.show(getFragmentManager(),"Time Picker");
            }
        });

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
//datepicker
//    public void onButtonClicked(View v) {
//        DialogFragment newFragment = new DatePickerFragment();
//        newFragment.show(getFragmentManager(),"Date Picker");
//    }
}
