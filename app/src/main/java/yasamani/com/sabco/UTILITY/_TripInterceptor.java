package yasamani.com.sabco.UTILITY;

import android.content.Context;

public class _TripInterceptor {

    Context context;
    _NetGPSInterceptor netGPSInterceptor;

    public _TripInterceptor(Context context, _NetGPSInterceptor netGPSInterceptor) {
        this.context = context;
        this.netGPSInterceptor = netGPSInterceptor;
    }
}
