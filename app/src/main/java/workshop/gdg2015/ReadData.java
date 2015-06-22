package workshop.gdg2015;

import android.content.Context;

public class ReadData {


    private final Context context;

    public ReadData(Context context) {
        this.context = context;
    }

    public String getAppName() {
        return context.getString(R.string.app_name);
    }
}
