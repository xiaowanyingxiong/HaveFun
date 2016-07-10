package xiongjian.com.havefun.presenter;

/**
 * Created by Administrator on 2016/7/10.
 */
public interface LoginInteractor {

    interface OnLoginFinishedListener{
        void onUserNameError();
        void onPassWordError();
        void success();

    }

    void login(String username,String password ,OnLoginFinishedListener listener);
}
