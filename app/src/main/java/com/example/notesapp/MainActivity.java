package com.example.notesapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.notesapp.models.Note;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

//ctrl+o to create @Override methods
    //logd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: called.");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: called.");

        // ctrl + hover over "Note" to see constructor
        Note note = new Note("title", "content", "timestamp" );
        Log.d(TAG, "onCreate: my note: " + note.toString());

        //empty constructor plus manual inputs
        Note note2 = new Note();
        note2.setTitle("title");
        note2.setContent("content");
        note2.setTimestamp("timestamp");



    }
}
