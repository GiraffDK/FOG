package dk.vinael.fog;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class partyFragment extends Fragment {
	ArrayList<String> items = new ArrayList<String>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View returner = inflater.inflate(R.layout.fragment_party_start, container, false);
		items.add("Nizzle Party1");
		items.add("Nizzle Party2");
		items.add("Nizzle Party3");
		return returner;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ListView lv = (ListView) getActivity().findViewById(R.id.list);
		ArrayAdapter<String> myarrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
		lv.setAdapter(myarrayAdapter);
		lv.setTextFilterEnabled(true);
	}

}
