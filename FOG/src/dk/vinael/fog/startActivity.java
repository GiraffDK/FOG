package dk.vinael.fog;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class startActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_framelayout);
		
		changeFragment(loginFragment.class);
	}
	
	public void changeFragment(Class<? extends Fragment> instanstiate) {
			
			try {
				FragmentManager fm = getFragmentManager();
				FragmentTransaction transaction;
				transaction = fm.beginTransaction();
				Fragment lastFrag = instanstiate.newInstance();
				transaction.replace(R.id.frameLayout2, lastFrag);
				transaction.commit();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
}

