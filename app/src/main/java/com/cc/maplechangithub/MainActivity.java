package com.cc.maplechangithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cc.cctoast.CCTost;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CCTost.show(getApplicationContext(),"啦啦啦");
	}
}
