package com.android.sync;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen  extends Activity
{
	public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift);
      //  setContentView();
        
       Button Income=(Button)findViewById(R.id.income);
       Button Conflict=(Button)findViewById(R.id.conflict);
       Bundle b=new Bundle();
       MainListener maiListener=new MainListener();
       Income.setOnClickListener(maiListener);
       Conflict.setOnClickListener(maiListener);
       //b.put
       
       /*Income.setOnClickListener(new OnClickListener() 
       {
		
		@Override
		public void onClick(View v) 
		{
			
			Intent iMainActivity=new Intent(MainScreen.this,MainActivity.class);
			startActivity(iMainActivity);
			
		}
	});*/
        
    }
	class MainListener implements View.OnClickListener 
	{
		@Override
		public void onClick(View v) 
		{
			
			Bundle bundle=setBundelParameters(v);
			
			Intent iMainActivity=new Intent(MainScreen.this,MainActivity.class);
			iMainActivity.putExtras(bundle);
			startActivity(iMainActivity);
			
		}
	}
	Bundle setBundelParameters(View v)
	{	
		Bundle bundle=new Bundle();
		bundle.putInt("id", v.getId());
		
		/*
		 * code to retrieve data according to the required category
		 */
		// dummy data!
		ArrayList lData=new ArrayList<String>();
		if(v.getId()==R.id.income)
		{
			lData.add("Title: Income");
			lData.add("Date: 25th march");
			lData.add("Category: abcd");
			lData.add("Code:xyz");
			bundle.putCharSequenceArrayList("data",lData);
		}
		if(v.getId()==R.id.conflict)
		{
			lData.add("Title: Conflict");
			lData.add("Date: 25th march");
			lData.add("person: Roit");
			lData.add("Reason: Got bored");
			bundle.putCharSequenceArrayList("data",lData);
		}
		return bundle;
	}

}

