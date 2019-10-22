package rivo.project.utsapp.fragments;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;

import rivo.project.utsapp.R;
import rivo.project.utsapp.activities.MainActivity;
import rivo.project.utsapp.activities.taskDayActivity;


public class DetailsFragment extends Fragment {
    TextView name,location, textadd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details_info, container, false);
        name = (TextView)view.findViewById(R.id.Name);
        location = (TextView)view.findViewById(R.id.Location);
        textadd = (TextView)view.findViewById(R.id.Add);

//        SpannableString ss = new SpannableString("Request");
//        ClickableSpan clickableSpan = new ClickableSpan() {
//            @Override
//            public void onClick(View textView) {
//
//            }
//        };

        Button btn1 = (Button) view.findViewById(R.id.Add);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), taskDayActivity.class);
                ((MainActivity) getActivity()).startActivity(intent);

            }
        });

        return view;
    }
    public void change(String uname, String ulocation){
        name.setText(uname);
        location.setText(ulocation);
    }


//    public void handleAdd(View v){
//        Intent intent = new Intent(getActivity(), taskDayActivity.class);
//        startActivity(intent);
//    }

}