package xiongjian.com.havefun.presenter;


import xiongjian.com.havefun.presenter.view.LoginView;

/**
 * Created by Administrator on 2016/7/10.
 */
public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView){
        this.loginView=loginView;
        this.loginInteractor=new LoginInteractorImpl();
    }


    @Override
    public void viladateCrendentials(String username, String password) {
        if(loginView!=null){
            loginView.showProgress();
        }

        loginInteractor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
            loginView=null;
    }

    @Override
    public void onUserNameError() {
        if(loginView!=null){
            loginView.setUserNameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPassWordError() {
        if(loginView!=null){
            loginView.setPassWordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void success() {
        if(loginView!=null){
            loginView.navigateToHome();
        }
    }
}
