package com.gdg.hydroid.activities101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		// String fName = getIntent().getStringExtra("fName");
		// String lName = getIntent().getStringExtra("lName");

		User user = getIntent().getParcelableExtra("user");
		String fName = user.fName;
		String lName = user.lName;

		textView = (TextView) findViewById(R.id.hello_tv);
		textView.setText("Hello " + fName + " " + lName);

		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecondActivity.this,
						ThirdActivity.class);
				startActivityForResult(intent, 0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		String age = data.getStringExtra("age");
		textView.setText(textView.getText() + "\nYour age is: " + age);
		super.onActivityResult(requestCode, resultCode, data);
	}

}
