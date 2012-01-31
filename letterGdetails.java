package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterGdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterH;
	Button mainmenuG;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.g);
	
	letterH=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuG=(Button)findViewById(R.id.mainmenuG);
	mainmenuG.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenug=new Intent(letterGdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenug);
			
		}
	});
	
	
letterH.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intenth=new Intent(letterGdetails.this,letterHdetails.class);
			startActivity(Intenth);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
