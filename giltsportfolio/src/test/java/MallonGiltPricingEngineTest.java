import gilts.Gilt;
import gilts.GiltPricingEngine;
import gilts.MallonGiltPricingEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
public class MallonGiltPricingEngineTest {
    @Mock
    static Gilt sharedGilt;

    @BeforeEach
    void setup() {
        sharedGilt = mock(Gilt.class);
    }

    @Test
    void twoYearGiltTest() {
        GiltPricingEngine pricer = new MallonGiltPricingEngine(4.46, 4.50, 4.11, 4.23);
        when(sharedGilt.getYearsRemaining()).thenReturn(2);
        when(sharedGilt.getCoupon()).thenReturn(42.50);
        when(sharedGilt.getCouponPercent()).thenReturn(4.25);
        when(sharedGilt.getPrincipal()).thenReturn(1000.0);
        assertEquals(995.98,pricer.getPrice(sharedGilt),0.01);
    }


}
