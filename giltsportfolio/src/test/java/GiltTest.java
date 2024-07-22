import gilts.AlreadyExpiredGiltException;
import gilts.Gilt;
import gilts.InvalidGiltInputException;
import gilts.InvalidGiltInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GiltTest {

    @Test
    void createGiltCheckPrincipal() {
        Gilt g = new Gilt(1.25, 100.00, 20);
        assertEquals(100.00, g.getPrincipal(), 0.01);
    }

    @Test
    void createGiltCheckCoupon() {
        Gilt g = new Gilt(1.25, 100.00, 20);
        assertEquals(1.25, g.getCoupon(), 0.01);
    }

    @Test
    void createGiltCheckYearsRemaining() {
        Gilt g = new Gilt(1.25, 100.00, 20);
        assertEquals(20, g.getYearsRemaining());
    }

    @Test
    void createGiltCheckCouponPercentage() {
        Gilt g = new Gilt(1.25, 100.00, 20);
        assertEquals(1.25/100.00, g.getCouponPercent(), 0.01);
    }

    @Test
    void unexpiredGiltTest(){
        Gilt g = new Gilt(1.25, 100.00, 4);
        assertFalse(g.expired());
    }

    @Test
    void expiredGiltTest(){
       Gilt g = new Gilt(1.25, 100.00, 0);
        assertTrue(g.expired());

    }

    @Test
    void nonExpiringGiltTickTest(){
        Gilt g = new Gilt(1.25,  4);
        g.tick();
        assertEquals(1.25, g.getCoupon(), 0.01);
        assertEquals(3, g.getYearsRemaining());
    }

    @Test
    void oneYearRemainingGiltTickTest(){
        Gilt g = new Gilt(1.25, 2);
        g.tick();
        assertEquals(101.25, g.tick(), 0.01);
    }

    @Test
    void zeroYearsRemainingGiltTickTest(){
        Gilt g = new Gilt(1.25, 0);

        assertThrows(AlreadyExpiredGiltException.class ,() -> g.tick());
    }

    //Boundary Test
    @Test
    void upperBoundaryYearsRemaining(){
        Gilt g = Gilt.create(1.25,100.00, 50);
        assertEquals(50, g.getYearsRemaining());
    }

    //lower boundary cannot have negative number for Years remaining, principal, coupon
    //only new object created if meets conditions
    @Test
    void giltWithNegativeYearsRemaining(){
        assertThrows(InvalidGiltInputException.class, () -> Gilt.create(1.25, 100.00, -5) );
    }

    @Test
    void giltWithNegativeCoupon(){
        assertThrows(InvalidGiltInputException.class, () -> Gilt.create(-1.25, 100.00, 5) );
    }

    @Test
    void giltWithNegativePrincipal(){
        assertThrows(InvalidGiltInputException.class, () -> Gilt.create(1.25, -100.00, 5));
    }

    //Erroneous
    //what if added string or different type that is not  acceptable to create Gilt

//    @Test
//    void giltWithStringCoupon(){
//assertThrows(InvalidGiltInputException.class, () -> Gilt.create(one dollar, -100.00, five));
//    }
}