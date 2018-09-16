package yasamani.com.sabco.DATA;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class AppDataManger {

    Context context;

    @Inject
    public AppDataManger(Context context) {
        this.context = context;
    }

    public void sayHello(){
        Toast.makeText(context, "Hello I am AppDataManager", Toast.LENGTH_SHORT).show();
    }
}
