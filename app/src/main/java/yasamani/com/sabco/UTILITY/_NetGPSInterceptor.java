package yasamani.com.sabco.UTILITY;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class _NetGPSInterceptor {
    Context context;


    @Inject
    public _NetGPSInterceptor(Context context) {
        this.context = context;
    }

    public void sayHello(){
        Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
    }
}
