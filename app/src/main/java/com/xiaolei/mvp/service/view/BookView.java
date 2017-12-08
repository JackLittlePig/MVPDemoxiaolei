package com.xiaolei.mvp.service.view;


import com.xiaolei.mvp.service.entity.Book;

/**
 * Created by ZhaoLei on 2017/12/8 11:52
 * E-Mail Address：17610230792@163.com
 */
public interface BookView extends View {
    void onSuccess(Book mBook);
    void onError(String result);
}
