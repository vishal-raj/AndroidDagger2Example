package com.vishu.androiddagger2example;

import android.app.Application;
import android.content.Context;

/**
 * Created by User on 20-01-2016.
 */
public class GingerApplication extends Application {
    private AppComponent appComponent;

    public static GingerApplication get(Context context) {
        return (GingerApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //Timber.plant(new Timber.DebugTree());
        }

        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
