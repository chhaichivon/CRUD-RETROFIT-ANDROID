package com.example.chhaichivon.crud_retrofit.api;

import com.example.chhaichivon.crud_retrofit.models.Category;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

/**
 * Created by chhaichivon on 6/22/17.
 */

public interface Api {

	@GET("get-all-category")
	Call<List<Category>> getAllCategoris();

	@GET("get-category-by-name/{name}")
	Call<List<Category>> getCategoryByName(@Part("name") String name);

	@GET("get-category-by-id/{id}")
	Call<Category> getCategoryById(@Part("id") Long id);

	@POST("save-category")
	Call<Category> saveCategory(@Body Category category);

	@Multipart
	@PUT("update-category")
	Call<Category> updateCategory(@Body Category category);
}
