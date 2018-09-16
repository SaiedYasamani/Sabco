package yasamani.com.sabco.DI;

import javax.inject.Singleton;

import dagger.Component;
import yasamani.com.sabco.UTILITY._NetGPSInterceptor;
import yasamani.com.sabco.UTILITY._TripInterceptor;
import yasamani.com.sabco.VIEW.MainActivity.MainActivity;
import yasamani.com.sabco.VIEWMODEL._BaseViewModel;
import yasamani.com.sabco._SabcoApp;

@Singleton
@Component(modules = AppModul.class)
public interface AppComponent {

    public void inject(_SabcoApp sabcoApp);
    public void inject(_BaseViewModel baseViewModel);
    public void inject(_NetGPSInterceptor netGPSInterceptor);
    public void inject(_TripInterceptor tripInterceptor);
    public void inject(MainActivity mainActivity);

    _NetGPSInterceptor provideNGInterceptor();

}
