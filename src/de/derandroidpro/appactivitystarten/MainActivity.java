package de.derandroidpro.appactivitystarten;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	public Button btn1;
	
	public Intent activityintent = new Intent();
	
	public String packagename = "com.android.settings";
	public String activityname = "com.android.settings.wifi.WifiSettings";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		
		case R.id.button1: {
			
			try {
			
			
			activityintent.setComponent(new ComponentName(packagename, activityname));
			startActivity(activityintent);
			
			}
			
			catch (Exception e){
				
				Toast.makeText(getApplicationContext(), "Activity konnte nicht gestartet werden.", Toast.LENGTH_SHORT).show();
				
			}
			
		}
		
		
		}
	}


}
