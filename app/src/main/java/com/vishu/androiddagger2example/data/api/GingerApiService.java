package com.vishu.androiddagger2example.data.api;

import com.vishu.androiddagger2example.data.model.Category;
import com.vishu.androiddagger2example.data.model.CheckLocation;
import com.vishu.androiddagger2example.data.model.Location;
import com.vishu.androiddagger2example.data.model.SubCategory;
import com.vishu.androiddagger2example.data.model.SubCategoryParams;
import com.vishu.androiddagger2example.data.model.Token;

import org.json.JSONObject;

import java.util.HashMap;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by User on 20-01-2016.
 */
public interface GingerApiService {

    @POST("user/getlist")
    Observable<Category> getCategoryList(@Body Location location);

    @POST("user/checkloc")
    Call<CheckLocation> checkLocation(@Body Location location);

    @POST("user/getlist")
    Call<SubCategory> getProducts(@Body HashMap<String, String> hashMap);

    @POST("user/getlist")
    Call<SubCategory> getProductList(@Body SubCategoryParams subCategoryParams);

    @POST("user/getin")
    Call<JSONObject> login(@Body HashMap<String, String> hashMap);

    @POST("user/verify")
    Call<Token> verifyOTP(@Body HashMap<String, String> hashMap);

}
