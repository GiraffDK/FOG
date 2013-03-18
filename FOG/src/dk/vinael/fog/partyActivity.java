package dk.vinael.fog;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class partyActivity extends Activity {
	ArrayList<String> items = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_party_start);
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		
		ListView lv = (ListView) (ListView) findViewById(R.id.list);
		ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		lv.setAdapter(myarrayAdapter);
		lv.setTextFilterEnabled(true);
	}
	
	public void onClick(View v){
		if (v.getId() == R.id.btn_add) {
			Intent intent = new Intent(this, createPartyActivity.class);
			startActivity(intent);
			
		} else if (v.getId() == R.id.btn_search) {
			Intent intent = new Intent(this, searchPartyActivity.class);
			startActivity(intent);
		} else if (v.getId() == R.id.btn_history) {
			Intent intent = new Intent(this, partyHistoryActivity.class);
			startActivity(intent);
		}
	}
	
	
//	@Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		super.onActivityCreated(savedInstanceState);
//		
//	}

}
