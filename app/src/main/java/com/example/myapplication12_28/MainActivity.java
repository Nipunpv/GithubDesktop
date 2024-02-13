package com.example.myapplication12_28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ArrayList<String> itemList = new ArrayList<String>();
    Button InsertButton = findViewById(R.id.buttonInsert);
    Button RemoveButton = findViewById(R.id.buttonRemove);
    Button DisplayButton = findViewById(R.id.buttonDisplay);
    TextView textView = findViewById(R.id.textView);

    InsertButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            itemList.add("Apple");
            Toast.makeText(MainActivity.this, "Apple added to ItemList", Toast.LENGTH_SHORT).show();
        }
    });
    RemoveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                itemList.remove(itemList.size()-1);
                Toast.makeText(MainActivity.this, "last item removed from list", Toast.LENGTH_SHORT).show();

            }catch (Exception e){
                Toast.makeText(MainActivity.this, "Item List is Empty", Toast.LENGTH_SHORT).show();
            }
        }
    });

    DisplayButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            StringBuilder displayText = new StringBuilder("Item List \n");
            for (String item : itemList){
            displayText.append(item).append("\n");
            }
        textView.setText(displayText.toString());

        }
    });

}
}