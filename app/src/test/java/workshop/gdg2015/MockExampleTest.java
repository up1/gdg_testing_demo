package workshop.gdg2015;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockExampleTest {

    @Mock
    Context mockContext;

    @Test
    public void readStringFromContext() {
        when(mockContext.getString(R.string.app_name)).thenReturn("GDG2015");

        ReadData readdata = new ReadData(mockContext);
        String actualResult = readdata.getAppName();
        assertEquals("GDG2015", actualResult);
    }
}
