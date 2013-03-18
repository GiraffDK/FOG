package dk.vinael.fog;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menuActivity extends Activity {
	
	private ArrayList<String> items = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_menu);
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		ListView lv = (ListView) findViewById(R.id.listView2);
		ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		lv.setAdapter(myarrayAdapter);
		lv.setTextFilterEnabled(true);	
	}


	public void onClick(View v) { 
		if (v.getId() == R.id.btn_private_party) {
			Intent intent = new Intent(this, partyActivity.class);
			startActivity(intent);
		} else if (v.getId() == R.id.btn_news) {
			Intent intent = new Intent(this, newsActivity.class);
			startActivity(intent);
		} else if (v.getId() == R.id.btn_profil_settings) {
			Intent intent = new Intent(this, profileSettingsActivity.class);
			startActivity(intent);
		}
	}
}
