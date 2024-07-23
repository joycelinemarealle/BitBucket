import gilts.Gilt;
import gilts.GiltPricingEngine;
import gilts.InvalidYieldPercentage;
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
    GiltPricingEngine pricer1;

    @BeforeEach
    void setup() {
        sharedGilt = mock(Gilt.class);
        pricer1 = new MallonGiltPricingEngine(2.35,3.02,3.56,4.06);
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


    @Test
    void twoYearsGiltTest(){
        when (sharedGilt.getYearsRemaining()).thenReturn(2);
        when (sharedGilt.getCoupon()).thenReturn(3.25);
        when (sharedGilt.getCouponPercent()).thenReturn(3.25);
        when (sharedGilt.getPrincipal()).thenReturn(100.0);
        assertEquals(101.76, pricer1.getPrice(sharedGilt), 0.01 );

    }

    @Test
    void fiveYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(5);
        when (sharedGilt.getCoupon()).thenReturn(10.25);
        when (sharedGilt.getCouponPercent()).thenReturn(1.025);
        when(sharedGilt.getPrincipal()).thenReturn(1000.0);
        assertEquals(907.25, pricer1.getPrice(sharedGilt), 0.01);
    }


    @Test
    void tenYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(10);
        when (sharedGilt.getCoupon()).thenReturn(22.0);
        when (sharedGilt.getCouponPercent()).thenReturn(11.0);
        when(sharedGilt.getPrincipal()).thenReturn(200.0);
        assertEquals(326.316, pricer1.getPrice(sharedGilt), 0.01);
    }

    @Test
    void twentyYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(20);
        when (sharedGilt.getCoupon()).thenReturn(0.0);
        when (sharedGilt.getCouponPercent()).thenReturn(0.0);
        when(sharedGilt.getPrincipal()).thenReturn(1000.0);
        assertEquals(422.475, pricer1.getPrice(sharedGilt), 0.01);
    }

    @Test
    void oneYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(1);
        when (sharedGilt.getCoupon()).thenReturn(1.0);
        when (sharedGilt.getCouponPercent()).thenReturn(1.0);
        when(sharedGilt.getPrincipal()).thenReturn(100.0);
        assertEquals(98.666, pricer1.getPrice(sharedGilt), 0.01);
    }

    @Test
    void fourYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(4);
        when (sharedGilt.getCoupon()).thenReturn(10.0);
        when (sharedGilt.getCouponPercent()).thenReturn(0.10);
        when(sharedGilt.getPrincipal()).thenReturn(1000.0);
        assertEquals(923.8023, pricer1.getPrice(sharedGilt), 0.01);
    }

    @Test
    void eightYearGiltTest(){
        when ( sharedGilt.getYearsRemaining()).thenReturn(8);
        when (sharedGilt.getCoupon()).thenReturn(2250.0);
        when (sharedGilt.getCouponPercent()).thenReturn(2.250);
        when(sharedGilt.getPrincipal()).thenReturn(100000.00);
        assertEquals(90826.330, pricer1.getPrice(sharedGilt), 0.01);
    }

    //Erroneous Test
    @Test
    void negativeYieldGiltTest(){
       assertThrows( InvalidYieldPercentage.class , () -> MallonGiltPricingEngine.create(-2.35,3.02,3.56,4.06));
    }
}
