import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTime(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        int int10 = dateTimeZone8.getOffset((long) (byte) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 3);
        org.joda.time.DateTime dateTime13 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime15 = dateTime4.minus((long) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.weekyear();
        org.joda.time.Instant instant17 = dateTime4.toInstant();
        org.joda.time.Instant instant19 = instant17.minus(1645454862530L);
        long long20 = instant17.getMillis();
        long long21 = instant17.getMillis();
        org.joda.time.DateTime dateTime22 = instant17.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant17", (dateTime4.compareTo(instant17) == 0) == dateTime4.equals(instant17));
    }
}

