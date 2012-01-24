package com.example.learnABCD;

import android.animation.IntEvaluator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class letterBdetails extends Activity implements OnClickListener
{
	
	ImageButton letterA;
	ImageButton letterC;
	Button mainmenub;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.b);
	letterA=(ImageButton)findViewById(R.id.imageButtonA);
	letterC=(ImageButton)findViewById(R.id.imageButtonC);
	mainmenub=(Button)findViewById(R.id.menub);
	letterA.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		Intent Intentb=new Intent(letterBdetails.this,letterAdetails.class);
		startActivity(Intentb);
		}
	});
	
	mainmenub.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentmainmenub=new Intent(letterBdetails.this,LearnABCDActivity.class);
			startActivity(Intentmainmenub);
			
		}
	});
	
/*	letterC.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent Intentc=new Intent(letterBdetails.this,letterCdetails.class);
			startActivity(Intentc);
			
		}
	});
*/
	
}


@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
