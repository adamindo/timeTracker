package timeTracker;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeValueTest {

    TimeValue timeValueMax;
    TimeValue timeValueMin;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        timeValueMax = new TimeValue("23:59");
        timeValueMin = new TimeValue("0", "0");
    }

    @org.junit.jupiter.api.Test
    void getHour() {
        assertEquals(23, timeValueMax.getHour());
        assertEquals(0, timeValueMin.getHour());
    }

    @org.junit.jupiter.api.Test
    void getMinute() {
        assertEquals(59, timeValueMax.getMinute());
        assertEquals(0, timeValueMin.getMinute());
    }
}