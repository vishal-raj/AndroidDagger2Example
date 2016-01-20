package com.vishu.androiddagger2example.ui.activity.module;

import com.vishu.androiddagger2example.ActivityScope;
import com.vishu.androiddagger2example.data.api.GingerApiService;
import com.vishu.androiddagger2example.ui.SplashActivity;
import com.vishu.androiddagger2example.ui.activity.presenter.SplashActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 20-01-2016.
 */
@Module
public class SplashActivityModule {
    private SplashActivity splashActivity;

    public SplashActivityModule(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
    }

    @Provides
    @ActivityScope
    SplashActivity provideSplashActivity() {
        return splashActivity;
    }

    @Provides
    @ActivityScope
    SplashActivityPresenter
    provideSplashActivityPresenter(GingerApiService gingerApiService) {
        return new SplashActivityPresenter(splashActivity, gingerApiService);
    }
}
