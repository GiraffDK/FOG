package dk.vinael.fog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class startActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// if logged in > menu else login
		setContentView(R.layout.fragment_login);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void goToMenu(View v){
		finish();
		Intent intent = new Intent(this, menuActivity.class);
		startActivity(intent);
	}
}

