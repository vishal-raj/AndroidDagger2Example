package com.vishu.androiddagger2example.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.vishu.androiddagger2example.GingerApplication;
import com.vishu.androiddagger2example.R;
import com.vishu.androiddagger2example.data.model.Category;
import com.vishu.androiddagger2example.ui.activity.module.SplashActivityModule;
import com.vishu.androiddagger2example.ui.activity.presenter.SplashActivityPresenter;
import com.vishu.androiddagger2example.ui.adapter.CategoryAdapter;
import com.vishu.androiddagger2example.utils.L;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements CategoryAdapter.mClickListener{

    @Inject
    SplashActivityPresenter presenter;
    @Bind(R.id.list_category)
    RecyclerView categoryList;
    private LinearLayoutManager linearLayoutManager;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryList.setLayoutManager(linearLayoutManager);
        categoryList.setItemAnimator(new DefaultItemAnimator());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
        presenter.loadCategories();
        /*presenter.loadCategory();*/
    }

    @Override
    protected void setupActivityComponent() {
        GingerApplication.get(this)
                .getAppComponent()
                .plus(new SplashActivityModule(this))
                .inject(this);
    }

    public void setCategories(Category category){
        categoryAdapter = new CategoryAdapter(category.getCategories());
        categoryAdapter.setListner(this);
        categoryList.setAdapter(categoryAdapter);
        categoryList.setHasFixedSize(true);
    }

    @Override
    public void mClick(View v, int position) {
        L.m("Clicked on Item");
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
