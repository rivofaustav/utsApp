package rivo.project.utsapp.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import rivo.project.utsapp.R;

public class ListMenuFragment extends ListFragment {
    String[] users = new String[] { "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
    String[] location = new String[]{"Malang","Malang","Malang","Malang","Malang","Malang"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.listitems_info, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change("Day: "+ users[position],"Location : "+ location[position]);
        getListView().setSelector(android.R.color.holo_green_light);
    }
}