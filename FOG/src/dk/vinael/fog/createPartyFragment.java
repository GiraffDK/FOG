package dk.vinael.fog;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class createPartyFragment extends Fragment implements OnClickListener {
	ArrayList<String> items = new ArrayList<String>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View returner = inflater.inflate(R.layout.fragment_create_party, container, false);
		return returner;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		getActivity().findViewById(R.id.button1).setOnClickListener(this);
		
	}
	
	public void goToMenu(View v){
		startActivity sa = (startActivity) getActivity();
		sa.changeFragment(menuFragment.class);
	}

	@Override
	public void onClick(View v) {
		if (v.getId()==R.id.button1){
			goToMenu(v);
		}
	}
	

}
