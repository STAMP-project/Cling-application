import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalTime localTime19 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime21 = property16.addCopy((long) 20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.LocalTime localTime28 = localTime26.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property11.compareTo((org.joda.time.ReadableInstant) dateTime33);
        long long35 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = property8.getAsText(locale36);
        org.joda.time.DateTimeField dateTimeField38 = property8.getField();
        org.joda.time.LocalTime localTime39 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTimeToday(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime41.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        boolean boolean50 = property47.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField51 = property47.getDurationField();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTimeToday(dateTimeZone54);
        int int56 = property47.getDifference((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime57 = localTime41.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        boolean boolean58 = property8.equals((java.lang.Object) dateTime57);
        java.lang.String str59 = property8.getAsString();
        org.joda.time.LocalTime localTime60 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime62 = localTime60.minusHours((-1606255342));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1606190416000L) + "'", long35 == (-1606190416000L));
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "381" + "'", str37, "381");
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1606255324) + "'", int56 == (-1606255324));
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "381" + "'", str59, "381");
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime.Property property7 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime9 = property7.addCopy(366L);
        long long10 = property7.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumShortTextLength(locale6);
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime10 = property2.addCopy(39);
        java.lang.String str11 = property2.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property2.getFieldType();
        org.joda.time.DurationField durationField13 = property2.getRangeDurationField();
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 766L + "'", long4 == 766L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "secondOfMinute" + "'", str11, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) (-1L));
        org.joda.time.LocalTime.Property property12 = localTime11.hourOfDay();
        java.lang.String str13 = property12.getAsString();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property12.getDifferenceAsLong(readableInstant14);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-446161L) + "'", long15 == (-446161L));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        boolean boolean6 = property3.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime8 = property3.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime10 = property3.addCopy(100L);
        org.joda.time.LocalTime localTime11 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property3.roundHalfFloorCopy();
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(26L, chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology13);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime11 = localTime7.plusMillis(29);
        org.joda.time.LocalTime.Property property12 = localTime7.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localTime7.getFields();
        org.joda.time.Chronology chronology14 = localTime7.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 10, chronology14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(820L, chronology14);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(obj0, chronology14);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.LocalTime localTime8 = localTime3.minusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime17 = localTime14.withHourOfDay(0);
        boolean boolean18 = localTime8.isEqual((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime17.plus(readablePeriod19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = localTime17.toString(dateTimeFormatter21);
        org.joda.time.LocalTime localTime24 = localTime17.plusHours((-1606255393));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "00:29:56.537" + "'", str22, "00:29:56.537");
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime25 = property22.withMinimumValue();
        org.joda.time.LocalTime localTime27 = property22.addCopy((long) 20);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime34 = localTime32.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property17.compareTo((org.joda.time.ReadableInstant) dateTime39);
        long long41 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.LocalTime localTime43 = property14.setCopy((int) (short) 1);
        int int44 = property14.getMinimumValue();
        org.joda.time.LocalTime localTime45 = property14.roundFloorCopy();
        boolean boolean46 = property2.equals((java.lang.Object) property14);
        org.joda.time.LocalTime localTime47 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1606190417000L) + "'", long41 == (-1606190417000L));
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localTime1.toDateTimeToday(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        boolean boolean10 = property7.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField11 = property7.getDurationField();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday(dateTimeZone14);
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime19 = localTime1.minusSeconds(36);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property22.withMaximumValue();
        org.joda.time.DurationField durationField26 = property22.getLeapDurationField();
        org.joda.time.LocalTime localTime27 = property22.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        int int32 = property30.get();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property30.getAsText(locale33);
        org.joda.time.LocalTime localTime35 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localTime37.toDateTimeToday(dateTimeZone38);
        int int40 = property30.getDifference((org.joda.time.ReadableInstant) dateTime39);
        int int41 = property22.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.LocalTime localTime43 = property22.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime44 = localTime1.withFields((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 28);
        org.joda.time.LocalTime localTime47 = localTime1.withFields((org.joda.time.ReadablePartial) localTime46);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1606255323) + "'", int16 == (-1606255323));
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 56 + "'", int32 == 56);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "56" + "'", str34, "56");
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1606255323) + "'", int40 == (-1606255323));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localTime1.toDateTimeToday(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime5 = property4.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) readablePeriod6);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(38);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        boolean boolean10 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime9.minusMinutes(942);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606255528), 6810663, (-1606255509));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255528 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (-1606255520), dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        int int7 = property5.get();
        org.joda.time.LocalTime localTime9 = property5.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime11 = property5.addWrapFieldToCopy(2);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = localTime11.minusSeconds((-1606262400));
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.get();
        org.joda.time.Interval interval20 = property17.toInterval();
        org.joda.time.LocalTime localTime21 = property17.getLocalTime();
        boolean boolean22 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.LocalTime localTime30 = localTime28.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology31);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology31);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) (-1L));
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.withMaximumValue();
        org.joda.time.LocalTime localTime42 = localTime40.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property43 = localTime42.millisOfSecond();
        boolean boolean44 = localTime34.isAfter((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        int int53 = localTime46.compareTo((org.joda.time.ReadablePartial) localTime52);
        org.joda.time.Chronology chronology54 = localTime52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.LocalTime localTime59 = property57.roundFloorCopy();
        org.joda.time.LocalTime localTime60 = property57.withMaximumValue();
        org.joda.time.LocalTime localTime62 = localTime60.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.LocalTime localTime66 = property65.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        org.joda.time.LocalTime localTime69 = localTime62.withField(dateTimeFieldType67, (int) '4');
        int int70 = localTime52.get(dateTimeFieldType67);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(dateTimeZone74);
        org.joda.time.LocalTime.Property property76 = localTime75.secondOfMinute();
        org.joda.time.Interval interval77 = property76.toInterval();
        org.joda.time.LocalTime localTime78 = property76.roundFloorCopy();
        int int79 = localTime72.compareTo((org.joda.time.ReadablePartial) localTime78);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(dateTimeZone80);
        org.joda.time.LocalTime.Property property82 = localTime81.secondOfMinute();
        org.joda.time.LocalTime localTime83 = property82.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property82.getFieldType();
        boolean boolean85 = localTime72.isSupported(dateTimeFieldType84);
        org.joda.time.LocalTime localTime87 = localTime72.minusMinutes(0);
        boolean boolean88 = localTime52.isAfter((org.joda.time.ReadablePartial) localTime87);
        boolean boolean89 = localTime42.isEqual((org.joda.time.ReadablePartial) localTime87);
        int int90 = localTime42.getMinuteOfHour();
        org.joda.time.LocalTime localTime92 = localTime42.plusSeconds(21);
        int int93 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.ReadablePeriod readablePeriod94 = null;
        org.joda.time.LocalTime localTime96 = localTime14.withPeriodAdded(readablePeriod94, (-1606255576));
        int int97 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime96);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 57 + "'", int19 == 57);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(localTime69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 57 + "'", int70 == 57);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int90 + "' != '" + 57 + "'", int90 == 57);
        org.junit.Assert.assertNotNull(localTime92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(localTime96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (-1606255520));
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localTime1.toDateTimeToday(dateTimeZone2);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(chronology4);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(38);
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        org.joda.time.DurationField durationField10 = property9.getLeapDurationField();
        org.joda.time.LocalTime localTime11 = property9.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(38);
        org.joda.time.LocalTime.Property property9 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime11 = localTime6.plusHours((-1606255361));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property7 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(chronology4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((-1606190410000L), chronology4);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) 31, chronology4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        int int16 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localTime9.isSupported(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime9.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime24.withPeriodAdded(readablePeriod25, 41);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime24.plus(readablePeriod28);
        org.joda.time.LocalTime localTime31 = localTime24.plusSeconds((-1606255568));
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        int int36 = property34.get();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property34.getAsShortText(locale37);
        int int39 = property34.getMinimumValueOverall();
        org.joda.time.LocalTime localTime41 = property34.setCopy("33");
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property34.getFieldType();
        int int43 = localTime31.get(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        int int48 = property46.get();
        org.joda.time.LocalTime localTime50 = property46.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime52 = property46.addWrapFieldToCopy(2);
        java.util.Locale locale53 = null;
        java.lang.String str54 = property46.getAsShortText(locale53);
        java.lang.String str55 = property46.getAsShortText();
        java.lang.String str56 = property46.getName();
        org.joda.time.LocalTime localTime58 = property46.setCopy(0);
        int int59 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime61 = localTime31.plus(readablePeriod60);
        boolean boolean62 = localTime7.isEqual((org.joda.time.ReadablePartial) localTime61);
        org.joda.time.LocalTime.Property property63 = localTime7.secondOfMinute();
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 59 + "'", int36 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "59" + "'", str38, "59");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 51 + "'", int43 == 51);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 59 + "'", int48 == 59);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "59" + "'", str54, "59");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "59" + "'", str55, "59");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "secondOfMinute" + "'", str56, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = localTime12.get(dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime6.property(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime6.minus(readablePeriod20);
        java.lang.String str23 = localTime21.toString("52");
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.parse("01:43:44.587");
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime31 = localTime29.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.LocalTime localTime34 = localTime31.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime41 = property37.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        int int43 = localTime31.get(dateTimeFieldType42);
        org.joda.time.LocalTime localTime45 = localTime25.withField(dateTimeFieldType42, 35);
        boolean boolean46 = localTime21.isSupported(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52" + "'", str23, "52");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 59 + "'", int43 == 59);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalTime localTime19 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime21 = property16.addCopy((long) 20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.LocalTime localTime28 = localTime26.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property11.compareTo((org.joda.time.ReadableInstant) dateTime33);
        long long35 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalTime localTime37 = property8.setCopy((int) (short) 1);
        int int38 = property8.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = property8.addNoWrapToCopy((-1606255437));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1606190361000L) + "'", long35 == (-1606190361000L));
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(7167997, (-1606255325), 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7167997 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime8.withMillisOfSecond(37);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfDay();
        int int14 = property13.getMaximumValue();
        java.util.Locale locale16 = null;
        org.joda.time.LocalTime localTime17 = property13.setCopy("18", locale16);
        java.lang.String str18 = property13.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 86399999 + "'", int14 == 86399999);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "37" + "'", str18, "37");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumShortTextLength(locale6);
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime10 = property2.addCopy(39);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.plus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        int int17 = property15.get();
        org.joda.time.LocalTime localTime19 = property15.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime21 = property15.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime23 = property15.addNoWrapToCopy((int) (byte) 100);
        int int24 = property15.getLeapAmount();
        java.util.Locale locale26 = null;
        org.joda.time.LocalTime localTime27 = property15.setCopy("47", locale26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = property30.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        int int39 = localTime33.get(dateTimeFieldType38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime33.withPeriodAdded(readablePeriod40, 0);
        org.joda.time.LocalTime localTime44 = localTime33.plusSeconds(20);
        org.joda.time.LocalTime localTime46 = localTime33.plusMillis((int) (short) 10);
        org.joda.time.LocalTime localTime48 = localTime46.minusSeconds(37);
        boolean boolean49 = localTime27.isAfter((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.LocalTime localTime51 = localTime46.plusMillis(45);
        int int52 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime51);
        java.util.Locale locale54 = null;
        java.lang.String str55 = localTime51.toString("4", locale54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.Interval interval60 = property59.toInterval();
        org.joda.time.LocalTime localTime61 = property59.roundFloorCopy();
        org.joda.time.LocalTime localTime62 = property59.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.LocalTime localTime66 = property65.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property65.getFieldType();
        int int68 = localTime62.get(dateTimeFieldType67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalTime localTime71 = localTime62.withPeriodAdded(readablePeriod69, 0);
        org.joda.time.LocalTime localTime73 = localTime62.plusSeconds(20);
        org.joda.time.LocalTime localTime75 = localTime62.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray76 = localTime62.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(dateTimeZone77);
        org.joda.time.LocalTime.Property property79 = localTime78.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(dateTimeZone80);
        org.joda.time.LocalTime.Property property82 = localTime81.secondOfMinute();
        org.joda.time.Interval interval83 = property82.toInterval();
        org.joda.time.LocalTime localTime84 = property82.roundFloorCopy();
        int int85 = localTime78.compareTo((org.joda.time.ReadablePartial) localTime84);
        org.joda.time.Chronology chronology86 = localTime84.getChronology();
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime(chronology86);
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime((java.lang.Object) localTime62, chronology86);
        org.joda.time.LocalTime localTime89 = new org.joda.time.LocalTime(551L, chronology86);
        org.joda.time.LocalTime localTime90 = org.joda.time.LocalTime.now(chronology86);
        boolean boolean91 = localTime51.isEqual((org.joda.time.ReadablePartial) localTime90);
        org.joda.time.LocalTime.Property property92 = localTime90.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 449L + "'", long4 == 449L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "4" + "'", str55, "4");
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray76);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(property92);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime10 = localTime6.plusMillis(29);
        org.joda.time.LocalTime.Property property11 = localTime6.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localTime6.getFields();
        org.joda.time.Chronology chronology13 = localTime6.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 10, chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((-1606255460L), chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(37L, chronology13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology13);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) (-1L));
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfSecond();
        boolean boolean21 = localTime11.isAfter((org.joda.time.ReadablePartial) localTime19);
        int[] intArray22 = localTime19.getValues();
        org.joda.time.LocalTime.Property property23 = localTime19.millisOfDay();
        java.util.Locale locale24 = null;
        int int25 = property23.getMaximumTextLength(locale24);
        org.joda.time.DurationField durationField26 = property23.getLeapDurationField();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[21, 58, 59, 519]");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNull(durationField26);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        org.joda.time.Interval interval10 = property2.toInterval();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property2.getAsShortText(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(interval10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(10);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds((-1606255575));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        java.util.Locale locale11 = null;
        int int12 = property2.getMaximumTextLength(locale11);
        int int13 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField14 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 6839207, chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(410L, chronology11);
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis((-1606255323));
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        int int6 = property2.get();
        int int7 = property2.getMinimumValue();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6975000, (-1606255350), 14, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6975000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        int int11 = property2.getDifference((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale13 = null;
        org.joda.time.LocalTime localTime14 = property2.setCopy("33", locale13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        org.joda.time.LocalTime localTime20 = property17.withMinimumValue();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) localTime20);
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond(38);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        boolean boolean25 = localTime21.isAfter((org.joda.time.ReadablePartial) localTime24);
        int int26 = localTime24.getHourOfDay();
        org.joda.time.LocalTime.Property property27 = localTime24.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
        int int29 = property27.getMinimumValue();
        org.joda.time.LocalTime localTime31 = property27.addCopy((-1606262420));
        org.joda.time.LocalTime localTime32 = property27.withMaximumValue();
        boolean boolean33 = property2.equals((java.lang.Object) localTime32);
        org.joda.time.Interval interval34 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1606255317) + "'", int11 == (-1606255317));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval34);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        int int11 = property2.getDifference((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale13 = null;
        org.joda.time.LocalTime localTime14 = property2.setCopy("33", locale13);
        org.joda.time.LocalTime localTime15 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology25);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 38, chronology25);
        boolean boolean29 = localTime15.isEqual((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime31.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.parse("01:43:44.587");
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.LocalTime localTime41 = localTime39.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.LocalTime localTime44 = localTime41.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime51 = property47.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property47.getFieldType();
        int int53 = localTime41.get(dateTimeFieldType52);
        org.joda.time.LocalTime localTime55 = localTime35.withField(dateTimeFieldType52, 35);
        org.joda.time.LocalTime.Property property56 = localTime31.property(dateTimeFieldType52);
        int int57 = localTime15.indexOf(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1606255317) + "'", int11 == (-1606255317));
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) '4');
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime7.plus(readablePeriod15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(obj0, chronology7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology18);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) (-1L));
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.withMaximumValue();
        org.joda.time.LocalTime localTime29 = localTime27.minusHours((int) (byte) 100);
        org.joda.time.LocalTime.Property property30 = localTime29.millisOfSecond();
        boolean boolean31 = localTime21.isAfter((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.Chronology chronology32 = localTime29.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(chronology32);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 100, chronology32);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) localTime8, chronology32);
        int int37 = localTime36.size();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int2 = localTime1.getSecondOfMinute();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) '4');
        org.joda.time.LocalTime localTime16 = localTime7.minusMillis((int) '#');
        org.joda.time.LocalTime.Property property17 = localTime7.hourOfDay();
        int int18 = property17.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumShortTextLength(locale6);
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime10 = property2.addCopy(39);
        int int11 = localTime10.getSecondOfMinute();
        org.joda.time.LocalTime localTime13 = localTime10.minusSeconds((-1606255528));
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        int int22 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        boolean boolean28 = localTime15.isSupported(dateTimeFieldType27);
        org.joda.time.LocalTime localTime30 = localTime15.minusMinutes(0);
        org.joda.time.LocalTime localTime32 = localTime15.plusHours(31);
        boolean boolean33 = localTime13.isAfter((org.joda.time.ReadablePartial) localTime15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 373L + "'", long4 == 373L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime9 = localTime5.plusMillis(29);
        org.joda.time.LocalTime.Property property10 = localTime5.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localTime5.getFields();
        org.joda.time.Chronology chronology12 = localTime5.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 10, chronology12);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(10L, chronology12);
        int int15 = localTime14.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime14.withMillisOfSecond(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("00:00:00.002");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime8.withMillisOfSecond(37);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfDay();
        int int14 = property13.getMaximumValue();
        java.util.Locale locale16 = null;
        org.joda.time.LocalTime localTime17 = property13.setCopy("18", locale16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        int int29 = localTime23.get(dateTimeFieldType28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime32 = localTime23.withPeriodAdded(readablePeriod30, 0);
        org.joda.time.LocalTime localTime34 = localTime23.plusSeconds(20);
        org.joda.time.LocalTime localTime36 = localTime23.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = localTime23.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        int int46 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.Chronology chronology47 = localTime45.getChronology();
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((java.lang.Object) localTime23, chronology47);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.now(chronology47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((java.lang.Object) property13, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 86399999 + "'", int14 == 86399999);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(localTime50);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        org.joda.time.LocalTime localTime11 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime12 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime13 = property8.roundHalfEvenCopy();
        int int14 = property2.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime13 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime15 = property10.addCopy((long) 20);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property10.getFieldType();
        int int17 = property10.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime26 = localTime22.plusMillis(29);
        org.joda.time.LocalTime.Property property27 = localTime22.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localTime22.getFields();
        org.joda.time.Chronology chronology29 = localTime22.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 10, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property33.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property37 = localTime36.millisOfDay();
        org.joda.time.LocalTime.Property property38 = localTime36.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.LocalTime localTime46 = property44.roundFloorCopy();
        int int47 = localTime40.compareTo((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.Chronology chronology48 = localTime46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.LocalTime localTime53 = property51.roundFloorCopy();
        org.joda.time.LocalTime localTime54 = property51.withMaximumValue();
        org.joda.time.LocalTime localTime56 = localTime54.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.LocalTime localTime60 = property59.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property59.getFieldType();
        org.joda.time.LocalTime localTime63 = localTime56.withField(dateTimeFieldType61, (int) '4');
        int int64 = localTime46.get(dateTimeFieldType61);
        boolean boolean65 = localTime36.isSupported(dateTimeFieldType61);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime(dateTimeZone66);
        org.joda.time.LocalTime.Property property68 = localTime67.secondOfMinute();
        org.joda.time.LocalTime localTime69 = property68.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property68.getFieldType();
        org.joda.time.LocalTime localTime71 = property68.withMinimumValue();
        org.joda.time.LocalTime localTime73 = property68.addCopy((long) 20);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime(dateTimeZone75);
        org.joda.time.LocalTime.Property property77 = localTime76.secondOfMinute();
        org.joda.time.LocalTime localTime78 = property77.getLocalTime();
        org.joda.time.LocalTime localTime80 = localTime78.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology81 = localTime80.getChronology();
        org.joda.time.LocalTime localTime82 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology81);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = localTime82.toDateTimeToday(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = localTime73.toDateTime((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime dateTime86 = localTime36.toDateTime((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime dateTime87 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime86);
        long long88 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime87);
        int int89 = property2.getDifference((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(localTime63);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTime87);
// flaky:         org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1606255314L) + "'", long88 == (-1606255314L));
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1606255314) + "'", int89 == (-1606255314));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606183500720L), dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        long long7 = property5.remainder();
        int int8 = property5.getLeapAmount();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property5.getDifference(readableInstant9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTimeToday(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        boolean boolean21 = property18.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField22 = property18.getDurationField();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 24);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localTime24.toDateTimeToday(dateTimeZone25);
        int int27 = property18.getDifference((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        long long29 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime30 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 321L + "'", long7 == 321L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1606255313) + "'", int27 == (-1606255313));
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1606255313L) + "'", long29 == (-1606255313L));
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime9 = property2.getLocalTime();
        java.lang.String str10 = property2.getName();
        org.joda.time.LocalTime localTime11 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.setCopy("30");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localTime19.isSupported(durationFieldType20);
        int int22 = property14.compareTo((org.joda.time.ReadablePartial) localTime19);
        boolean boolean23 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property26.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        int int35 = localTime29.get(dateTimeFieldType34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime38 = localTime29.withPeriodAdded(readablePeriod36, 0);
        org.joda.time.LocalTime localTime40 = localTime29.plusSeconds(20);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        boolean boolean44 = localTime29.isBefore((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.LocalTime.Property property45 = localTime29.minuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = localTime29.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        boolean boolean52 = property49.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime54 = property49.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.Interval interval61 = property60.toInterval();
        org.joda.time.LocalTime localTime62 = property60.roundFloorCopy();
        int int63 = localTime56.compareTo((org.joda.time.ReadablePartial) localTime62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime.Property property66 = localTime65.secondOfMinute();
        org.joda.time.LocalTime localTime67 = property66.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property66.getFieldType();
        boolean boolean69 = localTime56.isSupported(dateTimeFieldType68);
        org.joda.time.LocalTime localTime71 = localTime54.withField(dateTimeFieldType68, 2);
        org.joda.time.LocalTime.Property property72 = localTime29.property(dateTimeFieldType68);
        org.joda.time.LocalTime localTime74 = localTime7.withField(dateTimeFieldType68, 55);
        int int75 = localTime74.getMinuteOfHour();
        org.joda.time.LocalTime.Property property76 = localTime74.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 7 + "'", int35 == 7);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime74);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 58 + "'", int75 == 58);
        org.junit.Assert.assertNotNull(property76);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 2);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes((int) 'a');
        org.joda.time.LocalTime.Property property4 = localTime3.minuteOfHour();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsShortText(locale5);
        java.lang.String str7 = property4.getAsString();
        org.joda.time.LocalTime localTime8 = property4.roundHalfFloorCopy();
        long long9 = property4.remainder();
        org.joda.time.LocalTime localTime11 = property4.addNoWrapToCopy((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.plus(readablePeriod12);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "23" + "'", str6, "23");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalTime localTime9 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(2, (int) '#', (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime20 = localTime18.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology21 = localTime18.getChronology();
        org.joda.time.LocalTime localTime23 = localTime18.minusMillis((int) (short) 10);
        org.joda.time.LocalTime localTime25 = localTime18.minusMinutes(10);
        boolean boolean26 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime25);
        int int27 = property10.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfMinute" + "'", str8, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime8 = localTime6.minusMillis(20);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis(54);
        int[] intArray11 = localTime10.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 58, 6, 961]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(20);
        org.joda.time.LocalTime localTime18 = localTime5.plusHours((-1606327409));
        org.joda.time.LocalTime localTime20 = localTime5.minusMinutes((-1606255518));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime1.getFieldType((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime1.withPeriodAdded(readablePeriod4, 51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime1.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        boolean boolean6 = property2.equals((java.lang.Object) 31);
        org.joda.time.LocalTime localTime8 = property2.setCopy(14);
        org.joda.time.LocalTime localTime10 = property2.addWrapFieldToCopy(712);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 201L + "'", long4 == 201L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(20);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.LocalTime localTime20 = localTime18.minusSeconds(37);
        java.lang.String str21 = localTime20.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        boolean boolean26 = localTime20.isBefore((org.joda.time.ReadablePartial) localTime25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime20.withSecondOfMinute((-1606255334));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255334 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "01:57:31.010" + "'", str21, "01:57:31.010");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DurationField durationField6 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        long long8 = property2.remainder();
        int int9 = property2.get();
        org.joda.time.DateTimeField dateTimeField10 = property2.getField();
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 529L + "'", long8 == 529L);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addCopy((-1606255569));
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        int int14 = property12.get();
        org.joda.time.LocalTime localTime16 = property12.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime18 = property12.addWrapFieldToCopy(2);
        java.util.Locale locale19 = null;
        java.lang.String str20 = property12.getAsShortText(locale19);
        java.lang.String str21 = property12.getAsShortText();
        java.lang.String str22 = property12.getName();
        org.joda.time.LocalTime localTime24 = property12.setCopy(0);
        org.joda.time.LocalTime localTime25 = property12.roundCeilingCopy();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((-1606190401001L));
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        org.joda.time.DateTime dateTime29 = localTime25.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property2.getDifference((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalTime localTime31 = property2.getLocalTime();
        org.joda.time.LocalTime localTime33 = property2.addWrapFieldToCopy((-1606255408));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "8" + "'", str20, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8" + "'", str21, "8");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "secondOfMinute" + "'", str22, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1606327310) + "'", int30 == (-1606327310));
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property2.getAsText(locale4);
        int int6 = property2.get();
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.LocalTime localTime22 = localTime18.plusMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property25.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        int int34 = localTime28.get(dateTimeFieldType33);
        boolean boolean35 = localTime22.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.LocalTime localTime41 = localTime39.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(chronology42);
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((java.lang.Object) localTime22, chronology42);
        org.joda.time.LocalTime localTime45 = localTime13.withFields((org.joda.time.ReadablePartial) localTime44);
        boolean boolean46 = property2.equals((java.lang.Object) localTime45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9" + "'", str5, "9");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("147");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"147\" is malformed at \"7\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:43:44.587");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = localTime7.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property13.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property13.getFieldType();
        int int19 = localTime7.get(dateTimeFieldType18);
        org.joda.time.LocalTime localTime21 = localTime1.withField(dateTimeFieldType18, 35);
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime24 = property22.addWrapFieldToCopy(37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = localTime24.getFieldTypes();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTimeToday(dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime5.plusSeconds((-1606255576));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime15 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime17 = property12.addCopy((long) 20);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property12.getFieldType();
        org.joda.time.LocalTime localTime20 = localTime5.withField(dateTimeFieldType18, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime20.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 20);
        int int8 = property2.get();
        org.joda.time.LocalTime localTime10 = property2.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime11 = property2.roundHalfFloorCopy();
        java.lang.String str12 = property2.getName();
        java.util.Locale locale13 = null;
        int int14 = property2.getMaximumTextLength(locale13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondOfMinute" + "'", str12, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        long long6 = property2.remainder();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsShortText(locale7);
        long long9 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 293L + "'", long6 == 293L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 293L + "'", long9 == 293L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        int int18 = localTime12.get(dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime6.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime21 = localTime6.minusSeconds((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.LocalTime localTime27 = property24.withMinimumValue();
        java.lang.String str28 = property24.getAsShortText();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property24.getAsShortText(locale29);
        org.joda.time.LocalTime localTime32 = property24.setCopy(23);
        boolean boolean33 = localTime21.isAfter((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime35 = localTime21.plusMinutes(189);
        org.joda.time.LocalTime localTime37 = localTime21.minusMillis((-1606255509));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        int int8 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime localTime10 = localTime7.withMinuteOfHour(24);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(36);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime12.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        int int11 = localTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.addCopy((long) '#');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        boolean boolean16 = property13.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime18 = property13.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        boolean boolean33 = localTime20.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime18.withField(dateTimeFieldType32, 2);
        org.joda.time.LocalTime localTime37 = localTime18.withMillisOfDay(29);
        int int38 = localTime37.getMillisOfDay();
        boolean boolean39 = localTime10.isAfter((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime41 = localTime37.plus(readablePeriod40);
        org.joda.time.LocalTime.Property property42 = localTime37.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 29 + "'", int38 == 29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property42);
    }
}
