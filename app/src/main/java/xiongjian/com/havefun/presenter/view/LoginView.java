package xiongjian.com.havefun.presenter.view;

/**
 * Created by Administrator on 2016/7/10.
 */
public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setPassWordError();

    void navigateToHome ();
}
