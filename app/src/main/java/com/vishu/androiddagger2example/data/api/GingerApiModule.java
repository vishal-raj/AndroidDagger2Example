package com.vishu.androiddagger2example.data.api;

import android.app.Application;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.vishu.androiddagger2example.BuildConfig;
import com.vishu.androiddagger2example.R;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Vishal on 20-01-2016.
 */

@Module
public class GingerApiModule {
    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okClient = new OkHttpClient();
        okClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Response response = chain.proceed(chain.request());
                return response;
            }
        });
        okClient.interceptors().add(logging);
        return okClient;
    }

    @Provides
    @Singleton
    public Retrofit provideRestAdapter(Application application, OkHttpClient okHttpClient) {
        Retrofit client = new Retrofit.Builder()
                .baseUrl("http://52.26.6.81/api/index.php/")
                .addConverter(String.class, new ToStringConverter())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        if (BuildConfig.DEBUG) {
            //client.setLogLevel(RestAdapter.LogLevel.FULL);
        }

        return client;
    }

    @Provides
    @Singleton
    public GingerApiService provideGingerApiService(Retrofit retrofit) {
        return retrofit.create(GingerApiService.class);
    }
}
