package xiongjian.com.havefun.presenter;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Administrator on 2016/7/10.
 */
public class LoginInteractorImpl implements LoginInteractor{


    @Override
    public void login(final String username,final String password,final OnLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error =false;
                if(TextUtils.isEmpty(username)){
                    listener.onUserNameError();
                    error=true;
                }

                if(TextUtils.isEmpty(password)){
                    listener.onPassWordError();
                    error=true;
                }
                if(!error){
                    listener.success();
                }
            }
        },2000);
    }
}
