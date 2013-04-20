package com.gdg.hydroid.activities101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private final String LOG_TAG = "GDG";
	private EditText fNameEditText;
	private EditText lNameEditText;
	private Button loginButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		fNameEditText = (EditText) findViewById(R.id.editText1);
		lNameEditText = (EditText) findViewById(R.id.editText2);
		loginButton = (Button) findViewById(R.id.button1);

		loginButton.setOnClickListener(loginButtonListener);
	}

	private OnClickListener loginButtonListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			String fName = fNameEditText.getText().toString();
			String lName = lNameEditText.getText().toString();

			User user = new User();
			user.fName = fName;
			user.lName = lName;

			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			// intent.putExtra("fName", fName);
			// intent.putExtra("lName", lName);
			intent.putExtra("user", user);
			startActivity(intent);
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(LOG_TAG, "onDestroy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(LOG_TAG, "onPause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d(LOG_TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.d(LOG_TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.d(LOG_TAG, "onStop");
		super.onStop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
