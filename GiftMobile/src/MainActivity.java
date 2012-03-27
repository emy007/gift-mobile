package com.android.sync;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
       //Bundle info=getIntent().getExtras();
       
      // String screenInfo=info.getString("screenInfo");
       /*
        * code to retrieve data about this screen from usb connection
        * getUsbConnection();
        * getDevice();
        * create stream;
        * read file and retrieve required data;
        * get the data in Map with name value pairs!
        * 
        */
       
       // Dummy data for display retrieval 
      
       Bundle bData=getIntent().getExtras();
       ArrayList l=bData.getCharSequenceArrayList("data");
       
       ScrollView sMain=new ScrollView(this);
        LinearLayout lMain=new LinearLayout(this);
        lMain.setOrientation(LinearLayout.VERTICAL);
        
        LinearLayout lTitle=new LinearLayout(this);
 	   lTitle.setOrientation(LinearLayout.HORIZONTAL);
 	   
       for(int i=0;i<l.size();i++)
       {
    	   LinearLayout lRow=new LinearLayout(this);
    	   lRow.setOrientation(LinearLayout.HORIZONTAL);
    	   
    	   /*
    	    * retrieve require data from above map and add to linearlayout!
    	    * 
    	    */
    	   String data=(String)l.get(i);
    	   
    	   TextView key=new TextView(this);
    	   key.setText(data.split(":")[0]+ " :");
    	   
    	   TextView value=new TextView(this);
    	   value.setText(data.split(":")[1]);
    	   
    	   lRow.addView(key);
    	   lRow.addView(value);
    	   lMain.addView(lRow);
    	   
       }
       sMain.addView(lMain);
       
       setContentView(sMain);
    }
	/*
	 * 	Add to menu required options to menu!
	 * 
	 */
}
