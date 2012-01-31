package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterNdetails extends Activity implements OnClickListener
{
	
	
	ImageButton letterO;
	Button mainmenuN;
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.n);
	
	letterO=(ImageButton)findViewById(R.id.imageButton1);
	mainmenuN=(Button)findViewById(R.id.mainmenuN);
	mainmenuN.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenun=new Intent(letterNdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenun);
			
		}
	});
	
	
letterO.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intento=new Intent(letterNdetails.this,letterOdetails.class);
			startActivity(Intento);			
		}
	});

	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
