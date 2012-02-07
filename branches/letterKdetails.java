package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterKdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterL;
	Button mainmenuk;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.k);
	
	letterL=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuk=(Button)findViewById(R.id.mainmenuK);
	mainmenuk.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenuk=new Intent(letterKdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenuk);
			
		}
	});
	
	
letterL.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentl=new Intent(letterKdetails.this,letterLdetails.class);
			startActivity(Intentl);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
