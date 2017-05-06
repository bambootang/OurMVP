package com.bamboo.mvp.x;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import com.bamboo.mvp.R;

/**
 * Created by tangshuai on 2017/5/6.
 */

    public class XActivity extends Activity implements XContract.UI {

        private TextView tv_x_name;

        private TextView tv_x_gender;

        private TextView tv_sum;

        private XContract.Presenter presenter;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_x);
            initView();
            initPresenter();
        }

        private void initView() {
            tv_sum = (TextView) findViewById(R.id.tv_sum);
            tv_x_name = (TextView) findViewById(R.id.tv_x_name);
            tv_x_gender = (TextView) findViewById(R.id.tv_x_gender);
        }

        private void initPresenter() {
            presenter = new XPresenter(this);
            presenter.start(getIntent().getExtras());
        }

        @Override
        public void setPresenter(XContract.Presenter presenter) {
            // 如果UI是一个Fragment，这里的代码是需要的,是Activity的这里留空即可
            this.presenter = presenter;
        }

        @Override
        public void refreshSumResult() {
            tv_sum.setText(presenter.getSumScore() + "");
        }

        @Override
        public void refreshX() {
            tv_x_name.setText(presenter.getXName());
            tv_x_gender.setText(presenter.getXGender());
        }

        @Override
        public void showLoading(String msg) {
            //显示Dialog弹窗
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void dismissLoading() {
            //关闭Dialog弹窗
        }
}
