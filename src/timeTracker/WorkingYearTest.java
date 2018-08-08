package timeTracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkingYearTest {
    private WorkingYear leapYear;
    private WorkingYear noLeapYear;

    @Test
    void getYear() {
        assertEquals(2016, leapYear.getYear());
        assertEquals(2018, noLeapYear.getYear());
    }

    @Test
    void getMonths() {
        assertEquals(12, leapYear.getMonths().length);
        assertEquals(12, noLeapYear.getMonths().length);
    }

    @Test
    void isLeapYear() {
        assertTrue(leapYear.isLeapYear());
        assertFalse(noLeapYear.isLeapYear());
    }

    @BeforeEach
    void setUp() {
        leapYear = new WorkingYear(2016);
        noLeapYear = new WorkingYear(2018);
    }
}