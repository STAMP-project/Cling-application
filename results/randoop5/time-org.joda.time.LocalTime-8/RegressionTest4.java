import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
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
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        boolean boolean5 = property2.isLeap();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        long long5 = property3.remainder();
        int int6 = property3.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property3.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(160L, chronology17);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(0L, chronology17);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) localTime7, chronology17);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(522L, chronology17);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 787L + "'", long5 == 787L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsText(locale7);
        org.joda.time.LocalTime localTime10 = property2.addCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTimeToday(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime10.minuteOfHour();
        long long14 = property13.remainder();
        boolean boolean15 = property13.isLeap();
        org.joda.time.LocalTime localTime16 = property13.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime18 = property13.addWrapFieldToCopy(6822100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "17" + "'", str8, "17");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 27810L + "'", long14 == 27810L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime10 = property2.addNoWrapToCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime11 = property2.withMaximumValue();
        int int12 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime13 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime14 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.getMaximumValue();
        org.joda.time.DurationField durationField20 = property17.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        int int32 = localTime26.get(dateTimeFieldType31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime26.withPeriodAdded(readablePeriod33, 0);
        org.joda.time.LocalTime localTime37 = localTime26.plusSeconds(25);
        org.joda.time.LocalTime localTime39 = localTime26.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.LocalTime localTime43 = property42.getLocalTime();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = localTime44.isSupported(durationFieldType45);
        boolean boolean47 = localTime39.isEqual((org.joda.time.ReadablePartial) localTime44);
        java.lang.String str49 = localTime39.toString("00:00:00.036");
        org.joda.time.LocalTime localTime51 = localTime39.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((java.lang.Object) localTime39);
        org.joda.time.LocalTime.Property property53 = localTime39.secondOfMinute();
        int int54 = property53.getMaximumValue();
        org.joda.time.LocalTime localTime56 = property53.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime58 = property53.addWrapFieldToCopy(101);
        java.lang.String str59 = property53.getAsText();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.LocalTime localTime66 = property65.getLocalTime();
        org.joda.time.LocalTime localTime68 = localTime66.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology69);
        org.joda.time.LocalTime localTime71 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology69);
        org.joda.time.LocalTime localTime72 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 1, chronology69);
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime(chronology69);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalTime localTime75 = localTime73.minus(readablePeriod74);
        java.lang.String str77 = localTime73.toString("01:52:00.985");
        int int78 = localTime73.getHourOfDay();
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.fromMillisOfDay(205L);
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.DateTime dateTime82 = localTime80.toDateTimeToday(dateTimeZone81);
        org.joda.time.DateTime dateTime83 = localTime73.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        int int84 = property53.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int85 = property17.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int86 = property2.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 18 + "'", int32 == 18);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "00:00:00.036" + "'", str49, "00:00:00.036");
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "18" + "'", str59, "18");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "01:52:00.985" + "'", str77, "01:52:00.985");
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    @Ignore
  public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
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
        org.joda.time.LocalTime localTime25 = localTime14.plusSeconds(25);
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
        int int38 = property5.getDifference((org.joda.time.ReadableInstant) dateTime37);
        int int39 = property2.compareTo((org.joda.time.ReadableInstant) dateTime37);
        int int40 = property2.get();
        org.joda.time.LocalTime localTime41 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime42 = property2.roundHalfFloorCopy();
        java.lang.String str43 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1606262399) + "'", int38 == (-1606262399));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 17 + "'", int40 == 17);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "17" + "'", str43, "17");
    }

    @Test
    @Ignore
  public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        org.joda.time.LocalTime localTime23 = localTime16.withField(dateTimeFieldType21, (int) '4');
        boolean boolean24 = localTime1.isAfter((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType30 = null;
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.LocalTime localTime33 = localTime29.plusMillis((int) (short) 100);
        boolean boolean34 = localTime23.isEqual((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime33.withPeriodAdded(readablePeriod35, (-1));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1), 717, 78892486);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.String str4 = property2.getAsText();
        java.lang.String str5 = property2.getAsText();
        org.joda.time.LocalTime localTime7 = property2.setCopy("45");
        org.joda.time.LocalTime localTime9 = property2.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale11 = null;
        org.joda.time.LocalTime localTime12 = property2.setCopy("40", locale11);
        org.joda.time.Interval interval13 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "18" + "'", str4, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18" + "'", str5, "18");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(822);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime12.withPeriodAdded(readablePeriod13, (-1606262400));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    @Ignore
  public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(160L, chronology8);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        int int20 = localTime13.compareTo((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        boolean boolean26 = localTime13.isSupported(dateTimeFieldType25);
        org.joda.time.LocalTime localTime28 = localTime13.minusMinutes(0);
        int int29 = localTime13.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime35 = property32.withMaximumValue();
        org.joda.time.LocalTime localTime37 = localTime35.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        org.joda.time.LocalTime localTime44 = localTime37.withField(dateTimeFieldType42, (int) '4');
        org.joda.time.DateTime dateTime45 = localTime44.toDateTimeToday();
        boolean boolean46 = localTime13.isAfter((org.joda.time.ReadablePartial) localTime44);
        org.joda.time.LocalTime.Property property47 = localTime44.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime50 = localTime44.withPeriodAdded(readablePeriod48, 26);
        boolean boolean51 = localTime10.equals((java.lang.Object) 26);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 18 + "'", int29 == 18);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        int int2 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime localTime4 = localTime1.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime6 = localTime1.minusMillis(53);
        int int7 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property8.setCopy("100");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(2);
        org.joda.time.LocalTime localTime10 = property2.addNoWrapToCopy((int) (byte) 10);
        int int11 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = localTime17.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        int int35 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        boolean boolean41 = localTime28.isSupported(dateTimeFieldType40);
        org.joda.time.LocalTime.Property property42 = localTime26.property(dateTimeFieldType40);
        int int43 = localTime19.get(dateTimeFieldType40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime45 = localTime12.withField(dateTimeFieldType40, (-1606255383));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255383 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 18 + "'", int43 == 18);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy(941L);
        org.joda.time.DateTimeField dateTimeField8 = localTime6.getField(0);
        java.lang.Object obj9 = null;
        boolean boolean10 = localTime6.equals(obj9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(29, 6936100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(205L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        int int8 = property6.getMaximumValue();
        org.joda.time.DurationField durationField9 = property6.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property6.getFieldType();
        org.joda.time.LocalTime.Property property11 = localTime1.property(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        org.joda.time.Interval interval7 = property2.toInterval();
        int int8 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime9.toDateTimeToday(dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime9.plusHours(28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        long long6 = property2.remainder();
        int int7 = property2.getMinimumValueOverall();
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 340L + "'", long4 == 340L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 340L + "'", long6 == 340L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondOfMinute" + "'", str8, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.lang.String str5 = property2.getAsString();
        org.joda.time.LocalTime localTime7 = property2.setCopy("39");
        org.joda.time.LocalTime localTime9 = property2.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18" + "'", str5, "18");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        java.lang.String str12 = localTime10.toString("36");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = localTime10.toString(dateTimeFormatter13);
        org.joda.time.LocalTime localTime16 = localTime10.withMinuteOfHour(48);
        org.joda.time.DateTime dateTime17 = localTime10.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "36" + "'", str12, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "01:57:19.000" + "'", str14, "01:57:19.000");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
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
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property24.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property44 = localTime28.property(dateTimeFieldType42);
        int int45 = localTime21.get(dateTimeFieldType42);
        int int46 = localTime14.indexOf(dateTimeFieldType42);
        java.lang.String str47 = localTime14.toString();
        org.joda.time.LocalTime localTime49 = localTime14.plusSeconds(0);
        org.joda.time.LocalTime.Property property50 = localTime49.millisOfDay();
        java.util.Locale locale51 = null;
        int int52 = property50.getMaximumTextLength(locale51);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
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
        org.junit.Assert.assertNotNull(property44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 18 + "'", int45 == 18);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "01:57:18.000" + "'", str47, "01:57:18.000");
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 8 + "'", int52 == 8);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property29 = localTime13.property(dateTimeFieldType27);
        int int30 = localTime6.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology31 = localTime6.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology31);
        int int33 = localTime32.getMinuteOfHour();
        int int34 = localTime32.size();
        org.joda.time.LocalTime localTime36 = localTime32.minusMinutes(6848100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
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
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18 + "'", int30 == 18);
        org.junit.Assert.assertNotNull(chronology31);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 57 + "'", int33 == 57);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(localTime36);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(205L);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        java.lang.String str4 = localTime1.toString("55");
        boolean boolean6 = localTime1.equals((java.lang.Object) 940L);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 441L, dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        java.util.Locale locale4 = null;
        int int5 = property3.getMaximumTextLength(locale4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    @Ignore
  public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusSeconds(32);
        int[] intArray8 = localTime7.getValues();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        int int13 = property11.get();
        org.joda.time.LocalTime localTime15 = property11.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime16 = localTime7.withFields((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) localTime7, dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.LocalTime localTime24 = property21.withMinimumValue();
        org.joda.time.LocalTime localTime26 = property21.addCopy((long) 31);
        java.util.Locale locale27 = null;
        java.lang.String str28 = property21.getAsText(locale27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime34 = localTime32.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(chronology35);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((java.lang.Object) locale27, chronology35);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime40 = localTime37.withPeriodAdded(readablePeriod38, (int) (byte) 0);
        int int41 = localTime40.size();
        int[] intArray42 = localTime40.getValues();
        org.joda.time.LocalTime localTime44 = localTime40.withSecondOfMinute(28);
        int int45 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime44);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 56, 47, 0]");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18 + "'", int13 == 18);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "18" + "'", str28, "18");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(intArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 57, 18, 612]");
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("26");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"26\": Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.minusHours(454);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        boolean boolean5 = property2.isLeap();
        java.lang.String str6 = property2.getName();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = property2.addCopy(7019433);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    @Ignore
  public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        long long12 = property10.remainder();
        int int13 = property10.getLeapAmount();
        java.lang.String str14 = property10.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.get();
        org.joda.time.LocalTime localTime21 = property17.addCopy((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        int int26 = property24.get();
        org.joda.time.LocalTime localTime28 = property24.setCopy((int) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime43 = localTime34.withPeriodAdded(readablePeriod41, 0);
        org.joda.time.LocalTime localTime45 = localTime34.plusSeconds(25);
        org.joda.time.LocalTime localTime47 = localTime34.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime.Property property50 = localTime49.secondOfMinute();
        org.joda.time.LocalTime localTime51 = property50.getLocalTime();
        org.joda.time.LocalTime localTime52 = property50.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType53 = null;
        boolean boolean54 = localTime52.isSupported(durationFieldType53);
        boolean boolean55 = localTime47.isEqual((org.joda.time.ReadablePartial) localTime52);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localTime52.toDateTimeToday(dateTimeZone56);
        int int58 = property24.getDifference((org.joda.time.ReadableInstant) dateTime57);
        long long59 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        int int60 = property10.getDifference((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime61 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalTime localTime63 = localTime7.withMillisOfDay(6831100);
        int int64 = localTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 714L + "'", long12 == 714L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "18" + "'", str14, "18");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 18 + "'", int19 == 18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 18 + "'", int26 == 18);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1606262399) + "'", int58 == (-1606262399));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1606262399L) + "'", long59 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1606262399) + "'", int60 == (-1606262399));
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(localTime63);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 714 + "'", int64 == 714);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property29 = localTime13.property(dateTimeFieldType27);
        int int30 = localTime6.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology31 = localTime6.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology31);
        org.joda.time.LocalTime localTime34 = localTime32.withMillisOfDay(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = localTime34.withSecondOfMinute(6964952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6964952 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
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
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18 + "'", int30 == 18);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(7031100, 44, (-1606262400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7031100 for hourOfDay must be in the range [0,23]");
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
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
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
        org.joda.time.LocalTime.Property property17 = localTime4.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        org.joda.time.LocalTime localTime20 = property17.setCopy(34);
        org.joda.time.LocalTime localTime21 = property17.roundHalfCeilingCopy();
        java.lang.String str22 = property17.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "18" + "'", str22, "18");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(160L, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(0L, chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(723L, chronology10);
        org.joda.time.LocalTime localTime17 = localTime15.plusHours(6802100);
        org.joda.time.LocalTime.Property property18 = localTime15.millisOfDay();
        org.joda.time.LocalTime.Property property19 = localTime15.hourOfDay();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    @Ignore
  public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.getMaximumValue();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
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
        org.joda.time.LocalTime localTime23 = localTime12.plusSeconds(25);
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
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property36.getLocalTime();
        org.joda.time.LocalTime localTime39 = localTime37.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(chronology40);
        boolean boolean42 = localTime25.isAfter((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        int int47 = property45.get();
        org.joda.time.LocalTime localTime49 = property45.setCopy((int) (byte) 10);
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
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalTime localTime64 = localTime55.withPeriodAdded(readablePeriod62, 0);
        org.joda.time.LocalTime localTime66 = localTime55.plusSeconds(25);
        org.joda.time.LocalTime localTime68 = localTime55.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.LocalTime localTime72 = property71.getLocalTime();
        org.joda.time.LocalTime localTime73 = property71.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType74 = null;
        boolean boolean75 = localTime73.isSupported(durationFieldType74);
        boolean boolean76 = localTime68.isEqual((org.joda.time.ReadablePartial) localTime73);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateTime dateTime78 = localTime73.toDateTimeToday(dateTimeZone77);
        int int79 = property45.getDifference((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTime dateTime80 = localTime25.toDateTime((org.joda.time.ReadableInstant) dateTime78);
        int int81 = property2.compareTo((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.LocalTime localTime83 = property2.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = localTime83.toDateTimeToday(dateTimeZone84);
        org.joda.time.LocalTime localTime87 = localTime83.plusHours(5);
        org.joda.time.DurationFieldType durationFieldType88 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime90 = localTime83.withFieldAdded(durationFieldType88, 6827100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(chronology40);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 18 + "'", int47 == 18);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 19 + "'", int61 == 19);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1606262399) + "'", int79 == (-1606262399));
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(localTime87);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(160L, chronology8);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.LocalTime localTime13 = property11.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMillis(521);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.lang.String str5 = property2.getAsString();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, 52);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime15 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) localTime15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localTime16.toString(dateTimeFormatter17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = localTime16.toString("3", locale20);
        int int22 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property25.withMaximumValue();
        boolean boolean29 = property25.isLeap();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.LocalTime localTime35 = localTime33.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology36);
        org.joda.time.LocalTime localTime39 = localTime37.withMillisOfDay((int) (short) 1);
        java.lang.String str40 = localTime39.toString();
        org.joda.time.LocalTime localTime42 = localTime39.minusHours(19);
        boolean boolean43 = property25.equals((java.lang.Object) localTime39);
        boolean boolean44 = localTime16.isBefore((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.LocalTime localTime46 = localTime39.plusSeconds(98);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18" + "'", str5, "18");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "01:57:00.913" + "'", str18, "01:57:00.913");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3" + "'", str21, "3");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "00:00:00.001" + "'", str40, "00:00:00.001");
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localTime46);
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
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) (short) -1);
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
        org.joda.time.LocalTime.Property property29 = localTime13.property(dateTimeFieldType27);
        int int30 = localTime6.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology31 = localTime6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime38 = property37.getLocalTime();
        org.joda.time.LocalTime localTime40 = localTime38.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology41);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(10L, chronology41);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay(436L, chronology41);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) localTime6, chronology41);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.parse("01:53:54.000");
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfSecond(0);
        boolean boolean50 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
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
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18 + "'", int30 == 18);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime7.withPeriodAdded(readablePeriod8, 1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        org.joda.time.LocalTime localTime17 = property16.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((-1606262399));
        boolean boolean20 = localTime7.equals((java.lang.Object) localTime19);
        org.joda.time.Chronology chronology21 = localTime7.getChronology();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology21);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology21);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 26, chronology24);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now(chronology24);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    @Ignore
  public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology16);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology16);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 1, chronology16);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology16);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime20.minus(readablePeriod21);
        boolean boolean23 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.LocalTime localTime25 = localTime20.plusMinutes(3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.lang.String str5 = property2.getAsString();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, 52);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds(55);
        int int12 = localTime11.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localTime11.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19" + "'", str5, "19");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    @Ignore
  public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        int int12 = property10.get();
        org.joda.time.LocalTime localTime14 = property10.addCopy((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.get();
        org.joda.time.LocalTime localTime21 = property17.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime36 = localTime27.withPeriodAdded(readablePeriod34, 0);
        org.joda.time.LocalTime localTime38 = localTime27.plusSeconds(25);
        org.joda.time.LocalTime localTime40 = localTime27.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = localTime45.isSupported(durationFieldType46);
        boolean boolean48 = localTime40.isEqual((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localTime45.toDateTimeToday(dateTimeZone49);
        int int51 = property17.getDifference((org.joda.time.ReadableInstant) dateTime50);
        long long52 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        int int53 = property2.getDifference((org.joda.time.ReadableInstant) dateTime50);
        int int54 = property2.get();
        org.joda.time.Interval interval55 = property2.toInterval();
        org.joda.time.LocalTime localTime56 = property2.roundHalfCeilingCopy();
        int int57 = localTime56.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1606262399) + "'", int51 == (-1606262399));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1606262399L) + "'", long52 == (-1606262399L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1606262399) + "'", int53 == (-1606262399));
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 19 + "'", int54 == 19);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(7031100, 7, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7031100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        long long5 = property3.remainder();
        int int6 = property3.getLeapAmount();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = property3.getDifference(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        org.joda.time.LocalTime localTime14 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        int int16 = localTime15.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        boolean boolean22 = property19.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime24 = property19.addCopy((int) (byte) 0);
        java.util.Locale locale25 = null;
        int int26 = property19.getMaximumShortTextLength(locale25);
        org.joda.time.LocalTime localTime27 = property19.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime29 = property19.addNoWrapToCopy(47);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.LocalTime localTime37 = localTime35.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology38);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(10L, chronology38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
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
        org.joda.time.LocalTime.Property property58 = localTime45.property(dateTimeFieldType56);
        boolean boolean59 = localTime40.isSupported(dateTimeFieldType56);
        int int60 = property19.compareTo((org.joda.time.ReadablePartial) localTime40);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.fromMillisOfDay((long) '4');
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = localTime62.toDateTimeToday(dateTimeZone63);
        int int65 = property19.getDifference((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime66 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        int int67 = property3.getDifference((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime73 = property71.roundFloorCopy();
        org.joda.time.LocalTime localTime74 = property71.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 1);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime(dateTimeZone78);
        org.joda.time.LocalTime.Property property80 = localTime79.secondOfMinute();
        org.joda.time.LocalTime localTime81 = property80.getLocalTime();
        org.joda.time.LocalTime localTime82 = property80.roundFloorCopy();
        org.joda.time.LocalTime.Property property83 = localTime82.millisOfSecond();
        org.joda.time.LocalTime localTime84 = property83.withMaximumValue();
        org.joda.time.LocalTime localTime86 = localTime84.plusSeconds((-1606262399));
        boolean boolean87 = localTime74.equals((java.lang.Object) localTime86);
        org.joda.time.Chronology chronology88 = localTime74.getChronology();
        org.joda.time.LocalTime localTime89 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology88);
        org.joda.time.LocalTime localTime90 = new org.joda.time.LocalTime(chronology88);
        org.joda.time.LocalTime localTime91 = new org.joda.time.LocalTime((java.lang.Object) dateTime66, chronology88);
        org.joda.time.LocalTime localTime92 = new org.joda.time.LocalTime(34L, chronology88);
        org.joda.time.LocalTime localTime93 = org.joda.time.LocalTime.now(chronology88);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 298L + "'", long5 == 298L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1606262400) + "'", int8 == (-1606262400));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 19 + "'", int57 == 19);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1606255360) + "'", int65 == (-1606255360));
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1606262381) + "'", int67 == (-1606262381));
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localTime81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(localTime86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(localTime93);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(10L, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(436L, chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime16 = property13.addWrapFieldToCopy((-1));
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.DateTime dateTime18 = localTime17.toDateTimeToday();
        org.joda.time.LocalTime localTime20 = localTime17.minusHours(6850100);
        boolean boolean21 = property13.equals((java.lang.Object) localTime20);
        boolean boolean23 = property13.equals((java.lang.Object) "02:28:25.290");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) '4');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime14.getFieldTypes();
        org.joda.time.LocalTime localTime17 = localTime14.minusSeconds(5);
        org.joda.time.LocalTime localTime19 = localTime14.plusHours(6850100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        java.lang.String str6 = property2.getAsString();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        boolean boolean9 = property2.equals((java.lang.Object) 934L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 652L + "'", long4 == 652L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    @Ignore
  public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime11 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 696L + "'", long4 == 696L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1606262400) + "'", int7 == (-1606262400));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property13.addCopy((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        boolean boolean32 = localTime19.isSupported(dateTimeFieldType31);
        org.joda.time.LocalTime.Property property33 = localTime17.property(dateTimeFieldType31);
        int int34 = localTime10.get(dateTimeFieldType31);
        org.joda.time.LocalTime.Property property35 = localTime10.minuteOfHour();
        int int36 = property2.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime.Property property37 = localTime10.millisOfDay();
        org.joda.time.LocalTime localTime38 = property37.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 19 + "'", int34 == 19);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
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
        org.joda.time.LocalTime localTime25 = localTime14.plusSeconds(25);
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
        org.joda.time.DateTime dateTime38 = localTime32.toDateTimeToday();
        org.joda.time.DateTime dateTime39 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        int int8 = property2.get();
        boolean boolean9 = property2.isLeap();
        org.joda.time.DurationField durationField10 = property2.getDurationField();
        org.joda.time.LocalTime localTime11 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumShortTextLength(locale8);
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime12 = property2.addNoWrapToCopy(47);
        org.joda.time.LocalTime localTime13 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.String str4 = property2.getAsText();
        java.lang.String str5 = property2.getAsText();
        org.joda.time.LocalTime localTime7 = property2.setCopy("45");
        org.joda.time.LocalTime localTime9 = property2.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.ReadablePartial readablePartial10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.withFields(readablePartial10);
        int[] intArray12 = localTime9.getValues();
        org.joda.time.LocalTime localTime14 = localTime9.plusMillis(6869010);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime9.plus(readablePeriod15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19" + "'", str4, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19" + "'", str5, "19");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 57, 59, 903]");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds((int) (short) 1);
        java.lang.String str12 = localTime10.toString("36");
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime10.isSupported(durationFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.get();
        org.joda.time.LocalTime localTime21 = property17.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField22 = property17.getDurationField();
        org.joda.time.LocalTime localTime24 = property17.setCopy("38");
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        int int29 = property27.get();
        org.joda.time.LocalTime localTime31 = property27.setCopy((int) (byte) 10);
        org.joda.time.DurationField durationField32 = property27.getDurationField();
        org.joda.time.LocalTime localTime33 = property27.roundHalfEvenCopy();
        boolean boolean34 = localTime24.isAfter((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.DateTime dateTime35 = localTime33.toDateTimeToday();
        boolean boolean36 = localTime10.isEqual((org.joda.time.ReadablePartial) localTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "36" + "'", str12, "36");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 19 + "'", int29 == 19);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(localTime33);
// flaky:         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfDay(36);
        boolean boolean14 = localTime2.isEqual((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.Chronology chronology15 = localTime13.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(268L, chronology15);
        int[] intArray17 = localTime16.getValues();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 268]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        int int8 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property2.addNoWrapToCopy(58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, 52);
        int[] intArray12 = localTime8.getValues();
        org.joda.time.LocalTime.Property property13 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 29, 20, 82]");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfSecond();
        java.lang.String str6 = localTime4.toString();
        org.joda.time.LocalTime localTime8 = localTime4.plusSeconds(39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localTime4.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:57:20.000" + "'", str6, "01:57:20.000");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(25);
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
        org.joda.time.LocalTime.Property property52 = localTime18.property(dateTimeFieldType48);
        org.joda.time.DurationField durationField53 = property52.getDurationField();
        org.joda.time.LocalTime localTime55 = property52.setCopy("20");
        org.joda.time.LocalTime localTime56 = property52.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime58 = property52.addWrapFieldToCopy(16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(localTime58);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay(36);
        org.joda.time.LocalTime localTime9 = localTime7.plusHours(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute((-1606341292));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606341292 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
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
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localTime6.toString(dateTimeFormatter7);
        org.joda.time.LocalTime localTime10 = localTime6.minusMinutes(1);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime6.isSupported(durationFieldType11);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01:57:00.195" + "'", str8, "01:57:00.195");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.lang.String str5 = property2.getAsString();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(25);
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.addWrapFieldToCopy(77);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "20" + "'", str5, "20");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfSecond();
        org.joda.time.LocalTime localTime6 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds((-1606262399));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        int int15 = localTime6.get(dateTimeFieldType14);
        org.joda.time.LocalTime.Property property16 = localTime6.millisOfDay();
        java.lang.String str17 = property16.getAsShortText();
        java.lang.String str18 = property16.getName();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.LocalTime localTime27 = localTime24.withHourOfDay(0);
        int[] intArray28 = localTime27.getValues();
        org.joda.time.DateTime dateTime29 = localTime27.toDateTimeToday();
        boolean boolean30 = property16.equals((java.lang.Object) dateTime29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7040999" + "'", str17, "7040999");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "millisOfDay" + "'", str18, "millisOfDay");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(intArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 29, 20, 257]");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("02:27:48.810");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 3, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime2.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(898);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime9.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumTextLength(locale24);
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
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds(25);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        boolean boolean26 = localTime18.isEqual((org.joda.time.ReadablePartial) localTime23);
        java.lang.String str28 = localTime18.toString("00:00:00.036");
        org.joda.time.LocalTime localTime30 = localTime18.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) localTime18);
        org.joda.time.LocalTime.Property property32 = localTime18.secondOfMinute();
        int int33 = property32.getMaximumValue();
        org.joda.time.LocalTime localTime35 = property32.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime37 = property32.addWrapFieldToCopy(101);
        long long38 = property32.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "00:00:00.036" + "'", str28, "00:00:00.036");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 59 + "'", int33 == 59);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        int[] intArray9 = localTime8.getValues();
        org.joda.time.LocalTime localTime11 = localTime8.minusMillis(7014100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 29, 20, 382]");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    @Ignore
  public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        int int7 = property6.getMinimumValue();
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
        org.joda.time.LocalTime localTime31 = localTime20.plusSeconds(25);
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
        long long45 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalTime localTime46 = property6.roundHalfFloorCopy();
        java.util.Locale locale47 = null;
        int int48 = property6.getMaximumShortTextLength(locale47);
        org.joda.time.LocalTime localTime49 = property6.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-26771040L) + "'", long45 == (-26771040L));
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(localTime49);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime5);
        int int7 = localTime6.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        boolean boolean13 = property10.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime15 = property10.addCopy((int) (byte) 0);
        java.util.Locale locale16 = null;
        int int17 = property10.getMaximumShortTextLength(locale16);
        org.joda.time.LocalTime localTime18 = property10.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime20 = property10.addNoWrapToCopy(47);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.LocalTime localTime28 = localTime26.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 10, chronology29);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(10L, chronology29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        int int48 = localTime42.get(dateTimeFieldType47);
        org.joda.time.LocalTime.Property property49 = localTime36.property(dateTimeFieldType47);
        boolean boolean50 = localTime31.isSupported(dateTimeFieldType47);
        int int51 = property10.compareTo((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.fromMillisOfDay((long) '4');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localTime53.toDateTimeToday(dateTimeZone54);
        int int56 = property10.getDifference((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime57 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime55);
        java.util.Locale locale59 = null;
        java.lang.String str60 = localTime6.toString("01:54:00.473", locale59);
        int int61 = localTime6.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1606255359) + "'", int56 == (-1606255359));
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "01:54:00.473" + "'", str60, "01:54:00.473");
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 454 + "'", int61 == 454);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        boolean boolean6 = property2.isLeap();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        long long13 = property11.remainder();
        int int14 = property11.getLeapAmount();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = property11.getLocalTime();
        org.joda.time.LocalTime localTime18 = localTime16.minusHours((int) (byte) 0);
        int int19 = property8.compareTo((org.joda.time.ReadablePartial) localTime18);
        boolean boolean21 = localTime18.equals((java.lang.Object) 45978L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 543L + "'", long13 == 543L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}
