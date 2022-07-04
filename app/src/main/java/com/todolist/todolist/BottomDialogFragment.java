package com.todolist.todolist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class BottomDialogFragment extends BottomSheetDialogFragment {


    public BottomDialogFragment() {
        // Required empty public constructor
    }


    private EditText Title, Description;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bottom_dialog, container, false);
        return view;
    }
}