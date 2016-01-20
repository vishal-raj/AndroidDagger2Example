package com.vishu.androiddagger2example;

import com.vishu.androiddagger2example.data.api.GingerApiModule;
import com.vishu.androiddagger2example.ui.activity.component.SplashActivityComponent;
import com.vishu.androiddagger2example.ui.activity.module.SplashActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by User on 20-01-2016.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                GingerApiModule.class
        }
)
public interface AppComponent {

    SplashActivityComponent plus(SplashActivityModule module);

    //UserComponent plus(UserModule userModule);
}
