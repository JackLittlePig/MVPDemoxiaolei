package com.xiaolei.mvp.service.manager;

import android.content.Context;

import com.xiaolei.mvp.service.RetrofitHelper;
import com.xiaolei.mvp.service.RetrofitService;
import com.xiaolei.mvp.service.entity.Book;

import rx.Observable;

/**
 * Created by ZhaoLei on 2017/12/8 11:52
 * E-Mail Address：17610230792@163.com
 */
public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    public  Observable<Book> getSearchBooks(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBooks(name,tag,start,count);
    }
}
