package com.hydroid.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private final String LOG_TAG = "HYDROID";
	
	private EditText nameET;
	private EditText emailET;
	
	private Button submitBtn;
	private Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
    	nameET = (EditText) findViewById(R.id.editText1);
    	emailET = (EditText) findViewById(R.id.editText2);
    	submitBtn = (Button) findViewById(R.id.button1);
    	clearBtn = (Button) findViewById(R.id.button2);
    	
    	submitBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = nameET.getText().toString();
				String email = emailET.getText().toString();
				
				Log.d(LOG_TAG, "Name: " + name);
				Log.i(LOG_TAG, "Email: " + email);
				
			}
		});
    	
    	clearBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				nameET.setText("");
				emailET.setText("");
				nameET.requestFocus();
			}
		});
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
