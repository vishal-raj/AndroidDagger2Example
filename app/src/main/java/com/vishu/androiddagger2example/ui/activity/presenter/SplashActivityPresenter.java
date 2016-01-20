package com.vishu.androiddagger2example.ui.activity.presenter;

import com.vishu.androiddagger2example.data.api.GingerApiService;
import com.vishu.androiddagger2example.data.model.Category;
import com.vishu.androiddagger2example.data.model.Location;
import com.vishu.androiddagger2example.ui.activity.SplashActivity;
import com.vishu.androiddagger2example.utils.L;

import java.io.IOException;

import retrofit.HttpException;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by User on 20-01-2016.
 */
public class SplashActivityPresenter {
    private SplashActivity splashActivity;
    private GingerApiService gingerApiService;

    public SplashActivityPresenter(SplashActivity splashActivity, GingerApiService gingerApiService) {
        this.splashActivity = splashActivity;
        this.gingerApiService = gingerApiService;
    }

    public void loadRepositories() {
        Observable<Category> call = gingerApiService.getCategoryList(new Location("28.4792943", "77.0430799"));
        call.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .retry(5)
                .subscribe(new Subscriber<Category>() {
                    @Override
                    public void onCompleted() {
                        L.m("Completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (e instanceof HttpException) {
                            /*ResponseBody body = ((HttpException) e).response().errorBody();
                            Converter<GlobalErrorObject> converter =
                                    (Converter<GlobalErrorObject>) GsonConverterFactory.create().get(GlobalErrorObject.class);
                            try {
                                GlobalErrorObject errorObject = converter.fromBody(body);
                                L.m(errorObject.getErrorMessage());
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }*/
                            L.m("Error");
                        }
                        if (e instanceof IOException) {
                            L.m("No Internet");
                        }
                    }

                    @Override
                    public void onNext(Category category) {
                        L.m(category.getCategories().size() + "");
                    }
                });
    }
}
