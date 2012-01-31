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
	Button F;
	Button G;
	Button H;
	Button I;
	Button J;
	Button K;
	Button L;
	Button M;
	Button N;
	Button O;
	Button P;
	Button Q;
	Button R;
   Button S;
	
	
	
	
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
        F=(Button)findViewById(R.id.buttonF);
        G=(Button)findViewById(R.id.button8);
        H=(Button)findViewById(R.id.button7);
        I=(Button)findViewById(R.id.button9);
        J=(Button)findViewById(R.id.button10);
        K=(Button)findViewById(R.id.button11);
        L=(Button)findViewById(R.id.button12);
        M=(Button)findViewById(R.id.button13);
        N=(Button)findViewById(R.id.button14);
        O=(Button)findViewById(R.id.button15);
        P=(Button)findViewById(R.id.button16);
        Q=(Button)findViewById(R.id.button17);
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
        
        
        C.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent IntentC=new Intent(LearnABCDActivity.this,letterCdetails.class);
			startActivity(IntentC);
			}
		});
        
        
        D.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentD=new Intent(LearnABCDActivity.this,letterDdetails.class);
				startActivity(IntentD);
			}
		});
        
        E.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentE=new Intent(LearnABCDActivity.this,letterEdetails.class);
				startActivity(IntentE);
			}
		});

        F.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentF=new Intent(LearnABCDActivity.this,letterFdetails.class);
				startActivity(IntentF);
			}
		});
        G.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentG=new Intent(LearnABCDActivity.this,letterGdetails.class);
				startActivity(IntentG);
			}
		});
        
        H.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentH=new Intent(LearnABCDActivity.this,letterHdetails.class);
				startActivity(IntentH);
			}
		});
        
        I.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentI=new Intent(LearnABCDActivity.this,letterIdetails.class);
				startActivity(IntentI);
			}
		});
        
        J.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentJ=new Intent(LearnABCDActivity.this,letterJdetails.class);
				startActivity(IntentJ);
			}
		});
        
        K.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentK=new Intent(LearnABCDActivity.this,letterKdetails.class);
				startActivity(IntentK);
			}
		});
        L.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentL=new Intent(LearnABCDActivity.this,letterLdetails.class);
				startActivity(IntentL);
			}
		});
        
        M.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentM=new Intent(LearnABCDActivity.this,letterMdetails.class);
				startActivity(IntentM);
			}
		});
        
        N.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentN=new Intent(LearnABCDActivity.this,letterNdetails.class);
				startActivity(IntentN);
			}
		});
        
        O.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentO=new Intent(LearnABCDActivity.this,letterOdetails.class);
				startActivity(IntentO);
			}
		});
        
        P.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentP=new Intent(LearnABCDActivity.this,letterPdetails.class);
				startActivity(IntentP);
			}
		});
        
        Q.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent IntentQ=new Intent(LearnABCDActivity.this,letterQdetails.class);
				startActivity(IntentQ);
			}
		});
        








        

      }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}


}
