package com.example.recyclerv5;

import static com.example.recyclerv5.R.id.recyclerviewId;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ContactModel> arrayContact = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(recyclerviewId);

         recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayContact.add(new ContactModel(R.drawable.contact,"Samia","27647929646"));
        arrayContact.add(new ContactModel(R.drawable.contact,"Munim","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"A","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"M","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"K","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"L","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"J","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"O","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"I","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"K","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"G","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"E","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"Y","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"U","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"W","7324824987"));
        arrayContact.add(new ContactModel(R.drawable.contact,"Z","7324824987"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrayContact);
        recyclerView.setAdapter(adapter);

        System.out.println("hello this is my First Commit");




    }
}