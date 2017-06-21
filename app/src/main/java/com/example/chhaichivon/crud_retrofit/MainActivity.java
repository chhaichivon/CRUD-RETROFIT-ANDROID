package com.example.chhaichivon.crud_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chhaichivon.crud_retrofit.controlls.CategoryController;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		CategoryController categoryController = new CategoryController();
			categoryController.getAllCategory();
	}
}
