package xiongjian.com.havefun;

import android.app.Application;

import com.android.core.control.logcat.Logcat;
import com.android.core.model.control.LogicProxy;

/**
 * Created by Administrator on 2016/7/3.
 */
public class Myapplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        LogicProxy.getInstance().init();
        Logcat.init("com.android.logcat").hideThreadInfo().methodCount(3);
    }
}
