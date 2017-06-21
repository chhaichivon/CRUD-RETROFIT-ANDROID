package com.example.chhaichivon.crud_retrofit.controlls;

import android.util.Log;

import com.example.chhaichivon.crud_retrofit.api.Api;
import com.example.chhaichivon.crud_retrofit.models.Category;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Iterator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chhaichivon on 6/22/17.
 */

public class CategoryController implements Callback<List<Category>> {

	private static String CATEOGRY_URL ="localhost:9000/api/category/";

	public void getAllCategory(){
		Gson gson = new GsonBuilder()
						.setLenient()
						.create();

		Retrofit retrofit = new Retrofit
								.Builder()
								.baseUrl(CATEOGRY_URL)
								.addConverterFactory(GsonConverterFactory.create(gson))
								.build();
		Api api = retrofit.create(Api.class);

		Call<List<Category>> call = api.getAllCategoris();
		call.enqueue(this);
	}
	@Override
	public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
		if(response.isSuccessful()){
			List<Category>  categoryList = response.body();
			for(Category category : categoryList){
				Log.d("Category Name " , category.getName());
				Log.d("Category Name " , category.getDescription());
			}
		}else{
			Log.d("ERROR ", response.errorBody()  +"");
		}
	}

	@Override
	public void onFailure(Call<List<Category>> call, Throwable t) {
		Log.d("onFailure", t.getMessage());
	}
}
