import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        boolean boolean13 = localTime5.equals((java.lang.Object) 774L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = localTime19.get(dateTimeFieldType24);
        boolean boolean26 = localTime5.isBefore((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localTime5.getFieldTypes();
        org.joda.time.LocalTime localTime29 = localTime5.plusMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.LocalTime localTime42 = localTime40.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology43);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology43);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(chronology43);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology43);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology43);
        int[] intArray49 = localTime48.getValues();
        int int50 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localTime5.toDateTimeToday(dateTimeZone51);
        int int53 = localTime5.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 10, 10, 57]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) -1, chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(25L, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond(7012223);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7012223 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        java.lang.Class<?> wildcardClass6 = dateTimeFieldType5.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(236L, dateTimeZone1);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.util.Locale locale23 = null;
        org.joda.time.LocalTime localTime24 = property20.setCopy("44", locale23);
        int int25 = localTime24.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 44 + "'", int25 == 44);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        int int9 = property3.getMaximumValue();
        org.joda.time.LocalTime localTime11 = property3.setCopy(45);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 0, chronology14);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localTime15.isSupported(durationFieldType16);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.LocalTime localTime17 = localTime15.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) '4');
        int int25 = localTime7.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime7.withMinuteOfHour(41);
        org.joda.time.LocalTime localTime29 = localTime27.plusMillis((-1606262399));
        org.joda.time.LocalTime localTime31 = localTime29.withHourOfDay(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = localTime29.toString(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "11:30:00.601" + "'", str33, "11:30:00.601");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property23 = localTime7.property(dateTimeFieldType21);
        org.joda.time.Chronology chronology24 = localTime7.getChronology();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(301L, chronology24);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
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
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2");
        org.junit.Assert.assertNotNull(localTime1);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (-446183));
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds(7140070);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localTime5.getField(530);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 530");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localTime8.toString(dateTimeFormatter9);
        org.joda.time.LocalTime localTime12 = localTime8.minusMillis(844);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((int) (byte) 10, 2, 44);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        boolean boolean24 = property21.equals((java.lang.Object) false);
        int int25 = property21.getLeapAmount();
        int int26 = property21.getLeapAmount();
        org.joda.time.LocalTime localTime27 = property21.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime28 = property21.withMinimumValue();
        org.joda.time.DateTime dateTime29 = localTime28.toDateTimeToday();
        org.joda.time.DateTime dateTime30 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01:37:04.000" + "'", str10, "01:37:04.000");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        boolean boolean10 = property2.equals((java.lang.Object) (-1606262399L));
        boolean boolean11 = property2.isLeap();
        int int12 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.util.Locale locale23 = null;
        org.joda.time.LocalTime localTime24 = property20.setCopy("44", locale23);
        int int25 = property20.getLeapAmount();
        java.lang.String str26 = property20.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Property[millisOfDay]" + "'", str26, "Property[millisOfDay]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 39, dateTimeZone1);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getMaximumValueOverall();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        int int8 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 859L + "'", long4 == 859L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(chronology14);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology14);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology14);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) 38, chronology14);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        int int9 = property3.getMaximumValue();
        org.joda.time.LocalTime localTime11 = property3.setCopy(45);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 0, chronology14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime22.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.LocalTime localTime33 = localTime22.plusSeconds(32);
        org.joda.time.LocalTime localTime35 = localTime22.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime38 = localTime22.withPeriodAdded(readablePeriod36, 54);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime22.plus(readablePeriod39);
        org.joda.time.LocalTime localTime42 = localTime22.plusHours(40);
        boolean boolean43 = localTime16.isEqual((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.LocalTime localTime45 = localTime16.minusHours((-1606262390));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localTime45);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property8.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property8.getFieldType();
        int int14 = property8.getMaximumValue();
        org.joda.time.LocalTime localTime16 = property8.setCopy(45);
        org.joda.time.LocalTime localTime18 = localTime16.plusMillis((int) (short) 1);
        int int19 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime21 = localTime5.withMillisOfDay(694);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(559L);
        org.joda.time.ReadablePartial readablePartial2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.withFields(readablePartial2);
        int int4 = localTime1.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 559 + "'", int4 == 559);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.roundHalfCeilingCopy();
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
        org.joda.time.LocalTime localTime20 = localTime6.withField(dateTimeFieldType17, 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.LocalTime localTime26 = property23.addCopy(59);
        org.joda.time.LocalTime localTime27 = property23.roundCeilingCopy();
        org.joda.time.LocalTime localTime28 = localTime20.withFields((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        int int33 = property31.get();
        org.joda.time.LocalTime localTime35 = property31.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime36 = property31.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = property39.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property39.getFieldType();
        int int45 = localTime36.indexOf(dateTimeFieldType44);
        org.joda.time.LocalTime localTime46 = localTime28.withFields((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime.Property property47 = localTime36.secondOfMinute();
        int int48 = property47.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.toString();
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[secondOfMinute]" + "'", str5, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
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
        org.joda.time.LocalTime localTime23 = localTime12.plusSeconds(32);
        org.joda.time.LocalTime localTime25 = localTime12.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localTime12.getFieldTypes();
        org.joda.time.LocalTime.Property property27 = localTime12.millisOfDay();
        org.joda.time.LocalTime localTime28 = property27.roundFloorCopy();
        boolean boolean29 = localTime6.isEqual((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime31 = localTime6.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = property34.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        int int43 = localTime37.get(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime37.withPeriodAdded(readablePeriod44, 0);
        org.joda.time.LocalTime localTime48 = localTime37.plusSeconds(32);
        org.joda.time.LocalTime localTime50 = localTime37.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = localTime37.getFieldTypes();
        int int52 = localTime37.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.LocalTime localTime58 = property55.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        int int64 = localTime58.get(dateTimeFieldType63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalTime localTime67 = localTime58.withPeriodAdded(readablePeriod65, 0);
        org.joda.time.LocalTime localTime69 = localTime58.plusSeconds(32);
        org.joda.time.LocalTime localTime70 = localTime37.withFields((org.joda.time.ReadablePartial) localTime58);
        boolean boolean71 = localTime31.isAfter((org.joda.time.ReadablePartial) localTime70);
        int int73 = localTime31.getValue((int) (byte) 0);
        int int74 = localTime31.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 4 + "'", int64 == 4);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime6.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property11.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property11.getFieldType();
        int int17 = property11.getMaximumValue();
        org.joda.time.LocalTime localTime19 = property11.setCopy(45);
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology22 = localTime19.getChronology();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 0, chronology22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime30.withPeriodAdded(readablePeriod44, 54);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime30.plus(readablePeriod47);
        org.joda.time.LocalTime localTime50 = localTime30.plusHours(40);
        boolean boolean51 = localTime24.isEqual((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        int int56 = property54.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property54.getFieldType();
        boolean boolean58 = localTime24.equals((java.lang.Object) dateTimeFieldType57);
        int int59 = localTime6.indexOf(dateTimeFieldType57);
        org.joda.time.LocalTime.Property property60 = localTime6.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(property60);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime22 = localTime5.withMillisOfSecond(21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.LocalTime localTime26 = property23.setCopy(39);
        java.lang.String str27 = property23.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "5" + "'", str24, "5");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[secondOfMinute]" + "'", str27, "Property[secondOfMinute]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property9 = localTime4.hourOfDay();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = localTime11.plusHours(48);
        org.joda.time.LocalTime localTime15 = localTime13.minusHours(7174974);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 59);
        int int8 = localTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime17.plus(readablePeriod18);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime25.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.LocalTime localTime36 = localTime34.minusMinutes(46);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        int int41 = property39.get();
        org.joda.time.LocalTime localTime43 = property39.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime45 = property39.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) localTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType52 = null;
        boolean boolean53 = localTime51.isSupported(durationFieldType52);
        org.joda.time.LocalTime localTime55 = localTime51.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property56 = localTime51.hourOfDay();
        org.joda.time.LocalTime localTime57 = localTime46.withFields((org.joda.time.ReadablePartial) localTime51);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime61 = property60.getLocalTime();
        int int62 = property60.get();
        org.joda.time.LocalTime localTime64 = property60.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime66 = property60.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((java.lang.Object) localTime66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.LocalTime localTime71 = property70.getLocalTime();
        org.joda.time.LocalTime localTime72 = property70.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType73 = null;
        boolean boolean74 = localTime72.isSupported(durationFieldType73);
        org.joda.time.LocalTime localTime76 = localTime72.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property77 = localTime72.hourOfDay();
        org.joda.time.LocalTime localTime78 = localTime67.withFields((org.joda.time.ReadablePartial) localTime72);
        org.joda.time.LocalTime localTime80 = localTime67.minusSeconds(10);
        boolean boolean81 = localTime51.isAfter((org.joda.time.ReadablePartial) localTime67);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalTime localTime83 = localTime67.minus(readablePeriod82);
        org.joda.time.LocalTime localTime85 = localTime83.minusSeconds(38);
        org.joda.time.LocalTime localTime87 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.DateTime dateTime89 = localTime87.toDateTimeToday(dateTimeZone88);
        org.joda.time.DateTime dateTime90 = localTime83.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTime dateTime91 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTime dateTime92 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.LocalTime localTime93 = new org.joda.time.LocalTime((java.lang.Object) localTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime95 = localTime93.withMinuteOfHour(7097671);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7097671 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7203940 + "'", int8 == 7203940);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4 + "'", int62 == 4);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        org.joda.time.DurationField durationField12 = property2.getLeapDurationField();
        boolean boolean13 = property2.isLeap();
        org.joda.time.LocalTime localTime15 = property2.addWrapFieldToCopy(974);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5" + "'", str9, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property19 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime9.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        int int25 = property23.get();
        org.joda.time.LocalTime localTime27 = property23.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime29 = property23.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) localTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType36 = null;
        boolean boolean37 = localTime35.isSupported(durationFieldType36);
        org.joda.time.LocalTime localTime39 = localTime35.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property40 = localTime35.hourOfDay();
        org.joda.time.LocalTime localTime41 = localTime30.withFields((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.LocalTime localTime43 = localTime30.minusSeconds(10);
        boolean boolean44 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime30.minus(readablePeriod45);
        java.lang.String str48 = localTime30.toString("01:35:07.000");
        java.lang.Class<?> wildcardClass49 = localTime30.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "01:35:07.000" + "'", str48, "01:35:07.000");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("00:00:00.041");
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, 36);
        int int10 = property4.compareTo((org.joda.time.ReadablePartial) localTime9);
        int int11 = property4.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 86399999 + "'", int11 == 86399999);
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
        org.joda.time.Chronology chronology23 = localTime6.getChronology();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now(chronology23);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology23);
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
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.setCopy("54");
        org.joda.time.LocalTime localTime8 = localTime6.withSecondOfMinute(46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    @Ignore
  public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DurationField durationField15 = property13.getRangeDurationField();
        java.lang.String str16 = property13.toString();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        boolean boolean19 = property13.equals((java.lang.Object) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime25.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.LocalTime localTime36 = localTime25.plusSeconds(32);
        org.joda.time.LocalTime localTime38 = localTime25.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType44 = null;
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        boolean boolean46 = localTime38.isEqual((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime43.toDateTimeToday(dateTimeZone47);
        int int49 = property13.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalTime localTime50 = property13.roundHalfFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = localTime50.toString(dateTimeFormatter51);
        int int53 = property10.compareTo((org.joda.time.ReadablePartial) localTime50);
        java.lang.String str54 = property10.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[secondOfMinute]" + "'", str16, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1606262399) + "'", int49 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "01:59:05.000" + "'", str52, "01:59:05.000");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "381" + "'", str54, "381");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addCopy(59);
        org.joda.time.LocalTime localTime7 = property2.addNoWrapToCopy(45);
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour((int) '#');
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(18, 1, 21);
        boolean boolean14 = localTime9.isEqual((org.joda.time.ReadablePartial) localTime13);
        int[] intArray15 = localTime13.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[18, 1, 21, 0]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 44);
        int int2 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay(27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime1.withHourOfDay(7097671);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7097671 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime12 = localTime4.withMillisOfDay((int) '4');
        int int13 = localTime12.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 574L + "'", long4 == 574L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.lang.String str22 = property20.toString();
        org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property20.setCopy(0);
        int int26 = property20.getMinimumValueOverall();
        java.util.Locale locale27 = null;
        int int28 = property20.getMaximumTextLength(locale27);
        org.joda.time.DurationField durationField29 = property20.getDurationField();
        java.lang.String str30 = property20.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfDay]" + "'", str22, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(durationField29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "7146000" + "'", str30, "7146000");
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
        int int23 = localTime6.getSecondOfMinute();
        org.joda.time.LocalTime.Property property24 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime27 = property24.addCopy(20);
        int int28 = property24.getMaximumValueOverall();
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
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 59 + "'", int28 == 59);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 4, dateTimeZone1);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime22 = localTime5.withMillisOfSecond(21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.LocalTime localTime26 = property23.setCopy(39);
        org.joda.time.LocalTime localTime27 = property23.roundFloorCopy();
        int int28 = property23.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "6" + "'", str24, "6");
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.LocalTime localTime17 = localTime15.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) '4');
        int int25 = localTime7.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime7.withMinuteOfHour(41);
        org.joda.time.LocalTime localTime29 = localTime27.plusMillis((-1606262399));
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTime dateTime39 = localTime31.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = localTime31.toString(dateTimeFormatter40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = localTime31.toString("53", locale43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = localTime50.get(dateTimeFieldType55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalTime localTime59 = localTime50.withPeriodAdded(readablePeriod57, 0);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        boolean boolean65 = property62.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime67 = property62.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.Interval interval74 = property73.toInterval();
        org.joda.time.LocalTime localTime75 = property73.roundFloorCopy();
        int int76 = localTime69.compareTo((org.joda.time.ReadablePartial) localTime75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(dateTimeZone77);
        org.joda.time.LocalTime.Property property79 = localTime78.secondOfMinute();
        org.joda.time.LocalTime localTime80 = property79.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property79.getFieldType();
        boolean boolean82 = localTime69.isSupported(dateTimeFieldType81);
        org.joda.time.LocalTime localTime84 = localTime67.withField(dateTimeFieldType81, 2);
        boolean boolean85 = localTime50.isSupported(dateTimeFieldType81);
        int int86 = localTime31.indexOf(dateTimeFieldType81);
        org.joda.time.LocalTime.Property property87 = localTime29.property(dateTimeFieldType81);
        org.joda.time.DateTime dateTime88 = localTime29.toDateTimeToday();
        int[] intArray89 = localTime29.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "01:59:05.813" + "'", str41, "01:59:05.813");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "53" + "'", str44, "53");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(intArray89);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[11, 30, 2, 601]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(15, 8, 56);
        int int4 = localTime3.getMillisOfDay();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(559L);
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
        int int22 = localTime6.indexOf(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property23 = localTime3.property(dateTimeFieldType20);
        org.joda.time.LocalTime localTime25 = localTime3.withMinuteOfHour(59);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54536000 + "'", int4 == 54536000);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 27);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute(54);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 9301000, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(186L);
        org.joda.time.LocalTime localTime5 = localTime2.withFields((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((int) (byte) 10, 43, 44, (int) (short) 100);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localTime10.getFields();
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        boolean boolean32 = property29.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime34 = property29.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        int int43 = localTime36.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        boolean boolean49 = localTime36.isSupported(dateTimeFieldType48);
        org.joda.time.LocalTime localTime51 = localTime34.withField(dateTimeFieldType48, 2);
        boolean boolean52 = localTime17.isSupported(dateTimeFieldType48);
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localTime54.toDateTimeToday(dateTimeZone55);
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
        int int69 = localTime54.get(dateTimeFieldType67);
        org.joda.time.LocalTime.Property property70 = localTime17.property(dateTimeFieldType67);
        int int71 = localTime10.indexOf(dateTimeFieldType67);
        org.joda.time.LocalTime.Property property72 = localTime5.property(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 6 + "'", int68 == 6);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(property72);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addCopy((long) 19);
        int int10 = localTime9.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime9.withHourOfDay(28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime1.toString(dateTimeFormatter10);
        org.joda.time.LocalTime localTime13 = localTime1.withMillisOfDay(854);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01:59:06.269" + "'", str11, "01:59:06.269");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(54);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        boolean boolean15 = property12.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField16 = property12.getDurationField();
        long long17 = property12.remainder();
        org.joda.time.LocalTime localTime19 = property12.addCopy((long) 50);
        org.joda.time.LocalTime localTime21 = localTime19.withMillisOfDay(0);
        int int22 = localTime19.getSecondOfMinute();
        boolean boolean23 = localTime9.equals((java.lang.Object) int22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 304L + "'", long17 == 304L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 56 + "'", int22 == 56);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMillis((int) '4');
        java.util.Locale locale12 = null;
        java.lang.String str13 = localTime10.toString("57", locale12);
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
        boolean boolean31 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime36 = property34.withMinimumValue();
        org.joda.time.LocalTime localTime38 = property34.addWrapFieldToCopy((int) (byte) 1);
        java.lang.String str40 = localTime38.toString("00:00:00.010");
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = localTime45.isSupported(durationFieldType46);
        org.joda.time.LocalTime localTime49 = localTime45.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime51 = localTime45.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime53 = localTime45.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime55 = localTime45.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = localTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalTime localTime59 = localTime55.minus(readablePeriod58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.LocalTime localTime65 = property62.addCopy(59);
        org.joda.time.LocalTime.Property property66 = localTime65.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime(dateTimeZone67);
        org.joda.time.LocalTime.Property property69 = localTime68.secondOfMinute();
        org.joda.time.Interval interval70 = property69.toInterval();
        org.joda.time.LocalTime localTime71 = property69.roundFloorCopy();
        org.joda.time.LocalTime localTime72 = property69.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(dateTimeZone73);
        org.joda.time.LocalTime.Property property75 = localTime74.secondOfMinute();
        org.joda.time.LocalTime localTime76 = property75.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property75.getFieldType();
        int int78 = localTime72.get(dateTimeFieldType77);
        boolean boolean79 = localTime65.isSupported(dateTimeFieldType77);
        boolean boolean80 = localTime59.equals((java.lang.Object) dateTimeFieldType77);
        int int81 = localTime38.indexOf(dateTimeFieldType77);
        int int82 = localTime30.indexOf(dateTimeFieldType77);
        org.joda.time.LocalTime localTime84 = localTime30.minusSeconds(29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "57" + "'", str13, "57");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "00:00:00.010" + "'", str40, "00:00:00.010");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "01:58:31.000" + "'", str57, "01:58:31.000");
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 6 + "'", int78 == 6);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(localTime84);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime8.toString(dateTimeFormatter10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime8.withMinuteOfHour(7032644);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7032644 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.010" + "'", str11, "00:00:00.010");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMillis((int) '4');
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond(8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) localTime9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(505L, chronology11);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.addCopy(59);
        org.joda.time.Interval interval8 = property2.toInterval();
        boolean boolean9 = property2.isLeap();
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumTextLength(locale10);
        org.joda.time.LocalTime localTime13 = property2.addCopy(35);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(602L);
        boolean boolean16 = localTime13.equals((java.lang.Object) localTime15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 702L + "'", long4 == 702L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        boolean boolean10 = property2.equals((java.lang.Object) (-1606262399L));
        java.lang.String str11 = property2.toString();
        org.joda.time.LocalTime localTime12 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.lang.String str6 = property2.getName();
        java.lang.String str7 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6" + "'", str7, "6");
    }

    @Test
    @Ignore
  public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        java.lang.String str8 = property2.getAsString();
        int int9 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.Chronology chronology28 = localTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property31.withMaximumValue();
        org.joda.time.LocalTime localTime36 = localTime34.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.LocalTime localTime43 = localTime36.withField(dateTimeFieldType41, (int) '4');
        int int44 = localTime26.get(dateTimeFieldType41);
        boolean boolean45 = localTime11.isAfter((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime48 = localTime11.withPeriodAdded(readablePeriod46, 42);
        org.joda.time.DateTime dateTime49 = localTime48.toDateTimeToday();
        long long50 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalTime localTime51 = property2.roundHalfCeilingCopy();
        java.util.Locale locale53 = null;
        java.lang.String str54 = localTime51.toString("01:58:35.037", locale53);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6" + "'", str8, "6");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1606262400L) + "'", long50 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "01:58:35.037" + "'", str54, "01:58:35.037");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property2.getFieldType();
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        java.lang.String str11 = property2.getAsShortText();
        org.joda.time.LocalTime localTime12 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(52, 7091283, 683);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 7140070, dateTimeZone1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime12 = localTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (short) 10);
        int int15 = localTime12.getSecondOfMinute();
        org.joda.time.LocalTime localTime17 = localTime12.plusMinutes(28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property19 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime9.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime22 = localTime14.minusSeconds(36);
        int int23 = localTime22.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime localTime11 = localTime7.plusMillis(0);
        org.joda.time.LocalTime localTime13 = localTime7.minusHours(34);
        org.joda.time.LocalTime.Property property14 = localTime7.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusSeconds(44);
        int int4 = localTime0.getMinuteOfHour();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMillis((int) '4');
        java.util.Locale locale12 = null;
        java.lang.String str13 = localTime10.toString("57", locale12);
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
        boolean boolean31 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.LocalTime.Property property32 = localTime10.millisOfDay();
        org.joda.time.LocalTime.Property property33 = localTime10.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "57" + "'", str13, "57");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime14.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.LocalTime localTime25 = localTime14.plusSeconds(32);
        org.joda.time.LocalTime localTime27 = localTime14.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType33 = null;
        boolean boolean34 = localTime32.isSupported(durationFieldType33);
        boolean boolean35 = localTime27.isEqual((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime32.toDateTimeToday(dateTimeZone36);
        int int38 = property2.compareTo((org.joda.time.ReadableInstant) dateTime37);
        int int39 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        java.lang.String str6 = property2.getName();
        org.joda.time.LocalTime localTime8 = property2.addCopy(4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime8);
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
        org.joda.time.LocalTime localTime6 = property2.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.minusHours((int) (byte) 1);
        int int9 = localTime8.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 776 + "'", int9 == 776);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property6.addCopy((long) (short) 10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(694, 610, 25, 802, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 694 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalTime localTime25 = property22.addWrapFieldToCopy((-1));
        java.util.Locale locale26 = null;
        java.lang.String str27 = property22.getAsShortText(locale26);
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
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "6" + "'", str27, "6");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology15);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology15);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology15);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 38, chronology15);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(915L, chronology15);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
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
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsString();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("44", locale9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds(30);
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
        boolean boolean26 = localTime18.equals((java.lang.Object) 774L);
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
        boolean boolean39 = localTime18.isBefore((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = localTime18.getFieldTypes();
        org.joda.time.LocalTime localTime42 = localTime18.plusMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        long long48 = property45.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property45.getFieldType();
        int int50 = localTime18.get(dateTimeFieldType49);
        int int51 = localTime12.indexOf(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8" + "'", str7, "8");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 15L + "'", long48 == 15L);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        int int6 = localTime5.getHourOfDay();
        org.joda.time.Chronology chronology7 = localTime5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime15 = property10.addCopy((long) (short) 10);
        org.joda.time.DurationField durationField16 = property10.getLeapDurationField();
        org.joda.time.LocalTime localTime17 = property10.roundHalfEvenCopy();
        java.lang.String str18 = property10.getAsText();
        org.joda.time.LocalTime localTime19 = property10.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property10.getFieldType();
        boolean boolean21 = localTime5.isSupported(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "8" + "'", str18, "8");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        long long9 = property2.remainder();
        java.lang.String str10 = property2.toString();
        int int11 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime12 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property2.getFieldType();
        org.joda.time.DurationField durationField14 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 285L + "'", long9 == 285L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[secondOfMinute]" + "'", str10, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0, 44);
        int int3 = localTime2.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        int int8 = property6.get();
        org.joda.time.LocalTime localTime10 = property6.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = property6.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) localTime12);
        int int14 = localTime12.size();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime20 = localTime18.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property23.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        boolean boolean42 = localTime29.isSupported(dateTimeFieldType41);
        org.joda.time.LocalTime.Property property43 = localTime27.property(dateTimeFieldType41);
        org.joda.time.LocalTime localTime44 = localTime18.withFields((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        int int49 = property47.get();
        org.joda.time.LocalTime localTime51 = property47.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime52 = property47.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property55.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property55.getFieldType();
        int int61 = localTime52.indexOf(dateTimeFieldType60);
        boolean boolean62 = localTime27.isSupported(dateTimeFieldType60);
        boolean boolean63 = localTime12.isSupported(dateTimeFieldType60);
        boolean boolean64 = localTime2.isEqual((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime.Property property65 = localTime2.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 8 + "'", int49 == 8);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime7.withSecondOfMinute(974);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 974 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        org.joda.time.LocalTime localTime9 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addCopy(59);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property2.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
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
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) -1, chronology20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology20);
        boolean boolean23 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime22);
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
        org.joda.time.LocalTime.Property property36 = localTime7.property(dateTimeFieldType34);
        int int37 = localTime7.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7148000 + "'", int37 == 7148000);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = property2.addCopy(45);
        org.joda.time.LocalTime localTime11 = property2.addWrapFieldToCopy((int) (short) 10);
        java.lang.String str12 = property2.getAsText();
        java.lang.String str13 = property2.toString();
        org.joda.time.LocalTime localTime15 = property2.addWrapFieldToCopy(54536000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "8" + "'", str12, "8");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[secondOfMinute]" + "'", str13, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime9.toString(dateTimeFormatter10);
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds(32);
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime17.withPeriodAdded(readablePeriod31, 54);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime17.plus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime17.plusHours(40);
        org.joda.time.LocalTime localTime38 = localTime9.withFields((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime37.minusMinutes(35);
        org.joda.time.LocalTime localTime42 = localTime40.minusMinutes(0);
        org.joda.time.LocalTime.Property property43 = localTime42.millisOfDay();
        org.joda.time.LocalTime localTime45 = localTime42.minusMillis(7018011);
        org.joda.time.DateTimeField[] dateTimeFieldArray46 = localTime45.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.041" + "'", str11, "00:00:00.041");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldArray46);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("24");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"24\": Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.LocalTime localTime17 = localTime15.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) '4');
        int int25 = localTime7.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime7.withMinuteOfHour(41);
        org.joda.time.LocalTime localTime29 = localTime27.plusMillis((-1606262399));
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTime dateTime39 = localTime31.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = localTime31.toString(dateTimeFormatter40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = localTime31.toString("53", locale43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = localTime50.get(dateTimeFieldType55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalTime localTime59 = localTime50.withPeriodAdded(readablePeriod57, 0);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        boolean boolean65 = property62.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime67 = property62.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.Interval interval74 = property73.toInterval();
        org.joda.time.LocalTime localTime75 = property73.roundFloorCopy();
        int int76 = localTime69.compareTo((org.joda.time.ReadablePartial) localTime75);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(dateTimeZone77);
        org.joda.time.LocalTime.Property property79 = localTime78.secondOfMinute();
        org.joda.time.LocalTime localTime80 = property79.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property79.getFieldType();
        boolean boolean82 = localTime69.isSupported(dateTimeFieldType81);
        org.joda.time.LocalTime localTime84 = localTime67.withField(dateTimeFieldType81, 2);
        boolean boolean85 = localTime50.isSupported(dateTimeFieldType81);
        int int86 = localTime31.indexOf(dateTimeFieldType81);
        org.joda.time.LocalTime.Property property87 = localTime29.property(dateTimeFieldType81);
        int int88 = property87.getLeapAmount();
        org.joda.time.LocalTime localTime89 = property87.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "01:59:09.022" + "'", str41, "01:59:09.022");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "53" + "'", str44, "53");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(localTime89);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("11", locale9);
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 825, dateTimeZone1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        int int7 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DurationField durationField13 = property11.getRangeDurationField();
        org.joda.time.DurationField durationField14 = property11.getDurationField();
        boolean boolean15 = localTime8.equals((java.lang.Object) durationField14);
        int int16 = localTime8.getSecondOfMinute();
        org.joda.time.Chronology chronology17 = localTime8.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsShortText(locale6);
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        long long9 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 425L + "'", long9 == 425L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.util.Locale locale23 = null;
        org.joda.time.LocalTime localTime24 = property20.setCopy("44", locale23);
        org.joda.time.LocalTime localTime26 = property20.addNoWrapToCopy(576);
        org.joda.time.LocalTime localTime28 = localTime26.plusMillis(7078884);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType34 = null;
        boolean boolean35 = localTime33.isSupported(durationFieldType34);
        org.joda.time.LocalTime localTime37 = localTime33.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime39 = localTime33.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime41 = localTime33.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime43 = localTime33.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = localTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime43.minus(readablePeriod46);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localTime47.getFieldType(3);
        int int50 = localTime28.get(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "01:58:34.000" + "'", str45, "01:58:34.000");
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 460 + "'", int50 == 460);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 36, chronology12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 10, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(7103282, (-1606255412), 7102413, 58, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7103282 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusSeconds(44);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime0.secondOfMinute();
        org.joda.time.LocalTime.Property property7 = localTime0.millisOfSecond();
        org.joda.time.LocalTime localTime9 = property7.setCopy((int) 'a');
        int int10 = property7.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property8.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = localTime14.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime.Property property28 = localTime12.property(dateTimeFieldType26);
        org.joda.time.LocalTime localTime29 = localTime3.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime.Property property30 = localTime3.millisOfDay();
        int int31 = localTime3.getMillisOfSecond();
        org.joda.time.LocalTime localTime33 = localTime3.minusSeconds(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 649 + "'", int31 == 649);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property19 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime9.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime22 = localTime14.minusSeconds(36);
        org.joda.time.LocalTime localTime24 = localTime14.minusMillis(7012223);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime14.plus(readablePeriod25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 53);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(56);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localTime15.isSupported(durationFieldType16);
        org.joda.time.LocalTime localTime19 = localTime15.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime21 = localTime15.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime23 = localTime15.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime25 = localTime15.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime25.minus(readablePeriod28);
        boolean boolean30 = property2.equals((java.lang.Object) localTime29);
        java.lang.String str31 = property2.getAsText();
        org.joda.time.DurationField durationField32 = property2.getDurationField();
        org.joda.time.LocalTime localTime34 = property2.addNoWrapToCopy((int) (byte) 100);
        java.lang.String str35 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "01:58:34.000" + "'", str27, "01:58:34.000");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "9" + "'", str31, "9");
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(localTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "9" + "'", str35, "9");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime12.isSupported(durationFieldType13);
        org.joda.time.LocalTime localTime16 = localTime12.plusMillis((int) (short) 100);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime18 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property2.roundFloorCopy();
        java.lang.String str20 = localTime19.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 909L + "'", long4 == 909L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "01:59:09.000" + "'", str20, "01:59:09.000");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(490, 21, 537);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime localTime11 = localTime7.plusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localTime11.getFields();
        org.joda.time.LocalTime localTime14 = localTime11.plusSeconds(170);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime1.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime1.withPeriodAdded(readablePeriod12, 37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime1.getFieldTypes();
        org.joda.time.LocalTime localTime17 = localTime1.minusHours(55);
        int[] intArray18 = localTime17.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01:59:09.998" + "'", str11, "01:59:09.998");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[18, 59, 9, 998]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) ' ');
        org.joda.time.Chronology chronology8 = localTime5.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 58, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        boolean boolean15 = property12.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime17 = property12.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime.Property property22 = localTime21.millisOfDay();
        org.joda.time.LocalTime localTime23 = localTime17.withFields((org.joda.time.ReadablePartial) localTime21);
        int int24 = localTime21.getMinuteOfHour();
        int int25 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.LocalTime localTime27 = localTime21.minusMillis(173);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) localTime21, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusHours((-1606262400));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 59 + "'", int24 == 59);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.joda.time.LocalTime localTime13 = property11.addNoWrapToCopy((int) '#');
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        org.joda.time.Interval interval9 = property2.toInterval();
        int int10 = property2.getMinimumValue();
        java.lang.String str11 = property2.getAsShortText();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumShortTextLength(locale12);
        int int14 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(38, (int) (short) 100, (-1606264904));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.util.Locale locale23 = null;
        org.joda.time.LocalTime localTime24 = property20.setCopy("44", locale23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = localTime30.getFieldTypes();
        org.joda.time.LocalTime.Property property45 = localTime30.millisOfDay();
        org.joda.time.LocalTime localTime46 = property45.roundFloorCopy();
        java.util.Locale locale48 = null;
        org.joda.time.LocalTime localTime49 = property45.setCopy("44", locale48);
        boolean boolean50 = property20.equals((java.lang.Object) locale48);
        boolean boolean51 = property20.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.LocalTime localTime11 = localTime8.minusHours(45);
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime14 = localTime11.minusMinutes(48);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        int int7 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime9 = property2.withMinimumValue();
        org.joda.time.DurationField durationField10 = property2.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        org.joda.time.LocalTime localTime16 = property13.withMinimumValue();
        int int17 = property13.getMinimumValueOverall();
        org.joda.time.LocalTime localTime18 = property13.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.plus(readablePeriod19);
        int int21 = property2.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        long long7 = property2.remainder();
        org.joda.time.LocalTime localTime9 = property2.addCopy((long) 50);
        int int10 = property2.getMinimumValue();
        java.util.Locale locale11 = null;
        int int12 = property2.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 700L + "'", long7 == 700L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime9.toString(dateTimeFormatter10);
        int[] intArray12 = localTime9.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.041" + "'", str11, "00:00:00.041");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 41]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 7126000, dateTimeZone1);
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
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay(862);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.minus(readablePeriod12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 797L + "'", long4 == 797L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
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
        boolean boolean14 = localTime6.equals((java.lang.Object) 774L);
        int int15 = localTime0.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime17 = localTime0.minusHours(33);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime0.minus(readablePeriod18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime19.minus(readablePeriod20);
        org.joda.time.LocalTime localTime23 = localTime19.plusHours(7032010);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime12 = localTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime14 = localTime4.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.minus(readablePeriod17);
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes(7054010);
        org.joda.time.LocalTime localTime22 = localTime18.minusSeconds(100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "01:58:35.000" + "'", str16, "01:58:35.000");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property2.getFieldType();
        java.lang.String str13 = property2.toString();
        long long14 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[secondOfMinute]" + "'", str13, "Property[secondOfMinute]");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 967L + "'", long14 == 967L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property2.addWrapFieldToCopy(7162377);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime12 = localTime4.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime14.plus(readablePeriod15);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(25L);
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfDay(9);
        org.joda.time.LocalTime localTime22 = localTime18.plusHours(47);
        boolean boolean23 = localTime16.isEqual((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime25 = localTime16.minusMinutes(5);
        org.joda.time.LocalTime.Property property26 = localTime25.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMillis((int) '4');
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(7);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime10.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addCopy(59);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
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
        org.joda.time.LocalTime localTime23 = localTime12.plusSeconds(32);
        org.joda.time.LocalTime localTime25 = localTime12.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localTime30.isSupported(durationFieldType31);
        boolean boolean33 = localTime25.isEqual((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime30.toDateTimeToday(dateTimeZone34);
        int int36 = property6.compareTo((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property6.getMaximumValueOverall();
        boolean boolean38 = property6.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 999 + "'", int37 == 999);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    @Ignore
  public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.withMaximumValue();
        boolean boolean13 = property9.isLeap();
        java.lang.String str14 = property9.getAsString();
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
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime20.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.LocalTime localTime31 = localTime20.plusSeconds(32);
        org.joda.time.LocalTime localTime33 = localTime20.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.LocalTime localTime38 = property36.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localTime38.isSupported(durationFieldType39);
        boolean boolean41 = localTime33.isEqual((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localTime38.toDateTimeToday(dateTimeZone42);
        long long44 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        int int45 = property9.get();
        int int46 = property9.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.LocalTime localTime52 = property49.withMaximumValue();
        boolean boolean53 = property49.isLeap();
        java.lang.String str54 = property49.getAsString();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.LocalTime localTime59 = property57.roundFloorCopy();
        org.joda.time.LocalTime localTime60 = property57.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone61);
        org.joda.time.LocalTime.Property property63 = localTime62.secondOfMinute();
        org.joda.time.LocalTime localTime64 = property63.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        int int66 = localTime60.get(dateTimeFieldType65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalTime localTime69 = localTime60.withPeriodAdded(readablePeriod67, 0);
        org.joda.time.LocalTime localTime71 = localTime60.plusSeconds(32);
        org.joda.time.LocalTime localTime73 = localTime60.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(dateTimeZone74);
        org.joda.time.LocalTime.Property property76 = localTime75.secondOfMinute();
        org.joda.time.LocalTime localTime77 = property76.getLocalTime();
        org.joda.time.LocalTime localTime78 = property76.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType79 = null;
        boolean boolean80 = localTime78.isSupported(durationFieldType79);
        boolean boolean81 = localTime73.isEqual((org.joda.time.ReadablePartial) localTime78);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateTime dateTime83 = localTime78.toDateTimeToday(dateTimeZone82);
        long long84 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime83);
        int int85 = property9.getDifference((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.DateTime dateTime86 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.LocalTime.Property property87 = localTime6.millisOfSecond();
        java.lang.String str88 = localTime6.toString();
        org.joda.time.ReadablePeriod readablePeriod89 = null;
        org.joda.time.LocalTime localTime91 = localTime6.withPeriodAdded(readablePeriod89, 19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11" + "'", str14, "11");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1606262399L) + "'", long44 == (-1606262399L));
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 11 + "'", int45 == 11);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "11" + "'", str54, "11");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 11 + "'", int66 == 11);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1606262399L) + "'", long84 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1606262399) + "'", int85 == (-1606262399));
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(property87);
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "01:59:11.032" + "'", str88, "01:59:11.032");
        org.junit.Assert.assertNotNull(localTime91);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.joda.time.LocalTime localTime39 = localTime22.withField(dateTimeFieldType36, 2);
        boolean boolean40 = localTime5.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = localTime50.get(dateTimeFieldType55);
        int int57 = localTime42.get(dateTimeFieldType55);
        org.joda.time.LocalTime.Property property58 = localTime5.property(dateTimeFieldType55);
        org.joda.time.LocalTime localTime60 = localTime5.withSecondOfMinute(55);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalTime localTime62 = localTime5.minus(readablePeriod61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = localTime62.toString(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "01:59:11.000" + "'", str64, "01:59:11.000");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.plus(readablePeriod7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
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
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime12 = localTime4.withMillisOfDay((int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime18 = property15.withMinimumValue();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) localTime18);
        boolean boolean20 = localTime4.isAfter((org.joda.time.ReadablePartial) localTime19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        int int12 = property11.getLeapAmount();
        java.util.Locale locale13 = null;
        int int14 = property11.getMaximumShortTextLength(locale13);
        org.joda.time.LocalTime localTime15 = property11.roundHalfEvenCopy();
        int int16 = property11.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7151000 + "'", int16 == 7151000);
    }

    @Test
    @Ignore
  public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        java.lang.String str7 = property2.getAsString();
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
        org.joda.time.LocalTime localTime24 = localTime13.plusSeconds(32);
        org.joda.time.LocalTime localTime26 = localTime13.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType32 = null;
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        boolean boolean34 = localTime26.isEqual((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime31.toDateTimeToday(dateTimeZone35);
        long long37 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = property2.isLeap();
        org.joda.time.LocalTime localTime39 = property2.roundCeilingCopy();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property2.getAsShortText(locale40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.LocalTime localTime45 = property44.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        org.joda.time.LocalTime localTime47 = property44.withMinimumValue();
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((java.lang.Object) localTime47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        int int53 = property51.getMinimumValueOverall();
        boolean boolean54 = localTime48.equals((java.lang.Object) int53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime57 = localTime48.withPeriodAdded(readablePeriod55, 100);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(dateTimeZone59);
        org.joda.time.LocalTime.Property property61 = localTime60.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        org.joda.time.LocalTime localTime64 = property61.withMinimumValue();
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((java.lang.Object) localTime64);
        org.joda.time.LocalTime localTime67 = localTime64.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime69 = localTime67.minusMinutes(40);
        org.joda.time.Chronology chronology70 = localTime69.getChronology();
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(90L, chronology70);
        org.joda.time.LocalTime localTime73 = localTime71.plusHours(29);
        java.lang.String str75 = localTime71.toString("25");
        boolean boolean76 = localTime48.isBefore((org.joda.time.ReadablePartial) localTime71);
        int int77 = property2.compareTo((org.joda.time.ReadablePartial) localTime71);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1606262399L) + "'", long37 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "11" + "'", str41, "11");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "25" + "'", str75, "25");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:56:45.055");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property2.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime15 = property2.setCopy("35");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11" + "'", str9, "11");
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11" + "'", str12, "11");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localTime6.toString(dateTimeFormatter7);
        org.joda.time.LocalTime localTime10 = localTime6.minusMinutes((-1));
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localTime10.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01:59:00.785" + "'", str8, "01:59:00.785");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.addCopy(59);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.lang.Class<?> wildcardClass9 = localTime7.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 833L + "'", long4 == 833L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        int int17 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.Chronology chronology18 = localTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.withMaximumValue();
        org.joda.time.LocalTime localTime26 = localTime24.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        org.joda.time.LocalTime localTime33 = localTime26.withField(dateTimeFieldType31, (int) '4');
        int int34 = localTime16.get(dateTimeFieldType31);
        boolean boolean35 = localTime1.isAfter((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTime dateTime36 = localTime16.toDateTimeToday();
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = localTime16.getFields();
        org.joda.time.LocalTime.Property property38 = localTime16.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldArray37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime6.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property11.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property11.getFieldType();
        int int17 = property11.getMaximumValue();
        org.joda.time.LocalTime localTime19 = property11.setCopy(45);
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology22 = localTime19.getChronology();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 0, chronology22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime30.withPeriodAdded(readablePeriod44, 54);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime30.plus(readablePeriod47);
        org.joda.time.LocalTime localTime50 = localTime30.plusHours(40);
        boolean boolean51 = localTime24.isEqual((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        int int56 = property54.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property54.getFieldType();
        boolean boolean58 = localTime24.equals((java.lang.Object) dateTimeFieldType57);
        int int59 = localTime6.indexOf(dateTimeFieldType57);
        org.joda.time.DurationFieldType durationFieldType60 = null;
        boolean boolean61 = localTime6.isSupported(durationFieldType60);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) "01:56:40.179", dateTimeZone1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 6970000, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime2.getField((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalTime localTime25 = property22.addWrapFieldToCopy((-1));
        org.joda.time.LocalTime.Property property26 = localTime25.millisOfDay();
        java.util.Locale locale27 = null;
        int int28 = property26.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = null;
        int int30 = property26.getMaximumShortTextLength(locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = property33.getMinimumValueOverall();
        org.joda.time.LocalTime localTime37 = property33.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime39 = localTime37.minusMinutes(22);
        int int40 = property26.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTimeField dateTimeField41 = property26.getField();
        org.joda.time.DurationField durationField42 = property26.getDurationField();
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
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.Interval interval6 = property2.toInterval();
        int int7 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(25L);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(9);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime7.minusHours(10);
        org.joda.time.Chronology chronology27 = localTime7.getChronology();
        java.lang.String str28 = localTime7.toString();
        org.joda.time.LocalTime localTime30 = localTime7.plusMinutes((int) ' ');
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
        org.junit.Assert.assertNotNull(chronology27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "01:59:12.333" + "'", str28, "01:59:12.333");
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1, 44);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        int int7 = property5.get();
        int int8 = property5.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property5.addNoWrapToCopy(35);
        boolean boolean11 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        int int16 = property14.get();
        org.joda.time.LocalTime localTime18 = property14.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime20 = property14.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime22 = property14.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(0);
        org.joda.time.LocalTime localTime26 = localTime22.withSecondOfMinute(59);
        boolean boolean27 = localTime2.isAfter((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime29 = localTime22.withHourOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime31 = localTime22.withMillisOfDay(7010478);
        org.joda.time.LocalTime localTime33 = localTime22.withMillisOfDay(47);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(40);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(45);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime12.isSupported(durationFieldType13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime12.plus(readablePeriod15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        int int23 = localTime6.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.LocalTime localTime33 = localTime31.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology34);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology34);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology34);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100, chronology34);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property42.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property42.getFieldType();
        int int48 = property42.getMaximumValue();
        org.joda.time.LocalTime localTime50 = property42.setCopy(45);
        org.joda.time.DurationField durationField51 = property42.getRangeDurationField();
        org.joda.time.LocalTime localTime52 = property42.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property42.getFieldType();
        boolean boolean54 = localTime39.equals((java.lang.Object) dateTimeFieldType53);
        int int55 = localTime6.indexOf(dateTimeFieldType53);
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
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 59 + "'", int48 == 59);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
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
        int int6 = property2.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        boolean boolean8 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property9 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime10 = property9.withMinimumValue();
        org.joda.time.LocalTime localTime12 = localTime10.plusMillis(825);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        int int23 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.Chronology chronology24 = localTime22.getChronology();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) -1, chronology24);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(963L, chronology24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime26.plus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        long long33 = property31.remainder();
        int int34 = property31.getLeapAmount();
        org.joda.time.LocalTime localTime36 = property31.addCopy(59);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.LocalTime localTime42 = property39.withMinimumValue();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) localTime42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.Interval interval47 = property46.toInterval();
        int int48 = property46.getMinimumValueOverall();
        boolean boolean49 = localTime43.equals((java.lang.Object) int48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        int int54 = property52.get();
        org.joda.time.LocalTime localTime56 = property52.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime57 = property52.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.Interval interval61 = property60.toInterval();
        org.joda.time.LocalTime localTime62 = property60.roundFloorCopy();
        org.joda.time.LocalTime localTime64 = property60.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property60.getFieldType();
        int int66 = localTime57.indexOf(dateTimeFieldType65);
        org.joda.time.LocalTime.Property property67 = localTime43.property(dateTimeFieldType65);
        int int68 = localTime36.indexOf(dateTimeFieldType65);
        int int69 = localTime26.get(dateTimeFieldType65);
        int int70 = localTime12.get(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 755L + "'", long33 == 755L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 12 + "'", int54 == 12);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 12 + "'", int70 == 12);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        long long6 = property2.remainder();
        java.lang.Class<?> wildcardClass7 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 900L + "'", long6 == 900L);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        boolean boolean26 = localTime18.isEqual((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = localTime18.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime30 = localTime18.plus(readablePeriod29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "01:59:13.010" + "'", str28, "01:59:13.010");
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        org.joda.time.LocalTime localTime9 = property2.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 49);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.minus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime12.withPeriodAdded(readablePeriod15, 746);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12" + "'", str7, "12");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        boolean boolean10 = property2.equals((java.lang.Object) (-1606262399L));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        int int22 = localTime16.get(dateTimeFieldType21);
        int int23 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        int int24 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 13 + "'", int22 == 13);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = localTime1.getMillisOfSecond();
        java.lang.String str4 = localTime1.toString();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "01:59:13.069" + "'", str4, "01:59:13.069");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumTextLength(locale12);
        java.util.Locale locale15 = null;
        org.joda.time.LocalTime localTime16 = property8.setCopy("11", locale15);
        int int17 = localTime16.getMillisOfDay();
        int int18 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property2.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7151094 + "'", int17 == 7151094);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime5 = property2.setCopy("46");
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 750, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property5.getFieldType();
        int int10 = localTime2.get(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        boolean boolean16 = property2.equals((java.lang.Object) dateTimeField15);
        org.joda.time.DurationField durationField17 = property2.getRangeDurationField();
        java.lang.String str18 = property2.getAsString();
        org.joda.time.LocalTime localTime19 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime25 = property22.withMinimumValue();
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes(54);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (byte) 10, 2, 44);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        org.joda.time.LocalTime localTime34 = localTime27.withFields((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.LocalTime localTime36 = localTime31.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property39.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property39.getFieldType();
        org.joda.time.LocalTime.Property property44 = localTime36.property(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property45 = localTime19.property(dateTimeFieldType43);
        org.joda.time.LocalTime localTime46 = property45.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "13" + "'", str9, "13");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "13" + "'", str18, "13");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        int int8 = property2.get();
        boolean boolean9 = property2.isLeap();
        org.joda.time.LocalTime localTime11 = property2.addNoWrapToCopy(49);
        int int12 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(40);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(45);
        int int13 = localTime12.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        int int18 = property16.get();
        org.joda.time.LocalTime localTime20 = property16.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime21 = property16.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property24.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property24.getFieldType();
        int int30 = localTime21.indexOf(dateTimeFieldType29);
        org.joda.time.LocalTime.Property property31 = localTime12.property(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 437 + "'", int13 == 437);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property23 = localTime7.property(dateTimeFieldType21);
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        java.util.Locale locale25 = null;
        int int26 = property23.getMaximumTextLength(locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.LocalTime localTime32 = localTime30.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) locale25, chronology33);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 45, chronology33);
        java.lang.Class<?> wildcardClass36 = chronology33.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
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
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(wildcardClass36);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        int int8 = localTime7.getMinuteOfHour();
        org.joda.time.LocalTime.Property property9 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay(14);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime11.getValue(596);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 596");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("8", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalTime localTime25 = property22.addWrapFieldToCopy((-1));
        org.joda.time.LocalTime.Property property26 = localTime25.millisOfDay();
        java.util.Locale locale27 = null;
        int int28 = property26.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = null;
        int int30 = property26.getMaximumShortTextLength(locale29);
        org.joda.time.LocalTime localTime32 = property26.addWrapFieldToCopy(25);
        java.lang.Class<?> wildcardClass33 = property26.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property9 = localTime4.hourOfDay();
        org.joda.time.DurationField durationField10 = property9.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        int int5 = property2.get();
        org.joda.time.LocalTime localTime7 = property2.setCopy("44");
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 13 + "'", int5 == 13);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 36, chronology7);
        org.joda.time.LocalTime localTime11 = localTime9.minusSeconds(24);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(25L);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(9);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds(0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    @Ignore
  public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.lang.String str22 = property20.toString();
        org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property20.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.withMaximumValue();
        boolean boolean32 = property28.isLeap();
        java.lang.String str33 = property28.getAsString();
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
        org.joda.time.LocalTime localTime50 = localTime39.plusSeconds(32);
        org.joda.time.LocalTime localTime52 = localTime39.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.getLocalTime();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = localTime57.isSupported(durationFieldType58);
        boolean boolean60 = localTime52.isEqual((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = localTime57.toDateTimeToday(dateTimeZone61);
        long long63 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        long long64 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.LocalTime localTime66 = property20.addCopy((int) ' ');
        long long67 = property20.remainder();
        java.util.Locale locale68 = null;
        java.lang.String str69 = property20.getAsText(locale68);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfDay]" + "'", str22, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "13" + "'", str33, "13");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 14 + "'", int45 == 14);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1606262399L) + "'", long63 == (-1606262399L));
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1606262399000L) + "'", long64 == (-1606262399000L));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "7154000" + "'", str69, "7154000");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        int int17 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.Chronology chronology18 = localTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.withMaximumValue();
        org.joda.time.LocalTime localTime26 = localTime24.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        org.joda.time.LocalTime localTime33 = localTime26.withField(dateTimeFieldType31, (int) '4');
        int int34 = localTime16.get(dateTimeFieldType31);
        boolean boolean35 = localTime1.isAfter((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime38 = localTime1.withPeriodAdded(readablePeriod36, 42);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime38.plus(readablePeriod39);
        boolean boolean42 = localTime38.equals((java.lang.Object) "00:56:19.249");
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localTime38.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 13 + "'", int34 == 13);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
    }

    @Test
    @Ignore
  public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("11", locale9);
        org.joda.time.Interval interval11 = property2.toInterval();
        java.lang.String str12 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localTime17.isSupported(durationFieldType18);
        org.joda.time.LocalTime localTime21 = localTime17.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime23 = localTime17.minusMillis((int) '4');
        java.util.Locale locale25 = null;
        java.lang.String str26 = localTime23.toString("57", locale25);
        org.joda.time.LocalTime.Property property27 = localTime23.hourOfDay();
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
        org.joda.time.LocalTime localTime44 = localTime33.plusSeconds(32);
        org.joda.time.LocalTime localTime46 = localTime33.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = localTime33.getFieldTypes();
        org.joda.time.LocalTime.Property property48 = localTime33.millisOfDay();
        org.joda.time.LocalTime localTime49 = property48.roundFloorCopy();
        java.lang.String str50 = property48.toString();
        org.joda.time.LocalTime localTime51 = property48.roundFloorCopy();
        org.joda.time.LocalTime localTime53 = property48.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property56.withMaximumValue();
        boolean boolean60 = property56.isLeap();
        java.lang.String str61 = property56.getAsString();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(dateTimeZone62);
        org.joda.time.LocalTime.Property property64 = localTime63.secondOfMinute();
        org.joda.time.Interval interval65 = property64.toInterval();
        org.joda.time.LocalTime localTime66 = property64.roundFloorCopy();
        org.joda.time.LocalTime localTime67 = property64.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.LocalTime localTime71 = property70.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = property70.getFieldType();
        int int73 = localTime67.get(dateTimeFieldType72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalTime localTime76 = localTime67.withPeriodAdded(readablePeriod74, 0);
        org.joda.time.LocalTime localTime78 = localTime67.plusSeconds(32);
        org.joda.time.LocalTime localTime80 = localTime67.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime(dateTimeZone81);
        org.joda.time.LocalTime.Property property83 = localTime82.secondOfMinute();
        org.joda.time.LocalTime localTime84 = property83.getLocalTime();
        org.joda.time.LocalTime localTime85 = property83.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType86 = null;
        boolean boolean87 = localTime85.isSupported(durationFieldType86);
        boolean boolean88 = localTime80.isEqual((org.joda.time.ReadablePartial) localTime85);
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.DateTime dateTime90 = localTime85.toDateTimeToday(dateTimeZone89);
        long long91 = property56.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime90);
        long long92 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime90);
        int int93 = property27.compareTo((org.joda.time.ReadableInstant) dateTime90);
        int int94 = property2.compareTo((org.joda.time.ReadableInstant) dateTime90);
        java.lang.String str95 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "14" + "'", str12, "14");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "57" + "'", str26, "57");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14 + "'", int39 == 14);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Property[millisOfDay]" + "'", str50, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "14" + "'", str61, "14");
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 14 + "'", int73 == 14);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-1606262399L) + "'", long91 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-1606262400000L) + "'", long92 == (-1606262400000L));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "14" + "'", str95, "14");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
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
        boolean boolean35 = localTime17.isSupported(dateTimeFieldType33);
        boolean boolean36 = property2.equals((java.lang.Object) boolean35);
        int int37 = property2.getMinimumValue();
        java.lang.String str38 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14" + "'", str9, "14");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "14" + "'", str38, "14");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.addCopy(59);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalTime localTime10 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.LocalTime.Property property12 = localTime10.millisOfDay();
        org.joda.time.LocalTime.Property property13 = localTime10.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 209L + "'", long4 == 209L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
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
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) -1, chronology20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology20);
        boolean boolean23 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime22);
        int int24 = localTime7.getSecondOfMinute();
        int int25 = localTime7.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime7.withHourOfDay(194);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 194 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7154000 + "'", int25 == 7154000);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.lang.String str5 = property2.getAsShortText();
        org.joda.time.LocalTime localTime7 = property2.setCopy(50);
        int int8 = property2.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        int int10 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14" + "'", str5, "14");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 14 + "'", int10 == 14);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(54);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        boolean boolean18 = property15.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime20 = property15.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = localTime22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime30.withPeriodAdded(readablePeriod44, 54);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime30.plus(readablePeriod47);
        org.joda.time.LocalTime localTime50 = localTime30.plusHours(40);
        org.joda.time.LocalTime localTime51 = localTime22.withFields((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.LocalTime localTime53 = localTime22.plusMinutes((int) (byte) 10);
        org.joda.time.LocalTime localTime54 = localTime12.withFields((org.joda.time.ReadablePartial) localTime53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.LocalTime localTime59 = property57.roundFloorCopy();
        org.joda.time.LocalTime localTime60 = property57.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime62 = property57.addCopy((long) (short) 10);
        org.joda.time.Chronology chronology63 = localTime62.getChronology();
        int int64 = localTime54.compareTo((org.joda.time.ReadablePartial) localTime62);
        org.joda.time.LocalTime localTime66 = localTime54.minusHours(47);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00:00:00.041" + "'", str24, "00:00:00.041");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 14 + "'", int36 == 14);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(localTime66);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusSeconds(44);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localTime0.toDateTimeToday(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime0.secondOfMinute();
        org.joda.time.LocalTime.Property property7 = localTime0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy("01:58:16.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:58:16.000\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    @Ignore
  public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.lang.String str22 = property20.toString();
        org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property20.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.withMaximumValue();
        boolean boolean32 = property28.isLeap();
        java.lang.String str33 = property28.getAsString();
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
        org.joda.time.LocalTime localTime50 = localTime39.plusSeconds(32);
        org.joda.time.LocalTime localTime52 = localTime39.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.getLocalTime();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = localTime57.isSupported(durationFieldType58);
        boolean boolean60 = localTime52.isEqual((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = localTime57.toDateTimeToday(dateTimeZone61);
        long long63 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        long long64 = property20.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.LocalTime localTime66 = property20.addCopy((int) ' ');
        long long67 = property20.remainder();
        boolean boolean68 = property20.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfDay]" + "'", str22, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "14" + "'", str33, "14");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-1606262399L) + "'", long63 == (-1606262399L));
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1606262399000L) + "'", long64 == (-1606262399000L));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(54);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (byte) 10, 2, 44);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.LocalTime localTime14 = localTime7.withFields((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(559L);
        org.joda.time.ReadablePartial readablePartial17 = null;
        org.joda.time.LocalTime localTime18 = localTime16.withFields(readablePartial17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        int int23 = property21.get();
        org.joda.time.LocalTime localTime25 = property21.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime27 = property21.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) localTime27);
        int int29 = localTime27.size();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.LocalTime localTime35 = localTime33.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.LocalTime localTime40 = property38.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property38.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.Interval interval49 = property48.toInterval();
        org.joda.time.LocalTime localTime50 = property48.roundFloorCopy();
        int int51 = localTime44.compareTo((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        boolean boolean57 = localTime44.isSupported(dateTimeFieldType56);
        org.joda.time.LocalTime.Property property58 = localTime42.property(dateTimeFieldType56);
        org.joda.time.LocalTime localTime59 = localTime33.withFields((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        int int64 = property62.get();
        org.joda.time.LocalTime localTime66 = property62.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime67 = property62.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.Interval interval71 = property70.toInterval();
        org.joda.time.LocalTime localTime72 = property70.roundFloorCopy();
        org.joda.time.LocalTime localTime74 = property70.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property70.getFieldType();
        int int76 = localTime67.indexOf(dateTimeFieldType75);
        boolean boolean77 = localTime42.isSupported(dateTimeFieldType75);
        boolean boolean78 = localTime27.isSupported(dateTimeFieldType75);
        int int79 = localTime18.indexOf(dateTimeFieldType75);
        boolean boolean80 = localTime14.isSupported(dateTimeFieldType75);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime(dateTimeZone81);
        org.joda.time.LocalTime.Property property83 = localTime82.secondOfMinute();
        org.joda.time.Interval interval84 = property83.toInterval();
        org.joda.time.LocalTime localTime85 = property83.roundFloorCopy();
        org.joda.time.LocalTime localTime87 = property83.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property83.getFieldType();
        int int89 = property83.getMaximumValue();
        java.lang.String str90 = property83.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property83.getFieldType();
        int int92 = localTime14.get(dateTimeFieldType91);
        org.joda.time.ReadablePeriod readablePeriod93 = null;
        org.joda.time.LocalTime localTime95 = localTime14.withPeriodAdded(readablePeriod93, 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 14 + "'", int23 == 14);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 14 + "'", int64 == 14);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 59 + "'", int89 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "14" + "'", str90, "14");
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 44 + "'", int92 == 44);
        org.junit.Assert.assertNotNull(localTime95);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalTime localTime23 = property20.addCopy(50);
        org.joda.time.LocalTime localTime25 = property20.setCopy(48);
        org.joda.time.LocalTime localTime26 = property20.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        boolean boolean26 = localTime18.isEqual((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localTime23.toDateTimeToday(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime23.withPeriodAdded(readablePeriod29, 173);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay(7136094);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7136094 for hourOfDay must be in the range [0,23]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = property2.addCopy(45);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.LocalTime.Property property11 = localTime9.millisOfDay();
        int int12 = property11.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalTime localTime22 = property20.withMinimumValue();
        org.joda.time.LocalTime.Property property23 = localTime22.minuteOfHour();
        org.joda.time.LocalTime localTime25 = localTime22.withSecondOfMinute(46);
        org.joda.time.LocalTime localTime27 = localTime22.minusMinutes(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = localTime22.withMillisOfSecond(7073343);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7073343 for millisOfSecond must be in the range [0,999]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime14.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.LocalTime localTime25 = localTime23.minusMinutes(46);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTimeToday(dateTimeZone26);
        int int28 = property2.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalTime localTime30 = property2.addCopy(7032010);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    @Ignore
  public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DurationField durationField15 = property13.getRangeDurationField();
        java.lang.String str16 = property13.toString();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        boolean boolean19 = property13.equals((java.lang.Object) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime25.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.LocalTime localTime36 = localTime25.plusSeconds(32);
        org.joda.time.LocalTime localTime38 = localTime25.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType44 = null;
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        boolean boolean46 = localTime38.isEqual((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime43.toDateTimeToday(dateTimeZone47);
        int int49 = property13.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalTime localTime50 = property13.roundHalfFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = localTime50.toString(dateTimeFormatter51);
        int int53 = property10.compareTo((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.LocalTime localTime54 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[secondOfMinute]" + "'", str16, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1606262399) + "'", int49 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "01:59:15.000" + "'", str52, "01:59:15.000");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localTime54);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = property5.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        int int11 = property5.getMaximumValue();
        org.joda.time.LocalTime localTime13 = property5.setCopy(45);
        org.joda.time.LocalTime localTime15 = localTime13.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology16 = localTime13.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 0, chronology16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) 20, chronology16);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(774L, chronology16);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property8.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property8.getFieldType();
        int int14 = property8.getMaximumValue();
        org.joda.time.LocalTime localTime16 = property8.setCopy(45);
        org.joda.time.LocalTime localTime18 = localTime16.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology19 = localTime16.getChronology();
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday();
        int int21 = property2.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime23 = property2.addNoWrapToCopy(50);
        java.lang.String str24 = property2.getAsString();
        int int25 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "15" + "'", str24, "15");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(507L, dateTimeZone1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        org.joda.time.LocalTime localTime14 = localTime5.withField(dateTimeFieldType12, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        int int23 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.Chronology chronology24 = localTime22.getChronology();
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
        org.joda.time.LocalTime localTime39 = localTime32.withField(dateTimeFieldType37, (int) '4');
        int int40 = localTime22.get(dateTimeFieldType37);
        org.joda.time.LocalTime localTime42 = localTime22.withMinuteOfHour(41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime45 = localTime42.plusMinutes(20);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.LocalTime localTime49 = property48.getLocalTime();
        org.joda.time.LocalTime localTime50 = property48.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        int int59 = localTime52.compareTo((org.joda.time.ReadablePartial) localTime58);
        org.joda.time.Chronology chronology60 = localTime58.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone61);
        org.joda.time.LocalTime.Property property63 = localTime62.secondOfMinute();
        org.joda.time.Interval interval64 = property63.toInterval();
        org.joda.time.LocalTime localTime65 = property63.roundFloorCopy();
        org.joda.time.LocalTime localTime66 = property63.withMaximumValue();
        org.joda.time.LocalTime localTime68 = localTime66.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        org.joda.time.LocalTime localTime75 = localTime68.withField(dateTimeFieldType73, (int) '4');
        int int76 = localTime58.get(dateTimeFieldType73);
        boolean boolean77 = localTime50.isEqual((org.joda.time.ReadablePartial) localTime58);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime(dateTimeZone78);
        org.joda.time.LocalTime.Property property80 = localTime79.secondOfMinute();
        org.joda.time.Interval interval81 = property80.toInterval();
        org.joda.time.LocalTime localTime82 = property80.roundFloorCopy();
        org.joda.time.LocalTime localTime84 = property80.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property80.getFieldType();
        int int86 = property80.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property80.getFieldType();
        boolean boolean88 = localTime50.isSupported(dateTimeFieldType87);
        boolean boolean89 = localTime42.isSupported(dateTimeFieldType87);
        boolean boolean90 = localTime14.isSupported(dateTimeFieldType87);
        org.joda.time.LocalTime localTime92 = localTime14.minusSeconds(53);
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
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(localTime75);
// flaky:         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 15 + "'", int76 == 15);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 59 + "'", int86 == 59);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(localTime92);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime9.toString(dateTimeFormatter10);
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds(32);
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime17.withPeriodAdded(readablePeriod31, 54);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime17.plus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime17.plusHours(40);
        org.joda.time.LocalTime localTime38 = localTime9.withFields((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime.Property property39 = localTime37.millisOfSecond();
        org.joda.time.LocalTime localTime40 = property39.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.041" + "'", str11, "00:00:00.041");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        int int8 = localTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        int int14 = property11.getMinimumValueOverall();
        org.joda.time.LocalTime localTime15 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.LocalTime localTime21 = localTime19.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.LocalTime localTime24 = localTime21.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime24.withPeriodAdded(readablePeriod25, 54);
        int int28 = localTime24.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime24.toDateTimeToday(dateTimeZone29);
        boolean boolean31 = property11.equals((java.lang.Object) localTime24);
        java.lang.String str32 = property11.getAsString();
        org.joda.time.LocalTime localTime33 = property11.roundHalfFloorCopy();
        int int34 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7156000 + "'", int8 == 7156000);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "16" + "'", str32, "16");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    @Ignore
  public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime7.minusHours(10);
        org.joda.time.Chronology chronology27 = localTime7.getChronology();
        org.joda.time.LocalTime localTime29 = localTime7.plusSeconds((-1606255412));
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(17, 5);
        boolean boolean33 = localTime29.isBefore((org.joda.time.ReadablePartial) localTime32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime35 = localTime29.withMinuteOfHour(437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 437 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
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
        org.joda.time.LocalTime localTime29 = localTime22.withField(dateTimeFieldType27, (int) '4');
        int int30 = localTime12.get(dateTimeFieldType27);
        boolean boolean31 = localTime4.isEqual((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DurationFieldType durationFieldType32 = null;
        boolean boolean33 = localTime12.isSupported(durationFieldType32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime12.plus(readablePeriod34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime23 = localTime21.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology24);
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime29 = localTime27.plusMillis(6898000);
        boolean boolean30 = localTime1.isEqual((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = localTime29.toString(dateTimeFormatter31);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.LocalTime localTime42 = localTime40.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology43);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology43);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(chronology43);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology43);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (short) 100, chronology43);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(chronology43);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        org.joda.time.LocalTime localTime55 = property52.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime59 = property58.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        int int61 = localTime55.get(dateTimeFieldType60);
        org.joda.time.LocalTime.Property property62 = localTime49.property(dateTimeFieldType60);
        org.joda.time.LocalTime.Property property63 = localTime29.property(dateTimeFieldType60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime65 = property63.setCopy(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "01:54:58.001" + "'", str32, "01:54:58.001");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 16 + "'", int61 == 16);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(54);
        java.util.Locale locale9 = null;
        java.lang.String str10 = localTime7.toString("54", locale9);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology25);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology25);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology25);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.now(chronology25);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) 7032644, chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) "54", chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"54\": Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "54" + "'", str10, "54");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property9 = localTime4.minuteOfHour();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        int int19 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime21 = localTime18.plusHours((int) (short) 0);
        int int22 = localTime21.getHourOfDay();
        boolean boolean23 = property9.equals((java.lang.Object) localTime21);
        org.joda.time.LocalTime localTime24 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime25 = property9.roundCeilingCopy();
        org.joda.time.LocalTime.Property property26 = localTime25.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "59" + "'", str10, "59");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606259158), 7174974, 7103162);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606259158 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        org.joda.time.LocalTime localTime18 = localTime1.minusMinutes(59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime18.withPeriodAdded(readablePeriod21, 802);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
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
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "01:00:16.434" + "'", str20, "01:00:16.434");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology8);
        java.lang.String str11 = localTime10.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = localTime10.toString("01:58:35.037", locale13);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.032" + "'", str11, "00:00:00.032");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "01:58:35.037" + "'", str14, "01:58:35.037");
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    @Ignore
  public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.util.Locale locale6 = null;
        org.joda.time.LocalTime localTime7 = property2.setCopy("44", locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        int int12 = property10.get();
        org.joda.time.LocalTime localTime14 = property10.setCopy((int) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime20.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.LocalTime localTime31 = localTime20.plusSeconds(32);
        org.joda.time.LocalTime localTime33 = localTime20.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.LocalTime localTime38 = property36.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localTime38.isSupported(durationFieldType39);
        boolean boolean41 = localTime33.isEqual((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localTime38.toDateTimeToday(dateTimeZone42);
        int int44 = property10.getDifference((org.joda.time.ReadableInstant) dateTime43);
        int int45 = property2.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalTime localTime46 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime48 = localTime46.withSecondOfMinute(55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField50 = localTime48.getField((-1606262399));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606262399");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1606262399) + "'", int44 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1606262399) + "'", int45 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
    }

    @Test
    @Ignore
  public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(22);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime localTime11 = localTime8.plusSeconds(987);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(7044000, 19, 878, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7044000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        org.joda.time.LocalTime localTime12 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property2.addWrapFieldToCopy(12);
        org.joda.time.LocalTime localTime15 = property2.withMinimumValue();
        org.joda.time.DurationField durationField16 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16" + "'", str9, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16" + "'", str11, "16");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    @Ignore
  public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime7.minusHours(10);
        org.joda.time.Chronology chronology27 = localTime7.getChronology();
        org.joda.time.LocalTime localTime29 = localTime7.plusSeconds((-1606255412));
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(17, 5);
        boolean boolean33 = localTime29.isBefore((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime29.minus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime35.minusMinutes(7140070);
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
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsString();
        java.lang.String str8 = property2.getAsShortText();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        java.lang.String str10 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16" + "'", str7, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16" + "'", str8, "16");
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16" + "'", str10, "16");
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        int int8 = property2.get();
        boolean boolean9 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.Chronology chronology28 = localTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property31.withMaximumValue();
        org.joda.time.LocalTime localTime36 = localTime34.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.LocalTime localTime43 = localTime36.withField(dateTimeFieldType41, (int) '4');
        int int44 = localTime26.get(dateTimeFieldType41);
        boolean boolean45 = localTime11.isAfter((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime48 = localTime11.withPeriodAdded(readablePeriod46, 42);
        org.joda.time.DateTime dateTime49 = localTime48.toDateTimeToday();
        int int50 = property2.compareTo((org.joda.time.ReadableInstant) dateTime49);
        java.lang.String str51 = property2.getName();
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTimeToday(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.Interval interval59 = property58.toInterval();
        org.joda.time.LocalTime localTime60 = property58.roundFloorCopy();
        org.joda.time.LocalTime localTime61 = property58.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(dateTimeZone62);
        org.joda.time.LocalTime.Property property64 = localTime63.secondOfMinute();
        org.joda.time.LocalTime localTime65 = property64.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property64.getFieldType();
        int int67 = localTime61.get(dateTimeFieldType66);
        int int68 = localTime53.get(dateTimeFieldType66);
        boolean boolean69 = property2.equals((java.lang.Object) dateTimeFieldType66);
        org.joda.time.LocalTime localTime70 = property2.roundFloorCopy();
        java.util.Locale locale72 = null;
        org.joda.time.LocalTime localTime73 = property2.setCopy("31", locale72);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "secondOfMinute" + "'", str51, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 17 + "'", int67 == 17);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime73);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, 54);
        int int12 = localTime8.getSecondOfMinute();
        org.joda.time.LocalTime localTime14 = localTime8.minusMillis((int) 'a');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime14.getFieldTypes();
        org.joda.time.LocalTime localTime17 = localTime14.withHourOfDay(14);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfDay(862);
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis(7046564);
        org.joda.time.LocalTime localTime23 = localTime19.minusSeconds(40);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        org.joda.time.LocalTime localTime12 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property2.addWrapFieldToCopy(12);
        org.joda.time.LocalTime localTime15 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime17 = property2.addNoWrapToCopy(37);
        java.util.Locale locale18 = null;
        int int19 = property2.getMaximumTextLength(locale18);
        org.joda.time.DurationField durationField20 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "17" + "'", str9, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17" + "'", str11, "17");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        int int23 = localTime6.getSecondOfMinute();
        org.joda.time.LocalTime.Property property24 = localTime6.secondOfMinute();
        java.lang.String str25 = property24.toString();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumShortTextLength(locale26);
        org.joda.time.DurationField durationField28 = property24.getDurationField();
        org.joda.time.DurationField durationField29 = property24.getRangeDurationField();
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
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Property[secondOfMinute]" + "'", str25, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = localTime15.get(dateTimeFieldType20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime15.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        boolean boolean30 = property27.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime32 = property27.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.LocalTime localTime40 = property38.roundFloorCopy();
        int int41 = localTime34.compareTo((org.joda.time.ReadablePartial) localTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.LocalTime localTime45 = property44.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        boolean boolean47 = localTime34.isSupported(dateTimeFieldType46);
        org.joda.time.LocalTime localTime49 = localTime32.withField(dateTimeFieldType46, 2);
        boolean boolean50 = localTime15.isSupported(dateTimeFieldType46);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localTime52.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.LocalTime localTime59 = property57.roundFloorCopy();
        org.joda.time.LocalTime localTime60 = property57.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone61);
        org.joda.time.LocalTime.Property property63 = localTime62.secondOfMinute();
        org.joda.time.LocalTime localTime64 = property63.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        int int66 = localTime60.get(dateTimeFieldType65);
        int int67 = localTime52.get(dateTimeFieldType65);
        org.joda.time.LocalTime.Property property68 = localTime15.property(dateTimeFieldType65);
        org.joda.time.LocalTime localTime70 = localTime1.withField(dateTimeFieldType65, 7);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.LocalTime localTime74 = property73.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property73.getFieldType();
        org.joda.time.LocalTime localTime76 = property73.withMinimumValue();
        org.joda.time.LocalTime localTime77 = new org.joda.time.LocalTime((java.lang.Object) localTime76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = localTime77.toString(dateTimeFormatter78);
        int int80 = localTime77.getMinuteOfHour();
        boolean boolean81 = localTime70.isAfter((org.joda.time.ReadablePartial) localTime77);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 17 + "'", int66 == 17);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(localTime76);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "01:59:00.302" + "'", str79, "01:59:00.302");
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 59 + "'", int80 == 59);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        java.lang.String str9 = property2.getName();
        java.lang.String str10 = property2.toString();
        org.joda.time.Interval interval11 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[secondOfMinute]" + "'", str10, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime9 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = property12.addCopy(59);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        boolean boolean29 = localTime15.isSupported(dateTimeFieldType27);
        org.joda.time.LocalTime localTime30 = localTime9.withFields((org.joda.time.ReadablePartial) localTime15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 18 + "'", int28 == 18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(6975000);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime18 = localTime16.plusMinutes((int) ' ');
        boolean boolean19 = localTime12.isBefore((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime21 = localTime12.plusSeconds(7051533);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        int int25 = localTime7.getHourOfDay();
        org.joda.time.LocalTime localTime27 = localTime7.withHourOfDay(0);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(45);
        org.joda.time.LocalTime localTime12 = localTime10.plusMillis((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime10.getFieldType(7078884);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7078884");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(413L, chronology9);
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 100);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
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
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds(53);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addWrapFieldToCopy(6976095);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds(53);
        org.joda.time.LocalTime.Property property8 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        int int10 = property8.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsString();
        java.lang.String str8 = property2.getAsShortText();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        int int11 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "18" + "'", str7, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "18" + "'", str8, "18");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        int int10 = localTime8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = property19.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        int int32 = localTime25.compareTo((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        boolean boolean38 = localTime25.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime.Property property39 = localTime23.property(dateTimeFieldType37);
        org.joda.time.LocalTime localTime40 = localTime14.withFields((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        int int45 = property43.get();
        org.joda.time.LocalTime localTime47 = property43.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime48 = property43.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.LocalTime localTime53 = property51.roundFloorCopy();
        org.joda.time.LocalTime localTime55 = property51.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property51.getFieldType();
        int int57 = localTime48.indexOf(dateTimeFieldType56);
        boolean boolean58 = localTime23.isSupported(dateTimeFieldType56);
        boolean boolean59 = localTime8.isSupported(dateTimeFieldType56);
        org.joda.time.LocalTime.Property property60 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property60.setCopy(43);
        org.joda.time.LocalTime localTime64 = property60.addWrapFieldToCopy(9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 18 + "'", int45 == 18);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime5.withPeriodAdded(readablePeriod19, 54);
        org.joda.time.LocalTime localTime23 = localTime5.minusHours((-1606262399));
        org.joda.time.LocalTime.Property property24 = localTime5.millisOfDay();
        org.joda.time.DurationField durationField25 = property24.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime.Property property15 = localTime14.millisOfDay();
        org.joda.time.LocalTime localTime16 = localTime10.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime14.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
    }

    @Test
    @Ignore
  public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        boolean boolean15 = property11.isLeap();
        java.lang.String str16 = property11.getAsString();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime22.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.LocalTime localTime33 = localTime22.plusSeconds(32);
        org.joda.time.LocalTime localTime35 = localTime22.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.LocalTime localTime40 = property38.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType41 = null;
        boolean boolean42 = localTime40.isSupported(durationFieldType41);
        boolean boolean43 = localTime35.isEqual((org.joda.time.ReadablePartial) localTime40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localTime40.toDateTimeToday(dateTimeZone44);
        long long46 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        int int47 = property2.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "18" + "'", str8, "18");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "18" + "'", str16, "18");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 18 + "'", int28 == 18);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1606262399L) + "'", long46 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        long long7 = property2.remainder();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(28);
        org.joda.time.DateTime dateTime11 = localTime8.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 621L + "'", long7 == 621L);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("34");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"34\": Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime9.toString(dateTimeFormatter10);
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds(32);
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime17.withPeriodAdded(readablePeriod31, 54);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime17.plus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime17.plusHours(40);
        org.joda.time.LocalTime localTime38 = localTime9.withFields((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime37.minusMinutes(35);
        org.joda.time.LocalTime localTime42 = localTime40.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime44 = localTime40.minus(readablePeriod43);
        org.joda.time.LocalTime localTime46 = localTime40.plusSeconds(7044000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.041" + "'", str11, "00:00:00.041");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', 7148000, 7102413, 42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("3");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100, chronology10);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        org.joda.time.LocalTime.Property property29 = localTime16.property(dateTimeFieldType27);
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        java.lang.String str31 = property29.getAsShortText();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "18" + "'", str31, "18");
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
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.withMillisOfDay(39);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime();
        int int20 = localTime19.getHourOfDay();
        org.joda.time.LocalTime localTime22 = localTime19.plusSeconds(44);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime19.toDateTimeToday(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime19.secondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localTime19.getFieldTypes();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTimeToday(dateTimeZone29);
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
        int int43 = localTime28.get(dateTimeFieldType41);
        org.joda.time.LocalTime.Property property44 = localTime19.property(dateTimeFieldType41);
        org.joda.time.LocalTime.Property property45 = localTime5.property(dateTimeFieldType41);
        org.joda.time.DurationField durationField46 = property45.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 19 + "'", int42 == 19);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(durationField46);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = property2.addCopy(45);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime12 = property10.addCopy(559L);
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
        org.joda.time.LocalTime localTime29 = localTime18.plusSeconds(32);
        org.joda.time.LocalTime localTime31 = localTime18.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime31.minus(readablePeriod32);
        int int34 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(54);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology26);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology26);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(chronology26);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology26);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology26);
        int[] intArray32 = localTime31.getValues();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        long long37 = property35.remainder();
        int int38 = property35.getLeapAmount();
        org.joda.time.LocalTime localTime39 = property35.withMinimumValue();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) localTime39);
        boolean boolean41 = localTime31.equals((java.lang.Object) localTime39);
        org.joda.time.LocalTime localTime43 = localTime39.withHourOfDay(9);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType49 = null;
        boolean boolean50 = localTime48.isSupported(durationFieldType49);
        org.joda.time.LocalTime localTime52 = localTime48.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime54 = localTime48.minusMillis((int) '4');
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime56 = localTime54.minus(readablePeriod55);
        boolean boolean57 = localTime39.isEqual((org.joda.time.ReadablePartial) localTime54);
        boolean boolean58 = localTime12.equals((java.lang.Object) boolean57);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 10, 57]");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 278L + "'", long37 == 278L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime9.toString(dateTimeFormatter10);
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
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds(32);
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime17.withPeriodAdded(readablePeriod31, 54);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime17.plus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime17.plusHours(40);
        org.joda.time.LocalTime localTime38 = localTime9.withFields((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime9.plusMinutes((int) (byte) 10);
        org.joda.time.Chronology chronology41 = localTime9.getChronology();
        int[] intArray42 = localTime9.getValues();
        org.joda.time.LocalTime.Property property43 = localTime9.secondOfMinute();
        org.joda.time.DurationField durationField44 = property43.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.041" + "'", str11, "00:00:00.041");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 41]");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(durationField44);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime5.withPeriodAdded(readablePeriod19, 54);
        org.joda.time.LocalTime localTime23 = localTime5.minusHours((-1606262399));
        org.joda.time.LocalTime.Property property24 = localTime5.millisOfDay();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property24.getAsShortText(locale25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7159000" + "'", str26, "7159000");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        org.joda.time.LocalTime localTime16 = localTime7.plusMillis(54536000);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime16.toDateTimeToday(dateTimeZone17);
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
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(54);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        boolean boolean18 = property15.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime20 = property15.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = localTime22.toString(dateTimeFormatter23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime30.withPeriodAdded(readablePeriod44, 54);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime30.plus(readablePeriod47);
        org.joda.time.LocalTime localTime50 = localTime30.plusHours(40);
        org.joda.time.LocalTime localTime51 = localTime22.withFields((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.LocalTime localTime53 = localTime22.plusMinutes((int) (byte) 10);
        org.joda.time.LocalTime localTime54 = localTime12.withFields((org.joda.time.ReadablePartial) localTime53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType56 = localTime53.getFieldType(170);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 170");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00:00:00.041" + "'", str24, "00:00:00.041");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime54);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.joda.time.LocalTime localTime39 = localTime22.withField(dateTimeFieldType36, 2);
        boolean boolean40 = localTime5.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = localTime50.get(dateTimeFieldType55);
        int int57 = localTime42.get(dateTimeFieldType55);
        org.joda.time.LocalTime.Property property58 = localTime5.property(dateTimeFieldType55);
        org.joda.time.LocalTime localTime60 = localTime5.withSecondOfMinute(55);
        org.joda.time.LocalTime.Property property61 = localTime5.secondOfMinute();
        java.lang.Class<?> wildcardClass62 = property61.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        java.lang.String str9 = property2.getName();
        org.joda.time.DateTimeField dateTimeField10 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("25", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        int int11 = property9.getMinimumValueOverall();
        boolean boolean12 = localTime6.equals((java.lang.Object) int11);
        int int13 = localTime6.size();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime6.withPeriodAdded(readablePeriod14, 9301000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 576, chronology9);
        int int16 = localTime15.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localTime15.isSupported(durationFieldType17);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 7126000);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:54:00.034");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis(33);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond(13);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology18);
        boolean boolean20 = localTime8.equals((java.lang.Object) chronology18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology13);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology13);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime18.withPeriodAdded(readablePeriod19, 490);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addCopy(59);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        boolean boolean11 = property8.equals((java.lang.Object) false);
        int int12 = property8.getLeapAmount();
        int int13 = property8.getLeapAmount();
        org.joda.time.LocalTime localTime14 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime15 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.withMaximumValue();
        org.joda.time.LocalTime localTime23 = localTime21.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.LocalTime localTime30 = localTime23.withField(dateTimeFieldType28, (int) '4');
        org.joda.time.LocalTime localTime32 = localTime23.plusMillis(54536000);
        int int33 = property8.compareTo((org.joda.time.ReadablePartial) localTime32);
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
        org.joda.time.LocalTime.Property property49 = localTime48.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        int int54 = property52.get();
        org.joda.time.LocalTime localTime56 = property52.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime57 = property52.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.Interval interval61 = property60.toInterval();
        org.joda.time.LocalTime localTime62 = property60.roundFloorCopy();
        org.joda.time.LocalTime localTime64 = property60.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property60.getFieldType();
        int int66 = localTime57.indexOf(dateTimeFieldType65);
        org.joda.time.LocalTime localTime68 = localTime57.withMillisOfSecond(42);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime74 = property71.setCopy("46");
        org.joda.time.DurationField durationField75 = property71.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property71.getFieldType();
        int int77 = localTime68.indexOf(dateTimeFieldType76);
        org.joda.time.LocalTime.Property property78 = localTime48.property(dateTimeFieldType76);
        int int79 = localTime32.get(dateTimeFieldType76);
        boolean boolean80 = localTime5.isEqual((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime82 = localTime32.minusMillis(28);
        org.joda.time.LocalTime localTime84 = localTime32.plusMinutes(7044000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 55 + "'", int79 == 55);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime84);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property2.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
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
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsString();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("44", locale9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds(30);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20" + "'", str7, "20");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.LocalTime localTime17 = localTime15.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) '4');
        int int25 = localTime7.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime7.withMinuteOfHour(41);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime30 = localTime27.plusMinutes(20);
        org.joda.time.LocalTime localTime32 = localTime30.plusSeconds(7136094);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        boolean boolean6 = property3.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField7 = property3.getDurationField();
        java.lang.String str8 = property3.getAsString();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property3.setCopy("44", locale10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) 544L, chronology12);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        boolean boolean16 = property2.equals((java.lang.Object) dateTimeField15);
        org.joda.time.LocalTime localTime18 = property2.setCopy("57");
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds(6988017);
        org.joda.time.LocalTime.Property property21 = localTime18.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.lang.String str22 = property20.toString();
        org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property20.setCopy(0);
        int int26 = property20.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfDay]" + "'", str22, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 86399999 + "'", int26 == 86399999);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.minusMinutes(100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime.Property property15 = localTime14.millisOfDay();
        org.joda.time.LocalTime localTime16 = localTime10.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime.Property property17 = localTime10.minuteOfHour();
        org.joda.time.LocalTime localTime19 = localTime10.withSecondOfMinute(3);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime10.plus(readablePeriod20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.plusSeconds(44);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime1.secondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localTime1.getFieldTypes();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTimeToday(dateTimeZone11);
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
        int int25 = localTime10.get(dateTimeFieldType23);
        org.joda.time.LocalTime.Property property26 = localTime1.property(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime34 = property30.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property30.getFieldType();
        int int36 = property30.getMaximumValue();
        org.joda.time.LocalTime localTime38 = property30.setCopy(45);
        org.joda.time.LocalTime localTime40 = localTime38.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology41 = localTime38.getChronology();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 0, chronology41);
        boolean boolean43 = localTime1.equals((java.lang.Object) chronology41);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((long) 47, chronology41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        int int49 = property47.get();
        org.joda.time.LocalTime localTime51 = property47.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField52 = property47.getDurationField();
        java.lang.String str53 = property47.getAsString();
        org.joda.time.LocalTime localTime55 = property47.addCopy(50);
        org.joda.time.Interval interval56 = property47.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property47.getFieldType();
        int int58 = localTime44.indexOf(dateTimeFieldType57);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 59 + "'", int36 == 59);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(durationField52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "20" + "'", str53, "20");
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    @Ignore
  public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime12.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.LocalTime localTime23 = localTime12.plusSeconds(32);
        org.joda.time.LocalTime localTime25 = localTime12.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localTime30.isSupported(durationFieldType31);
        boolean boolean33 = localTime25.isEqual((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime30.toDateTimeToday(dateTimeZone34);
        int int36 = property2.getDifference((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property2.getMaximumValue();
        java.lang.String str38 = property2.getName();
        org.joda.time.LocalTime localTime39 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime40 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime41 = property2.getLocalTime();
        org.joda.time.LocalTime localTime42 = property2.roundHalfFloorCopy();
        java.util.Locale locale43 = null;
        java.lang.String str44 = property2.getAsText(locale43);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1606262399) + "'", int36 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "secondOfMinute" + "'", str38, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "21" + "'", str44, "21");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        int int26 = property24.get();
        org.joda.time.LocalTime localTime28 = property24.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime30 = property24.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) localTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = localTime36.isSupported(durationFieldType37);
        org.joda.time.LocalTime localTime40 = localTime36.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property41 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime42 = localTime31.withFields((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        int int47 = property45.get();
        org.joda.time.LocalTime localTime49 = property45.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime51 = property45.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((java.lang.Object) localTime51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.getLocalTime();
        org.joda.time.LocalTime localTime57 = property55.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = localTime57.isSupported(durationFieldType58);
        org.joda.time.LocalTime localTime61 = localTime57.plusMillis((int) (short) 100);
        org.joda.time.LocalTime.Property property62 = localTime57.hourOfDay();
        org.joda.time.LocalTime localTime63 = localTime52.withFields((org.joda.time.ReadablePartial) localTime57);
        org.joda.time.LocalTime localTime65 = localTime52.minusSeconds(10);
        boolean boolean66 = localTime36.isAfter((org.joda.time.ReadablePartial) localTime52);
        org.joda.time.DateTime dateTime67 = localTime36.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            int int68 = property20.getDifference((org.joda.time.ReadableInstant) dateTime67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1606262400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 21 + "'", int26 == 21);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 21 + "'", int47 == 21);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime67);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime17 = property15.roundHalfCeilingCopy();
        java.lang.String str18 = property15.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property8.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = localTime14.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime.Property property28 = localTime12.property(dateTimeFieldType26);
        org.joda.time.LocalTime localTime29 = localTime3.withFields((org.joda.time.ReadablePartial) localTime12);
        boolean boolean31 = localTime12.equals((java.lang.Object) 25L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        boolean boolean24 = localTime11.isSupported(dateTimeFieldType23);
        boolean boolean25 = localTime7.isSupported(dateTimeFieldType23);
        org.joda.time.LocalTime localTime27 = localTime7.minusHours(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField29 = localTime7.getField(974);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 974");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        org.joda.time.DateTime dateTime15 = localTime5.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    @Ignore
  public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.setCopy("46");
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        boolean boolean16 = property12.isLeap();
        java.lang.String str17 = property12.getAsString();
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
        org.joda.time.LocalTime localTime34 = localTime23.plusSeconds(32);
        org.joda.time.LocalTime localTime36 = localTime23.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.LocalTime localTime40 = property39.getLocalTime();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType42 = null;
        boolean boolean43 = localTime41.isSupported(durationFieldType42);
        boolean boolean44 = localTime36.isEqual((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localTime41.toDateTimeToday(dateTimeZone45);
        long long47 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime46);
        int int48 = property12.get();
        int int49 = property12.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.LocalTime localTime54 = property52.roundFloorCopy();
        org.joda.time.LocalTime localTime55 = property52.withMaximumValue();
        boolean boolean56 = property52.isLeap();
        java.lang.String str57 = property52.getAsString();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.Interval interval61 = property60.toInterval();
        org.joda.time.LocalTime localTime62 = property60.roundFloorCopy();
        org.joda.time.LocalTime localTime63 = property60.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime.Property property66 = localTime65.secondOfMinute();
        org.joda.time.LocalTime localTime67 = property66.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property66.getFieldType();
        int int69 = localTime63.get(dateTimeFieldType68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalTime localTime72 = localTime63.withPeriodAdded(readablePeriod70, 0);
        org.joda.time.LocalTime localTime74 = localTime63.plusSeconds(32);
        org.joda.time.LocalTime localTime76 = localTime63.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(dateTimeZone77);
        org.joda.time.LocalTime.Property property79 = localTime78.secondOfMinute();
        org.joda.time.LocalTime localTime80 = property79.getLocalTime();
        org.joda.time.LocalTime localTime81 = property79.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType82 = null;
        boolean boolean83 = localTime81.isSupported(durationFieldType82);
        boolean boolean84 = localTime76.isEqual((org.joda.time.ReadablePartial) localTime81);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateTime dateTime86 = localTime81.toDateTimeToday(dateTimeZone85);
        long long87 = property52.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime86);
        int int88 = property12.getDifference((org.joda.time.ReadableInstant) dateTime86);
        int int89 = property2.compareTo((org.joda.time.ReadableInstant) dateTime86);
        java.util.Locale locale90 = null;
        int int91 = property2.getMaximumTextLength(locale90);
        org.joda.time.DurationField durationField92 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21" + "'", str17, "21");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1606262399L) + "'", long47 == (-1606262399L));
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 21 + "'", int48 == 21);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "21" + "'", str57, "21");
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 22 + "'", int69 == 22);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1606262399L) + "'", long87 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1606262399) + "'", int88 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertNull(durationField92);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        boolean boolean13 = localTime5.equals((java.lang.Object) 774L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property16.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = localTime19.get(dateTimeFieldType24);
        boolean boolean26 = localTime5.isBefore((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = localTime5.toString(dateTimeFormatter27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFormatter27, dateTimeZone29);
        int[] intArray31 = localTime30.getValues();
        org.joda.time.LocalTime.Property property32 = localTime30.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime30.withPeriodAdded(readablePeriod33, 670);
        int int36 = localTime35.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "01:59:22.000" + "'", str28, "01:59:22.000");
        org.junit.Assert.assertNotNull(intArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 59, 21, 752]");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy((int) (byte) 1);
        int int7 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21" + "'", str7, "21");
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "21" + "'", str10, "21");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DurationField durationField14 = property12.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        boolean boolean16 = property2.equals((java.lang.Object) dateTimeField15);
        org.joda.time.DurationField durationField17 = property2.getRangeDurationField();
        java.lang.String str18 = property2.getAsString();
        org.joda.time.DurationField durationField19 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22" + "'", str9, "22");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "22" + "'", str18, "22");
        org.junit.Assert.assertNull(durationField19);
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
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, 54);
        org.joda.time.LocalTime localTime13 = localTime11.minusMinutes(310);
        java.util.Locale locale15 = null;
        java.lang.String str16 = localTime11.toString("01:56:00.997", locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime22.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.LocalTime localTime33 = localTime22.plusSeconds(32);
        org.joda.time.LocalTime localTime35 = localTime22.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime35.minus(readablePeriod36);
        org.joda.time.LocalTime localTime39 = localTime37.withMinuteOfHour(39);
        int int40 = localTime37.getMinuteOfHour();
        org.joda.time.LocalTime localTime42 = localTime37.withMillisOfSecond(0);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = localTime42.isSupported(durationFieldType43);
        int int45 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "01:56:00.997" + "'", str16, "01:56:00.997");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 59 + "'", int40 == 59);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(537, 23, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 537 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property2.addNoWrapToCopy(36164000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22" + "'", str9, "22");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1, 44);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        int int7 = property5.get();
        int int8 = property5.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property5.addNoWrapToCopy(35);
        boolean boolean11 = localTime2.isBefore((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        int int16 = property14.get();
        org.joda.time.LocalTime localTime18 = property14.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime20 = property14.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime22 = property14.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(0);
        org.joda.time.LocalTime localTime26 = localTime22.withSecondOfMinute(59);
        boolean boolean27 = localTime2.isAfter((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime2.minus(readablePeriod28);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.addCopy(59);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalTime localTime10 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DurationField durationField12 = property8.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 368L + "'", long4 == 368L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) -1, chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(963L, chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) ' ', chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 7026000, chronology13);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        boolean boolean22 = property19.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime24 = property19.addCopy((int) (byte) 0);
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
        org.joda.time.LocalTime localTime41 = localTime24.withField(dateTimeFieldType38, 2);
        org.joda.time.LocalTime localTime43 = localTime16.withField(dateTimeFieldType38, 38);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        java.lang.String str8 = property2.getAsString();
        int int9 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField10 = property2.getLeapDurationField();
        int int11 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "22" + "'", str8, "22");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.setCopy("46");
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("20", locale10);
        int int12 = localTime11.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(544L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        org.joda.time.LocalTime localTime11 = property8.withMaximumValue();
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumTextLength(locale12);
        java.util.Locale locale15 = null;
        org.joda.time.LocalTime localTime16 = property8.setCopy("11", locale15);
        int int17 = localTime16.getMillisOfDay();
        int int18 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.DateTime dateTime28 = localTime20.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = localTime20.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime20.withPeriodAdded(readablePeriod31, 37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localTime20.getFieldTypes();
        org.joda.time.LocalTime localTime36 = localTime20.minusHours(55);
        org.joda.time.DateTime dateTime37 = localTime20.toDateTimeToday();
        org.joda.time.DateTime dateTime38 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7151745 + "'", int17 == 7151745);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "01:59:22.745" + "'", str30, "01:59:22.745");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        int int7 = localTime6.getMillisOfSecond();
        org.joda.time.LocalTime.Property property8 = localTime6.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 913 + "'", int7 == 913);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.setCopy("46");
        java.lang.String str7 = property2.toString();
        org.joda.time.LocalTime localTime9 = property2.addCopy(942L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[secondOfMinute]" + "'", str7, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = localTime12.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime18 = localTime15.withPeriodAdded(readablePeriod16, 54);
        int int19 = localTime15.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime15.toDateTimeToday(dateTimeZone20);
        boolean boolean22 = property2.equals((java.lang.Object) localTime15);
        java.lang.String str23 = property2.getAsString();
        org.joda.time.LocalTime localTime24 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime25 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 23 + "'", int19 == 23);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "23" + "'", str23, "23");
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        boolean boolean24 = localTime11.isSupported(dateTimeFieldType23);
        boolean boolean25 = localTime7.isSupported(dateTimeFieldType23);
        org.joda.time.LocalTime localTime27 = localTime7.minusHours(16);
        org.joda.time.Chronology chronology28 = localTime7.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        org.joda.time.LocalTime.Property property15 = localTime7.hourOfDay();
        java.util.Locale locale16 = null;
        int int17 = property15.getMaximumShortTextLength(locale16);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("00:00:00.041");
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, 36);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
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
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("11", locale9);
        int int11 = localTime10.getMillisOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime10.withFieldAdded(durationFieldType12, 7010478);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7151297 + "'", int11 == 7151297);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 59);
        int int8 = localTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7222363 + "'", int8 == 7222363);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        boolean boolean7 = property4.isLeap();
        org.joda.time.LocalTime localTime8 = property4.roundHalfFloorCopy();
        int int9 = property4.get();
        org.joda.time.LocalTime localTime10 = property4.roundHalfEvenCopy();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(3399032L, chronology11);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(544L, chronology11);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6898000, 460, 170, (-446183));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6898000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, 54);
        int int12 = localTime8.getSecondOfMinute();
        org.joda.time.LocalTime localTime14 = localTime8.minusMillis((int) 'a');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime14.getFieldTypes();
        org.joda.time.LocalTime localTime17 = localTime14.withHourOfDay(14);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfDay(862);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsShortText(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property20.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.Interval interval9 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(825, 987, 7121000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 825 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.LocalTime localTime8 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localTime8.getFields();
        org.joda.time.LocalTime.Property property12 = localTime8.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 59);
        int int8 = localTime7.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology15);
        org.joda.time.LocalTime localTime19 = localTime17.withSecondOfMinute(19);
        org.joda.time.LocalTime localTime21 = localTime19.minusMinutes(4);
        org.joda.time.LocalTime localTime23 = localTime19.minusSeconds(7148000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7222724 + "'", int8 == 7222724);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    @Ignore
  public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(56);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localTime15.isSupported(durationFieldType16);
        org.joda.time.LocalTime localTime19 = localTime15.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime21 = localTime15.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime23 = localTime15.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime25 = localTime15.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime25.minus(readablePeriod28);
        boolean boolean30 = property2.equals((java.lang.Object) localTime29);
        java.lang.String str31 = property2.getAsText();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime37 = localTime35.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.LocalTime localTime40 = localTime37.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime43 = localTime40.withPeriodAdded(readablePeriod41, 54);
        int int44 = localTime40.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localTime40.toDateTimeToday(dateTimeZone45);
        long long47 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "01:58:48.000" + "'", str27, "01:58:48.000");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "23" + "'", str31, "23");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 23 + "'", int44 == 23);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1606257120L) + "'", long47 == (-1606257120L));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalTime localTime25 = property22.addWrapFieldToCopy((-1));
        org.joda.time.LocalTime.Property property26 = localTime25.millisOfDay();
        java.util.Locale locale27 = null;
        int int28 = property26.getMaximumShortTextLength(locale27);
        java.util.Locale locale29 = null;
        int int30 = property26.getMaximumShortTextLength(locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = property33.getMinimumValueOverall();
        org.joda.time.LocalTime localTime37 = property33.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime39 = localTime37.minusMinutes(22);
        int int40 = property26.compareTo((org.joda.time.ReadablePartial) localTime37);
        int int41 = property26.getMaximumValue();
        org.joda.time.DurationField durationField42 = property26.getLeapDurationField();
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
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 86399999 + "'", int41 == 86399999);
        org.junit.Assert.assertNull(durationField42);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.joda.time.LocalTime localTime39 = localTime22.withField(dateTimeFieldType36, 2);
        boolean boolean40 = localTime5.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.Interval interval48 = property47.toInterval();
        org.joda.time.LocalTime localTime49 = property47.roundFloorCopy();
        org.joda.time.LocalTime localTime50 = property47.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = localTime50.get(dateTimeFieldType55);
        int int57 = localTime42.get(dateTimeFieldType55);
        org.joda.time.LocalTime.Property property58 = localTime5.property(dateTimeFieldType55);
        org.joda.time.LocalTime localTime60 = localTime5.withSecondOfMinute(55);
        org.joda.time.LocalTime.Property property61 = localTime5.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime63 = localTime5.withMinuteOfHour(566);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 566 for minuteOfHour must be in the range [0,59]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 24 + "'", int11 == 24);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 24 + "'", int56 == 24);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy((int) (byte) 1);
        java.lang.String str8 = localTime6.toString("00:00:00.010");
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00:00:00.010" + "'", str8, "00:00:00.010");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
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
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) -1, chronology20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology20);
        boolean boolean23 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime25 = localTime7.plusSeconds(13);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.LocalTime localTime31 = property28.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) localTime31);
        int int33 = localTime32.getSecondOfMinute();
        boolean boolean34 = localTime7.equals((java.lang.Object) int33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime7.toDateTimeToday(dateTimeZone35);
        org.joda.time.Chronology chronology37 = localTime7.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        java.lang.String str7 = property2.getAsShortText();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        java.lang.String str9 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = localTime15.get(dateTimeFieldType20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime15.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.LocalTime localTime26 = localTime15.plusSeconds(32);
        org.joda.time.LocalTime localTime28 = localTime15.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType34 = null;
        boolean boolean35 = localTime33.isSupported(durationFieldType34);
        boolean boolean36 = localTime28.isEqual((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime33.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property41.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime46 = property41.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime47 = property41.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.Interval interval51 = property50.toInterval();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        org.joda.time.LocalTime localTime53 = property50.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.LocalTime localTime57 = property56.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property56.getFieldType();
        int int59 = localTime53.get(dateTimeFieldType58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime62 = localTime53.withPeriodAdded(readablePeriod60, 0);
        org.joda.time.LocalTime localTime64 = localTime62.minusMinutes(46);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = localTime64.toDateTimeToday(dateTimeZone65);
        int int67 = property41.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime68 = localTime33.toDateTime((org.joda.time.ReadableInstant) dateTime66);
        int int69 = property2.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24" + "'", str9, "24");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 24 + "'", int59 == 24);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property6.getFieldType();
        boolean boolean9 = property6.isLeap();
        org.joda.time.LocalTime localTime10 = property6.roundHalfFloorCopy();
        int int11 = property6.get();
        org.joda.time.LocalTime localTime12 = property6.roundHalfEvenCopy();
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(7148000, 6988017, 359, 7018000, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7148000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 24 + "'", int11 == 24);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    @Ignore
  public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        java.lang.String str7 = property2.getAsString();
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
        org.joda.time.LocalTime localTime24 = localTime13.plusSeconds(32);
        org.joda.time.LocalTime localTime26 = localTime13.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType32 = null;
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        boolean boolean34 = localTime26.isEqual((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime31.toDateTimeToday(dateTimeZone35);
        long long37 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean38 = property2.isLeap();
        org.joda.time.LocalTime localTime39 = property2.roundCeilingCopy();
        int int41 = localTime39.getValue(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24" + "'", str7, "24");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25 + "'", int19 == 25);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1606262399L) + "'", long37 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        java.lang.String str12 = property2.getAsShortText();
        int int13 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime14 = property2.getLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24" + "'", str9, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "24" + "'", str12, "24");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    @Ignore
  public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 54);
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        java.lang.String str10 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DurationField durationField15 = property13.getRangeDurationField();
        java.lang.String str16 = property13.toString();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10);
        boolean boolean19 = property13.equals((java.lang.Object) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime25.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.LocalTime localTime36 = localTime25.plusSeconds(32);
        org.joda.time.LocalTime localTime38 = localTime25.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType44 = null;
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        boolean boolean46 = localTime38.isEqual((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime43.toDateTimeToday(dateTimeZone47);
        int int49 = property13.getDifference((org.joda.time.ReadableInstant) dateTime48);
        int int50 = property2.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[secondOfMinute]" + "'", str16, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 25 + "'", int31 == 25);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1606262399) + "'", int49 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1606262399) + "'", int50 == (-1606262399));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        org.joda.time.LocalTime localTime14 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.LocalTime localTime19 = localTime15.minusMinutes((-1));
        boolean boolean20 = property2.equals((java.lang.Object) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.LocalTime localTime30 = localTime28.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology31);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology31);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology31);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology31);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) 100, chronology31);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology31);
        int int38 = property2.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.LocalTime localTime40 = localTime37.withMillisOfSecond(173);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "01:59:00.069" + "'", str17, "01:59:00.069");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsText(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "25" + "'", str10, "25");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(45);
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        java.lang.String str12 = property2.getAsText();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property2.getAsShortText(locale13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25" + "'", str14, "25");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.LocalTime localTime17 = localTime15.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) '4');
        int int25 = localTime7.get(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime7.withMinuteOfHour(41);
        org.joda.time.LocalTime localTime29 = localTime27.plusMillis((-1606262399));
        int int30 = localTime27.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = localTime27.withHourOfDay(6970000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6970000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25 + "'", int25 == 25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41 + "'", int30 == 41);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property2.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(559L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime13 = localTime7.withFields((org.joda.time.ReadablePartial) localTime11);
        int int14 = localTime11.getMinuteOfHour();
        int int15 = localTime11.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localTime11.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 565 + "'", int15 == 565);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(45);
        org.joda.time.LocalTime localTime12 = localTime10.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology13 = localTime10.getChronology();
        int[] intArray14 = localTime10.getValues();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        int int23 = localTime16.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTime dateTime24 = localTime16.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = localTime16.toString(dateTimeFormatter25);
        org.joda.time.LocalTime localTime28 = localTime16.plusSeconds((int) 'a');
        boolean boolean29 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 59, 45, 662]");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:59:25.662" + "'", str26, "01:59:25.662");
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 170, dateTimeZone1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 32, chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(670L, chronology13);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(0, 10, (int) (byte) 10, 57, chronology13);
        int[] intArray19 = localTime18.getValues();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        long long24 = property22.remainder();
        int int25 = property22.getLeapAmount();
        org.joda.time.LocalTime localTime26 = property22.withMinimumValue();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) localTime26);
        boolean boolean28 = localTime18.equals((java.lang.Object) localTime26);
        org.joda.time.LocalTime localTime30 = localTime18.withSecondOfMinute(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField32 = localTime30.getField(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 10, 10, 57]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 885L + "'", long24 == 885L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(404L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime12.isSupported(durationFieldType13);
        org.joda.time.LocalTime localTime16 = localTime12.plusMillis((int) (short) 100);
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime19 = property2.addCopy(25L);
        org.joda.time.LocalTime localTime20 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime21 = property2.roundHalfCeilingCopy();
        java.lang.String str22 = property2.getName();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property2.getAsText(locale23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 986L + "'", long4 == 986L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "secondOfMinute" + "'", str22, "secondOfMinute");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "25" + "'", str24, "25");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(784, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 784 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) 54);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        boolean boolean13 = property10.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime15 = property10.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfDay(41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localTime17.toString(dateTimeFormatter18);
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
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime25.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.LocalTime localTime36 = localTime25.plusSeconds(32);
        org.joda.time.LocalTime localTime38 = localTime25.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime41 = localTime25.withPeriodAdded(readablePeriod39, 54);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime25.plus(readablePeriod42);
        org.joda.time.LocalTime localTime45 = localTime25.plusHours(40);
        org.joda.time.LocalTime localTime46 = localTime17.withFields((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.LocalTime localTime48 = localTime17.plusMinutes((int) (byte) 10);
        org.joda.time.Chronology chronology49 = localTime17.getChronology();
        org.joda.time.LocalTime localTime51 = localTime17.withMinuteOfHour(9);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology52);
        org.joda.time.LocalTime localTime55 = localTime53.plusHours(328);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "00:00:00.041" + "'", str19, "00:00:00.041");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 26 + "'", int31 == 26);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localTime55);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        int int5 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime6 = property2.roundHalfCeilingCopy();
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
        org.joda.time.LocalTime localTime20 = localTime6.withField(dateTimeFieldType17, 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.LocalTime localTime26 = property23.addCopy(59);
        org.joda.time.LocalTime localTime27 = property23.roundCeilingCopy();
        org.joda.time.LocalTime localTime28 = localTime20.withFields((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.LocalTime localTime30 = localTime28.minusMinutes(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType32 = localTime30.getFieldType(670);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 670");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime5.getFieldTypes();
        org.joda.time.LocalTime.Property property20 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime21 = property20.roundFloorCopy();
        java.lang.String str22 = property20.toString();
        org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property20.setCopy(0);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        java.lang.String str27 = property26.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfDay]" + "'", str22, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addCopy(59);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        boolean boolean11 = property8.equals((java.lang.Object) false);
        int int12 = property8.getLeapAmount();
        int int13 = property8.getLeapAmount();
        org.joda.time.LocalTime localTime14 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime15 = property8.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.withMaximumValue();
        org.joda.time.LocalTime localTime23 = localTime21.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.LocalTime localTime30 = localTime23.withField(dateTimeFieldType28, (int) '4');
        org.joda.time.LocalTime localTime32 = localTime23.plusMillis(54536000);
        int int33 = property8.compareTo((org.joda.time.ReadablePartial) localTime32);
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
        org.joda.time.LocalTime.Property property49 = localTime48.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        int int54 = property52.get();
        org.joda.time.LocalTime localTime56 = property52.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime57 = property52.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.Interval interval61 = property60.toInterval();
        org.joda.time.LocalTime localTime62 = property60.roundFloorCopy();
        org.joda.time.LocalTime localTime64 = property60.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property60.getFieldType();
        int int66 = localTime57.indexOf(dateTimeFieldType65);
        org.joda.time.LocalTime localTime68 = localTime57.withMillisOfSecond(42);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime74 = property71.setCopy("46");
        org.joda.time.DurationField durationField75 = property71.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property71.getFieldType();
        int int77 = localTime68.indexOf(dateTimeFieldType76);
        org.joda.time.LocalTime.Property property78 = localTime48.property(dateTimeFieldType76);
        int int79 = localTime32.get(dateTimeFieldType76);
        boolean boolean80 = localTime5.isEqual((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime localTime82 = localTime32.minusMillis(28);
        org.joda.time.DateTime dateTime83 = localTime82.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 26 + "'", int45 == 26);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 26 + "'", int54 == 26);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 55 + "'", int79 == 55);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(56);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localTime15.isSupported(durationFieldType16);
        org.joda.time.LocalTime localTime19 = localTime15.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime21 = localTime15.plusSeconds((int) (short) 1);
        org.joda.time.LocalTime localTime23 = localTime15.withMillisOfDay((int) '4');
        org.joda.time.LocalTime localTime25 = localTime15.minusSeconds(35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime25.minus(readablePeriod28);
        boolean boolean30 = property2.equals((java.lang.Object) localTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField32 = localTime29.getField(974);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 974");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "01:58:51.000" + "'", str27, "01:58:51.000");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(605L);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(0);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        int int9 = property8.getMinimumValueOverall();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("00:00:00.041");
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 36);
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
        org.joda.time.LocalTime.Property property32 = localTime13.property(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localTime13.toDateTimeToday(dateTimeZone33);
        long long35 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localTime13);
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
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1606255200L) + "'", long35 == (-1606255200L));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        long long10 = property8.remainder();
        int int11 = property8.getLeapAmount();
        org.joda.time.LocalTime localTime12 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime13 = property8.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.LocalTime localTime22 = localTime18.plusMillis((int) (short) 100);
        int int23 = property8.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalTime localTime24 = property8.roundFloorCopy();
        int int25 = property2.compareTo((org.joda.time.ReadablePartial) localTime24);
        int int26 = localTime24.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = localTime24.isSupported(durationFieldType27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21L + "'", long10 == 21L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27 + "'", int26 == 27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 35);
        org.junit.Assert.assertNotNull(localTime1);
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
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(32);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime18.minus(readablePeriod19);
        org.joda.time.LocalTime localTime22 = localTime20.withMinuteOfHour(39);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime30.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.LocalTime localTime41 = localTime30.plusSeconds(32);
        org.joda.time.LocalTime localTime43 = localTime30.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType49 = null;
        boolean boolean50 = localTime48.isSupported(durationFieldType49);
        boolean boolean51 = localTime43.isEqual((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localTime48.toDateTimeToday(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(dateTimeZone54);
        org.joda.time.LocalTime.Property property56 = localTime55.secondOfMinute();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalTime localTime58 = property56.roundFloorCopy();
        org.joda.time.LocalTime localTime59 = property56.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime61 = property56.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime62 = property56.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.Interval interval66 = property65.toInterval();
        org.joda.time.LocalTime localTime67 = property65.roundFloorCopy();
        org.joda.time.LocalTime localTime68 = property65.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        int int74 = localTime68.get(dateTimeFieldType73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime68.withPeriodAdded(readablePeriod75, 0);
        org.joda.time.LocalTime localTime79 = localTime77.minusMinutes(46);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = localTime79.toDateTimeToday(dateTimeZone80);
        int int82 = property56.compareTo((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime83 = localTime48.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.DateTime dateTime84 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = localTime22.getValue(913);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 913");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27 + "'", int36 == 27);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 27 + "'", int74 == 27);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime84);
    }

    @Test
    @Ignore
  public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime12.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.LocalTime localTime23 = localTime12.plusSeconds(32);
        org.joda.time.LocalTime localTime25 = localTime12.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType31 = null;
        boolean boolean32 = localTime30.isSupported(durationFieldType31);
        boolean boolean33 = localTime25.isEqual((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime30.toDateTimeToday(dateTimeZone34);
        int int36 = property2.getDifference((org.joda.time.ReadableInstant) dateTime35);
        int int37 = property2.getMaximumValue();
        java.lang.String str38 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        java.util.Locale locale45 = null;
        org.joda.time.LocalTime localTime46 = property41.setCopy("44", locale45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        int int51 = property49.get();
        org.joda.time.LocalTime localTime53 = property49.setCopy((int) (byte) 10);
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
        org.joda.time.LocalTime localTime70 = localTime59.plusSeconds(32);
        org.joda.time.LocalTime localTime72 = localTime59.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime(dateTimeZone73);
        org.joda.time.LocalTime.Property property75 = localTime74.secondOfMinute();
        org.joda.time.LocalTime localTime76 = property75.getLocalTime();
        org.joda.time.LocalTime localTime77 = property75.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType78 = null;
        boolean boolean79 = localTime77.isSupported(durationFieldType78);
        boolean boolean80 = localTime72.isEqual((org.joda.time.ReadablePartial) localTime77);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = localTime77.toDateTimeToday(dateTimeZone81);
        int int83 = property49.getDifference((org.joda.time.ReadableInstant) dateTime82);
        int int84 = property41.getDifference((org.joda.time.ReadableInstant) dateTime82);
        int int85 = property2.getDifference((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1606262399) + "'", int36 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 59 + "'", int37 == 59);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "secondOfMinute" + "'", str38, "secondOfMinute");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 27 + "'", int51 == 27);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 27 + "'", int65 == 27);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1606262399) + "'", int83 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1606262399) + "'", int84 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1606262399) + "'", int85 == (-1606262399));
    }
}
