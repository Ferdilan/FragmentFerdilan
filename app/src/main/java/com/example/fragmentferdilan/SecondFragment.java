package com.example.fragmentferdilan;

import static android.view.View.inflate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {
    View view;
    Button secondButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

       view = inflater.inflate(R.layout.fragment_second, container, false);

       secondButton = (Button) view.findViewById(R.id.secondbutton);

       secondButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_SHORT).show    ();
           }
       });
        return view;
    }
}