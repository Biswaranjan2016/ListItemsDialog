package com.example.happy.listitemsdialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListItem extends DialogFragment {


    public ListItem() {
        // Required empty public constructor
    }

    public Dialog onCreateDialog(Bundle savedInstance){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Pick Color")
                .setItems(R.array.colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        View view = getActivity().getWindow().getDecorView();
                        setColor(which,view);
                    }
                });
        return builder.create();
    }
    public void setColor(int position,View view){
        switch (position){
            case 0: view.setBackgroundColor(Color.parseColor("red"));
                break;
            case 1: view.setBackgroundColor(Color.parseColor("green"));
                break;
            case 2: view.setBackgroundColor(Color.parseColor("yellow"));
                break;
            case 3: view.setBackgroundColor(Color.parseColor("blue"));
                break;
        }
    }

}
