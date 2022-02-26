package com.example.journeyjournal;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class JournalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.journal_activity);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("some") != null)
            {
                Toast.makeText(getApplicationContext(), "data", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
