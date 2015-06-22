package workshop.gdg2015;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ReadDataFromContext {

    @Test
    public void readAppNameFromStringResource() {
        ReadData readData = new ReadData(InstrumentationRegistry.getTargetContext());
        assertEquals("GDG2015", readData.getAppName());
    }

}
