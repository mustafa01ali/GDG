package com.hydroid.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		displayData();
	}

	private void displayData() {

		TextView tv = (TextView) findViewById(R.id.textView);
		
		// Get the original intent
		Intent i = getIntent();
		
		// Display the data passed via the intent
		tv.setText(String.format("%s: %s\n\n%s: %s", getString(R.string.name), i.getStringExtra("name"), getString(R.string.email), i.getStringExtra("email")));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
