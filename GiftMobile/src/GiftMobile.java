package com.android.sync;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GiftMobile extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
      //  setContentView();
        
       Button login=(Button)findViewById(R.id.signin);
       
       login.setOnClickListener(new OnClickListener() 
       {
		
		@Override
		public void onClick(View v) 
		{
			Intent iMainActivity=new Intent(GiftMobile.this,MainScreen.class);
			startActivity(iMainActivity);
			
		}
	});
        
    }
}