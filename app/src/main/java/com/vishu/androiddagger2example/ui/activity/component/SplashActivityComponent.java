package com.vishu.androiddagger2example.ui.activity.component;

import com.vishu.androiddagger2example.ActivityScope;
import com.vishu.androiddagger2example.ui.activity.SplashActivity;
import com.vishu.androiddagger2example.ui.activity.module.SplashActivityModule;

import dagger.Subcomponent;

/**
 * Created by User on 20-01-2016.
 */
@ActivityScope
@Subcomponent(
        modules = SplashActivityModule.class
)
public interface SplashActivityComponent {
    SplashActivity inject(SplashActivity splashActivity);
}
