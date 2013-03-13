package dk.vinael.fog;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ArrayList<String> items = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		ListView lv = (ListView)	findViewById(R.id.listView1);
		ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		lv.setAdapter(myarrayAdapter);
		lv.setTextFilterEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
