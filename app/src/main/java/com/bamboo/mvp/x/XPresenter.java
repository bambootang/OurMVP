package com.bamboo.mvp.x;

import android.os.Bundle;

import com.bamboo.mvp.data.XModle;

/**
 * Created by tangshuai on 2017/5/6.
 */

public class XPresenter implements XContract.Presenter {

    private XContract.UI ui;

    private XModle modle;

    private int a, b;

    private int sum = 0;

    private String xName, xGender;

    public XPresenter(XContract.UI ui) {
        this.ui = ui;
        this.modle = new XModle();
    }

    @Override
    public void start(Bundle bundle) {
        a = bundle.getInt(XContract.PARAM_INT_A, 0);
        b = bundle.getInt(XContract.PARAM_INT_B, 0);
        start();
    }

        private void start() {
            sum = modle.sum(a, b);
            ui.refreshSumResult();
            ui.showLoading("正在获取X的信息");
            modle.getX(new XModle.Callback() {
                @Override
                public void onResult(String name, String gender) {
                    ui.dismissLoading();
                    xName = name;
                    xGender = gender;
                    ui.refreshX();
                }
            });
        }

    @Override
    public String getXName() {
        return "姓名：" + xName;
    }

    @Override
    public String getXGender() {
        return "性别：" + xGender;
    }

    @Override
    public String getSumScore() {
        return "总成绩：" + sum;
    }
}
