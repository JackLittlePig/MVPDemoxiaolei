package com.xiaolei.mvp.service.presenter;


import android.content.Intent;
import com.xiaolei.mvp.service.view.View;


/**
 * Created by ZhaoLei on 2017/12/8 11:52
 * E-Mail Address：17610230792@163.com
 */
public interface Presenter {
    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);

    void attachIncomingIntent(Intent intent);
}
