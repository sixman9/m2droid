package com.yourpackage.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstAndroidActivity extends Activity implements OnClickListener {
	
	private Button button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Find a View component my the [system generated] Id
        button = (Button) findViewById(R.id.Button01);
        
        //Add onClick Listener (this)
        button.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		if(v.getId() == button.getId()) {
			//Button was clicked - switch to different layout
			setContentView(R.layout.layout2);
		}
		
	}
    

}
