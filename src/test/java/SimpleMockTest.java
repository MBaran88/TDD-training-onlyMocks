import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;


import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class SimpleMockTest {

    @Mock
    private Set = mockedSet;

    @Test
   public void testMockingMaps(){
        Map mockedMap = mock(Map.class);
        //mockedMap.get(1);
        //mockedMap.get(2);
        //mockedMap.get(3);

        //verify(mockedMap, times(3)).get(anyInt());
    }


    @Test
    public void testStubbing(){
        Map mockedMap = mock (Map.class);
        when(mockedMap.get("one")).thenReturn(2);
        Object result = mockedMap.get("one");

        assertThat(result).isEqualTo(Integer.valueOf(2));
    }
}
