package lk.my.sliit.method_gaming;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "DatabaseHelper";

    private static final String TABLE_NAME = "High_Score";
    private static final String COL1 = "Name";
    private static final String COL2 = "Score";


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
