import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(100L, chronology8);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis(0);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds(813);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        java.lang.String str6 = property2.getName();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.joda.time.LocalTime localTime9 = property2.setCopy(41);
        java.lang.String str10 = property2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property2.setCopy((-1606262393));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262393 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        boolean boolean23 = property20.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField24 = property20.getDurationField();
        boolean boolean25 = localTime17.equals((java.lang.Object) property20);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property20.getFieldType();
        boolean boolean28 = property20.equals((java.lang.Object) "32");
        long long29 = property20.remainder();
        java.lang.String str30 = property20.getAsText();
        java.lang.String str31 = property20.getAsShortText();
        java.lang.String str32 = property20.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 793L + "'", long29 == 793L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "34" + "'", str30, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "34" + "'", str31, "34");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Property[secondOfMinute]" + "'", str32, "Property[secondOfMinute]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumShortTextLength(locale11);
        org.joda.time.LocalTime localTime13 = property10.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        boolean boolean25 = property22.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField26 = property22.getDurationField();
        org.joda.time.DurationField durationField27 = property22.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        java.util.Locale locale31 = null;
        int int32 = property30.getMaximumShortTextLength(locale31);
        org.joda.time.LocalTime localTime33 = property30.getLocalTime();
        org.joda.time.LocalTime localTime34 = property30.withMinimumValue();
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTimeToday(dateTimeZone37);
        int int39 = property22.compareTo((org.joda.time.ReadableInstant) dateTime38);
        long long40 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        int int41 = property10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime43 = property10.addCopy(38);
        int int44 = localTime43.getHourOfDay();
        boolean boolean45 = property2.equals((java.lang.Object) int44);
        org.joda.time.LocalTime localTime46 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "34" + "'", str6, "34");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1606262365L) + "'", long40 == (-1606262365L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        java.lang.String str10 = property2.getAsText();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property2.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35" + "'", str10, "35");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35" + "'", str12, "35");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = localTime10.toString(dateTimeFormatter13);
        org.joda.time.LocalTime localTime16 = localTime10.withMinuteOfHour(47);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.LocalTime localTime25 = localTime22.withHourOfDay(0);
        org.joda.time.LocalTime localTime27 = localTime25.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime31 = property28.setCopy(18);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property34.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.LocalTime localTime46 = property44.roundFloorCopy();
        int int47 = localTime40.compareTo((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.LocalTime localTime51 = property50.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property50.getFieldType();
        boolean boolean53 = localTime40.isSupported(dateTimeFieldType52);
        org.joda.time.LocalTime.Property property54 = localTime38.property(dateTimeFieldType52);
        org.joda.time.LocalTime.Property property55 = localTime31.property(dateTimeFieldType52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = localTime31.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.Interval interval60 = property59.toInterval();
        org.joda.time.LocalTime localTime61 = property59.roundFloorCopy();
        org.joda.time.LocalTime localTime62 = property59.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property59.getFieldType();
        org.joda.time.LocalTime localTime65 = localTime31.withField(dateTimeFieldType63, 25);
        boolean boolean66 = localTime10.isSupported(dateTimeFieldType63);
        org.joda.time.LocalTime localTime68 = localTime10.withMinuteOfHour(26);
        org.joda.time.LocalTime.Property property69 = localTime68.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "01:58:35.000" + "'", str14, "01:58:35.000");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property69);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(27, (-26769835), 6960116, 614);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime14 = property11.setCopy(18);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property17.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        boolean boolean36 = localTime23.isSupported(dateTimeFieldType35);
        org.joda.time.LocalTime.Property property37 = localTime21.property(dateTimeFieldType35);
        org.joda.time.LocalTime.Property property38 = localTime14.property(dateTimeFieldType35);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = localTime14.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.LocalTime localTime45 = property42.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property42.getFieldType();
        org.joda.time.LocalTime localTime48 = localTime14.withField(dateTimeFieldType46, 25);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        java.util.Locale locale52 = null;
        int int53 = property51.getMaximumShortTextLength(locale52);
        org.joda.time.LocalTime localTime54 = property51.getLocalTime();
        org.joda.time.LocalTime localTime55 = property51.withMinimumValue();
        org.joda.time.LocalTime localTime57 = property51.addWrapFieldToCopy((int) (byte) 10);
        int int58 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.LocalTime localTime60 = localTime48.withMillisOfDay(111);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(localTime60);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.addCopy(690);
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.joda.time.Interval interval12 = property2.toInterval();
        org.joda.time.LocalTime localTime14 = property2.addNoWrapToCopy(33);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property2.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        int int8 = property7.getMaximumValue();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        boolean boolean11 = property7.isLeap();
        org.joda.time.LocalTime localTime13 = property7.setCopy("25");
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis(13);
        boolean boolean22 = localTime13.isAfter((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.LocalTime localTime28 = localTime26.plusMillis(0);
        org.joda.time.LocalTime localTime30 = localTime28.minusMinutes(23);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property33.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        int int42 = localTime36.get(dateTimeFieldType41);
        boolean boolean43 = localTime28.isSupported(dateTimeFieldType41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        boolean boolean49 = property46.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime51 = property46.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.LocalTime localTime59 = property57.roundFloorCopy();
        int int60 = localTime53.compareTo((org.joda.time.ReadablePartial) localTime59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone61);
        org.joda.time.LocalTime.Property property63 = localTime62.secondOfMinute();
        org.joda.time.LocalTime localTime64 = property63.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        boolean boolean66 = localTime53.isSupported(dateTimeFieldType65);
        org.joda.time.LocalTime localTime68 = localTime51.withField(dateTimeFieldType65, 1);
        int int69 = localTime28.get(dateTimeFieldType65);
        boolean boolean70 = localTime21.isSupported(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 36 + "'", int42 == 36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(localTime68);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(100L, chronology12);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(0, (int) (byte) 0, 31, (int) '4', chronology12);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localTime17.isSupported(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime12 = property9.getLocalTime();
        org.joda.time.LocalTime localTime13 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday(dateTimeZone14);
        int int16 = property2.getDifference((org.joda.time.ReadableInstant) dateTime15);
        int int17 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime19 = property2.addWrapFieldToCopy(29);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = localTime24.plusMillis((int) ' ');
        org.joda.time.LocalTime localTime28 = localTime24.plusMinutes(0);
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond(21);
        org.joda.time.LocalTime localTime32 = localTime28.plusHours(29);
        org.joda.time.LocalTime localTime33 = localTime19.withFields((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime35 = localTime33.withMillisOfSecond(492);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1606262365) + "'", int16 == (-1606262365));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        java.lang.String str12 = localTime10.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.Chronology chronology25 = localTime23.getChronology();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262400), chronology25);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) readablePeriod13, chronology25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = property30.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.LocalTime localTime38 = property36.roundFloorCopy();
        org.joda.time.LocalTime localTime39 = property36.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = localTime39.get(dateTimeFieldType44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime48 = localTime39.withPeriodAdded(readablePeriod46, 0);
        boolean boolean49 = property30.equals((java.lang.Object) localTime48);
        org.joda.time.DateTime dateTime50 = localTime48.toDateTimeToday();
        boolean boolean51 = localTime27.isBefore((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalTime localTime54 = localTime48.withPeriodAdded(readablePeriod52, 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:58:36.000" + "'", str12, "01:58:36.000");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 36 + "'", int45 == 36);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localTime54);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        int int6 = property2.get();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        int int9 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime12.withPeriodAdded(readablePeriod13, 13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime12.toDateTimeToday(dateTimeZone16);
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) dateTime17);
        int int19 = property2.getMaximumValue();
        java.lang.String str20 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1606262399) + "'", int18 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "36" + "'", str20, "36");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (-1606262393));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        int int15 = localTime14.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfDay(12);
        org.joda.time.Chronology chronology20 = localTime17.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology20);
        boolean boolean22 = localTime14.isBefore((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localTime14.isSupported(durationFieldType23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79081261 + "'", int15 == 79081261);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        int int7 = property2.getMinimumValueOverall();
        int int8 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("00:28:47.266", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        int int27 = localTime26.getHourOfDay();
        int int28 = localTime26.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime36 = localTime33.withPeriodAdded(readablePeriod34, 13);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime33.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localTime26.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property15.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.withMaximumValue();
        org.joda.time.LocalTime localTime48 = localTime46.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        org.joda.time.LocalTime localTime55 = localTime48.withField(dateTimeFieldType53, (int) (byte) 1);
        org.joda.time.LocalTime.Property property56 = localTime55.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.Interval interval63 = property62.toInterval();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        int int65 = localTime58.compareTo((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime localTime67 = localTime64.plusHours((int) (short) 0);
        int int68 = localTime67.getHourOfDay();
        int int69 = localTime67.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(dateTimeZone70);
        org.joda.time.LocalTime.Property property72 = localTime71.secondOfMinute();
        org.joda.time.LocalTime localTime73 = property72.getLocalTime();
        org.joda.time.LocalTime localTime74 = property72.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 13);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = localTime74.toDateTimeToday(dateTimeZone78);
        org.joda.time.DateTime dateTime80 = localTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        int int81 = property56.compareTo((org.joda.time.ReadableInstant) dateTime80);
        long long82 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        int int83 = property15.getMaximumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property15.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime(dateTimeZone85);
        org.joda.time.LocalTime.Property property87 = localTime86.secondOfMinute();
        org.joda.time.Interval interval88 = property87.toInterval();
        org.joda.time.LocalTime localTime89 = property87.roundFloorCopy();
        org.joda.time.LocalTime localTime91 = property87.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property92 = localTime91.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone93 = null;
        org.joda.time.DateTime dateTime94 = localTime91.toDateTimeToday(dateTimeZone93);
        org.joda.time.DateTimeZone dateTimeZone95 = null;
        org.joda.time.DateTime dateTime96 = localTime91.toDateTimeToday(dateTimeZone95);
        int int97 = property15.compareTo((org.joda.time.ReadablePartial) localTime91);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36 + "'", int28 == 36);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localTime67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 36 + "'", int69 == 36);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-446164L) + "'", long82 == (-446164L));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 23 + "'", int83 == 23);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(interval88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(localTime91);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(dateTime96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(28);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfSecond();
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday();
        org.joda.time.LocalTime localTime11 = localTime5.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField18 = property14.getDurationField();
        org.joda.time.DurationField durationField19 = property14.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumShortTextLength(locale23);
        org.joda.time.LocalTime localTime25 = property22.getLocalTime();
        org.joda.time.LocalTime localTime26 = property22.withMinimumValue();
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTimeToday(dateTimeZone29);
        int int31 = property14.compareTo((org.joda.time.ReadableInstant) dateTime30);
        long long32 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        int int33 = property2.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalTime localTime35 = property2.addCopy(38);
        org.joda.time.LocalTime localTime37 = property2.addWrapFieldToCopy(372);
        java.lang.String str38 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1606262363L) + "'", long32 == (-1606262363L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "36" + "'", str38, "36");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(35);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime13 = localTime10.plusMinutes((int) (short) 0);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds(204);
        org.joda.time.LocalTime localTime19 = localTime13.plusHours((-1606262358));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 0);
        org.joda.time.LocalTime localTime9 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField10 = property2.getLeapDurationField();
        java.util.Locale locale11 = null;
        int int12 = property2.getMaximumShortTextLength(locale11);
        java.lang.String str13 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 269L + "'", long4 == 269L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37" + "'", str13, "37");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(13, 0, 27, 7065665);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7065665 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(12);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology4);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        int int8 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        int int13 = property11.get();
        org.joda.time.LocalTime localTime15 = property11.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime16 = property11.withMinimumValue();
        java.lang.String str18 = localTime16.toString("12");
        org.joda.time.LocalTime localTime20 = localTime16.plusMinutes(14);
        boolean boolean22 = localTime16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property25.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime29.toDateTimeToday(dateTimeZone31);
        org.joda.time.LocalTime localTime33 = localTime16.withFields((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime29.toDateTimeToday(dateTimeZone34);
        long long36 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "12" + "'", str18, "12");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1606262399L) + "'", long36 == (-1606262399L));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        int int12 = localTime10.getSecondOfMinute();
        org.joda.time.LocalTime.Property property13 = localTime10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DurationField durationField18 = property16.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        org.joda.time.LocalTime localTime21 = property16.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime22 = property16.withMaximumValue();
        int int23 = property13.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        int int33 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.Chronology chronology34 = localTime32.getChronology();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        int int45 = localTime38.compareTo((org.joda.time.ReadablePartial) localTime44);
        org.joda.time.LocalTime localTime47 = localTime44.plusHours((int) (short) 0);
        int int48 = localTime47.getHourOfDay();
        int int49 = localTime47.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime57 = localTime54.withPeriodAdded(readablePeriod55, 13);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localTime54.toDateTimeToday(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = localTime47.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        boolean boolean61 = localTime36.isEqual((org.joda.time.ReadablePartial) localTime47);
        org.joda.time.LocalTime localTime63 = localTime47.plusMillis((int) (byte) 10);
        org.joda.time.LocalTime localTime65 = localTime47.plusMillis(23);
        int int66 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(localTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 37 + "'", int49 == 37);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) localTime1, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime1.toDateTimeToday(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 1, 17, (int) (short) 0);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday(dateTimeZone12);
        long long14 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1606259902L) + "'", long14 == (-1606259902L));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(28);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((-1606262350));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property27 = localTime26.millisOfDay();
        boolean boolean28 = property15.equals((java.lang.Object) property27);
        java.util.Locale locale29 = null;
        java.lang.String str30 = property15.getAsShortText(locale29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "107" + "'", str30, "107");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        int int27 = localTime26.getHourOfDay();
        int int28 = localTime26.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime36 = localTime33.withPeriodAdded(readablePeriod34, 13);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime33.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localTime26.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property15.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.withMaximumValue();
        org.joda.time.LocalTime localTime48 = localTime46.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        org.joda.time.LocalTime localTime55 = localTime48.withField(dateTimeFieldType53, (int) (byte) 1);
        org.joda.time.LocalTime.Property property56 = localTime55.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.Interval interval63 = property62.toInterval();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        int int65 = localTime58.compareTo((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime localTime67 = localTime64.plusHours((int) (short) 0);
        int int68 = localTime67.getHourOfDay();
        int int69 = localTime67.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(dateTimeZone70);
        org.joda.time.LocalTime.Property property72 = localTime71.secondOfMinute();
        org.joda.time.LocalTime localTime73 = property72.getLocalTime();
        org.joda.time.LocalTime localTime74 = property72.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 13);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = localTime74.toDateTimeToday(dateTimeZone78);
        org.joda.time.DateTime dateTime80 = localTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        int int81 = property56.compareTo((org.joda.time.ReadableInstant) dateTime80);
        long long82 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        int int83 = property15.getMaximumValueOverall();
        org.joda.time.LocalTime localTime84 = property15.roundCeilingCopy();
        org.joda.time.LocalTime.Property property85 = localTime84.minuteOfHour();
        int int86 = property85.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone87 = null;
        org.joda.time.LocalTime localTime88 = new org.joda.time.LocalTime(dateTimeZone87);
        org.joda.time.LocalTime.Property property89 = localTime88.secondOfMinute();
        org.joda.time.LocalTime localTime90 = property89.getLocalTime();
        org.joda.time.LocalTime localTime91 = property89.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod92 = null;
        org.joda.time.LocalTime localTime94 = localTime91.withPeriodAdded(readablePeriod92, 13);
        org.joda.time.DateTimeZone dateTimeZone95 = null;
        org.joda.time.DateTime dateTime96 = localTime91.toDateTimeToday(dateTimeZone95);
        int int97 = property85.getDifference((org.joda.time.ReadableInstant) dateTime96);
        long long98 = property85.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 38 + "'", int28 == 38);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localTime67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 38 + "'", int69 == 38);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-446164L) + "'", long82 == (-446164L));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 23 + "'", int83 == 23);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localTime91);
        org.junit.Assert.assertNotNull(localTime94);
        org.junit.Assert.assertNotNull(dateTime96);
// flaky:         org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-26769838) + "'", int97 == (-26769838));
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 0L + "'", long98 == 0L);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        long long7 = property2.remainder();
        long long8 = property2.remainder();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.joda.time.LocalTime localTime12 = property2.addWrapFieldToCopy(201);
        org.joda.time.LocalTime localTime14 = property2.addCopy((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfDay(12);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) (byte) 1, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "38" + "'", str6, "38");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 366L + "'", long7 == 366L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 366L + "'", long8 == 366L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        int int8 = localTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 465 + "'", int8 == 465);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.plus(readablePeriod6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime3.withPeriodAdded(readablePeriod8, (-1606262346));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 1);
        org.joda.time.LocalTime localTime26 = localTime7.minusSeconds(2);
        org.joda.time.LocalTime.Property property27 = localTime7.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime12.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localTime12.getFields();
        boolean boolean23 = property2.equals((java.lang.Object) localTime12);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType25 = null;
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property29.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        int int38 = localTime32.get(dateTimeFieldType37);
        int int39 = localTime24.indexOf(dateTimeFieldType37);
        boolean boolean40 = localTime12.isSupported(dateTimeFieldType37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = localTime12.toString(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 39 + "'", int38 == 39);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "01:58:39.000" + "'", str42, "01:58:39.000");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime12.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localTime12.getFields();
        boolean boolean23 = property2.equals((java.lang.Object) localTime12);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType25 = null;
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property29.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        int int38 = localTime32.get(dateTimeFieldType37);
        int int39 = localTime24.indexOf(dateTimeFieldType37);
        boolean boolean40 = localTime12.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime localTime42 = localTime12.plusMinutes((-1606262377));
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.LocalTime localTime49 = property45.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        int int58 = localTime51.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        boolean boolean64 = localTime51.isSupported(dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime49.property(dateTimeFieldType63);
        org.joda.time.LocalTime localTime66 = property65.roundCeilingCopy();
        boolean boolean67 = localTime42.isAfter((org.joda.time.ReadablePartial) localTime66);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 39 + "'", int38 == 39);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime localTime8 = localTime4.plusMinutes(0);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond(21);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        int int19 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.Chronology chronology20 = localTime18.getChronology();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology20);
        int int23 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime25 = localTime22.plusSeconds((-1606262399));
        org.joda.time.LocalTime localTime27 = localTime22.minusMinutes(8);
        org.joda.time.LocalTime localTime29 = localTime22.plusMinutes(52);
        org.joda.time.LocalTime.Property property30 = localTime22.millisOfDay();
        org.joda.time.LocalTime localTime32 = localTime22.minusMinutes(17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(12);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        boolean boolean5 = localTime1.isSupported(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime21 = localTime19.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.LocalTime localTime28 = localTime21.withField(dateTimeFieldType26, (int) (byte) 1);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime37.plusHours((int) (short) 0);
        int int41 = localTime40.getHourOfDay();
        int int42 = localTime40.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime50 = localTime47.withPeriodAdded(readablePeriod48, 13);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localTime47.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localTime40.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        int int54 = property29.compareTo((org.joda.time.ReadableInstant) dateTime53);
        long long55 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        int int56 = property2.getDifference((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalTime localTime58 = property2.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime59 = property2.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime61 = localTime59.plus(readablePeriod60);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime64 = localTime61.withFieldAdded(durationFieldType62, 7020598);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 39 + "'", int42 == 39);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1606262399L) + "'", long55 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1606262399) + "'", int56 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        boolean boolean14 = property2.equals((java.lang.Object) localTime11);
        org.joda.time.LocalTime localTime15 = property2.withMinimumValue();
        java.lang.String str16 = property2.getAsString();
        java.lang.String str17 = property2.getAsText();
        org.joda.time.LocalTime localTime18 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "39" + "'", str16, "39");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "39" + "'", str17, "39");
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        boolean boolean7 = property2.isLeap();
        org.joda.time.LocalTime localTime8 = property2.roundCeilingCopy();
        java.lang.String str9 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 242L + "'", long4 == 242L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39" + "'", str9, "39");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getName();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime9 = property2.roundHalfFloorCopy();
        java.lang.String str10 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 490L + "'", long4 == 490L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[secondOfMinute]" + "'", str10, "Property[secondOfMinute]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes(22);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        int int8 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(0);
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(23);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumShortTextLength(locale11);
        org.joda.time.LocalTime localTime13 = property10.getLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.Chronology chronology15 = localTime13.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology15);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        int int7 = localTime6.getHourOfDay();
        int int8 = localTime6.getMillisOfSecond();
        org.joda.time.LocalTime localTime10 = localTime6.withMillisOfDay(356);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 686 + "'", int8 == 686);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        int int17 = localTime11.get(dateTimeFieldType16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime11.withPeriodAdded(readablePeriod18, 0);
        boolean boolean21 = property2.equals((java.lang.Object) localTime20);
        org.joda.time.LocalTime localTime23 = localTime20.plusHours(8);
        org.joda.time.LocalTime localTime25 = localTime20.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime27 = localTime20.withMillisOfDay(412);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType33 = null;
        boolean boolean34 = localTime32.isSupported(durationFieldType33);
        org.joda.time.LocalTime localTime36 = localTime32.plusMillis(2);
        boolean boolean37 = localTime27.isEqual((org.joda.time.ReadablePartial) localTime32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        int int5 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property6 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundHalfFloorCopy();
        int int8 = localTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.LocalTime localTime6 = property2.setCopy("15");
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime9 = localTime7.minusHours(814);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        int int10 = property2.getMinimumValue();
        java.lang.String str11 = property2.getAsText();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime14 = property2.setCopy("12");
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime14.withFieldAdded(durationFieldType15, 201);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(814L, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(78901277);
        org.joda.time.LocalTime localTime6 = localTime2.plusMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(12);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(0L, chronology5);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology5);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(601L, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.withSecondOfMinute(20);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.getMaximumValueOverall();
        long long7 = property2.remainder();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumTextLength(locale10);
        java.lang.String str12 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 793L + "'", long7 == 793L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.LocalTime localTime11 = property2.setCopy(52);
        int[] intArray12 = localTime11.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 850L + "'", long4 == 850L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 58, 52, 850]");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.LocalTime localTime6 = property2.setCopy("15");
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        org.joda.time.Interval interval9 = property2.toInterval();
        org.joda.time.LocalTime localTime11 = property2.addCopy(6868000);
        int int12 = property2.get();
        org.joda.time.LocalTime localTime13 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime14 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 0);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        int int24 = localTime9.indexOf(dateTimeFieldType22);
        org.joda.time.LocalTime localTime26 = localTime8.withField(dateTimeFieldType22, 0);
        org.joda.time.LocalTime localTime28 = localTime26.minusSeconds((int) (short) -1);
        org.joda.time.LocalTime localTime30 = localTime28.plusHours(0);
        int int31 = localTime30.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 39L + "'", long4 == 39L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 41 + "'", int23 == 41);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        long long10 = property2.remainder();
        java.lang.String str11 = property2.getName();
        int int12 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 136L + "'", long10 == 136L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "secondOfMinute" + "'", str11, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime7 = property2.setCopy(56);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        int int10 = property2.getMaximumValueOverall();
        int int11 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41" + "'", str4, "41");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "41" + "'", str9, "41");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 6982049, dateTimeZone1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime12 = property9.getLocalTime();
        org.joda.time.LocalTime localTime13 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday(dateTimeZone14);
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localTime17.isSupported(durationFieldType18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property22.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        int int31 = localTime25.get(dateTimeFieldType30);
        int int32 = localTime17.indexOf(dateTimeFieldType30);
        int int33 = property2.compareTo((org.joda.time.ReadablePartial) localTime17);
        int int34 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 473L + "'", long4 == 473L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 41 + "'", int31 == 41);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        int int18 = localTime17.getMinuteOfHour();
        boolean boolean19 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        long long24 = property22.remainder();
        int int25 = property22.getLeapAmount();
        org.joda.time.LocalTime localTime26 = property22.withMinimumValue();
        boolean boolean27 = property22.isLeap();
        boolean boolean28 = localTime17.equals((java.lang.Object) property22);
        org.joda.time.LocalTime localTime29 = property22.roundHalfCeilingCopy();
        int int30 = property22.get();
        java.lang.String str31 = property22.getAsText();
        org.joda.time.LocalTime localTime32 = property22.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 582L + "'", long24 == 582L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41 + "'", int30 == 41);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "41" + "'", str31, "41");
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime6.minus(readablePeriod8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localTime6.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        boolean boolean20 = property17.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime22 = property17.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        int int31 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        boolean boolean37 = localTime24.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime localTime39 = localTime22.withField(dateTimeFieldType36, 1);
        boolean boolean40 = localTime14.isEqual((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.LocalTime localTime42 = localTime39.withMillisOfSecond(59);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime44 = localTime42.minus(readablePeriod43);
        org.joda.time.LocalTime localTime46 = localTime42.minusSeconds(100);
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
        org.joda.time.LocalTime localTime71 = localTime54.withField(dateTimeFieldType68, 1);
        boolean boolean72 = localTime42.isSupported(dateTimeFieldType68);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(dateTimeZone73);
        org.joda.time.LocalTime.Property property75 = localTime74.secondOfMinute();
        org.joda.time.Interval interval76 = property75.toInterval();
        org.joda.time.LocalTime localTime77 = property75.roundFloorCopy();
        org.joda.time.LocalTime localTime79 = property75.addCopy((long) (short) -1);
        boolean boolean80 = localTime42.equals((java.lang.Object) localTime79);
        boolean boolean82 = localTime42.equals((java.lang.Object) 242L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(interval76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        int int8 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime.Property property9 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.setCopy("37");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime18 = property14.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.LocalTime localTime29 = localTime26.plusHours((int) (short) 0);
        int int30 = localTime29.getMinuteOfHour();
        boolean boolean31 = localTime18.isAfter((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localTime18.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime18.plus(readablePeriod33);
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfDay(49);
        java.util.Locale locale38 = null;
        java.lang.String str39 = localTime34.toString("18", locale38);
        int int40 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime43 = localTime11.withPeriodAdded(readablePeriod41, 16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 58 + "'", int30 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "18" + "'", str39, "18");
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localTime43);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        boolean boolean11 = property8.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField12 = property8.getDurationField();
        org.joda.time.DurationField durationField13 = property8.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumShortTextLength(locale17);
        org.joda.time.LocalTime localTime19 = property16.getLocalTime();
        org.joda.time.LocalTime localTime20 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTimeToday(dateTimeZone23);
        int int25 = property8.compareTo((org.joda.time.ReadableInstant) dateTime24);
        long long26 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime27 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime29 = localTime27.minusMillis(43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField31 = localTime29.getField(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1606262358L) + "'", long26 == (-1606262358L));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property9.getFieldType();
        org.joda.time.LocalTime localTime15 = property9.withMinimumValue();
        int int17 = localTime15.getValue(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property20.withMaximumValue();
        org.joda.time.LocalTime localTime25 = localTime23.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.LocalTime localTime32 = localTime25.withField(dateTimeFieldType30, (int) (byte) 1);
        int int33 = localTime15.indexOf(dateTimeFieldType30);
        boolean boolean34 = localTime6.equals((java.lang.Object) int33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 29L + "'", long4 == 29L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.addCopy(690);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getName();
        org.joda.time.LocalTime localTime9 = property2.addCopy(19);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property12.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property12.getFieldType();
        org.joda.time.LocalTime localTime18 = property12.withMaximumValue();
        org.joda.time.DurationField durationField19 = property12.getLeapDurationField();
        java.lang.String str20 = property12.getName();
        org.joda.time.LocalTime localTime22 = property12.addCopy(484);
        org.joda.time.LocalTime localTime23 = localTime9.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime25 = localTime22.withMillisOfSecond(356);
        int int26 = localTime25.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 46 + "'", int26 == 46);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) '#', dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusMinutes(56);
        int int5 = localTime4.size();
        org.joda.time.LocalTime localTime7 = localTime4.minusSeconds(19);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(28);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = localTime7.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localTime10.toString(dateTimeFormatter11);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 100, chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((-446164L), chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00:30:42.373" + "'", str12, "00:30:42.373");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        int int18 = localTime17.getMinuteOfHour();
        boolean boolean19 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime localTime21 = localTime17.minusMinutes(625);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        long long26 = property24.remainder();
        int int27 = property24.get();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime33 = localTime31.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.LocalTime localTime36 = localTime33.withHourOfDay(0);
        org.joda.time.LocalTime localTime38 = localTime36.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime42 = property39.setCopy(18);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.LocalTime localTime49 = property45.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        int int58 = localTime51.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        boolean boolean64 = localTime51.isSupported(dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime49.property(dateTimeFieldType63);
        org.joda.time.LocalTime.Property property66 = localTime42.property(dateTimeFieldType63);
        boolean boolean67 = property24.equals((java.lang.Object) localTime42);
        org.joda.time.LocalTime localTime68 = property24.roundHalfFloorCopy();
        boolean boolean69 = localTime17.equals((java.lang.Object) localTime68);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 462L + "'", long26 == 462L);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42 + "'", int27 == 42);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime68);
// flaky:         org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        int int18 = localTime17.getMinuteOfHour();
        boolean boolean19 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localTime6.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime6.plus(readablePeriod21);
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfDay(49);
        java.lang.String str25 = localTime24.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "00:00:00.049" + "'", str25, "00:00:00.049");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        int int11 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.Chronology chronology12 = localTime10.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology12);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 16, chronology12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 2, chronology12);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.plusHours((int) (short) 0);
        int int29 = localTime28.getHourOfDay();
        int int30 = localTime28.getSecondOfMinute();
        int int31 = localTime28.getSecondOfMinute();
        boolean boolean32 = localTime17.equals((java.lang.Object) localTime28);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42 + "'", int30 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        org.joda.time.LocalTime localTime10 = property2.addCopy(869);
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43 + "'", int4 == 43);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes(22);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        java.lang.String str13 = property11.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property16.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        int int29 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property32.getFieldType();
        boolean boolean35 = localTime22.isSupported(dateTimeFieldType34);
        org.joda.time.LocalTime.Property property36 = localTime20.property(dateTimeFieldType34);
        org.joda.time.LocalTime localTime37 = property36.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        java.util.Locale locale41 = null;
        int int42 = property40.getMaximumShortTextLength(locale41);
        org.joda.time.LocalTime localTime43 = property40.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        org.joda.time.LocalTime localTime49 = property46.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        boolean boolean55 = property52.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField56 = property52.getDurationField();
        org.joda.time.DurationField durationField57 = property52.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        java.util.Locale locale61 = null;
        int int62 = property60.getMaximumShortTextLength(locale61);
        org.joda.time.LocalTime localTime63 = property60.getLocalTime();
        org.joda.time.LocalTime localTime64 = property60.withMinimumValue();
        org.joda.time.LocalTime localTime66 = localTime64.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = localTime66.toDateTimeToday(dateTimeZone67);
        int int69 = property52.compareTo((org.joda.time.ReadableInstant) dateTime68);
        long long70 = property46.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime68);
        int int71 = property40.compareTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime72 = localTime37.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        int int73 = property11.compareTo((org.joda.time.ReadableInstant) dateTime68);
        long long74 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.LocalTime localTime76 = property7.addCopy(467L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "43" + "'", str13, "43");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTime68);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1606262356L) + "'", long70 == (-1606262356L));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-26771039L) + "'", long74 == (-26771039L));
        org.junit.Assert.assertNotNull(localTime76);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((-1606262399));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262399 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        int int7 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        java.lang.String str6 = property2.toString();
        org.joda.time.LocalTime localTime8 = property2.setCopy("11");
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[secondOfMinute]" + "'", str6, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime localTime8 = localTime4.plusMinutes(0);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond(21);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        int int19 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.Chronology chronology20 = localTime18.getChronology();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology20);
        int int23 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime.Property property24 = localTime22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        long long29 = property27.remainder();
        int int30 = property27.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property27.getFieldType();
        java.lang.String str32 = property27.getAsString();
        org.joda.time.LocalTime localTime33 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property27.roundCeilingCopy();
        org.joda.time.LocalTime.Property property35 = localTime34.minuteOfHour();
        org.joda.time.DateTime dateTime36 = localTime34.toDateTimeToday();
        org.joda.time.DateTime dateTime37 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 674L + "'", long29 == 674L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "43" + "'", str32, "43");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:54:22.100");
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((-1606262400));
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime5.withFieldAdded(durationFieldType8, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        boolean boolean23 = property20.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField24 = property20.getDurationField();
        boolean boolean25 = localTime17.equals((java.lang.Object) property20);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property20.getFieldType();
        boolean boolean28 = property20.equals((java.lang.Object) "32");
        long long29 = property20.remainder();
        java.lang.String str30 = property20.getAsText();
        java.lang.String str31 = property20.getAsShortText();
        org.joda.time.DurationField durationField32 = property20.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 44 + "'", int11 == 44);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 946L + "'", long29 == 946L);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "43" + "'", str30, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "43" + "'", str31, "43");
        org.junit.Assert.assertNull(durationField32);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(3380000L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.LocalTime.Property property19 = localTime16.minuteOfHour();
        int int20 = localTime16.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 44 + "'", int11 == 44);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        int int9 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime10 = property2.withMinimumValue();
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(814L);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, 15);
        int int5 = localTime4.getSecondOfMinute();
        org.joda.time.LocalTime.Property property6 = localTime4.millisOfSecond();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getName();
        int int8 = property2.getMinimumValueOverall();
        int int9 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime14 = property11.addCopy(982);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        java.lang.String str7 = property2.toString();
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy(43);
        int int10 = localTime9.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[secondOfMinute]" + "'", str7, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 377 + "'", int10 == 377);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 10);
        org.joda.time.LocalTime localTime9 = property2.addWrapFieldToCopy(78901066);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(61L, chronology2);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime7 = localTime3.withMinuteOfHour(23);
        org.joda.time.LocalTime localTime9 = localTime7.minusHours(484);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime9.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 1);
        int int25 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime.Property property26 = localTime7.millisOfSecond();
        int int27 = property26.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 58 + "'", int25 == 58);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        java.lang.String str7 = property2.getName();
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsShortText(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44" + "'", str4, "44");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        int int12 = localTime6.get(dateTimeFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime6.withPeriodAdded(readablePeriod13, 0);
        org.joda.time.LocalTime localTime17 = localTime6.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        boolean boolean24 = property21.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField25 = property21.getDurationField();
        boolean boolean26 = localTime18.equals((java.lang.Object) property21);
        int int27 = localTime18.getSecondOfMinute();
        org.joda.time.LocalTime localTime29 = localTime18.plusMinutes(57);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds(0);
        org.joda.time.Chronology chronology32 = localTime29.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay(981L, chronology32);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 45 + "'", int12 == 45);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55 + "'", int27 == 55);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localTime5.getFields();
        int int16 = localTime5.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime localTime27 = localTime24.plusHours((int) (short) 0);
        int int28 = localTime27.getMinuteOfHour();
        org.joda.time.LocalTime localTime30 = localTime27.withHourOfDay(4);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.LocalTime localTime36 = localTime34.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.LocalTime localTime39 = localTime36.withHourOfDay(0);
        org.joda.time.LocalTime localTime41 = localTime39.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.LocalTime localTime46 = property44.roundFloorCopy();
        org.joda.time.LocalTime localTime48 = property44.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.LocalTime localTime56 = property54.roundFloorCopy();
        int int57 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime61 = property60.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        boolean boolean63 = localTime50.isSupported(dateTimeFieldType62);
        org.joda.time.LocalTime.Property property64 = localTime48.property(dateTimeFieldType62);
        boolean boolean65 = localTime39.isSupported(dateTimeFieldType62);
        org.joda.time.LocalTime localTime67 = localTime27.withField(dateTimeFieldType62, 17);
        int int68 = localTime5.indexOf(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 45 + "'", int11 == 45);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 58 + "'", int28 == 58);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime12 = property9.getLocalTime();
        org.joda.time.LocalTime localTime13 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday(dateTimeZone14);
        int int16 = property2.getDifference((org.joda.time.ReadableInstant) dateTime15);
        int int17 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime19 = property2.addWrapFieldToCopy(29);
        org.joda.time.LocalTime localTime20 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1606262355) + "'", int16 == (-1606262355));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(6982049);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        java.lang.String str9 = localTime7.toString("12");
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay(1);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addNoWrapToCopy(36);
        java.util.Locale locale15 = null;
        int int16 = property12.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime7 = localTime1.minusMinutes(19);
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
        org.joda.time.LocalTime.Property property23 = localTime1.property(dateTimeFieldType21);
        int int24 = property23.get();
        int int25 = property23.get();
        int int26 = property23.getMinimumValue();
        java.util.Locale locale28 = null;
        org.joda.time.LocalTime localTime29 = property23.setCopy("12", locale28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = localTime29.withSecondOfMinute(204);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 204 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
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
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 45 + "'", int25 == 45);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(0);
        int int6 = localTime3.getMillisOfSecond();
        org.joda.time.LocalTime.Property property7 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 422 + "'", int6 == 422);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        int int27 = localTime26.getHourOfDay();
        int int28 = localTime26.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime36 = localTime33.withPeriodAdded(readablePeriod34, 13);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime33.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localTime26.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property15.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.withMaximumValue();
        org.joda.time.LocalTime localTime48 = localTime46.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        org.joda.time.LocalTime localTime55 = localTime48.withField(dateTimeFieldType53, (int) (byte) 1);
        org.joda.time.LocalTime.Property property56 = localTime55.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.Interval interval63 = property62.toInterval();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        int int65 = localTime58.compareTo((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime localTime67 = localTime64.plusHours((int) (short) 0);
        int int68 = localTime67.getHourOfDay();
        int int69 = localTime67.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(dateTimeZone70);
        org.joda.time.LocalTime.Property property72 = localTime71.secondOfMinute();
        org.joda.time.LocalTime localTime73 = property72.getLocalTime();
        org.joda.time.LocalTime localTime74 = property72.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 13);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateTime dateTime79 = localTime74.toDateTimeToday(dateTimeZone78);
        org.joda.time.DateTime dateTime80 = localTime67.toDateTime((org.joda.time.ReadableInstant) dateTime79);
        int int81 = property56.compareTo((org.joda.time.ReadableInstant) dateTime80);
        long long82 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        int int83 = property15.getMaximumValueOverall();
        org.joda.time.LocalTime localTime84 = property15.roundCeilingCopy();
        org.joda.time.LocalTime.Property property85 = localTime84.minuteOfHour();
        org.joda.time.LocalTime localTime87 = property85.addCopy((long) ' ');
        java.util.Locale locale88 = null;
        int int89 = property85.getMaximumTextLength(locale88);
        java.lang.String str90 = property85.getAsString();
        org.joda.time.DateTimeField dateTimeField91 = property85.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 45 + "'", int28 == 45);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localTime67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-446164L) + "'", long82 == (-446164L));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 23 + "'", int83 == 23);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "0" + "'", str90, "0");
        org.junit.Assert.assertNotNull(dateTimeField91);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        boolean boolean14 = property2.equals((java.lang.Object) localTime11);
        java.util.Locale locale15 = null;
        int int16 = property2.getMaximumShortTextLength(locale15);
        org.joda.time.LocalTime localTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property20.withMaximumValue();
        org.joda.time.LocalTime localTime25 = localTime23.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.LocalTime localTime32 = localTime25.withField(dateTimeFieldType30, (int) (byte) 1);
        org.joda.time.LocalTime.Property property33 = localTime25.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        int int42 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.LocalTime localTime44 = localTime41.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property45 = localTime44.millisOfDay();
        boolean boolean46 = property33.equals((java.lang.Object) property45);
        org.joda.time.LocalTime localTime47 = property33.roundHalfFloorCopy();
        int int48 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 791L + "'", long4 == 791L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "45" + "'", str7, "45");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606262350), 54, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262350 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = localTime6.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        org.joda.time.Chronology chronology11 = localTime8.getChronology();
        org.joda.time.LocalTime localTime13 = localTime8.plusHours(0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime8.plus(readablePeriod14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        int int6 = property2.get();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "45" + "'", str5, "45");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45" + "'", str9, "45");
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(655L, dateTimeZone1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime18 = localTime14.withPeriodAdded(readablePeriod16, (-1606262363));
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime21 = localTime19.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        org.joda.time.LocalTime localTime28 = localTime21.withField(dateTimeFieldType26, (int) (byte) 1);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime37.plusHours((int) (short) 0);
        int int41 = localTime40.getHourOfDay();
        int int42 = localTime40.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime50 = localTime47.withPeriodAdded(readablePeriod48, 13);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localTime47.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localTime40.toDateTime((org.joda.time.ReadableInstant) dateTime52);
        int int54 = property29.compareTo((org.joda.time.ReadableInstant) dateTime53);
        long long55 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        int int56 = property2.getDifference((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalTime localTime58 = property2.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime60 = localTime58.minusMinutes(14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 46 + "'", int42 == 46);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1606262399L) + "'", long55 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1606262399) + "'", int56 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(100L, chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 789, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((-1606262346));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262346 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.Chronology chronology19 = localTime17.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology19);
        int int24 = property2.compareTo((org.joda.time.ReadablePartial) localTime23);
        int[] intArray25 = localTime23.getValues();
        int int26 = localTime23.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 58, 46, 264]");
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) 466, chronology13);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(obj1, chronology13);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((-1606262349L), chronology13);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = property2.addCopy(6982049);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime13 = localTime10.plusMinutes((int) (short) 0);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds(204);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        boolean boolean23 = property20.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime25 = property20.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime27 = localTime25.minusMillis((int) (short) 1);
        java.lang.String str28 = localTime27.toString();
        org.joda.time.LocalTime localTime29 = localTime13.withFields((org.joda.time.ReadablePartial) localTime27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "01:58:46.429" + "'", str28, "01:58:46.429");
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = localTime13.get(dateTimeFieldType18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime13.withPeriodAdded(readablePeriod20, 0);
        org.joda.time.LocalTime localTime24 = localTime13.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) localTime24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime24.plus(readablePeriod26);
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        org.joda.time.LocalTime.Property property30 = localTime5.property(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 47 + "'", int19 == 47);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        boolean boolean11 = property8.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField12 = property8.getDurationField();
        org.joda.time.DurationField durationField13 = property8.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumShortTextLength(locale17);
        org.joda.time.LocalTime localTime19 = property16.getLocalTime();
        org.joda.time.LocalTime localTime20 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTimeToday(dateTimeZone23);
        int int25 = property8.compareTo((org.joda.time.ReadableInstant) dateTime24);
        long long26 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime28 = property2.addCopy(18);
        org.joda.time.DurationField durationField29 = property2.getDurationField();
        java.lang.String str30 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1606262353L) + "'", long26 == (-1606262353L));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(durationField29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "46" + "'", str30, "46");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localTime8.toString(dateTimeFormatter9);
        org.joda.time.Chronology chronology11 = localTime8.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        int int18 = property16.get();
        org.joda.time.LocalTime localTime20 = property16.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime21 = property16.withMinimumValue();
        java.lang.String str23 = localTime21.toString("12");
        org.joda.time.LocalTime localTime25 = localTime21.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.LocalTime localTime32 = localTime30.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology33);
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = localTime36.getFields();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime39 = localTime36.plus(readablePeriod38);
        boolean boolean40 = localTime21.isBefore((org.joda.time.ReadablePartial) localTime36);
        int int41 = localTime36.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localTime36.toString(dateTimeFormatter42);
        org.joda.time.LocalTime localTime45 = localTime36.plusHours(55);
        org.joda.time.LocalTime localTime47 = localTime36.minusSeconds(31);
        boolean boolean48 = localTime13.isEqual((org.joda.time.ReadablePartial) localTime47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00:30:46.834" + "'", str10, "00:30:46.834");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12" + "'", str23, "12");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldArray37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "00:00:00.052" + "'", str43, "00:00:00.052");
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(905L);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localTime1.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localTime19.isSupported(durationFieldType20);
        org.joda.time.LocalTime localTime23 = localTime19.plusMillis(2);
        int int24 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.String str25 = localTime23.toString();
        org.joda.time.LocalTime localTime27 = localTime23.plusSeconds(0);
        int int28 = localTime27.getMinuteOfHour();
        org.joda.time.LocalTime localTime30 = localTime27.minusMinutes((int) '#');
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "01:58:47.002" + "'", str25, "01:58:47.002");
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 58 + "'", int28 == 58);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        int int15 = property13.get();
        org.joda.time.LocalTime localTime17 = property13.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime18 = property13.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.withMaximumValue();
        org.joda.time.LocalTime localTime32 = localTime30.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        org.joda.time.LocalTime localTime39 = localTime32.withField(dateTimeFieldType37, (int) (byte) 1);
        org.joda.time.LocalTime.Property property40 = localTime39.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.Interval interval47 = property46.toInterval();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        int int49 = localTime42.compareTo((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.LocalTime localTime51 = localTime48.plusHours((int) (short) 0);
        int int52 = localTime51.getHourOfDay();
        int int53 = localTime51.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.LocalTime localTime57 = property56.getLocalTime();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime61 = localTime58.withPeriodAdded(readablePeriod59, 13);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localTime58.toDateTimeToday(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property40.compareTo((org.joda.time.ReadableInstant) dateTime64);
        long long66 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime64);
        int int67 = property13.getDifference((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalTime localTime69 = property13.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime71 = localTime69.withMinuteOfHour(30);
        boolean boolean72 = localTime8.isEqual((org.joda.time.ReadablePartial) localTime71);
        org.joda.time.Chronology chronology73 = localTime71.getChronology();
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(chronology73);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localTime51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 47 + "'", int53 == 47);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1606262399L) + "'", long66 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1606262399) + "'", int67 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(chronology73);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        int int14 = localTime8.get(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.LocalTime localTime29 = localTime22.withField(dateTimeFieldType27, (int) (byte) 1);
        int int30 = localTime8.get(dateTimeFieldType27);
        org.joda.time.LocalTime localTime32 = localTime8.withMillisOfDay(57);
        org.joda.time.LocalTime.Property property33 = localTime32.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        int int43 = localTime36.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.Chronology chronology44 = localTime42.getChronology();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(chronology44);
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        int int55 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.LocalTime localTime57 = localTime54.plusHours((int) (short) 0);
        int int58 = localTime57.getHourOfDay();
        int int59 = localTime57.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalTime localTime67 = localTime64.withPeriodAdded(readablePeriod65, 13);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localTime64.toDateTimeToday(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localTime57.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = localTime46.isEqual((org.joda.time.ReadablePartial) localTime57);
        boolean boolean72 = localTime32.isEqual((org.joda.time.ReadablePartial) localTime46);
        int int73 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime75 = localTime2.plusMillis(17);
        org.joda.time.LocalTime localTime77 = localTime75.minusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 47 + "'", int59 == 47);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        long long5 = property2.remainder();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime15 = localTime13.plusMillis(28);
        org.joda.time.LocalTime.Property property16 = localTime13.millisOfSecond();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTimeToday();
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) dateTime17);
        int int19 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        int int28 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.LocalTime localTime30 = localTime27.plusHours((int) (short) 0);
        int int31 = localTime30.getHourOfDay();
        int int32 = localTime30.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime40 = localTime37.withPeriodAdded(readablePeriod38, 13);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localTime37.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime30.plus(readablePeriod44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.LocalTime localTime53 = property51.roundFloorCopy();
        int int54 = localTime47.compareTo((org.joda.time.ReadablePartial) localTime53);
        org.joda.time.LocalTime localTime56 = localTime53.plusHours((int) (short) 0);
        int int57 = localTime56.getHourOfDay();
        int int58 = localTime56.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.LocalTime localTime63 = property61.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalTime localTime66 = localTime63.withPeriodAdded(readablePeriod64, 13);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = localTime63.toDateTimeToday(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = localTime56.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime70 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime68);
        int int71 = property2.compareTo((org.joda.time.ReadableInstant) dateTime68);
        java.lang.String str72 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 627L + "'", long5 == 627L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1606264320) + "'", int18 == (-1606264320));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 47 + "'", int32 == 47);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localTime56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 47 + "'", int58 == 47);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Property[secondOfMinute]" + "'", str72, "Property[secondOfMinute]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 776L + "'", long4 == 776L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime9 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime9.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(79081600, 6899489, (-1606262358));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 79081600 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.minuteOfHour();
        org.joda.time.DurationField durationField13 = property12.getDurationField();
        int int14 = property12.getMinimumValue();
        boolean boolean15 = property12.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localTime10.getFields();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime10.plus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime10.minusMinutes(7081059);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime20 = localTime17.withHourOfDay(0);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localTime22.isSupported(durationFieldType23);
        boolean boolean25 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime27 = localTime22.plusHours(2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = localTime22.toString(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "00:30:10.108" + "'", str29, "00:30:10.108");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        int int5 = property2.getMaximumValueOverall();
        int int6 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(46);
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localTime19.isSupported(durationFieldType20);
        org.joda.time.LocalTime localTime23 = localTime19.plusMillis(2);
        int int24 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime23);
        java.lang.String str25 = localTime23.toString();
        int[] intArray26 = localTime23.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "01:58:48.002" + "'", str25, "01:58:48.002");
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 58, 48, 2]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(522L, dateTimeZone1);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime14 = localTime11.withHourOfDay(0);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute((int) (byte) 10);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime14.withPeriodAdded(readablePeriod18, 15);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        java.util.Locale locale24 = null;
        int int25 = property23.getMaximumShortTextLength(locale24);
        org.joda.time.LocalTime localTime26 = property23.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime27 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property31.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = localTime34.get(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.withMaximumValue();
        org.joda.time.LocalTime localTime48 = localTime46.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        org.joda.time.LocalTime localTime55 = localTime48.withField(dateTimeFieldType53, (int) (byte) 1);
        int int56 = localTime34.get(dateTimeFieldType53);
        boolean boolean57 = localTime27.isSupported(dateTimeFieldType53);
        org.joda.time.LocalTime.Property property58 = localTime20.property(dateTimeFieldType53);
        int int60 = localTime20.getValue(0);
        org.joda.time.LocalTime.Property property61 = localTime20.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalTime localTime63 = localTime20.minus(readablePeriod62);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 48 + "'", int40 == 48);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 48 + "'", int56 == 48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime63);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Chronology chronology16 = localTime14.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology16);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology16);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(56L, chronology16);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(524L, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(52, 10, 7030522, 356, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime7 = localTime1.minusMinutes(19);
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
        org.joda.time.LocalTime.Property property23 = localTime1.property(dateTimeFieldType21);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime1.withPeriodAdded(readablePeriod24, (int) 'a');
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
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
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        org.joda.time.DurationField durationField17 = property15.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology25);
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = localTime28.getFields();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) localTime28);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = localTime28.getFieldType(0);
        org.joda.time.LocalTime localTime34 = localTime28.minusSeconds(32);
        int int35 = property15.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = localTime34.isSupported(durationFieldType36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldArray29);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(175L, dateTimeZone1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) localTime1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfDay(306);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        int int5 = property2.getMaximumValueOverall();
        int int6 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(46);
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.LocalTime localTime10 = property2.withMaximumValue();
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(50);
        org.joda.time.LocalTime localTime14 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        boolean boolean14 = localTime1.isSupported(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = localTime1.minusMinutes(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime16.withField(dateTimeFieldType19, 732);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "01:58:48.960" + "'", str18, "01:58:48.960");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime10.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.LocalTime localTime21 = localTime10.plusSeconds((int) (byte) 10);
        int int22 = property2.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime localTime24 = property2.addCopy(313L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField26 = localTime24.getField(412);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 412");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "49" + "'", str4, "49");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        java.lang.String str12 = localTime10.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(7);
        org.joda.time.LocalTime.Property property17 = localTime10.hourOfDay();
        long long18 = property17.remainder();
        org.joda.time.LocalTime localTime20 = property17.addNoWrapToCopy((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.LocalTime localTime26 = localTime24.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.LocalTime localTime29 = localTime26.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = localTime29.toString(dateTimeFormatter30);
        org.joda.time.Chronology chronology32 = localTime29.getChronology();
        int int33 = property17.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:58:49.000" + "'", str12, "01:58:49.000");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3529000L + "'", long18 == 3529000L);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "00:30:49.108" + "'", str31, "00:30:49.108");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMinimumValue();
        java.lang.Class<?> wildcardClass11 = property7.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.addCopy(690);
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.joda.time.Interval interval12 = property2.toInterval();
        java.util.Locale locale13 = null;
        int int14 = property2.getMaximumTextLength(locale13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 24, dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        int int10 = property2.getMinimumValue();
        java.lang.String str11 = property2.getAsText();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property2.getAsText(locale12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "49" + "'", str9, "49");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "49" + "'", str11, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49" + "'", str13, "49");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(0);
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(23);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumShortTextLength(locale11);
        org.joda.time.LocalTime localTime13 = property10.getLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.Chronology chronology15 = localTime13.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology15);
        java.lang.String str17 = localTime7.toString();
        org.joda.time.LocalTime localTime19 = localTime7.minusSeconds(567);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "01:35:49.349" + "'", str17, "01:35:49.349");
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        int int11 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.Chronology chronology12 = localTime10.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 466, chronology12);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(obj0, chronology12);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology12);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        int int22 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.Chronology chronology23 = localTime21.getChronology();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(chronology23);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        int int34 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.LocalTime localTime36 = localTime33.plusHours((int) (short) 0);
        int int37 = localTime36.getHourOfDay();
        int int38 = localTime36.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime43.withPeriodAdded(readablePeriod44, 13);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime43.toDateTimeToday(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = localTime36.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean50 = localTime25.isEqual((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.DateTime dateTime51 = localTime36.toDateTimeToday();
        int int52 = property12.compareTo((org.joda.time.ReadableInstant) dateTime51);
        int int53 = property12.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property12.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 49 + "'", int38 == 49);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime10.isSupported(durationFieldType13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime10.plus(readablePeriod15);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.String str4 = property2.getAsText();
        int int5 = property2.get();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.LocalTime.Property property14 = localTime11.hourOfDay();
        org.joda.time.LocalTime.Property property15 = localTime11.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        long long20 = property18.remainder();
        java.util.Locale locale21 = null;
        int int22 = property18.getMaximumShortTextLength(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        java.util.Locale locale26 = null;
        int int27 = property25.getMaximumShortTextLength(locale26);
        org.joda.time.LocalTime localTime28 = property25.getLocalTime();
        org.joda.time.LocalTime localTime29 = property25.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday(dateTimeZone30);
        int int32 = property18.compareTo((org.joda.time.ReadableInstant) dateTime31);
        int int33 = property15.compareTo((org.joda.time.ReadableInstant) dateTime31);
        long long34 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "49" + "'", str4, "49");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 669L + "'", long20 == 669L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1606262351L) + "'", long34 == (-1606262351L));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        int int7 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        java.lang.String str16 = property15.getAsString();
        java.lang.String str17 = property15.getAsString();
        long long18 = property15.remainder();
        org.joda.time.LocalTime localTime20 = property15.setCopy(3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "21" + "'", str16, "21");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21" + "'", str17, "21");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3481772L + "'", long18 == 3481772L);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime14 = localTime11.withHourOfDay(0);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute((int) (byte) 10);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime23 = localTime21.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime26 = localTime23.withHourOfDay(0);
        org.joda.time.LocalTime localTime28 = localTime26.withSecondOfMinute((int) (byte) 10);
        int int29 = localTime28.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime28.toDateTimeToday(dateTimeZone30);
        long long32 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalTime localTime33 = property2.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime33.minus(readablePeriod34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 854 + "'", int29 == 854);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1606257081L) + "'", long32 == (-1606257081L));
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime26 = localTime19.withField(dateTimeFieldType24, (int) (byte) 1);
        int int27 = localTime5.get(dateTimeFieldType24);
        org.joda.time.LocalTime localTime29 = localTime5.withMillisOfDay(57);
        org.joda.time.LocalTime.Property property30 = localTime29.minuteOfHour();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 50 + "'", int11 == 50);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:55:08.002");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        int int7 = property4.getMaximumValueOverall();
        org.joda.time.LocalTime localTime8 = property4.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        int int17 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localTime22.isSupported(durationFieldType23);
        org.joda.time.LocalTime localTime26 = localTime22.plusMillis(2);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property29.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        int int38 = localTime32.get(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property41.withMaximumValue();
        org.joda.time.LocalTime localTime46 = localTime44.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        org.joda.time.LocalTime localTime53 = localTime46.withField(dateTimeFieldType51, (int) (byte) 1);
        int int54 = localTime32.get(dateTimeFieldType51);
        org.joda.time.LocalTime localTime56 = localTime26.withField(dateTimeFieldType51, 27);
        int int57 = localTime16.get(dateTimeFieldType51);
        int int58 = localTime8.indexOf(dateTimeFieldType51);
        int int59 = localTime1.get(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 50 + "'", int54 == 50);
        org.junit.Assert.assertNotNull(localTime56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 50 + "'", int57 == 50);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 8 + "'", int59 == 8);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(696L, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime2.getField((-1606255319));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606255319");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        int int27 = localTime26.getHourOfDay();
        int int28 = localTime26.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime36 = localTime33.withPeriodAdded(readablePeriod34, 13);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime33.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = localTime26.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property15.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DurationField durationField41 = property15.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        java.lang.String str7 = property2.getName();
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "50" + "'", str4, "50");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime9 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getName();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime9 = property2.roundHalfFloorCopy();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = property2.compareTo(readablePartial10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 513L + "'", long4 == 513L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 15);
        org.joda.time.LocalTime localTime3 = localTime1.plusMinutes((-1606262358));
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes(546);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay(35);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(822, (-1606262358), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 822 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        org.joda.time.LocalTime localTime14 = property11.addCopy(58);
        boolean boolean16 = property11.equals((java.lang.Object) "01:55:16.000");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 100, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) 323L, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withMinuteOfHour(822);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 822 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(35);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime12.isSupported(durationFieldType13);
        org.joda.time.LocalTime localTime16 = localTime12.plusMillis(2);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localTime21.isSupported(durationFieldType22);
        org.joda.time.LocalTime localTime25 = localTime21.plusMillis(2);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        int int37 = localTime31.get(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = property40.withMaximumValue();
        org.joda.time.LocalTime localTime45 = localTime43.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.LocalTime localTime49 = property48.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        org.joda.time.LocalTime localTime52 = localTime45.withField(dateTimeFieldType50, (int) (byte) 1);
        int int53 = localTime31.get(dateTimeFieldType50);
        org.joda.time.LocalTime localTime55 = localTime25.withField(dateTimeFieldType50, 27);
        boolean boolean56 = localTime16.isSupported(dateTimeFieldType50);
        org.joda.time.LocalTime localTime58 = localTime5.withField(dateTimeFieldType50, 2);
        java.lang.Class<?> wildcardClass59 = localTime5.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 51 + "'", int37 == 51);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(localTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 51 + "'", int53 == 51);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime7 = localTime1.minusMinutes(19);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime1.withPeriodAdded(readablePeriod8, 30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.minusMillis(36);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        boolean boolean19 = property16.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField20 = property16.getDurationField();
        org.joda.time.DurationField durationField21 = property16.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        java.util.Locale locale25 = null;
        int int26 = property24.getMaximumShortTextLength(locale25);
        org.joda.time.LocalTime localTime27 = property24.getLocalTime();
        org.joda.time.LocalTime localTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime30 = localTime28.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTimeToday(dateTimeZone31);
        int int33 = property16.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalTime localTime34 = property16.getLocalTime();
        boolean boolean35 = localTime10.equals((java.lang.Object) property16);
        int int36 = property16.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withSecondOfMinute(45);
        java.util.Locale locale9 = null;
        java.lang.String str10 = localTime7.toString("01:56:20.000", locale9);
        org.joda.time.LocalTime localTime12 = localTime7.plusHours(10);
        java.lang.String str14 = localTime12.toString("58");
        java.lang.String str15 = localTime12.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01:56:20.000" + "'", str10, "01:56:20.000");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "58" + "'", str14, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11:58:45.000" + "'", str15, "11:58:45.000");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime19 = property2.addCopy((-1));
        org.joda.time.LocalTime localTime20 = property2.roundCeilingCopy();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property2.getAsShortText(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property2.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "51" + "'", str22, "51");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime18 = property2.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime18.withPeriodAdded(readablePeriod19, 149);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property24.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime33 = localTime31.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.LocalTime localTime36 = localTime33.withHourOfDay(0);
        org.joda.time.LocalTime localTime38 = localTime36.withSecondOfMinute((int) (byte) 10);
        int int39 = property24.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property42.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        int int55 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime59 = property58.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        boolean boolean61 = localTime48.isSupported(dateTimeFieldType60);
        org.joda.time.LocalTime.Property property62 = localTime46.property(dateTimeFieldType60);
        int int63 = property24.compareTo((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.LocalTime localTime65 = localTime46.withSecondOfMinute(23);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((java.lang.Object) localTime46, dateTimeZone66);
        int int68 = localTime46.getHourOfDay();
        boolean boolean69 = localTime21.isBefore((org.joda.time.ReadablePartial) localTime46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(localTime65);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalTime localTime20 = localTime13.withField(dateTimeFieldType18, (int) (byte) 1);
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.LocalTime localTime32 = localTime29.plusHours((int) (short) 0);
        int int33 = localTime32.getHourOfDay();
        int int34 = localTime32.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime39.withPeriodAdded(readablePeriod40, 13);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime39.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property21.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.LocalTime localTime52 = property49.withMaximumValue();
        org.joda.time.LocalTime localTime54 = localTime52.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.LocalTime localTime58 = property57.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property57.getFieldType();
        org.joda.time.LocalTime localTime61 = localTime54.withField(dateTimeFieldType59, (int) (byte) 1);
        org.joda.time.LocalTime.Property property62 = localTime61.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime(dateTimeZone66);
        org.joda.time.LocalTime.Property property68 = localTime67.secondOfMinute();
        org.joda.time.Interval interval69 = property68.toInterval();
        org.joda.time.LocalTime localTime70 = property68.roundFloorCopy();
        int int71 = localTime64.compareTo((org.joda.time.ReadablePartial) localTime70);
        org.joda.time.LocalTime localTime73 = localTime70.plusHours((int) (short) 0);
        int int74 = localTime73.getHourOfDay();
        int int75 = localTime73.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalTime localTime77 = new org.joda.time.LocalTime(dateTimeZone76);
        org.joda.time.LocalTime.Property property78 = localTime77.secondOfMinute();
        org.joda.time.LocalTime localTime79 = property78.getLocalTime();
        org.joda.time.LocalTime localTime80 = property78.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalTime localTime83 = localTime80.withPeriodAdded(readablePeriod81, 13);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = localTime80.toDateTimeToday(dateTimeZone84);
        org.joda.time.DateTime dateTime86 = localTime73.toDateTime((org.joda.time.ReadableInstant) dateTime85);
        int int87 = property62.compareTo((org.joda.time.ReadableInstant) dateTime86);
        long long88 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime86);
        long long89 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime86);
        boolean boolean90 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 51 + "'", int34 == 51);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(localTime73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 51 + "'", int75 == 51);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-446164L) + "'", long88 == (-446164L));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + (-1606262399L) + "'", long89 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        boolean boolean14 = property2.equals((java.lang.Object) localTime11);
        org.joda.time.LocalTime localTime16 = localTime11.minusSeconds(16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime19 = property2.addCopy((-1));
        org.joda.time.LocalTime localTime20 = property2.roundCeilingCopy();
        java.lang.String str21 = property2.getName();
        java.lang.String str22 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "secondOfMinute" + "'", str21, "secondOfMinute");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "51" + "'", str22, "51");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.get();
        org.joda.time.LocalTime localTime7 = property2.setCopy("43");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        int int12 = property10.get();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField14 = property10.getDurationField();
        org.joda.time.LocalTime localTime16 = property10.addCopy(655L);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime localTime27 = localTime24.plusHours((int) (short) 0);
        int int28 = localTime27.getHourOfDay();
        int int29 = localTime27.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime34.withPeriodAdded(readablePeriod35, 13);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localTime34.toDateTimeToday(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        long long41 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        long long42 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.LocalTime localTime43 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 606L + "'", long4 == 606L);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 51 + "'", int29 == 51);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1606262399L) + "'", long41 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1606262399L) + "'", long42 == (-1606262399L));
        org.junit.Assert.assertNotNull(localTime43);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime1.plus(readablePeriod3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType1 = null;
        boolean boolean2 = localTime0.isSupported(durationFieldType1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime0.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.withMaximumValue();
        org.joda.time.LocalTime localTime24 = localTime22.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        org.joda.time.LocalTime localTime31 = localTime24.withField(dateTimeFieldType29, (int) (byte) 1);
        int int32 = localTime10.get(dateTimeFieldType29);
        org.joda.time.LocalTime localTime34 = localTime10.withMillisOfDay(57);
        org.joda.time.LocalTime.Property property35 = localTime34.minuteOfHour();
        org.joda.time.LocalTime localTime37 = localTime34.withMillisOfDay(40);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.LocalTime localTime43 = localTime41.plusMillis(0);
        org.joda.time.LocalTime localTime45 = localTime43.minusMinutes(23);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.Interval interval49 = property48.toInterval();
        org.joda.time.LocalTime localTime50 = property48.roundFloorCopy();
        org.joda.time.LocalTime localTime51 = property48.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        int int57 = localTime51.get(dateTimeFieldType56);
        boolean boolean58 = localTime43.isSupported(dateTimeFieldType56);
        int int59 = localTime34.get(dateTimeFieldType56);
        boolean boolean60 = localTime4.isSupported(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 52 + "'", int57 == 52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) (byte) 10);
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("12", locale10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.plus(readablePeriod12);
        org.joda.time.LocalTime.Property property14 = localTime11.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        int int8 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) (byte) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime14.getFieldTypes();
        int int18 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        int int8 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime.Property property9 = localTime7.minuteOfHour();
        org.joda.time.LocalTime.Property property10 = localTime7.secondOfMinute();
        org.joda.time.LocalTime.Property property11 = localTime7.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(147L);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = localTime1.getFieldTypes();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        int int8 = property6.get();
        org.joda.time.LocalTime localTime10 = property6.addCopy((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        org.joda.time.LocalTime localTime17 = property13.roundFloorCopy();
        int int18 = property13.getMaximumValue();
        boolean boolean19 = property6.equals((java.lang.Object) property13);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        boolean boolean25 = property22.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField26 = property22.getDurationField();
        org.joda.time.DurationField durationField27 = property22.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        java.util.Locale locale31 = null;
        int int32 = property30.getMaximumShortTextLength(locale31);
        org.joda.time.LocalTime localTime33 = property30.getLocalTime();
        org.joda.time.LocalTime localTime34 = property30.withMinimumValue();
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTimeToday(dateTimeZone37);
        int int39 = property22.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property6.getDifference((org.joda.time.ReadableInstant) dateTime38);
        int int41 = property3.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1606262347) + "'", int40 == (-1606262347));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        long long10 = property2.remainder();
        int int11 = property2.getMinimumValue();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime14 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNull(durationField9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 163L + "'", long10 == 163L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime12 = property9.getLocalTime();
        org.joda.time.LocalTime localTime13 = property9.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime13.toDateTimeToday(dateTimeZone14);
        int int16 = property2.getDifference((org.joda.time.ReadableInstant) dateTime15);
        int int17 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime19 = property2.addWrapFieldToCopy(29);
        org.joda.time.DurationField durationField20 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        int int25 = property23.get();
        org.joda.time.LocalTime localTime27 = property23.addCopy((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime30 = localTime27.withPeriodAdded(readablePeriod28, (int) (byte) 0);
        boolean boolean31 = property2.equals((java.lang.Object) localTime27);
        org.joda.time.LocalTime.Property property32 = localTime27.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime34 = property32.setCopy((-1606262346));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1606262348) + "'", int16 == (-1606262348));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalTime localTime20 = localTime13.withField(dateTimeFieldType18, (int) (byte) 1);
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.LocalTime localTime32 = localTime29.plusHours((int) (short) 0);
        int int33 = localTime32.getHourOfDay();
        int int34 = localTime32.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime39.withPeriodAdded(readablePeriod40, 13);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime39.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        int int46 = property21.compareTo((org.joda.time.ReadableInstant) dateTime45);
        long long47 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        java.lang.String str48 = property2.getAsString();
        org.joda.time.DateTimeField dateTimeField49 = property2.getField();
        org.joda.time.DurationField durationField50 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1606262399L) + "'", long47 == (-1606262399L));
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "52" + "'", str48, "52");
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime20 = localTime17.withHourOfDay(0);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property25.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        boolean boolean44 = localTime31.isSupported(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property45 = localTime29.property(dateTimeFieldType43);
        boolean boolean46 = localTime20.isSupported(dateTimeFieldType43);
        int int47 = localTime5.get(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property48 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime49 = property48.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.Chronology chronology19 = localTime17.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology19);
        int int24 = property2.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.withMinuteOfHour(53);
        org.joda.time.LocalTime localTime28 = localTime26.minusHours(58);
        org.joda.time.LocalTime localTime30 = localTime28.plusMillis(56);
        org.joda.time.LocalTime localTime32 = localTime28.minusSeconds(34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property6.addWrapFieldToCopy(23);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localTime8.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        org.joda.time.DurationField durationField10 = property2.getRangeDurationField();
        int int11 = property2.get();
        java.lang.String str12 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationField10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52" + "'", str12, "52");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        boolean boolean21 = localTime8.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        int int23 = localTime6.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property26.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.LocalTime localTime38 = property36.roundFloorCopy();
        int int39 = localTime32.compareTo((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        boolean boolean45 = localTime32.isSupported(dateTimeFieldType44);
        org.joda.time.LocalTime.Property property46 = localTime30.property(dateTimeFieldType44);
        org.joda.time.LocalTime localTime48 = localTime6.withField(dateTimeFieldType44, (int) (short) 10);
        int int49 = localTime6.getSecondOfMinute();
        org.joda.time.LocalTime.Property property50 = localTime6.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 819 + "'", int23 == 819);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 51 + "'", int49 == 51);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getSecondOfMinute();
        int int8 = localTime4.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) localTime4, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.withHourOfDay((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        boolean boolean23 = property20.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField24 = property20.getDurationField();
        boolean boolean25 = localTime17.equals((java.lang.Object) property20);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property20.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property20.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.getMaximumValueOverall();
        int int7 = property2.get();
        int int8 = property2.getMinimumValueOverall();
        boolean boolean9 = property2.isLeap();
        int int10 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(222L, chronology10);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime19 = localTime17.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.LocalTime localTime22 = localTime19.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = localTime22.toString(dateTimeFormatter23);
        org.joda.time.Chronology chronology25 = localTime22.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) localTime13, chronology25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00:30:53.195" + "'", str24, "00:30:53.195");
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("00:29:17.989");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:29:17.989\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property2.setCopy("00:29:17.989");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:29:17.989\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 403L + "'", long4 == 403L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53" + "'", str9, "53");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        int int18 = localTime17.getMinuteOfHour();
        int int19 = property2.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime.Property property20 = localTime17.secondOfMinute();
        boolean boolean21 = property20.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "53" + "'", str5, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "53" + "'", str6, "53");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime7.minusMinutes(25);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTime(readableInstant10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime7.withPeriodAdded(readablePeriod12, 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property17.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property17.getFieldType();
        org.joda.time.LocalTime localTime23 = property17.withMinimumValue();
        org.joda.time.LocalTime localTime25 = localTime23.minusMinutes(50);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime31 = localTime29.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.LocalTime localTime34 = localTime31.withHourOfDay(0);
        org.joda.time.LocalTime localTime36 = localTime34.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime40 = property37.setCopy(18);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime47 = property43.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.Interval interval54 = property53.toInterval();
        org.joda.time.LocalTime localTime55 = property53.roundFloorCopy();
        int int56 = localTime49.compareTo((org.joda.time.ReadablePartial) localTime55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(dateTimeZone57);
        org.joda.time.LocalTime.Property property59 = localTime58.secondOfMinute();
        org.joda.time.LocalTime localTime60 = property59.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property59.getFieldType();
        boolean boolean62 = localTime49.isSupported(dateTimeFieldType61);
        org.joda.time.LocalTime.Property property63 = localTime47.property(dateTimeFieldType61);
        org.joda.time.LocalTime.Property property64 = localTime40.property(dateTimeFieldType61);
        org.joda.time.LocalTime localTime66 = localTime25.withField(dateTimeFieldType61, 2);
        org.joda.time.LocalTime.Property property67 = localTime14.property(dateTimeFieldType61);
        org.joda.time.LocalTime localTime68 = property67.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localTime68);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime14 = localTime11.withHourOfDay(0);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute((int) (byte) 10);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property20.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        int int33 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        boolean boolean39 = localTime26.isSupported(dateTimeFieldType38);
        org.joda.time.LocalTime.Property property40 = localTime24.property(dateTimeFieldType38);
        int int41 = property2.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime localTime42 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime44 = localTime42.withHourOfDay(68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 68 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localTime42);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.setCopy("58");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumShortTextLength(locale6);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.setCopy("01:58:46.429", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:58:46.429\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(466, (-1606262344));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 466 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime13 = localTime11.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.LocalTime localTime20 = localTime13.withField(dateTimeFieldType18, (int) (byte) 1);
        org.joda.time.DateTime dateTime21 = localTime13.toDateTimeToday();
        long long22 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        java.lang.String str23 = property2.getAsText();
        org.joda.time.Interval interval24 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "54" + "'", str4, "54");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1606334405L) + "'", long22 == (-1606334405L));
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "54" + "'", str23, "54");
        org.junit.Assert.assertNotNull(interval24);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262370));
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(982);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1606255352), 58, 732, (-1606262372));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255352 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        org.joda.time.LocalTime localTime10 = property2.addCopy(869);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(7);
        int int13 = localTime10.getSecondOfMinute();
        org.joda.time.LocalTime localTime15 = localTime10.plusHours(59);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localTime15.getFieldTypes();
        int int17 = localTime15.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property27 = localTime26.millisOfDay();
        boolean boolean28 = property15.equals((java.lang.Object) property27);
        org.joda.time.LocalTime localTime29 = property15.roundHalfFloorCopy();
        long long30 = property15.remainder();
        org.joda.time.LocalTime localTime31 = property15.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime7 = localTime1.minusMinutes(19);
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
        org.joda.time.LocalTime.Property property23 = localTime1.property(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = localTime1.withMinuteOfHour(621);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 621 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
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
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        boolean boolean21 = localTime8.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime6.plus(readablePeriod23);
        org.joda.time.LocalTime localTime26 = localTime6.plusHours(955);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 100);
        int int9 = property2.get();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        int int12 = property2.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localTime17.isSupported(durationFieldType18);
        org.joda.time.LocalTime localTime21 = localTime17.plusMillis(2);
        boolean boolean22 = property2.equals((java.lang.Object) localTime17);
        java.lang.String str23 = property2.toString();
        boolean boolean24 = property2.isLeap();
        org.joda.time.DurationField durationField25 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        int int30 = property28.getMinimumValueOverall();
        int int31 = property28.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        java.lang.String str36 = property34.getAsShortText();
        org.joda.time.DurationField durationField37 = property34.getRangeDurationField();
        org.joda.time.LocalTime localTime39 = property34.setCopy(56);
        int int40 = property28.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        java.util.Locale locale44 = null;
        int int45 = property43.getMaximumShortTextLength(locale44);
        org.joda.time.LocalTime localTime46 = property43.getLocalTime();
        org.joda.time.LocalTime.Property property47 = localTime46.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        org.joda.time.LocalTime localTime53 = property50.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property56.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        int int65 = localTime59.get(dateTimeFieldType64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalTime localTime68 = localTime59.withPeriodAdded(readablePeriod66, 0);
        boolean boolean69 = property50.equals((java.lang.Object) localTime68);
        org.joda.time.DateTime dateTime70 = localTime68.toDateTimeToday();
        long long71 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime70);
        int int72 = property28.compareTo((org.joda.time.ReadableInstant) dateTime70);
        int int73 = property2.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.LocalTime localTime74 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Property[secondOfMinute]" + "'", str23, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "54" + "'", str36, "54");
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 55 + "'", int65 == 55);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime70);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-26771040L) + "'", long71 == (-26771040L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1606262400) + "'", int73 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime74);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1606262399L));
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfSecond();
        java.lang.String str3 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "601" + "'", str3, "601");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        java.lang.String str9 = localTime7.toString("12");
        org.joda.time.LocalTime localTime11 = localTime7.plusMinutes(14);
        boolean boolean13 = localTime7.equals((java.lang.Object) (short) -1);
        int[] intArray14 = localTime7.getValues();
        int int15 = localTime7.getMillisOfDay();
        java.util.Locale locale17 = null;
        java.lang.String str18 = localTime7.toString("00:26:36.707", locale17);
        org.joda.time.LocalTime.Property property19 = localTime7.hourOfDay();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        int int31 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology32 = localTime30.getChronology();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay(222L, chronology32);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(505L, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) property19, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 58, 0, 754]");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7080754 + "'", int15 == 7080754);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00:26:36.707" + "'", str18, "00:26:36.707");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 23 + "'", int20 == 23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology18);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(100L, chronology18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) 789, chronology18);
        boolean boolean24 = localTime8.isEqual((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime.Property property25 = localTime8.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 818L + "'", long4 == 818L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "54" + "'", str7, "54");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime5.minusMillis(8);
        org.joda.time.LocalTime.Property property11 = localTime5.millisOfDay();
        org.joda.time.LocalTime.Property property12 = localTime5.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime20 = localTime17.withHourOfDay(0);
        org.joda.time.LocalTime localTime22 = localTime20.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property25.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        boolean boolean44 = localTime31.isSupported(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property45 = localTime29.property(dateTimeFieldType43);
        boolean boolean46 = localTime20.isSupported(dateTimeFieldType43);
        int int47 = localTime5.get(dateTimeFieldType43);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime49 = localTime5.plus(readablePeriod48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        int int58 = localTime51.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.LocalTime localTime60 = localTime57.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property61 = localTime60.millisOfDay();
        java.lang.String str62 = localTime60.toString();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalTime localTime64 = localTime60.minus(readablePeriod63);
        org.joda.time.LocalTime localTime66 = localTime60.minusMinutes(7);
        org.joda.time.LocalTime.Property property67 = localTime60.hourOfDay();
        java.lang.String str68 = property67.toString();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime73 = property71.roundFloorCopy();
        org.joda.time.LocalTime localTime74 = property71.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime76 = localTime74.plusMillis(13);
        org.joda.time.LocalTime.Property property77 = localTime74.secondOfMinute();
        org.joda.time.LocalTime localTime78 = property77.withMaximumValue();
        org.joda.time.LocalTime localTime80 = localTime78.minusHours(53);
        int int81 = property67.compareTo((org.joda.time.ReadablePartial) localTime78);
        org.joda.time.LocalTime localTime83 = property67.setCopy("16");
        org.joda.time.DurationField durationField84 = property67.getDurationField();
        boolean boolean85 = localTime5.equals((java.lang.Object) durationField84);
        int int86 = localTime5.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 55 + "'", int11 == 55);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 55 + "'", int47 == 55);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "01:58:54.000" + "'", str62, "01:58:54.000");
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Property[hourOfDay]" + "'", str68, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 7135000 + "'", int86 == 7135000);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 201 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 234L + "'", long4 == 234L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(51);
        int[] intArray7 = localTime4.getValues();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localTime4.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime13 = localTime10.withSecondOfMinute(59);
        org.joda.time.LocalTime.Property property14 = localTime10.millisOfSecond();
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(19);
        java.util.Locale locale18 = null;
        java.lang.String str19 = localTime16.toString("01:54:36.000", locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumShortTextLength(locale23);
        org.joda.time.LocalTime localTime25 = property22.getLocalTime();
        org.joda.time.LocalTime.Property property26 = localTime25.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime33 = localTime31.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology34);
        org.joda.time.LocalTime localTime37 = localTime35.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localTime37.getFields();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime37.plus(readablePeriod39);
        org.joda.time.LocalTime localTime41 = localTime25.withFields((org.joda.time.ReadablePartial) localTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        int int50 = localTime43.compareTo((org.joda.time.ReadablePartial) localTime49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        boolean boolean56 = localTime43.isSupported(dateTimeFieldType55);
        int int57 = localTime40.indexOf(dateTimeFieldType55);
        int int58 = localTime16.get(dateTimeFieldType55);
        int int59 = localTime4.get(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 58, 55, 0]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:54:36.000" + "'", str19, "01:54:36.000");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 55 + "'", int58 == 55);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 55 + "'", int59 == 55);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262400), chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond(822);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 1);
        int int25 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime localTime27 = localTime7.plusSeconds(4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 58 + "'", int25 == 58);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(989, 543, (-1606262352), 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 989 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.minuteOfHour();
        org.joda.time.DurationField durationField13 = property12.getDurationField();
        int int14 = property12.getMinimumValue();
        org.joda.time.DurationField durationField15 = property12.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(durationField15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        int int14 = localTime8.get(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.LocalTime localTime29 = localTime22.withField(dateTimeFieldType27, (int) (byte) 1);
        int int30 = localTime8.get(dateTimeFieldType27);
        org.joda.time.LocalTime localTime32 = localTime8.withMillisOfDay(57);
        org.joda.time.LocalTime.Property property33 = localTime32.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        int int43 = localTime36.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.Chronology chronology44 = localTime42.getChronology();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(chronology44);
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        int int55 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.LocalTime localTime57 = localTime54.plusHours((int) (short) 0);
        int int58 = localTime57.getHourOfDay();
        int int59 = localTime57.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalTime localTime67 = localTime64.withPeriodAdded(readablePeriod65, 13);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = localTime64.toDateTimeToday(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localTime57.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = localTime46.isEqual((org.joda.time.ReadablePartial) localTime57);
        boolean boolean72 = localTime32.isEqual((org.joda.time.ReadablePartial) localTime46);
        int int73 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime75 = localTime2.plusMillis(17);
        org.joda.time.LocalTime localTime77 = localTime75.minusMinutes(6900214);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 56 + "'", int30 == 56);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 55 + "'", int59 == 55);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localTime5.getFields();
        org.joda.time.LocalTime.Property property16 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        int int18 = property16.compareTo((org.joda.time.ReadablePartial) localTime17);
        java.util.Locale locale19 = null;
        java.lang.String str20 = property16.getAsText(locale19);
        java.lang.String str21 = property16.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 56 + "'", int11 == 56);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = localTime18.get(dateTimeFieldType23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime18.withPeriodAdded(readablePeriod25, 0);
        boolean boolean28 = property9.equals((java.lang.Object) localTime27);
        org.joda.time.DateTime dateTime29 = localTime27.toDateTimeToday();
        long long30 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = property6.setCopy("01:56:45.000", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:56:45.000\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 56 + "'", int24 == 56);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-26771040L) + "'", long30 == (-26771040L));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localTime1.isSupported(durationFieldType2);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) 869, chronology4);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology4);
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localTime5.toString(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "01:58:59.042" + "'", str9, "01:58:59.042");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        java.lang.String str7 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes(22);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.roundHalfEvenCopy();
        org.joda.time.Interval interval9 = property7.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        java.lang.String str12 = localTime10.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(7);
        org.joda.time.LocalTime.Property property17 = localTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime23 = localTime21.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime26 = localTime23.withHourOfDay(0);
        org.joda.time.LocalTime localTime28 = localTime26.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime30 = localTime10.withFields((org.joda.time.ReadablePartial) localTime28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:58:56.000" + "'", str12, "01:58:56.000");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(13);
        org.joda.time.LocalTime localTime9 = localTime5.plusSeconds((-1606262400));
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds(465);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime3.withHourOfDay(484);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 484 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.DurationField durationField18 = property2.getRangeDurationField();
        java.lang.String str19 = property2.getAsText();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumShortTextLength(locale23);
        org.joda.time.LocalTime localTime25 = property22.getLocalTime();
        org.joda.time.LocalTime localTime26 = property22.withMinimumValue();
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTimeToday(dateTimeZone29);
        int int31 = property2.getDifference((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "56" + "'", str19, "56");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1606262343) + "'", int31 == (-1606262343));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        int int8 = property2.getMinimumValueOverall();
        java.lang.String str9 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56" + "'", str7, "56");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 0);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        int int24 = localTime9.indexOf(dateTimeFieldType22);
        org.joda.time.LocalTime localTime26 = localTime8.withField(dateTimeFieldType22, 0);
        java.lang.String str28 = localTime8.toString("50");
        org.joda.time.LocalTime localTime30 = localTime8.minusMinutes(0);
        int int31 = localTime30.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 542L + "'", long4 == 542L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 57 + "'", int23 == 57);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "50" + "'", str28, "50");
        org.junit.Assert.assertNotNull(localTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 56 + "'", int31 == 56);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(100L, chronology8);
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes(201);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        int int11 = localTime10.getMillisOfSecond();
        java.util.Locale locale13 = null;
        java.lang.String str14 = localTime10.toString("51", locale13);
        org.joda.time.LocalTime.Property property15 = localTime10.secondOfMinute();
        int int16 = property15.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 657 + "'", int11 == 657);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "51" + "'", str14, "51");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMinimumValue();
        org.joda.time.LocalTime localTime12 = property7.addWrapFieldToCopy(204);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 100);
        int int9 = property2.get();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        int int12 = property2.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localTime17.isSupported(durationFieldType18);
        org.joda.time.LocalTime localTime21 = localTime17.plusMillis(2);
        boolean boolean22 = property2.equals((java.lang.Object) localTime17);
        java.lang.String str23 = property2.toString();
        boolean boolean24 = property2.isLeap();
        org.joda.time.DurationField durationField25 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        int int30 = property28.getMinimumValueOverall();
        int int31 = property28.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        java.lang.String str36 = property34.getAsShortText();
        org.joda.time.DurationField durationField37 = property34.getRangeDurationField();
        org.joda.time.LocalTime localTime39 = property34.setCopy(56);
        int int40 = property28.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        java.util.Locale locale44 = null;
        int int45 = property43.getMaximumShortTextLength(locale44);
        org.joda.time.LocalTime localTime46 = property43.getLocalTime();
        org.joda.time.LocalTime.Property property47 = localTime46.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        org.joda.time.LocalTime localTime53 = property50.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property56.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        int int65 = localTime59.get(dateTimeFieldType64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalTime localTime68 = localTime59.withPeriodAdded(readablePeriod66, 0);
        boolean boolean69 = property50.equals((java.lang.Object) localTime68);
        org.joda.time.DateTime dateTime70 = localTime68.toDateTimeToday();
        long long71 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime70);
        int int72 = property28.compareTo((org.joda.time.ReadableInstant) dateTime70);
        int int73 = property2.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DurationField durationField74 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField75 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 56 + "'", int9 == 56);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Property[secondOfMinute]" + "'", str23, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "56" + "'", str36, "56");
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 57 + "'", int65 == 57);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-26771040L) + "'", long71 == (-26771040L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1606262400) + "'", int73 == (-1606262400));
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(durationField75);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime14 = localTime11.withHourOfDay(0);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute((int) (byte) 10);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime14.withPeriodAdded(readablePeriod18, 15);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        java.util.Locale locale24 = null;
        int int25 = property23.getMaximumShortTextLength(locale24);
        org.joda.time.LocalTime localTime26 = property23.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime27 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property31.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = localTime34.get(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.withMaximumValue();
        org.joda.time.LocalTime localTime48 = localTime46.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        org.joda.time.LocalTime localTime55 = localTime48.withField(dateTimeFieldType53, (int) (byte) 1);
        int int56 = localTime34.get(dateTimeFieldType53);
        boolean boolean57 = localTime27.isSupported(dateTimeFieldType53);
        org.joda.time.LocalTime.Property property58 = localTime20.property(dateTimeFieldType53);
        int int60 = localTime20.getValue(0);
        org.joda.time.LocalTime.Property property61 = localTime20.millisOfSecond();
        org.joda.time.LocalTime.Property property62 = localTime20.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalTime localTime64 = localTime20.minus(readablePeriod63);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 57 + "'", int40 == 57);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 57 + "'", int56 == 57);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime64);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfFloorCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = localTime9.toString("01:56:39.000", locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:56:39.000" + "'", str12, "01:56:39.000");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy(524L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 95L + "'", long4 == 95L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        boolean boolean21 = localTime8.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        long long23 = property22.remainder();
        int int24 = property22.getMaximumValueOverall();
        org.joda.time.Interval interval25 = property22.toInterval();
        java.lang.String str26 = property22.getAsString();
        long long27 = property22.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 121L + "'", long23 == 121L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertNotNull(interval25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "56" + "'", str26, "56");
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 121L + "'", long27 == 121L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.DateTime dateTime3 = localTime1.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00:00:00.010" + "'", str2, "00:00:00.010");
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addCopy((long) (-1606262381));
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime10.withFieldAdded(durationFieldType11, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.LocalTime localTime12 = property9.addWrapFieldToCopy(6);
        java.lang.String str13 = property9.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 277L + "'", long4 == 277L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57" + "'", str7, "57");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        int int6 = property2.get();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField10 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "57" + "'", str5, "57");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 57 + "'", int6 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(28, 484, 265, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("00:26:52.035");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        int int10 = property2.getMinimumValue();
        java.lang.String str11 = property2.getAsText();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime14 = localTime12.minusMinutes((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime12.withPeriodAdded(readablePeriod15, 2520015);
        org.joda.time.LocalTime.Property property18 = localTime12.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57" + "'", str9, "57");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "57" + "'", str11, "57");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "58" + "'", str19, "58");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.String str4 = property2.getAsText();
        int int5 = property2.get();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(927);
        org.joda.time.DurationField durationField9 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57" + "'", str4, "57");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime13 = localTime10.plusMinutes((int) (short) 0);
        org.joda.time.LocalTime localTime15 = localTime13.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime17 = localTime13.minusSeconds(204);
        java.util.Locale locale19 = null;
        java.lang.String str20 = localTime17.toString("00:28:11.437", locale19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = localTime25.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.LocalTime localTime38 = localTime35.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property39 = localTime38.millisOfDay();
        java.lang.String str40 = localTime38.toString();
        org.joda.time.LocalTime localTime41 = localTime25.withFields((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.LocalTime localTime45 = property44.getLocalTime();
        boolean boolean47 = property44.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime49 = property44.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        int int58 = localTime51.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        boolean boolean64 = localTime51.isSupported(dateTimeFieldType63);
        org.joda.time.LocalTime localTime66 = localTime49.withField(dateTimeFieldType63, 1);
        boolean boolean67 = localTime25.isAfter((org.joda.time.ReadablePartial) localTime49);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.LocalTime localTime74 = localTime72.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology75 = localTime74.getChronology();
        org.joda.time.LocalTime localTime76 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology75);
        org.joda.time.LocalTime localTime77 = new org.joda.time.LocalTime(chronology75);
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(chronology75);
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime((java.lang.Object) localTime25, chronology75);
        java.lang.String str81 = localTime25.toString("01:56:43.000");
        int int82 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00:28:11.437" + "'", str20, "00:28:11.437");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "01:58:57.000" + "'", str40, "01:58:57.000");
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "01:56:43.000" + "'", str81, "01:56:43.000");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime localTime7 = localTime3.withMinuteOfHour(23);
        org.joda.time.LocalTime localTime9 = localTime7.minusHours(484);
        org.joda.time.LocalTime.Property property10 = localTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime18 = localTime15.withPeriodAdded(readablePeriod16, 13);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime15.toDateTimeToday(dateTimeZone19);
        int int21 = property10.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        boolean boolean22 = property19.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField23 = property19.getDurationField();
        org.joda.time.DurationField durationField24 = property19.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        java.util.Locale locale28 = null;
        int int29 = property27.getMaximumShortTextLength(locale28);
        org.joda.time.LocalTime localTime30 = property27.getLocalTime();
        org.joda.time.LocalTime localTime31 = property27.withMinimumValue();
        org.joda.time.LocalTime localTime33 = localTime31.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime33.toDateTimeToday(dateTimeZone34);
        int int36 = property19.compareTo((org.joda.time.ReadableInstant) dateTime35);
        long long37 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        int int38 = property9.getDifference((org.joda.time.ReadableInstant) dateTime35);
        int int39 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 778L + "'", long4 == 778L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57" + "'", str7, "57");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1606262342L) + "'", long37 == (-1606262342L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1606262399) + "'", int38 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = localTime21.get(dateTimeFieldType26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime30 = localTime21.withPeriodAdded(readablePeriod28, 0);
        org.joda.time.LocalTime localTime32 = localTime21.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) localTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        boolean boolean39 = property36.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField40 = property36.getDurationField();
        boolean boolean41 = localTime33.equals((java.lang.Object) property36);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property36.getFieldType();
        org.joda.time.Interval interval43 = property36.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property36.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property36.getFieldType();
        int int46 = localTime7.get(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 58 + "'", int27 == 58);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 59 + "'", int46 == 59);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        boolean boolean12 = property2.equals((java.lang.Object) property9);
        org.joda.time.LocalTime localTime14 = property9.addNoWrapToCopy((int) (short) -1);
        org.joda.time.LocalTime localTime16 = property9.addCopy(57);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.LocalTime localTime25 = localTime22.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localTime25.toString(dateTimeFormatter26);
        int int28 = property9.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "00:30:57.930" + "'", str27, "00:30:57.930");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, (int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime9.getFields();
        org.joda.time.LocalTime.Property property11 = localTime9.hourOfDay();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundCeilingCopy();
        java.lang.String str14 = property11.getName();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property11.setCopy("01:56:26.000", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:56:26.000\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 57 + "'", int4 == 57);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hourOfDay" + "'", str14, "hourOfDay");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        int int8 = localTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        int int19 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.Chronology chronology20 = localTime18.getChronology();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology20);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) 16, chronology20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology20);
        org.joda.time.LocalTime localTime27 = localTime25.minusHours((-1606262360));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        long long32 = property30.remainder();
        int int33 = property30.getLeapAmount();
        org.joda.time.LocalTime localTime34 = property30.withMinimumValue();
        org.joda.time.LocalTime localTime36 = property30.addCopy((int) (short) 0);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType38 = null;
        boolean boolean39 = localTime37.isSupported(durationFieldType38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.LocalTime localTime45 = property42.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.LocalTime localTime49 = property48.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        int int51 = localTime45.get(dateTimeFieldType50);
        int int52 = localTime37.indexOf(dateTimeFieldType50);
        org.joda.time.LocalTime localTime54 = localTime36.withField(dateTimeFieldType50, 0);
        boolean boolean55 = localTime25.isSupported(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 22L + "'", long32 == 22L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 58 + "'", int51 == 58);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("2", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        java.lang.String str19 = localTime17.toString();
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        boolean boolean26 = property23.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime28 = property23.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        int int37 = localTime30.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        boolean boolean43 = localTime30.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime localTime45 = localTime28.withField(dateTimeFieldType42, 1);
        boolean boolean46 = localTime4.isAfter((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.LocalTime localTime51 = property50.getLocalTime();
        org.joda.time.LocalTime localTime53 = localTime51.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology54 = localTime53.getChronology();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology54);
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) localTime4, chronology54);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(chronology54);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalTime localTime63 = localTime60.withPeriodAdded(readablePeriod61, 9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:58:58.000" + "'", str19, "01:58:58.000");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime63);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 100);
        int int9 = property2.get();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        int int12 = property2.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime14 = property2.addNoWrapToCopy(9);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 7020169);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(35);
        org.joda.time.LocalTime localTime9 = localTime5.minusHours(46);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.LocalTime localTime17 = property12.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime18 = property12.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime18.toDateTimeToday(dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime18.withMinuteOfHour(30);
        boolean boolean23 = localTime5.equals((java.lang.Object) 30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        java.lang.String str19 = localTime17.toString();
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime27 = property23.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.LocalTime localTime38 = localTime35.plusHours((int) (short) 0);
        int int39 = localTime38.getMinuteOfHour();
        boolean boolean40 = localTime27.isAfter((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        long long45 = property43.remainder();
        int int46 = property43.getLeapAmount();
        org.joda.time.LocalTime localTime47 = property43.withMinimumValue();
        boolean boolean48 = property43.isLeap();
        boolean boolean49 = localTime38.equals((java.lang.Object) property43);
        boolean boolean50 = localTime20.isAfter((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.LocalTime localTime52 = localTime38.plusMinutes(58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:58:58.000" + "'", str19, "01:58:58.000");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 58 + "'", int39 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 479L + "'", long45 == 479L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime52);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy(0L);
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        int int26 = localTime20.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property29.withMaximumValue();
        org.joda.time.LocalTime localTime34 = localTime32.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        org.joda.time.LocalTime localTime41 = localTime34.withField(dateTimeFieldType39, (int) (byte) 1);
        int int42 = localTime20.get(dateTimeFieldType39);
        org.joda.time.LocalTime localTime44 = localTime12.withField(dateTimeFieldType39, (int) (short) 1);
        org.joda.time.LocalTime.Property property45 = localTime8.property(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 59 + "'", int26 == 59);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 59 + "'", int42 == 59);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.DurationField durationField18 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime19 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        org.joda.time.LocalTime localTime13 = property11.addNoWrapToCopy(20);
        org.joda.time.LocalTime localTime14 = property11.roundHalfEvenCopy();
        int int15 = property11.get();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property18.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime22.toDateTimeToday(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = property11.getDifference((org.joda.time.ReadableInstant) dateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1606262399886");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7138000 + "'", int15 == 7138000);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        int int5 = property2.getMaximumValueOverall();
        int int6 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(46);
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.LocalTime localTime10 = property2.withMaximumValue();
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(50);
        int int14 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        org.joda.time.DurationField durationField17 = property15.getRangeDurationField();
        org.joda.time.LocalTime localTime18 = property15.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.plus(readablePeriod19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 647);
        java.lang.String str2 = localTime1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00:00:00.647" + "'", str2, "00:00:00.647");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime8 = property2.addCopy(86399999);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(430L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = localTime7.withHourOfDay(0);
        org.joda.time.LocalTime localTime12 = localTime10.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property15.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        int int28 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        boolean boolean34 = localTime21.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime.Property property35 = localTime19.property(dateTimeFieldType33);
        boolean boolean36 = localTime10.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime.Property property37 = localTime1.property(dateTimeFieldType33);
        java.util.Locale locale38 = null;
        int int39 = property37.getMaximumTextLength(locale38);
        java.lang.String str40 = property37.toString();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Property[secondOfMinute]" + "'", str40, "Property[secondOfMinute]");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime14.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        java.lang.String str19 = localTime17.toString();
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime27 = property23.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.LocalTime localTime38 = localTime35.plusHours((int) (short) 0);
        int int39 = localTime38.getMinuteOfHour();
        boolean boolean40 = localTime27.isAfter((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        long long45 = property43.remainder();
        int int46 = property43.getLeapAmount();
        org.joda.time.LocalTime localTime47 = property43.withMinimumValue();
        boolean boolean48 = property43.isLeap();
        boolean boolean49 = localTime38.equals((java.lang.Object) property43);
        boolean boolean50 = localTime20.isAfter((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.LocalTime.Property property51 = localTime20.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        org.joda.time.LocalTime localTime57 = localTime55.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology58 = localTime57.getChronology();
        org.joda.time.LocalTime localTime60 = localTime57.withHourOfDay(0);
        org.joda.time.LocalTime localTime62 = localTime60.withSecondOfMinute((int) (byte) 10);
        int int63 = localTime62.getMillisOfSecond();
        boolean boolean64 = localTime20.isAfter((org.joda.time.ReadablePartial) localTime62);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:58:59.000" + "'", str19, "01:58:59.000");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 58 + "'", int39 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 465L + "'", long45 == 465L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 465 + "'", int63 == 465);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(986L, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(880);
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) 'a');
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime0.getFieldType(466);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 466");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withSecondOfMinute(59);
        int int5 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property6 = localTime1.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime1.withPeriodAdded(readablePeriod7, (-1606262351));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localTime1.getField(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        int int15 = property13.get();
        org.joda.time.LocalTime localTime17 = property13.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime18 = property13.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.withMaximumValue();
        org.joda.time.LocalTime localTime32 = localTime30.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        org.joda.time.LocalTime localTime39 = localTime32.withField(dateTimeFieldType37, (int) (byte) 1);
        org.joda.time.LocalTime.Property property40 = localTime39.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.Interval interval47 = property46.toInterval();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        int int49 = localTime42.compareTo((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.LocalTime localTime51 = localTime48.plusHours((int) (short) 0);
        int int52 = localTime51.getHourOfDay();
        int int53 = localTime51.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.LocalTime localTime57 = property56.getLocalTime();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime61 = localTime58.withPeriodAdded(readablePeriod59, 13);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localTime58.toDateTimeToday(dateTimeZone62);
        org.joda.time.DateTime dateTime64 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property40.compareTo((org.joda.time.ReadableInstant) dateTime64);
        long long66 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime64);
        int int67 = property13.getDifference((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalTime localTime69 = property13.addNoWrapToCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime71 = localTime69.withMinuteOfHour(30);
        boolean boolean72 = localTime8.isEqual((org.joda.time.ReadablePartial) localTime71);
        org.joda.time.LocalTime localTime74 = localTime8.minusHours(78961426);
        org.joda.time.Chronology chronology75 = localTime74.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localTime51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 59 + "'", int53 == 59);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1606262399L) + "'", long66 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1606262399) + "'", int67 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(chronology75);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsText(locale7);
        int int9 = property2.getMaximumValueOverall();
        boolean boolean10 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "59" + "'", str8, "59");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy(12);
        int int7 = property2.getMinimumValueOverall();
        java.lang.String str8 = property2.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property11.addCopy(54);
        org.joda.time.DateTime dateTime17 = localTime16.toDateTimeToday();
        int int18 = property2.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime7 = property2.roundHalfCeilingCopy();
        int int8 = property2.get();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(25);
        org.joda.time.LocalTime localTime5 = localTime3.plusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        int[] intArray16 = localTime15.getValues();
        org.joda.time.LocalTime localTime18 = localTime15.withMillisOfDay((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = localTime23.minusMinutes(22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.withMaximumValue();
        org.joda.time.LocalTime localTime33 = localTime31.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        org.joda.time.LocalTime localTime40 = localTime33.withField(dateTimeFieldType38, (int) (byte) 1);
        boolean boolean41 = localTime25.isSupported(dateTimeFieldType38);
        org.joda.time.LocalTime localTime43 = localTime18.withField(dateTimeFieldType38, 56);
        boolean boolean44 = localTime10.isSupported(dateTimeFieldType38);
        int int45 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 59, 0, 105]");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime26 = localTime19.withField(dateTimeFieldType24, (int) (byte) 1);
        int int27 = localTime5.get(dateTimeFieldType24);
        org.joda.time.LocalTime localTime29 = localTime5.withMillisOfDay(57);
        org.joda.time.LocalTime.Property property30 = localTime29.minuteOfHour();
        org.joda.time.LocalTime localTime32 = localTime29.withMillisOfDay(40);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        boolean boolean38 = property35.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField39 = property35.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        java.util.Locale locale43 = null;
        int int44 = property42.getMaximumShortTextLength(locale43);
        org.joda.time.LocalTime localTime45 = property42.getLocalTime();
        org.joda.time.LocalTime localTime46 = property42.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime46.toDateTimeToday(dateTimeZone47);
        int int49 = property35.getDifference((org.joda.time.ReadableInstant) dateTime48);
        int int50 = property35.getMaximumValueOverall();
        org.joda.time.LocalTime localTime52 = property35.addWrapFieldToCopy(29);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = localTime57.plusMillis((int) ' ');
        org.joda.time.LocalTime localTime61 = localTime57.plusMinutes(0);
        org.joda.time.LocalTime localTime63 = localTime61.withMillisOfSecond(21);
        org.joda.time.LocalTime localTime65 = localTime61.plusHours(29);
        org.joda.time.LocalTime localTime66 = localTime52.withFields((org.joda.time.ReadablePartial) localTime65);
        boolean boolean67 = localTime32.isEqual((org.joda.time.ReadablePartial) localTime65);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1606262400) + "'", int49 == (-1606262400));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 59 + "'", int50 == 59);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getName();
        org.joda.time.LocalTime localTime9 = property2.addCopy(19);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property12.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property12.getFieldType();
        org.joda.time.LocalTime localTime18 = property12.withMaximumValue();
        org.joda.time.DurationField durationField19 = property12.getLeapDurationField();
        java.lang.String str20 = property12.getName();
        org.joda.time.LocalTime localTime22 = property12.addCopy(484);
        org.joda.time.LocalTime localTime23 = localTime9.withFields((org.joda.time.ReadablePartial) localTime22);
        java.lang.String str25 = localTime9.toString("9");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondOfMinute" + "'", str7, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "9" + "'", str25, "9");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.minuteOfHour();
        org.joda.time.LocalTime localTime14 = property12.setCopy((int) (short) 1);
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        org.joda.time.LocalTime localTime17 = property15.addWrapFieldToCopy(78841507);
        org.joda.time.LocalTime localTime19 = property15.setCopy("6");
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DurationField durationField24 = property22.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField25 = property22.getField();
        org.joda.time.LocalTime localTime27 = property22.addNoWrapToCopy(30);
        org.joda.time.LocalTime localTime28 = property22.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        long long33 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-26771098L) + "'", long33 == (-26771098L));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.minusMillis(36);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        boolean boolean19 = property16.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField20 = property16.getDurationField();
        org.joda.time.DurationField durationField21 = property16.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        java.util.Locale locale25 = null;
        int int26 = property24.getMaximumShortTextLength(locale25);
        org.joda.time.LocalTime localTime27 = property24.getLocalTime();
        org.joda.time.LocalTime localTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime30 = localTime28.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime30.toDateTimeToday(dateTimeZone31);
        int int33 = property16.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalTime localTime34 = property16.getLocalTime();
        boolean boolean35 = localTime10.equals((java.lang.Object) property16);
        org.joda.time.LocalTime localTime37 = localTime10.plusHours(15);
        org.joda.time.LocalTime localTime39 = localTime10.withMillisOfDay(11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        org.joda.time.LocalTime localTime10 = property2.addCopy(869);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        java.lang.String str9 = localTime7.toString("12");
        org.joda.time.LocalTime localTime11 = localTime7.plusMinutes(14);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis(0);
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes(309);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localTime1.isSupported(durationFieldType2);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(chronology4);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) 732, chronology4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 29);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        int int6 = property2.get();
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(41);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        int int9 = localTime8.size();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        java.lang.String str9 = localTime7.toString("12");
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        int int20 = localTime13.compareTo((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime19.plusHours((int) (short) 0);
        int int23 = localTime22.getMinuteOfHour();
        org.joda.time.LocalTime localTime25 = localTime22.withHourOfDay(4);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime31 = localTime29.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.LocalTime localTime34 = localTime31.withHourOfDay(0);
        org.joda.time.LocalTime localTime36 = localTime34.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = property39.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        int int52 = localTime45.compareTo((org.joda.time.ReadablePartial) localTime51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        boolean boolean58 = localTime45.isSupported(dateTimeFieldType57);
        org.joda.time.LocalTime.Property property59 = localTime43.property(dateTimeFieldType57);
        boolean boolean60 = localTime34.isSupported(dateTimeFieldType57);
        org.joda.time.LocalTime localTime62 = localTime22.withField(dateTimeFieldType57, 17);
        boolean boolean63 = localTime11.isSupported(dateTimeFieldType57);
        int int64 = localTime11.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        int int17 = localTime11.get(dateTimeFieldType16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime11.withPeriodAdded(readablePeriod18, 0);
        boolean boolean21 = property2.equals((java.lang.Object) localTime20);
        org.joda.time.LocalTime localTime23 = localTime20.plusHours(8);
        org.joda.time.LocalTime localTime25 = localTime20.minusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        long long30 = property28.remainder();
        int int31 = property28.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property28.getFieldType();
        int int33 = localTime25.indexOf(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime25.withMillisOfDay(283);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 154L + "'", long30 == 154L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        java.lang.String str10 = property2.getName();
        org.joda.time.LocalTime localTime11 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime1.withPeriodAdded(readablePeriod3, 56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:54:16.000");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        long long6 = property4.remainder();
        int int7 = property4.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property4.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        boolean boolean14 = property11.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime16 = property11.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        boolean boolean31 = localTime18.isSupported(dateTimeFieldType30);
        org.joda.time.LocalTime localTime33 = localTime16.withField(dateTimeFieldType30, 1);
        boolean boolean34 = localTime8.isEqual((org.joda.time.ReadablePartial) localTime16);
        boolean boolean35 = localTime1.isEqual((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        org.joda.time.LocalTime localTime41 = property38.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType42 = null;
        boolean boolean43 = localTime41.isSupported(durationFieldType42);
        org.joda.time.LocalTime.Property property44 = localTime41.millisOfDay();
        org.joda.time.LocalTime localTime46 = property44.addCopy((long) (-1606262381));
        boolean boolean47 = localTime1.equals((java.lang.Object) property44);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 314L + "'", long6 == 314L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) 86L, chronology8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = localTime17.minusMinutes(22);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property22.withMaximumValue();
        org.joda.time.LocalTime localTime27 = localTime25.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        org.joda.time.LocalTime localTime34 = localTime27.withField(dateTimeFieldType32, (int) (byte) 1);
        boolean boolean35 = localTime19.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime localTime37 = localTime19.withSecondOfMinute((int) (byte) 0);
        org.joda.time.LocalTime localTime38 = localTime12.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime40 = localTime12.minusSeconds(6975379);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        java.lang.String str12 = localTime10.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(7);
        org.joda.time.LocalTime.Property property17 = localTime10.hourOfDay();
        long long18 = property17.remainder();
        int int19 = property17.getMaximumValue();
        org.joda.time.LocalTime localTime21 = property17.addCopy((-1606262374L));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:59:01.000" + "'", str12, "01:59:01.000");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3541000L + "'", long18 == 3541000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 23 + "'", int19 == 23);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime5 = property2.addCopy((long) 116);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime26 = localTime19.withField(dateTimeFieldType24, (int) (byte) 1);
        int int27 = localTime5.get(dateTimeFieldType24);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime5.plus(readablePeriod28);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        boolean boolean31 = localTime5.isSupported(durationFieldType30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.LocalTime localTime6 = property2.setCopy("15");
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        org.joda.time.Interval interval9 = property2.toInterval();
        long long10 = property2.remainder();
        int int11 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(interval9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 694L + "'", long10 == 694L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(847L, dateTimeZone1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 847L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime19 = property2.addCopy((-1));
        org.joda.time.LocalTime localTime20 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = property2.withMinimumValue();
        int int22 = property2.getMaximumValue();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property2.getAsText(locale23);
        org.joda.time.DurationField durationField25 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        int int30 = property28.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime37 = localTime35.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology38);
        org.joda.time.LocalTime localTime41 = localTime39.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray42 = localTime41.getFields();
        boolean boolean43 = property28.equals((java.lang.Object) dateTimeFieldArray42);
        org.joda.time.LocalTime localTime45 = property28.addCopy((-1));
        org.joda.time.LocalTime localTime46 = property28.roundCeilingCopy();
        org.joda.time.LocalTime localTime47 = property28.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((java.lang.Object) localTime47, dateTimeZone48);
        int int50 = property2.compareTo((org.joda.time.ReadablePartial) localTime49);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 59 + "'", int30 == 59);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.getMaximumValueOverall();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        org.joda.time.LocalTime localTime9 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime11 = property2.addWrapFieldToCopy(7041277);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property27 = localTime26.millisOfDay();
        boolean boolean28 = property15.equals((java.lang.Object) property27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property31.getFieldType();
        org.joda.time.LocalTime localTime35 = property31.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = localTime35.isSupported(durationFieldType36);
        org.joda.time.LocalTime localTime39 = localTime35.minusMinutes(282);
        int int40 = property27.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.LocalTime localTime41 = property27.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localTime41);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withSecondOfMinute(45);
        org.joda.time.LocalTime localTime9 = localTime5.minusMinutes(0);
        org.joda.time.LocalTime.Property property10 = localTime5.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(412, (-26769838), 49, 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 412 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        boolean boolean23 = property20.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField24 = property20.getDurationField();
        boolean boolean25 = localTime17.equals((java.lang.Object) property20);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property20.getFieldType();
        boolean boolean28 = property20.equals((java.lang.Object) "32");
        boolean boolean29 = property20.isLeap();
        java.util.Locale locale30 = null;
        int int31 = property20.getMaximumTextLength(locale30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(604L);
        java.lang.String str3 = localTime1.toString("01:57:32.000");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "01:57:32.000" + "'", str3, "01:57:32.000");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606262400), 7035807);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(13);
        org.joda.time.LocalTime localTime9 = localTime5.plusSeconds((-1606262400));
        org.joda.time.LocalTime localTime11 = localTime5.plusMinutes(79081261);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.getMaximumValueOverall();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        java.lang.String str9 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime19 = property2.addCopy((-1));
        org.joda.time.LocalTime localTime20 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = property2.getLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        java.lang.String str12 = localTime10.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(7);
        org.joda.time.LocalTime localTime18 = localTime16.plusMinutes((int) (byte) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:59:02.000" + "'", str12, "01:59:02.000");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        java.lang.String str9 = localTime7.toString("12");
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) localTime11, dateTimeZone12);
        int int14 = localTime13.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localTime8.toString(dateTimeFormatter9);
        org.joda.time.LocalTime localTime12 = localTime8.minusMillis(44);
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond(45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00:31:02.483" + "'", str10, "00:31:02.483");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        boolean boolean11 = property8.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField12 = property8.getDurationField();
        org.joda.time.DurationField durationField13 = property8.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumShortTextLength(locale17);
        org.joda.time.LocalTime localTime19 = property16.getLocalTime();
        org.joda.time.LocalTime localTime20 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime22.toDateTimeToday(dateTimeZone23);
        int int25 = property8.compareTo((org.joda.time.ReadableInstant) dateTime24);
        long long26 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        java.lang.String str27 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1606262397L) + "'", long26 == (-1606262397L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "secondOfMinute" + "'", str27, "secondOfMinute");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withSecondOfMinute(45);
        org.joda.time.LocalTime localTime9 = localTime5.minusMinutes(0);
        int int10 = localTime9.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes(22);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime9 = localTime4.minusHours(79081261);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.Chronology chronology13 = localTime11.getChronology();
        boolean boolean14 = property2.equals((java.lang.Object) localTime11);
        org.joda.time.LocalTime localTime16 = localTime11.plusHours(6868000);
        org.joda.time.LocalTime.Property property17 = localTime11.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime11.withHourOfDay(265);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 265 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.setCopy(48);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(31);
        org.joda.time.LocalTime localTime12 = localTime8.plusMinutes(58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 765L + "'", long4 == 765L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 15);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, (-1606262372));
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606262400), chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.LocalTime localTime27 = localTime24.withHourOfDay(0);
        org.joda.time.LocalTime localTime29 = localTime27.withSecondOfMinute((int) (byte) 10);
        int int30 = property15.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = property33.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        int int46 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        boolean boolean52 = localTime39.isSupported(dateTimeFieldType51);
        org.joda.time.LocalTime.Property property53 = localTime37.property(dateTimeFieldType51);
        int int54 = property15.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime56 = localTime37.withSecondOfMinute(23);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) localTime37, dateTimeZone57);
        int int59 = localTime37.getHourOfDay();
        boolean boolean60 = localTime12.isBefore((org.joda.time.ReadablePartial) localTime37);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localTime56);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 0);
        org.joda.time.LocalTime localTime9 = property2.roundHalfFloorCopy();
        java.lang.String str10 = property2.toString();
        org.joda.time.LocalTime localTime11 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        int int16 = property14.get();
        org.joda.time.LocalTime localTime18 = property14.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime19 = property14.withMinimumValue();
        org.joda.time.Interval interval20 = property14.toInterval();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.Chronology chronology31 = localTime29.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology31);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology31);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology31);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.now(chronology31);
        int int36 = property14.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = localTime41.minusMinutes(22);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime43.withPeriodAdded(readablePeriod44, (-1606262400));
        int int47 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime46);
        boolean boolean48 = localTime11.isBefore((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay(430L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = localTime50.toString(dateTimeFormatter51);
        int int53 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime50);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 990L + "'", long4 == 990L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[secondOfMinute]" + "'", str10, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "00:00:00.430" + "'", str52, "00:00:00.430");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        int int17 = localTime11.get(dateTimeFieldType16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime11.withPeriodAdded(readablePeriod18, 0);
        boolean boolean21 = property2.equals((java.lang.Object) localTime20);
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday();
        org.joda.time.Chronology chronology23 = localTime20.getChronology();
        org.joda.time.LocalTime.Property property24 = localTime20.millisOfSecond();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) property24, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(3479000L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        boolean boolean17 = property2.equals((java.lang.Object) dateTimeFieldArray16);
        org.joda.time.LocalTime localTime19 = property2.addCopy((-1));
        org.joda.time.LocalTime localTime20 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = property2.withMinimumValue();
        int int22 = property2.getMaximumValue();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property2.getAsText(locale23);
        org.joda.time.DurationField durationField25 = property2.getDurationField();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property2.getAsText(locale26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "3" + "'", str24, "3");
        org.junit.Assert.assertNotNull(durationField25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "3" + "'", str27, "3");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6982049, 7041277);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6982049 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.LocalTime localTime14 = localTime10.minusSeconds(53);
        org.joda.time.LocalTime localTime16 = localTime14.plusHours(7020169);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime1.getFieldType(7063034);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7063034");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(252, 29, 78961426, (int) (byte) 1, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 252 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 1);
        org.joda.time.LocalTime.Property property15 = localTime7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        int int24 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = localTime23.plusHours((int) (short) 0);
        org.joda.time.LocalTime.Property property27 = localTime26.millisOfDay();
        boolean boolean28 = property15.equals((java.lang.Object) property27);
        int int29 = property27.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property32.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property32.getFieldType();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property32.getAsText(locale38);
        int int40 = property32.getMinimumValue();
        java.lang.String str41 = property32.getAsText();
        org.joda.time.LocalTime localTime42 = property32.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime44 = localTime42.minusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        long long49 = property47.remainder();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        int int58 = localTime51.compareTo((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.LocalTime localTime60 = localTime57.plusHours((int) (short) 0);
        int int61 = localTime60.getHourOfDay();
        int int62 = localTime60.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.LocalTime localTime66 = property65.getLocalTime();
        org.joda.time.LocalTime localTime67 = property65.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalTime localTime70 = localTime67.withPeriodAdded(readablePeriod68, 13);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localTime67.toDateTimeToday(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localTime60.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        int int74 = property47.getDifference((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = localTime42.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        long long76 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "3" + "'", str39, "3");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "3" + "'", str41, "3");
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 466L + "'", long49 == 466L);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(localTime60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1606262399) + "'", int74 == (-1606262399));
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1606262400000L) + "'", long76 == (-1606262400000L));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes((int) (short) 100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 1);
        org.joda.time.LocalTime localTime26 = localTime7.minusMillis((-1606262400));
        org.joda.time.LocalTime localTime28 = localTime7.minusHours(59);
        org.joda.time.LocalTime localTime30 = localTime28.minusMillis(647);
        org.joda.time.LocalTime.Property property31 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime33 = property31.setCopy(14);
        java.lang.String str34 = property31.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "14" + "'", str34, "14");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology7);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        long long12 = property10.remainder();
        int int13 = property10.getLeapAmount();
        org.joda.time.LocalTime localTime14 = property10.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        boolean boolean20 = property17.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime22 = property17.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        int int31 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        boolean boolean37 = localTime24.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime localTime39 = localTime22.withField(dateTimeFieldType36, 1);
        boolean boolean40 = localTime14.isEqual((org.joda.time.ReadablePartial) localTime22);
        int int41 = property2.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        java.util.Locale locale45 = null;
        int int46 = property44.getMaximumShortTextLength(locale45);
        org.joda.time.LocalTime localTime47 = property44.getLocalTime();
        org.joda.time.LocalTime localTime48 = property44.withMinimumValue();
        org.joda.time.LocalTime localTime50 = localTime48.minusMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localTime50.toDateTimeToday(dateTimeZone51);
        int int53 = property2.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DurationField durationField54 = property2.getRangeDurationField();
        int int55 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime59 = property58.getLocalTime();
        org.joda.time.LocalTime localTime60 = property58.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType61 = null;
        boolean boolean62 = localTime60.isSupported(durationFieldType61);
        org.joda.time.LocalTime.Property property63 = localTime60.hourOfDay();
        org.joda.time.LocalTime.Property property64 = localTime60.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(dateTimeZone65);
        org.joda.time.LocalTime.Property property67 = localTime66.secondOfMinute();
        org.joda.time.LocalTime localTime68 = property67.getLocalTime();
        long long69 = property67.remainder();
        java.util.Locale locale70 = null;
        int int71 = property67.getMaximumShortTextLength(locale70);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime(dateTimeZone72);
        org.joda.time.LocalTime.Property property74 = localTime73.secondOfMinute();
        java.util.Locale locale75 = null;
        int int76 = property74.getMaximumShortTextLength(locale75);
        org.joda.time.LocalTime localTime77 = property74.getLocalTime();
        org.joda.time.LocalTime localTime78 = property74.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = localTime78.toDateTimeToday(dateTimeZone79);
        int int81 = property67.compareTo((org.joda.time.ReadableInstant) dateTime80);
        int int82 = property64.compareTo((org.joda.time.ReadableInstant) dateTime80);
        int int83 = property2.getDifference((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 801L + "'", long12 == 801L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localTime68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 802L + "'", long69 == 802L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1606262397) + "'", int83 == (-1606262397));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) '4');
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        int int12 = localTime10.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localTime10.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        int int10 = property2.getMinimumValue();
        org.joda.time.Interval interval11 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(13);
        org.joda.time.LocalTime.Property property8 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.withMaximumValue();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }
}
