package com.xiaolei.mvp.service;



import com.xiaolei.mvp.service.entity.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ZhaoLei on 2017/12/8 11:52
 * E-Mail Address：17610230792@163.com
 */
public interface RetrofitService {
    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,
                                    @Query("tag") String tag, @Query("start") int start,
                                    @Query("count") int count);
}
