package yasamani.com.sabco.VIEW.MainActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import yasamani.com.sabco.DATA.AppDataManger;
import yasamani.com.sabco.DI.AppComponent;
import yasamani.com.sabco.DI.AppModul;
import yasamani.com.sabco.DI.DaggerAppComponent;
import yasamani.com.sabco.R;
import yasamani.com.sabco.UTILITY._NetGPSInterceptor;

public class MainActivity extends AppCompatActivity {

    @Inject
    public _NetGPSInterceptor netGPSInterceptor;

    @Inject
    public AppDataManger appDataManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = DaggerAppComponent.builder().appModul(new AppModul(this)).build();
        appComponent.inject(this);

        if(netGPSInterceptor != null){
            Toast.makeText(this, "Interceptor is not null", Toast.LENGTH_SHORT).show();
            netGPSInterceptor.sayHello();
        }else {
            Toast.makeText(this, "Interceptor is null", Toast.LENGTH_SHORT).show();
        }

        if(appDataManger != null){
            appDataManger.sayHello();
        }
    }
}
