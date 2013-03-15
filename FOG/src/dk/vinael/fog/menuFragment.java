package dk.vinael.fog;

import java.util.ArrayList;

import android.app.Fragment;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menuFragment extends Fragment implements OnClickListener {
	
	private ArrayList<String> items = new ArrayList<String>();
	private startActivity ac;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View returner = inflater.inflate(R.layout.fragment_menu, container, false);
		return returner;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ac = (startActivity) getActivity();
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
		ListView lv = (ListView) ac.findViewById(R.id.listView2);
		ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(ac, android.R.layout.simple_list_item_1, items);
		lv.setAdapter(myarrayAdapter);
		lv.setTextFilterEnabled(true);
		ac.findViewById(R.id.btn_private_party).setOnClickListener(this);
		ac.findViewById(R.id.btn_profil_settings).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) { 
		if (v.getId() == R.id.btn_private_party) {
			ac.changeFragment(partyFragment.class);
		} else if (v.getId() == R.id.btn_profil_settings) {
			ac.changeFragment(settingsFragment.class);
		}
	}
}
