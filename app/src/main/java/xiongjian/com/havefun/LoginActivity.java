package xiongjian.com.havefun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import xiongjian.com.havefun.presenter.LoginPresenterImpl;
import xiongjian.com.havefun.presenter.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView , View.OnClickListener{

    private EditText username;
    private EditText password;
    private ProgressBar progressBar;
    private LoginPresenterImpl presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        progressBar=(ProgressBar)findViewById(R.id.progress);
        findViewById(R.id.button).setOnClickListener(this);

        presenter=new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUserNameError() {
        username.setError("用户名为空");
    }

    @Override
    public void setPassWordError() {
        password.setError("密码为空");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        presenter.viladateCrendentials(username.getText().toString(),password.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
