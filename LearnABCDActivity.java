package com.example.learnABCD;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;

public class LearnABCDActivity extends Activity implements OnClickListener
{
	Button A;
	Button B;
	Button C;
	Button D;
	Button E;
	
    /*Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        A=(Button)findViewById(R.id.buttonA);
        B=(Button)findViewById(R.id.buttonB);
        C=(Button)findViewById(R.id.buttonC);
        D=(Button)findViewById(R.id.buttonD);
        E=(Button)findViewById(R.id.buttonE);
     
        A.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentA=new Intent(LearnABCDActivity.this,letterAdetails.class);
				startActivity(IntentA);
			}
		});
        
        B.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent IntentB=new Intent(LearnABCDActivity.this,letterBdetails.class);
			startActivity(IntentB);
			}
		});
      }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}


}