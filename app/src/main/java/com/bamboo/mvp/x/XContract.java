    package com.bamboo.mvp.x;

    import com.bamboo.mvp.BasePresenter;
    import com.bamboo.mvp.BaseUI;

    /**
     * Created by tangshuai on 2017/5/6.
     */

    public interface XContract {
        /**
         * A课程得分的传递的参数名
         */
        String PARAM_INT_A = "a";
        /**
         * B课程得分的传递的参数名
         */
        String PARAM_INT_B = "b";

        interface UI extends BaseUI<Presenter> {

            /**
             * 通知UI，Sum已经计算出来，可以刷新对应的UI了
             */
            void refreshSumResult();

            /**
             * 通知UI，X的信息已经获取到，可以刷新X了。
             */
            void refreshX();

            /**
             * 显示loading弹窗
             * @param msg
             */
            void showLoading(String msg);

            /**
             * 关闭loading弹窗
             */
            void dismissLoading();

        }

        interface Presenter extends BasePresenter {

            /**
             * 获取X的姓名
             *
             * @return
             */
            String getXName();

            /**
             * 获取X的性别
             *
             * @return
             */
            String getXGender();

            /**
             * 获取总成绩
             *
             * @return
             */
            String getSumScore();
        }

    }
