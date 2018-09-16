package yasamani.com.sabco.DI;

import android.content.Context;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import yasamani.com.sabco.UTILITY._NetGPSInterceptor;
import yasamani.com.sabco.UTILITY._TripInterceptor;

@Singleton
@Module
public class AppModul {

    Context context;

    public AppModul(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Context provideContext(){
        return context;
    }

    @Singleton
    @Provides
    public _NetGPSInterceptor provideNGInterceptor(Context context){
        return new _NetGPSInterceptor(context);
    }

    @Singleton
    @Provides
    public _TripInterceptor provideTripInterceptor(Context context, _NetGPSInterceptor netGPSInterceptor){
        return new _TripInterceptor(context, netGPSInterceptor);
    }
}
