package yasamani.com.sabco.UTILITY.DBHelper;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import yasamani.com.sabco.DATA.Model.Driver.Register;

@Database(entities = {Register.class},version = 1,exportSchema = false)
public abstract class DBConfig extends RoomDatabase {
    public abstract Dao getDao();
}
