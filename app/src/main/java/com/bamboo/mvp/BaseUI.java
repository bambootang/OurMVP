package com.bamboo.mvp;

/**
 * Created by tangshuai on 2017/5/6.
 */

public interface BaseUI<T extends BasePresenter> {

    void setPresenter(T presenter);
}
