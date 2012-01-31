package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterJdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterK;
	Button mainmenuJ;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.j);
	
	letterK=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuJ=(Button)findViewById(R.id.mainmenuJ);
	mainmenuJ.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuj=new Intent(letterJdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuj);
			
		}
	});
	
	
letterK.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentk=new Intent(letterJdetails.this,letterKdetails.class);
			startActivity(Intentk);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
