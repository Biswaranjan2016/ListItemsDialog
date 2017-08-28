package com.example.happy.listitemsdialog;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    ListItem listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        listItem = new ListItem();
        listItem.show(fragmentManager,"setColor");

        Button button = (Button) findViewById(R.id.pickerBtn);
        button.setOnClickListener(new ListenerClass());
    }
    public class ListenerClass implements View.OnClickListener{
        public void onClick(View view){
            showOption();
        }
    }
    public void showOption(){
        listItem.show(fragmentManager,"setColor");
    }
}
