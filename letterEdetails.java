package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterEdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterF;
	Button mainmenuE;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.e);
	
	letterF=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuE=(Button)findViewById(R.id.mainmenuE);
	mainmenuE.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenue=new Intent(letterEdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenue);
			
		}
	});
	
	
letterF.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentf=new Intent(letterEdetails.this,letterFdetails.class);
			startActivity(Intentf);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
