package com.bamboo.mvp.data;

/**
 * Created by tangshuai on 2017/5/6.
 */

public class XModle {

    /**
     *
     * @param a a课程分数
     * @param b b课程分数
     * @return  总分数
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * 假装这里是从服务器获取的数据
     * @param callback
     */
    public void getX(Callback callback) {
        callback.onResult("kerwin", "boy");
    }

    public interface Callback {
        void onResult(String name, String gender);
    }
}
