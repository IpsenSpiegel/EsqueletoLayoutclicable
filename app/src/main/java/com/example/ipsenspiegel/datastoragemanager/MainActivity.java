package com.example.ipsenspiegel.datastoragemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG_MAIN_ACTIVITY = "In-MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button ok_Btn = (Button) this.findViewById(R.id.btnOk);
        ok_Btn.setOnClickListener(this);
        final Button internalStorage_Btn = (Button) this.findViewById(R.id.btnInternalStorage);
        internalStorage_Btn.setOnClickListener(this);
        final Button externalStorage_Btn = (Button) this.findViewById(R.id.btnExternalStorage);
        externalStorage_Btn.setOnClickListener(this);
        final Button getFiles_Btn = (Button) this.findViewById(R.id.btnGetFiles);
        getFiles_Btn.setOnClickListener(this);
        final Button createDB_Btn = (Button) this.findViewById(R.id.btnDataBase);
        createDB_Btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View whichView) {
        if (whichView.getId() == R.id.btnOk)
        {
            Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Update button clicked");
        }
        else if (whichView.getId() == R.id.btnInternalStorage)
        {
            Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Internal storage button clicked");
        }
        else if (whichView.getId() == R.id.btnExternalStorage)
        {
            Log.i(MainActivity.TAG_MAIN_ACTIVITY, "External storage button clicked");

        }
        else if (whichView.getId() == R.id.btnGetFiles)
        {
            Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Get files button clicked");
        }
        else if (whichView.getId() == R.id.btnDataBase)
        {
            Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Create DB button clicked");

        }
    }


}




