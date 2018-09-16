package yasamani.com.sabco;

import android.app.Application;

import yasamani.com.sabco.DI.AppComponent;
import yasamani.com.sabco.DI.AppModul;
import yasamani.com.sabco.DI.DaggerAppComponent;

public class _SabcoApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModul(new AppModul(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
