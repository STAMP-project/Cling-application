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
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        java.lang.String str3 = property1.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.roundHalfEven();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = mutableDateTime11.toDateTimeISO();
        boolean boolean13 = mutableDateTime11.isEqualNow();
        int int14 = property1.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        java.util.Locale locale15 = null;
        int int16 = property1.getMaximumShortTextLength(locale15);
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = property1.compareTo(readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:37.297Z" + "'", str9, "2020-11-25T01:49:37.297Z");
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        int int9 = mutableDateTime4.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 6462346, dateTimeZone16);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:37.348Z" + "'", str6, "2020-11-25T01:49:37.348Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        mutableDateTime6.addMonths(10);
        boolean boolean16 = mutableDateTime6.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMinuteOfDay(6328693);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6328693 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.388Z" + "'", str4, "2020-11-25T01:49:37.388Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        mutableDateTime21.setChronology(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime21.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime13.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime53.add(readablePeriod54);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.441Z" + "'", str4, "2020-11-25T01:49:37.441Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:37.441Z" + "'", str18, "2020-11-25T01:49:37.441Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:37.441Z" + "'", str27, "2020-11-25T01:49:37.441Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:37.441Z" + "'", str37, "2020-11-25T01:49:37.441Z");
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:37.442Z" + "'", str45, "2020-11-25T01:49:37.442Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.weekOfWeekyear();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumShortTextLength(locale17);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.506Z" + "'", str4, "2020-11-25T01:49:37.506Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:37.506Z" + "'", str15, "2020-11-25T01:49:37.506Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = mutableDateTime2.isSupported(dateTimeFieldType3);
        mutableDateTime2.setMonthOfYear((int) (short) 10);
        mutableDateTime2.setWeekyear((-6408900));
        int int9 = mutableDateTime2.getMinuteOfDay();
        mutableDateTime2.setDate((long) 741);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        int int15 = mutableDateTime13.getWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.minuteOfHour();
        java.lang.String str17 = property16.getAsText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.620Z" + "'", str4, "2020-11-25T01:49:37.620Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "49" + "'", str17, "49");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = mutableDateTime2.isSupported(dateTimeFieldType3);
        mutableDateTime2.setMonthOfYear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfYear();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.lang.String str18 = mutableDateTime12.toString();
        mutableDateTime12.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime12.millisOfSecond();
        java.lang.String str22 = property21.toString();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.add((int) (short) 100);
        java.util.Locale locale25 = null;
        java.util.Calendar calendar26 = mutableDateTime24.toCalendar(locale25);
        int int27 = mutableDateTime24.getMillisOfSecond();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime24.getZone();
        long long30 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime24.centuryOfEra();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:37.658Z" + "'", str14, "2020-11-25T01:49:37.658Z");
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:37.658Z" + "'", str18, "2020-11-25T01:49:37.658Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Property[millisOfSecond]" + "'", str22, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1606262402758,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=2,MILLISECOND=758,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 758 + "'", int27 == 758);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-18318L) + "'", long30 == (-18318L));
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone7);
        mutableDateTime2.setZoneRetainFields(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.680Z", dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (-6347900), dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundHalfFloor();
        int int16 = mutableDateTime15.getHourOfDay();
        int int17 = mutableDateTime15.getYearOfCentury();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.733Z" + "'", str4, "2020-11-25T01:49:37.733Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:37.733Z" + "'", str8, "2020-11-25T01:49:37.733Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "733" + "'", str14, "733");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = mutableDateTime2.clone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setSecondOfDay((int) '#');
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        int int33 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property22.getFieldType();
        int int35 = mutableDateTime15.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.property(dateTimeFieldType34);
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.Interval interval38 = property36.toInterval();
        org.joda.time.MutableDateTime mutableDateTime39 = property36.roundFloor();
        org.joda.time.DurationField durationField40 = property36.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = property36.set(766);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 766 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.787Z" + "'", str4, "2020-11-25T01:49:37.787Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:37.787Z" + "'", str8, "2020-11-25T01:49:37.787Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "2020-11-25T00:00:02.787Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "2020-11-25T00:00:02.787Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "2020-11-25T00:00:02.787Z");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime6.minuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        mutableDateTime17.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime17.millisOfSecond();
        java.lang.String str27 = property26.toString();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        mutableDateTime34.add((long) (short) -1);
        mutableDateTime34.addDays(105);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime34.minuteOfDay();
        mutableDateTime30.setDate((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        int int52 = mutableDateTime49.getYearOfCentury();
        org.joda.time.Chronology chronology53 = mutableDateTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime54.dayOfYear();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime63 = org.joda.time.MutableDateTime.now(chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(chronology62);
        mutableDateTime54.setChronology(chronology62);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime68, dateTimeZone71);
        org.joda.time.DateTime dateTime73 = mutableDateTime72.toDateTimeISO();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = mutableDateTime76.toString(dateTimeFormatter77);
        int int79 = mutableDateTime76.getYearOfCentury();
        org.joda.time.Chronology chronology80 = mutableDateTime76.getChronology();
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime72.toMutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime54.toMutableDateTime(chronology80);
        org.joda.time.MutableDateTime mutableDateTime84 = mutableDateTime30.toMutableDateTime(chronology80);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime84.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField86 = property85.getField();
        int int87 = mutableDateTime6.get(dateTimeField86);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str4, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str19, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str23, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[millisOfSecond]" + "'", str27, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str36, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str51, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20 + "'", int52 == 20);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(property55);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str60, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str70, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "2020-11-25T01:49:37.825Z" + "'", str78, "2020-11-25T01:49:37.825Z");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 20 + "'", int79 == 20);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertNotNull(mutableDateTime83);
        org.junit.Assert.assertNotNull(mutableDateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeField86);
// flaky:         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 49 + "'", int87 == 49);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime13.getMinuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        int int22 = mutableDateTime21.getEra();
        boolean boolean23 = mutableDateTime21.isEqualNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.935Z" + "'", str4, "2020-11-25T01:49:37.935Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekyear();
        java.lang.String str22 = property21.getAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.972Z" + "'", str4, "2020-11-25T01:49:37.972Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:37.972Z" + "'", str12, "2020-11-25T01:49:37.972Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020" + "'", str22, "2020");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime13.toCalendar(locale14);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.024Z" + "'", str4, "2020-11-25T01:49:38.024Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1606268978024,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=38,MILLISECOND=24,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone5);
        mutableDateTime0.setZoneRetainFields(dateTimeZone5);
        mutableDateTime0.setMillisOfSecond((int) (short) 1);
        mutableDateTime0.setSecondOfMinute(10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime0.millisOfSecond();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime0.year();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime0.millisOfSecond();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        boolean boolean9 = property4.isLeap();
        int int10 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property4.addWrapField(53);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfCeiling();
        mutableDateTime20.addSeconds((int) (short) -1);
        boolean boolean23 = mutableDateTime20.isBeforeNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime20.toString(dateTimeFormatter24);
        int int26 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        long long27 = property4.remainder();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-30T23:59:59.000Z" + "'", str25, "1969-12-30T23:59:59.000Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        int int12 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.weekyear();
        mutableDateTime2.setMillisOfDay(968);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.129Z" + "'", str4, "2020-11-25T01:49:38.129Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:38.129Z" + "'", str8, "2020-11-25T01:49:38.129Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addWeekyears(45);
        mutableDateTime9.setMillis(10L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.centuryOfEra();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime25, dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime33.setMillisOfSecond(946);
        boolean boolean37 = mutableDateTime33.isBefore((long) (-6467900));
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:38.152Z" + "'", str19, "2020-11-25T01:49:38.152Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "20" + "'", str24, "20");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime13.getMinuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.DurationField durationField24 = property23.getRangeDurationField();
        int int25 = property23.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime27 = property23.add(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property23.getFieldType();
        boolean boolean29 = mutableDateTime13.isSupported(dateTimeFieldType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutableDateTime13.setDate(readableInstant30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime13.hourOfDay();
        org.joda.time.Chronology chronology33 = mutableDateTime13.getChronology();
        mutableDateTime13.setTime((-18596L));
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.194Z" + "'", str4, "2020-11-25T01:49:38.194Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear(6439318);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6439318 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str4, "2020-11-25T01:49:38.254Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str8, "2020-11-25T01:49:38.254Z");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) 1604188800000L);
        boolean boolean18 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.280Z" + "'", str4, "2020-11-25T01:49:38.280Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:38.280Z" + "'", str8, "2020-11-25T01:49:38.280Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        int int12 = mutableDateTime7.getWeekOfWeekyear();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTime dateTime17 = mutableDateTime7.toDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime7.copy();
        boolean boolean19 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.minuteOfDay();
        mutableDateTime18.setWeekyear(994);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.dayOfYear();
        java.lang.String str24 = property23.getAsString();
        java.util.Locale locale25 = null;
        int int26 = property23.getMaximumShortTextLength(locale25);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.309Z" + "'", str4, "2020-11-25T01:49:38.309Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:38.309Z" + "'", str9, "2020-11-25T01:49:38.309Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "330" + "'", str24, "330");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "365");
        mutableDateTime1.setMinuteOfHour(7);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime1.add(readableDuration4);
        mutableDateTime1.addMonths(6370);
        int int8 = mutableDateTime1.getCenturyOfEra();
        int int9 = mutableDateTime1.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfCeiling();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 895 + "'", int9 == 895);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getYearOfCentury();
        int int8 = mutableDateTime2.getSecondOfMinute();
        boolean boolean10 = mutableDateTime2.isBefore((long) (byte) 1);
        int int11 = mutableDateTime2.getCenturyOfEra();
        int int12 = mutableDateTime2.getEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.385Z" + "'", str4, "2020-11-25T01:49:38.385Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime0.toMutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime0.minuteOfDay();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property10.getDifference(readableInstant11);
        org.joda.time.DurationField durationField13 = property10.getLeapDurationField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(durationField13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime6.toMutableDateTime(chronology14);
        mutableDateTime15.setSecondOfDay((int) ' ');
        int int18 = mutableDateTime15.getWeekyear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.monthOfYear();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add(6545774);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        int int30 = mutableDateTime25.getWeekOfWeekyear();
        mutableDateTime25.setYear(45);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.addWrapField(6393151);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        java.lang.String str44 = mutableDateTime38.toString();
        mutableDateTime38.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime38.millisOfSecond();
        java.lang.String str48 = property47.toString();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.add((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = property47.getDifference(readableInstant51);
        java.lang.String str53 = property47.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property47.getFieldType();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        java.lang.String str63 = mutableDateTime57.toString();
        mutableDateTime57.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime57.millisOfSecond();
        java.lang.String str67 = property66.toString();
        java.util.Locale locale68 = null;
        java.lang.String str69 = property66.getAsText(locale68);
        org.joda.time.MutableDateTime mutableDateTime70 = property66.roundHalfFloor();
        int int71 = mutableDateTime70.getSecondOfMinute();
        boolean boolean72 = property47.equals((java.lang.Object) int71);
        org.joda.time.MutableDateTime mutableDateTime73 = property47.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property47.getFieldType();
        int int75 = mutableDateTime35.get(dateTimeFieldType74);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime22.set(dateTimeFieldType74, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str4, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str12, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2020 + "'", int18 == 2020);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Nov" + "'", str20, "Nov");
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str27, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str40, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str44, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Property[millisOfSecond]" + "'", str48, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-6575900) + "'", int52 == (-6575900));
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "621" + "'", str53, "621");
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str59, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(property62);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str63, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Property[millisOfSecond]" + "'", str67, "Property[millisOfSecond]");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "521" + "'", str69, "521");
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 521 + "'", int75 == 521);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean21 = mutableDateTime2.isAfterNow();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        int int29 = mutableDateTime24.getWeekOfWeekyear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = mutableDateTime24.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime34.toMutableDateTimeISO();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology51);
        mutableDateTime43.setChronology(chronology51);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime57, dateTimeZone60);
        org.joda.time.DateTime dateTime62 = mutableDateTime61.toDateTimeISO();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        int int68 = mutableDateTime65.getYearOfCentury();
        org.joda.time.Chronology chronology69 = mutableDateTime65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime61.toMutableDateTime(chronology69);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime43.toMutableDateTime(chronology69);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime35.toMutableDateTime(chronology69);
        mutableDateTime2.setChronology(chronology69);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime77 = property75.add(6441);
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(obj78, chronology79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = null;
        java.lang.String str82 = mutableDateTime80.toString(dateTimeFormatter81);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        mutableDateTime80.add(readablePeriod83);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime80.centuryOfEra();
        java.util.Locale locale86 = null;
        java.lang.String str87 = property85.getAsShortText(locale86);
        org.joda.time.MutableDateTime mutableDateTime88 = property85.getMutableDateTime();
        java.lang.Object obj89 = null;
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(obj89, chronology90);
        org.joda.time.DateTimeZone dateTimeZone92 = mutableDateTime91.getZone();
        org.joda.time.MutableDateTime mutableDateTime93 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime88, dateTimeZone92);
        mutableDateTime88.addYears(330);
        boolean boolean96 = mutableDateTime77.isAfter((org.joda.time.ReadableInstant) mutableDateTime88);
        org.joda.time.MutableDateTime mutableDateTime97 = mutableDateTime88.toMutableDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.578Z" + "'", str4, "2020-11-25T01:49:38.578Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:38.578Z" + "'", str12, "2020-11-25T01:49:38.578Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:38.578Z" + "'", str26, "2020-11-25T01:49:38.578Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 48 + "'", int29 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:38.579Z" + "'", str40, "2020-11-25T01:49:38.579Z");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2020-11-25T01:49:38.579Z" + "'", str49, "2020-11-25T01:49:38.579Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:38.579Z" + "'", str59, "2020-11-25T01:49:38.579Z");
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2020-11-25T01:49:38.579Z" + "'", str67, "2020-11-25T01:49:38.579Z");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 20 + "'", int68 == 20);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(mutableDateTime77);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "2020-11-25T01:49:38.579Z" + "'", str82, "2020-11-25T01:49:38.579Z");
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "20" + "'", str87, "20");
        org.junit.Assert.assertNotNull(mutableDateTime88);
        org.junit.Assert.assertNotNull(dateTimeZone92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(mutableDateTime97);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        mutableDateTime2.addMillis(2);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime13.setZoneRetainFields(dateTimeZone18);
        mutableDateTime2.setZone(dateTimeZone18);
        mutableDateTime2.addWeekyears((int) (byte) 1);
        mutableDateTime2.addDays(0);
        mutableDateTime2.addMinutes(18591);
        boolean boolean30 = mutableDateTime2.isBefore((long) 4021);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime2.year();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.751Z" + "'", str4, "2020-11-25T01:49:38.751Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        java.lang.String str17 = mutableDateTime11.toString();
        mutableDateTime11.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime11.toMutableDateTime();
        int int22 = mutableDateTime21.getMonthOfYear();
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.setDateTime(994, 86399, 43, 2679, 6558, (-6561900), 698);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2679 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:38.798Z" + "'", str13, "2020-11-25T01:49:38.798Z");
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:38.798Z" + "'", str17, "2020-11-25T01:49:38.798Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfEven();
        int int10 = mutableDateTime9.getYear();
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 857 + "'", int6 == 857);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumShortTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.roundHalfEven();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.monthOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        java.lang.String str19 = mutableDateTime13.toString();
        mutableDateTime13.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime13.secondOfDay();
        boolean boolean25 = mutableDateTime13.isEqual((long) 2020);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime13.minuteOfDay();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology33);
        mutableDateTime13.setChronology(chronology33);
        boolean boolean37 = mutableDateTime13.isBefore((long) (short) -1);
        org.joda.time.Instant instant38 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfMonth();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        mutableDateTime13.setRounding(dateTimeField42);
        mutableDateTime9.setRounding(dateTimeField42);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:38.885Z" + "'", str15, "2020-11-25T01:49:38.885Z");
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:38.885Z" + "'", str19, "2020-11-25T01:49:38.885Z");
        org.junit.Assert.assertNotNull(gregorianCalendar22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:38.885Z" + "'", str31, "2020-11-25T01:49:38.885Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        mutableDateTime8.addDays((int) (short) 0);
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTimeISO();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime5.copy();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.yearOfEra();
        int int17 = property16.get();
        org.joda.time.DurationField durationField18 = property16.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1969 + "'", int17 == 1969);
        org.junit.Assert.assertNull(durationField18);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime3, dateTimeZone6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, dateTimeZone12);
        int int15 = mutableDateTime14.getMinuteOfHour();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime14.toMutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 2020, dateTimeZone19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        mutableDateTime27.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.yearOfCentury();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfCeiling();
        int int33 = mutableDateTime32.getWeekyear();
        mutableDateTime32.addMinutes(21);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfMonth();
        org.joda.time.DurationField durationField38 = property37.getRangeDurationField();
        java.lang.String str39 = property37.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.roundHalfEven();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime43, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = mutableDateTime47.toDateTimeISO();
        boolean boolean49 = mutableDateTime47.isEqualNow();
        int int50 = property37.getDifference((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime47.getZone();
        mutableDateTime32.setZoneRetainFields(dateTimeZone51);
        org.joda.time.Chronology chronology53 = mutableDateTime32.getChronology();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime56.add(readablePeriod59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.centuryOfEra();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        int int70 = property61.getDifference((org.joda.time.ReadableInstant) mutableDateTime64);
        java.lang.String str71 = property61.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime72 = property61.roundHalfFloor();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        int int78 = mutableDateTime75.getYearOfCentury();
        org.joda.time.Chronology chronology79 = mutableDateTime75.getChronology();
        int int80 = mutableDateTime75.getWeekOfWeekyear();
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.DateTimeZone dateTimeZone84 = mutableDateTime83.getZone();
        org.joda.time.DateTime dateTime85 = mutableDateTime75.toDateTime(dateTimeZone84);
        org.joda.time.MutableDateTime mutableDateTime86 = dateTime85.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime86.era();
        boolean boolean88 = property61.equals((java.lang.Object) property87);
        java.util.Locale locale89 = null;
        java.lang.String str90 = property87.getAsText(locale89);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property87.getFieldType();
        int int92 = mutableDateTime32.get(dateTimeFieldType91);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime24.property(dateTimeFieldType91);
        org.joda.time.MutableDateTime mutableDateTime94 = property93.roundHalfCeiling();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:38.986Z" + "'", str5, "2020-11-25T01:49:38.986Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "25" + "'", str39, "25");
        org.junit.Assert.assertNotNull(mutableDateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:38.986Z" + "'", str45, "2020-11-25T01:49:38.986Z");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(chronology53);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2020-11-25T01:49:38.986Z" + "'", str58, "2020-11-25T01:49:38.986Z");
        org.junit.Assert.assertNotNull(property61);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T01:49:38.986Z" + "'", str66, "2020-11-25T01:49:38.986Z");
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "20" + "'", str71, "20");
        org.junit.Assert.assertNotNull(mutableDateTime72);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "2020-11-25T01:49:38.986Z" + "'", str77, "2020-11-25T01:49:38.986Z");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 20 + "'", int78 == 20);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 48 + "'", int80 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(mutableDateTime86);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "AD" + "'", str90, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(mutableDateTime94);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:16.598Z");
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate(6464046, 330, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 330 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        long long21 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.minuteOfHour();
        int int23 = property22.getMinimumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.165Z" + "'", str4, "2020-11-25T01:49:39.165Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.165Z" + "'", str12, "2020-11-25T01:49:39.165Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606268979000L + "'", long21 == 1606268979000L);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.String str17 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime18 = property7.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime18.toMutableDateTime(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.setMinuteOfHour(6540072);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6540072 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.225Z" + "'", str4, "2020-11-25T01:49:39.225Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.226Z" + "'", str12, "2020-11-25T01:49:39.226Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20" + "'", str17, "20");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        mutableDateTime6.addMonths(10);
        int int16 = mutableDateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime6.millisOfDay();
        org.joda.time.Interval interval18 = property17.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.254Z" + "'", str4, "2020-11-25T01:49:39.254Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumShortTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.roundHalfEven();
        int int10 = mutableDateTime9.getHourOfDay();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime13.getMinuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        int int22 = mutableDateTime21.getEra();
        boolean boolean24 = mutableDateTime21.isEqual((-108L));
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.344Z" + "'", str4, "2020-11-25T01:49:39.344Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        int int9 = mutableDateTime7.getYear();
        boolean boolean11 = mutableDateTime7.isEqual(6547869L);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        boolean boolean11 = property8.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add((int) (byte) 10);
        boolean boolean14 = mutableDateTime13.isAfterNow();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.centuryOfEra();
        mutableDateTime13.addMillis(12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.470Z" + "'", str4, "2020-11-25T01:49:39.470Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime6.getEra();
        mutableDateTime6.addMonths(510);
        org.joda.time.DateTime dateTime17 = mutableDateTime6.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.weekOfWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.535Z" + "'", str4, "2020-11-25T01:49:39.535Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMillisOfSecond(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.weekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        mutableDateTime22.addMonths(6558);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.607Z" + "'", str4, "2020-11-25T01:49:39.607Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.607Z" + "'", str12, "2020-11-25T01:49:39.607Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundCeiling();
        mutableDateTime13.setSecondOfMinute(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.yearOfCentury();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfCeiling();
        int int24 = mutableDateTime23.getWeekyear();
        mutableDateTime23.addMinutes(21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.DurationField durationField29 = property28.getRangeDurationField();
        java.lang.String str30 = property28.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundHalfEven();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime34, dateTimeZone37);
        org.joda.time.DateTime dateTime39 = mutableDateTime38.toDateTimeISO();
        boolean boolean40 = mutableDateTime38.isEqualNow();
        int int41 = property28.getDifference((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime38.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone42);
        boolean boolean44 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime13.hourOfDay();
        org.joda.time.DurationField durationField46 = property45.getDurationField();
        int int47 = property45.get();
        org.joda.time.DurationField durationField48 = property45.getDurationField();
        boolean boolean49 = property45.isLeap();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.734Z" + "'", str4, "2020-11-25T01:49:39.734Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:39.734Z" + "'", str8, "2020-11-25T01:49:39.734Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "25" + "'", str30, "25");
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:39.734Z" + "'", str36, "2020-11-25T01:49:39.734Z");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:49:15.344Z");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:54.658Z", dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((-1549491282907L), dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone6);
        mutableDateTime10.addDays(6464046);
        mutableDateTime10.setMillisOfSecond(98);
        org.joda.time.Chronology chronology15 = mutableDateTime10.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime9.setChronology(chronology17);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj0, chronology17);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.hourOfDay();
        java.util.Locale locale24 = null;
        int int25 = property23.getMaximumTextLength(locale24);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:39.905Z" + "'", str6, "2020-11-25T01:49:39.905Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:39.906Z" + "'", str15, "2020-11-25T01:49:39.906Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone12);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.centuryOfEra();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        java.lang.String str30 = mutableDateTime24.toString();
        mutableDateTime24.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime24.secondOfDay();
        boolean boolean36 = mutableDateTime24.isEqual((long) 2020);
        int int37 = mutableDateTime24.getMillisOfSecond();
        long long38 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Chronology chronology39 = mutableDateTime24.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((-6317901), 624, 663, (int) '#', (-6528900), 2, 15, chronology39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:39.994Z" + "'", str11, "2020-11-25T01:49:39.994Z");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:39.994Z" + "'", str26, "2020-11-25T01:49:39.994Z");
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:39.994Z" + "'", str30, "2020-11-25T01:49:39.994Z");
        org.junit.Assert.assertNotNull(gregorianCalendar33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 994 + "'", int37 == 994);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(chronology39);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        mutableDateTime7.addYears(100);
        int int10 = mutableDateTime7.getYearOfCentury();
        int int11 = mutableDateTime7.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime7.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField(21);
        org.joda.time.DurationField durationField17 = property14.getRangeDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.079Z" + "'", str4, "2020-11-25T01:49:40.079Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 109 + "'", int11 == 109);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = mutableDateTime2.isSupported(dateTimeFieldType3);
        mutableDateTime2.setMonthOfYear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfYear();
        int int8 = mutableDateTime2.getWeekyear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime13.getMinuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.DurationField durationField24 = property23.getRangeDurationField();
        int int25 = property23.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime27 = property23.add(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property23.getFieldType();
        boolean boolean29 = mutableDateTime13.isSupported(dateTimeFieldType28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutableDateTime13.setDate(readableInstant30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime13.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.add(298L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.211Z" + "'", str4, "2020-11-25T01:49:40.211Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.weekyear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.centuryOfEra();
        long long19 = property18.remainder();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.365Z" + "'", str4, "2020-11-25T01:49:40.365Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:40.365Z" + "'", str12, "2020-11-25T01:49:40.365Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1549491019635L) + "'", long19 == (-1549491019635L));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        long long9 = property8.remainder();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        long long11 = property8.remainder();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add((long) 6328693);
        mutableDateTime13.addSeconds(6464046);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.711Z" + "'", str4, "2020-11-25T01:49:40.711Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6580711L + "'", long9 == 6580711L);
        org.junit.Assert.assertNotNull(durationField10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6580711L + "'", long11 == 6580711L);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfMinute();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.DurationField durationField14 = property12.getLeapDurationField();
        long long15 = property12.remainder();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        mutableDateTime18.setMillisOfSecond(0);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime18.add(readableDuration24);
        mutableDateTime18.addMonths(19);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime35.setChronology(chronology43);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime49, dateTimeZone52);
        org.joda.time.DateTime dateTime54 = mutableDateTime53.toDateTimeISO();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        int int60 = mutableDateTime57.getYearOfCentury();
        org.joda.time.Chronology chronology61 = mutableDateTime57.getChronology();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime53.toMutableDateTime(chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology61);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime35.toMutableDateTime(chronology61);
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(chronology61);
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(chronology61);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime18.toMutableDateTime(chronology61);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) property12, chronology61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str4, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str8, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNull(durationField14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 804L + "'", long15 == 804L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str20, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str32, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str41, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str51, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2020-11-25T01:49:40.804Z" + "'", str59, "2020-11-25T01:49:40.804Z");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20 + "'", int60 == 20);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(chronology3);
        boolean boolean5 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setTime((long) 6393151);
        boolean boolean8 = mutableDateTime4.isBeforeNow();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.addHours(20);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.yearOfEra();
        boolean boolean6 = mutableDateTime0.isEqual(6440118L);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime3.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant14 = null;
        boolean boolean15 = mutableDateTime13.isBefore(readableInstant14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone28);
        mutableDateTime19.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (-6408900), dateTimeZone28);
        org.joda.time.DateTime dateTime32 = mutableDateTime13.toDateTime(dateTimeZone28);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:41.094Z" + "'", str21, "2020-11-25T01:49:41.094Z");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.Date date11 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 30);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime16.add(readablePeriod22, (int) (byte) 0);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.setMillisOfDay((int) (byte) 0);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        java.lang.String str36 = mutableDateTime30.toString();
        mutableDateTime30.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime30.toGregorianCalendar();
        int int40 = mutableDateTime30.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime30.weekyear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        java.lang.String str50 = mutableDateTime44.toString();
        mutableDateTime44.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime44.millisOfSecond();
        java.lang.String str54 = property53.toString();
        org.joda.time.MutableDateTime mutableDateTime56 = property53.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime57 = property53.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime57.copy();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) 'a');
        int int62 = mutableDateTime61.getDayOfYear();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.Instant instant66 = mutableDateTime65.toInstant();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime65.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime68 = property67.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField69 = property67.getField();
        int int70 = mutableDateTime61.get(dateTimeField69);
        mutableDateTime58.setRounding(dateTimeField69);
        mutableDateTime30.setRounding(dateTimeField69);
        mutableDateTime16.setRounding(dateTimeField69, 0);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = mutableDateTime77.toString(dateTimeFormatter78);
        int int80 = mutableDateTime77.getYearOfCentury();
        org.joda.time.Chronology chronology81 = mutableDateTime77.getChronology();
        int int82 = mutableDateTime77.getWeekOfWeekyear();
        mutableDateTime77.setYear(45);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime77.dayOfMonth();
        boolean boolean86 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime77);
        mutableDateTime77.setYear(6475150);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime77.year();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str4, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed Nov 25 01:49:41 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str18, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str32, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str36, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str46, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str50, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Property[millisOfSecond]" + "'", str54, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2020-11-25T01:49:41.183Z" + "'", str79, "2020-11-25T01:49:41.183Z");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 20 + "'", int80 == 20);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 48 + "'", int82 == 48);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(property89);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.weekyear();
        int int18 = mutableDateTime10.getCenturyOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.322Z" + "'", str4, "2020-11-25T01:49:41.322Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:41.322Z" + "'", str12, "2020-11-25T01:49:41.322Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.era();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        mutableDateTime8.add((long) (short) -1);
        mutableDateTime8.addMillis(2);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        mutableDateTime8.setZone(dateTimeZone24);
        mutableDateTime2.setZoneRetainFields(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime2.add(readablePeriod30, 6370);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        boolean boolean41 = mutableDateTime39.isEqualNow();
        org.joda.time.Chronology chronology42 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.addWrapField(309);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:41.414Z" + "'", str10, "2020-11-25T01:49:41.414Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:41.414Z" + "'", str37, "2020-11-25T01:49:41.414Z");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        mutableDateTime4.setTime((long) 48);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime14.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime4.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfCentury();
        int int30 = property29.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:41.621Z" + "'", str11, "2020-11-25T01:49:41.621Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:41.622Z" + "'", str20, "2020-11-25T01:49:41.622Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setMillis(readableInstant8);
        int int10 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.addMillis((int) '4');
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6581724 + "'", int10 == 6581724);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.setDayOfYear((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.toMutableDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundFloor();
        boolean boolean4 = mutableDateTime2.isBefore(100L);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) (short) -1);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        mutableDateTime19.setSecondOfDay((int) '#');
        int int23 = mutableDateTime19.getMonthOfYear();
        org.joda.time.DateTime dateTime24 = mutableDateTime19.toDateTimeISO();
        int int25 = property14.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property14.getFieldType();
        int int27 = mutableDateTime7.get(dateTimeFieldType26);
        int int28 = mutableDateTime2.get(dateTimeFieldType26);
        int int29 = mutableDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 330 + "'", int27 == 330);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.weekyear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.centuryOfEra();
        boolean boolean20 = mutableDateTime10.isEqual((long) 6393151);
        org.joda.time.DateTime dateTime21 = mutableDateTime10.toDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.012Z" + "'", str4, "2020-11-25T01:49:42.012Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:42.012Z" + "'", str12, "2020-11-25T01:49:42.012Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime2.add(readablePeriod13, (-1));
        boolean boolean16 = mutableDateTime2.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime2.getZone();
        mutableDateTime2.addYears(0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.067Z" + "'", str4, "2020-11-25T01:49:42.067Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:42.067Z" + "'", str8, "2020-11-25T01:49:42.067Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        mutableDateTime2.setRounding(dateTimeField16);
        int int18 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.centuryOfEra();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property26.getAsShortText(locale27);
        java.lang.String str29 = property26.getName();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        int int37 = mutableDateTime32.getWeekOfWeekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTime dateTime42 = mutableDateTime32.toDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime42.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.era();
        boolean boolean45 = property26.equals((java.lang.Object) property44);
        org.joda.time.DateTimeField dateTimeField46 = property44.getField();
        int int47 = mutableDateTime2.get(dateTimeField46);
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 112 + "'", int6 == 112);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:42.112Z" + "'", str11, "2020-11-25T01:49:42.112Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:42.113Z" + "'", str23, "2020-11-25T01:49:42.113Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "20" + "'", str28, "20");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "centuryOfEra" + "'", str29, "centuryOfEra");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:42.113Z" + "'", str34, "2020-11-25T01:49:42.113Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 48 + "'", int37 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:59.820Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        mutableDateTime5.setDate((long) 10);
        int int9 = mutableDateTime5.getSecondOfMinute();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime5.add(readableDuration10);
        java.lang.Class<?> wildcardClass12 = mutableDateTime5.getClass();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.addHours(20);
        mutableDateTime0.setWeekyear(0);
        int int6 = mutableDateTime0.getRoundingMode();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime0.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime0.yearOfCentury();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a');
        int int11 = mutableDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
        boolean boolean14 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime13);
        int int15 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean16 = mutableDateTime13.isEqualNow();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = mutableDateTime2.clone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setSecondOfDay((int) '#');
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        int int33 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property22.getFieldType();
        int int35 = mutableDateTime15.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.property(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime2.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.404Z" + "'", str4, "2020-11-25T01:49:42.404Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:42.404Z" + "'", str8, "2020-11-25T01:49:42.404Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "2020-11-25T00:00:02.404Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "2020-11-25T00:00:02.404Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "2020-11-25T00:00:02.404Z");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = mutableDateTime2.clone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setSecondOfDay((int) '#');
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        int int33 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property22.getFieldType();
        int int35 = mutableDateTime15.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.property(dateTimeFieldType34);
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.roundHalfFloor();
        mutableDateTime38.addYears(6566333);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.537Z" + "'", str4, "2020-11-25T01:49:42.537Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:42.537Z" + "'", str8, "2020-11-25T01:49:42.537Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "2020-11-25T00:00:02.537Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "2020-11-25T00:00:02.537Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "2020-11-25T00:00:02.537Z");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        int int9 = mutableDateTime7.getYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        mutableDateTime12.setMillisOfSecond(0);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime12.add(readableDuration18);
        mutableDateTime12.addYears(31);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime12.getZone();
        mutableDateTime7.setZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:42.663Z" + "'", str14, "2020-11-25T01:49:42.663Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        mutableDateTime2.addDays(0);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = mutableDateTime2.toCalendar(locale9);
        java.util.Locale locale11 = null;
        java.util.Calendar calendar12 = mutableDateTime2.toCalendar(locale11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 729 + "'", int6 == 729);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1606262435729,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=35,MILLISECOND=729,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1606262435729,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=35,MILLISECOND=729,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        java.lang.String str9 = mutableDateTime3.toString();
        mutableDateTime3.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime3.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime3.toMutableDateTime();
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime13.toCalendar(locale14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime13.toMutableDateTime();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(1606268946669L, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:42.812Z" + "'", str5, "2020-11-25T01:49:42.812Z");
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:42.812Z" + "'", str9, "2020-11-25T01:49:42.812Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1606262402812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=2,MILLISECOND=812,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime14.toCalendar(locale15);
        int int17 = mutableDateTime14.getMillisOfSecond();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        mutableDateTime14.addMonths(18591);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.857Z" + "'", str4, "2020-11-25T01:49:42.857Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:42.857Z" + "'", str8, "2020-11-25T01:49:42.857Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1606262402957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=2,MILLISECOND=957,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 957 + "'", int17 == 957);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.add((long) 0);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5, 309);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundCeiling();
        mutableDateTime13.setSecondOfMinute(48);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.yearOfCentury();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfCeiling();
        int int24 = mutableDateTime23.getWeekyear();
        mutableDateTime23.addMinutes(21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.DurationField durationField29 = property28.getRangeDurationField();
        java.lang.String str30 = property28.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundHalfEven();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime34, dateTimeZone37);
        org.joda.time.DateTime dateTime39 = mutableDateTime38.toDateTimeISO();
        boolean boolean40 = mutableDateTime38.isEqualNow();
        int int41 = property28.getDifference((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime38.getZone();
        mutableDateTime23.setZoneRetainFields(dateTimeZone42);
        boolean boolean44 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime13.hourOfDay();
        org.joda.time.DurationField durationField46 = property45.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.roundCeiling();
        int int48 = mutableDateTime47.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.040Z" + "'", str4, "2020-11-25T01:49:43.040Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:43.040Z" + "'", str8, "2020-11-25T01:49:43.040Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "25" + "'", str30, "25");
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:43.040Z" + "'", str36, "2020-11-25T01:49:43.040Z");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 330 + "'", int48 == 330);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = mutableDateTime2.clone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setSecondOfDay((int) '#');
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        int int33 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property22.getFieldType();
        int int35 = mutableDateTime15.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.property(dateTimeFieldType34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        java.lang.String str45 = mutableDateTime39.toString();
        mutableDateTime39.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime39.toGregorianCalendar();
        java.lang.Object obj49 = mutableDateTime39.clone();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        mutableDateTime52.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = property59.add((long) (short) -1);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        mutableDateTime64.setSecondOfDay((int) '#');
        int int68 = mutableDateTime64.getMonthOfYear();
        org.joda.time.DateTime dateTime69 = mutableDateTime64.toDateTimeISO();
        int int70 = property59.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property59.getFieldType();
        int int72 = mutableDateTime52.get(dateTimeFieldType71);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime39.property(dateTimeFieldType71);
        boolean boolean74 = mutableDateTime2.isSupported(dateTimeFieldType71);
        mutableDateTime2.addSeconds(53);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime78 = mutableDateTime2.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.130Z" + "'", str4, "2020-11-25T01:49:43.130Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:43.130Z" + "'", str8, "2020-11-25T01:49:43.130Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "2020-11-25T00:00:02.130Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "2020-11-25T00:00:02.130Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "2020-11-25T00:00:02.130Z");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:43.131Z" + "'", str41, "2020-11-25T01:49:43.131Z");
        org.junit.Assert.assertNotNull(property44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:43.131Z" + "'", str45, "2020-11-25T01:49:43.131Z");
        org.junit.Assert.assertNotNull(gregorianCalendar48);
        org.junit.Assert.assertNotNull(obj49);
// flaky:         org.junit.Assert.assertEquals(obj49.toString(), "2020-11-25T00:00:02.131Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "2020-11-25T00:00:02.131Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "2020-11-25T00:00:02.131Z");
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(instant65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 11 + "'", int68 == 11);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 330 + "'", int72 == 330);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTime78);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:30.877Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.centuryOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.String str19 = property9.getAsShortText();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        java.lang.String str28 = mutableDateTime22.toString();
        mutableDateTime22.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.secondOfDay();
        int int33 = mutableDateTime22.getCenturyOfEra();
        int int34 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DurationField durationField35 = property9.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime37 = property9.add(97);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add(292278993);
        int int43 = property40.getMinimumValue();
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:43.283Z" + "'", str6, "2020-11-25T01:49:43.283Z");
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:43.283Z" + "'", str14, "2020-11-25T01:49:43.283Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "20" + "'", str19, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:43.284Z" + "'", str24, "2020-11-25T01:49:43.284Z");
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:43.284Z" + "'", str28, "2020-11-25T01:49:43.284Z");
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(durationField35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        mutableDateTime7.setChronology(chronology15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime7.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.monthOfYear();
        int int38 = mutableDateTime36.getMinuteOfHour();
        java.lang.String str39 = mutableDateTime36.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.341Z" + "'", str4, "2020-11-25T01:49:43.341Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:43.341Z" + "'", str13, "2020-11-25T01:49:43.341Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:43.341Z" + "'", str23, "2020-11-25T01:49:43.341Z");
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:43.341Z" + "'", str31, "2020-11-25T01:49:43.341Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 49 + "'", int38 == 49);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:43.341Z" + "'", str39, "2020-11-25T01:49:43.341Z");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0, 1970, 906, 496, (int) (short) 1, 109, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 496 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set(0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        boolean boolean3 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.yearOfCentury();
        int int5 = property4.getMinimumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:30.877Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.centuryOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        int int18 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.String str19 = property9.getAsShortText();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        java.lang.String str28 = mutableDateTime22.toString();
        mutableDateTime22.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.secondOfDay();
        int int33 = mutableDateTime22.getCenturyOfEra();
        int int34 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DurationField durationField35 = property9.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime37 = property9.add(97);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime1.era();
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:43.713Z" + "'", str6, "2020-11-25T01:49:43.713Z");
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:43.713Z" + "'", str14, "2020-11-25T01:49:43.713Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "20" + "'", str19, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:43.713Z" + "'", str24, "2020-11-25T01:49:43.713Z");
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:43.713Z" + "'", str28, "2020-11-25T01:49:43.713Z");
        org.junit.Assert.assertNotNull(gregorianCalendar31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(durationField35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "365");
        mutableDateTime1.setMinuteOfHour(7);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfYear();
        int int8 = mutableDateTime6.getCenturyOfEra();
        int int9 = mutableDateTime6.getDayOfWeek();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.add(1);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        mutableDateTime23.add((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime23.getZone();
        mutableDateTime20.setZone(dateTimeZone32);
        mutableDateTime6.setZoneRetainFields(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime1.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:43.770Z" + "'", str25, "2020-11-25T01:49:43.770Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.monthOfYear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.minuteOfHour();
        int int6 = property5.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = property11.getDifference(readableInstant15);
        java.util.Locale locale17 = null;
        int int18 = property11.getMaximumTextLength(locale17);
        org.joda.time.DurationField durationField19 = property11.getLeapDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.940Z" + "'", str4, "2020-11-25T01:49:43.940Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:43.940Z" + "'", str8, "2020-11-25T01:49:43.940Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-6580900) + "'", int16 == (-6580900));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(durationField19);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime7.addMinutes(1970);
        mutableDateTime7.addHours(99);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = mutableDateTime7.toString("2020-11-25T01:47:08.751Z", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundHalfCeiling();
        org.joda.time.DurationField durationField8 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.getMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getYearOfCentury();
        int int8 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.add(6364574);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.164Z" + "'", str4, "2020-11-25T01:49:44.164Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.era();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        mutableDateTime8.add((long) (short) -1);
        mutableDateTime8.addMillis(2);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        mutableDateTime8.setZone(dateTimeZone24);
        mutableDateTime2.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.addWrapField(209);
        long long33 = property30.remainder();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        mutableDateTime36.addDays((int) (short) 0);
        int int41 = mutableDateTime36.getEra();
        int int42 = property30.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTimeField dateTimeField43 = mutableDateTime36.getRoundingField();
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:44.253Z" + "'", str10, "2020-11-25T01:49:44.253Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 260 + "'", int42 == 260);
        org.junit.Assert.assertNull(dateTimeField43);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        int int14 = mutableDateTime6.getEra();
        mutableDateTime6.addMonths(510);
        org.joda.time.DateTime dateTime17 = mutableDateTime6.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.dayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.349Z" + "'", str4, "2020-11-25T01:49:44.349Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        mutableDateTime19.add((long) (short) -1);
        mutableDateTime19.addDays(105);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime19.minuteOfDay();
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology47);
        mutableDateTime39.setChronology(chronology47);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime53, dateTimeZone56);
        org.joda.time.DateTime dateTime58 = mutableDateTime57.toDateTimeISO();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.Chronology chronology65 = mutableDateTime61.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime57.toMutableDateTime(chronology65);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(chronology65);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime39.toMutableDateTime(chronology65);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime15.toMutableDateTime(chronology65);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime69.setMonthOfYear(624);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 624 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str4, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str8, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str21, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str36, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str45, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str55, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertNotNull(dateTime58);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "2020-11-25T01:49:44.398Z" + "'", str63, "2020-11-25T01:49:44.398Z");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20 + "'", int64 == 20);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.centuryOfEra();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        mutableDateTime17.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime17.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime17.secondOfMinute();
        mutableDateTime17.addWeekyears((-139121));
        int int30 = property14.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime17.weekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.488Z" + "'", str4, "2020-11-25T01:49:44.488Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:44.488Z" + "'", str19, "2020-11-25T01:49:44.488Z");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:44.488Z" + "'", str23, "2020-11-25T01:49:44.488Z");
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1391 + "'", int30 == 1391);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.DateTime dateTime2 = mutableDateTime0.toDateTimeISO();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        int int4 = dateTime2.getDayOfYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 330 + "'", int4 == 330);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        mutableDateTime17.addMillis(994);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime17.setDayOfWeek((-6453900));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6453900 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.743Z" + "'", str4, "2020-11-25T01:49:44.743Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 18592L + "'", long20 == 18592L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        mutableDateTime4.setTime((long) 48);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime14.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime4.toMutableDateTime(chronology22);
        java.lang.String str27 = mutableDateTime26.toString();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        boolean boolean37 = mutableDateTime35.equals((java.lang.Object) "2020-11-25T01:47:07.854Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime35.toString(dateTimeFormatter38);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.centuryOfEra();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        int int56 = property47.getDifference((org.joda.time.ReadableInstant) mutableDateTime50);
        java.lang.String str57 = property47.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime58 = property47.roundHalfFloor();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.Chronology chronology65 = mutableDateTime61.getChronology();
        int int66 = mutableDateTime61.getWeekOfWeekyear();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        org.joda.time.DateTime dateTime71 = mutableDateTime61.toDateTime(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime71.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.era();
        boolean boolean74 = property47.equals((java.lang.Object) property73);
        java.util.Locale locale75 = null;
        java.lang.String str76 = property73.getAsText(locale75);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property73.getFieldType();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime35.property(dateTimeFieldType77);
        mutableDateTime26.setTime((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str11, "2020-11-25T01:49:44.794Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str20, "2020-11-25T01:49:44.794Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T00:00:00.048Z" + "'", str27, "2020-11-25T00:00:00.048Z");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str39, "2020-11-25T01:49:44.794Z");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str44, "2020-11-25T01:49:44.794Z");
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str52, "2020-11-25T01:49:44.794Z");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "20" + "'", str57, "20");
        org.junit.Assert.assertNotNull(mutableDateTime58);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "2020-11-25T01:49:44.794Z" + "'", str63, "2020-11-25T01:49:44.794Z");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20 + "'", int64 == 20);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 48 + "'", int66 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "AD" + "'", str76, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(property78);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        int int9 = mutableDateTime4.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 6462346, dateTimeZone16);
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutableDateTime18.setMillis(readableInstant19);
        boolean boolean21 = mutableDateTime18.isEqualNow();
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:44.953Z" + "'", str6, "2020-11-25T01:49:44.953Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.centuryOfEra();
        int int18 = mutableDateTime16.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime19.setZoneRetainFields(dateTimeZone24);
        mutableDateTime19.setMillisOfSecond((int) (short) 1);
        mutableDateTime19.setSecondOfMinute(10);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(0);
        org.joda.time.DateTimeField dateTimeField44 = property40.getField();
        mutableDateTime19.setRounding(dateTimeField44);
        mutableDateTime16.setRounding(dateTimeField44);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.078Z" + "'", str4, "2020-11-25T01:49:45.078Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:45.078Z" + "'", str8, "2020-11-25T01:49:45.078Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2020 + "'", int18 == 2020);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:45.078Z" + "'", str36, "2020-11-25T01:49:45.078Z");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        mutableDateTime7.setChronology(chronology15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime7.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        int int38 = mutableDateTime36.getWeekOfWeekyear();
        org.joda.time.Chronology chronology39 = mutableDateTime36.getChronology();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology41);
        mutableDateTime42.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.era();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.dayOfWeek();
        mutableDateTime48.add((long) (short) -1);
        mutableDateTime48.addMillis(2);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfMonth();
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone64);
        mutableDateTime59.setZoneRetainFields(dateTimeZone64);
        mutableDateTime48.setZone(dateTimeZone64);
        mutableDateTime42.setZoneRetainFields(dateTimeZone64);
        mutableDateTime36.setZoneRetainFields(dateTimeZone64);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime36.hourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.155Z" + "'", str4, "2020-11-25T01:49:45.155Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:45.155Z" + "'", str13, "2020-11-25T01:49:45.155Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:45.155Z" + "'", str23, "2020-11-25T01:49:45.155Z");
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:45.155Z" + "'", str31, "2020-11-25T01:49:45.155Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 48 + "'", int38 == 48);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:45.155Z" + "'", str50, "2020-11-25T01:49:45.155Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(property71);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        mutableDateTime21.setChronology(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime21.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime13.toMutableDateTime(chronology47);
        int int52 = mutableDateTime51.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.381Z" + "'", str4, "2020-11-25T01:49:45.381Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:45.381Z" + "'", str18, "2020-11-25T01:49:45.381Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:45.381Z" + "'", str27, "2020-11-25T01:49:45.381Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:45.381Z" + "'", str37, "2020-11-25T01:49:45.381Z");
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:45.381Z" + "'", str45, "2020-11-25T01:49:45.381Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 330 + "'", int52 == 330);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        mutableDateTime2.addDays(105);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.weekyear();
        int int15 = property14.getLeapAmount();
        int int16 = property14.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property14.add(35017L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.525Z" + "'", str4, "2020-11-25T01:49:45.525Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime0.setWeekyear(44);
        java.lang.Class<?> wildcardClass13 = mutableDateTime0.getClass();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.Date date11 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 30);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime16.add(readablePeriod22, (int) (byte) 0);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.setMillisOfDay((int) (byte) 0);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        java.lang.String str36 = mutableDateTime30.toString();
        mutableDateTime30.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime30.toGregorianCalendar();
        int int40 = mutableDateTime30.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime30.weekyear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        java.lang.String str50 = mutableDateTime44.toString();
        mutableDateTime44.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime44.millisOfSecond();
        java.lang.String str54 = property53.toString();
        org.joda.time.MutableDateTime mutableDateTime56 = property53.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime57 = property53.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime57.copy();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) 'a');
        int int62 = mutableDateTime61.getDayOfYear();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.Instant instant66 = mutableDateTime65.toInstant();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime65.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime68 = property67.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField69 = property67.getField();
        int int70 = mutableDateTime61.get(dateTimeField69);
        mutableDateTime58.setRounding(dateTimeField69);
        mutableDateTime30.setRounding(dateTimeField69);
        mutableDateTime16.setRounding(dateTimeField69, 0);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = mutableDateTime77.toString(dateTimeFormatter78);
        int int80 = mutableDateTime77.getYearOfCentury();
        org.joda.time.Chronology chronology81 = mutableDateTime77.getChronology();
        int int82 = mutableDateTime77.getWeekOfWeekyear();
        mutableDateTime77.setYear(45);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime77.dayOfMonth();
        boolean boolean86 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime77);
        mutableDateTime77.addMonths(294);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str4, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed Nov 25 01:49:45 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str18, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str32, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str36, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
        org.junit.Assert.assertNotNull(property41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str46, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str50, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Property[millisOfSecond]" + "'", str54, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2020-11-25T01:49:45.654Z" + "'", str79, "2020-11-25T01:49:45.654Z");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 20 + "'", int80 == 20);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 48 + "'", int82 == 48);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        mutableDateTime7.addYears(100);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.millisOfSecond();
        java.lang.String str12 = property11.getAsText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.789Z" + "'", str4, "2020-11-25T01:49:45.789Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "789" + "'", str12, "789");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        int int15 = mutableDateTime14.getWeekyear();
        mutableDateTime14.addMinutes(21);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        java.lang.String str21 = property19.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundHalfEven();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime25, dateTimeZone28);
        org.joda.time.DateTime dateTime30 = mutableDateTime29.toDateTimeISO();
        boolean boolean31 = mutableDateTime29.isEqualNow();
        int int32 = property19.getDifference((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime29.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone33);
        org.joda.time.Chronology chronology35 = mutableDateTime14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(332, 0, 50, 0, 20, 21, 250, chronology35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "25" + "'", str21, "25");
        org.junit.Assert.assertNotNull(mutableDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:45.854Z" + "'", str27, "2020-11-25T01:49:45.854Z");
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        mutableDateTime21.setChronology(chronology29);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime21.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime13.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology47);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.896Z" + "'", str4, "2020-11-25T01:49:45.896Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:45.896Z" + "'", str18, "2020-11-25T01:49:45.896Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:45.896Z" + "'", str27, "2020-11-25T01:49:45.896Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2020-11-25T01:49:45.896Z" + "'", str37, "2020-11-25T01:49:45.896Z");
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:45.896Z" + "'", str45, "2020-11-25T01:49:45.896Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime54);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime9.setChronology(chronology17);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj0, chronology17);
        boolean boolean23 = mutableDateTime22.isBeforeNow();
        mutableDateTime22.addYears(6457);
        java.lang.String str26 = mutableDateTime22.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.dayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.yearOfCentury();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.hourOfDay();
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime30.add(readableDuration35);
        mutableDateTime30.addMonths(105);
        java.lang.Object obj39 = mutableDateTime30.clone();
        int int40 = mutableDateTime30.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime30.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone41);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:46.050Z" + "'", str6, "2020-11-25T01:49:46.050Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:46.050Z" + "'", str15, "2020-11-25T01:49:46.050Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "8477-11-25T01:49:46.050Z" + "'", str26, "8477-11-25T01:49:46.050Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "1978-10-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "1978-10-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "1978-10-01T00:00:52.001Z");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1978 + "'", int40 == 1978);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:54.658Z", dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((-1549491282907L), dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone6);
        mutableDateTime10.addDays(6464046);
        mutableDateTime10.setMillisOfSecond(98);
        mutableDateTime10.setSecondOfDay(47);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        mutableDateTime3.setMillisOfSecond(0);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        int int18 = property17.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.addWrapField(0);
        int int21 = mutableDateTime3.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        boolean boolean22 = mutableDateTime3.isAfterNow();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        int int30 = mutableDateTime25.getWeekOfWeekyear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTime dateTime35 = mutableDateTime25.toDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime35.toMutableDateTimeISO();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        int int51 = mutableDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology52);
        mutableDateTime44.setChronology(chronology52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime58, dateTimeZone61);
        org.joda.time.DateTime dateTime63 = mutableDateTime62.toDateTimeISO();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        int int69 = mutableDateTime66.getYearOfCentury();
        org.joda.time.Chronology chronology70 = mutableDateTime66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime62.toMutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime44.toMutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime36.toMutableDateTime(chronology70);
        mutableDateTime3.setChronology(chronology70);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((-1L), chronology70);
        int int77 = mutableDateTime76.getYear();
        org.joda.time.ReadableDuration readableDuration78 = null;
        mutableDateTime76.add(readableDuration78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime76.yearOfCentury();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str5, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str13, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str27, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str41, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str50, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20 + "'", int51 == 20);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str60, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertNotNull(dateTime63);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2020-11-25T01:49:46.262Z" + "'", str68, "2020-11-25T01:49:46.262Z");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 20 + "'", int69 == 20);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(mutableDateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1969 + "'", int77 == 1969);
        org.junit.Assert.assertNotNull(property80);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.String str17 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime18 = property7.roundHalfFloor();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getWeekOfWeekyear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTime dateTime31 = mutableDateTime21.toDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.era();
        boolean boolean34 = property7.equals((java.lang.Object) property33);
        java.lang.String str35 = property7.getAsText();
        java.util.Locale locale36 = null;
        java.lang.String str37 = property7.getAsText(locale36);
        int int38 = property7.get();
        org.joda.time.DurationField durationField39 = property7.getDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.470Z" + "'", str4, "2020-11-25T01:49:46.470Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:46.470Z" + "'", str12, "2020-11-25T01:49:46.470Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20" + "'", str17, "20");
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:46.470Z" + "'", str23, "2020-11-25T01:49:46.470Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "20" + "'", str35, "20");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "20" + "'", str37, "20");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20 + "'", int38 == 20);
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        int int13 = mutableDateTime2.getCenturyOfEra();
        int int14 = mutableDateTime2.getYearOfEra();
        int int15 = mutableDateTime2.getDayOfMonth();
        int int16 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        int int20 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.552Z" + "'", str4, "2020-11-25T01:49:46.552Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:46.552Z" + "'", str8, "2020-11-25T01:49:46.552Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        int int8 = property7.getMinimumValue();
        org.joda.time.Interval interval9 = property7.toInterval();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property7.set("2020-11-25T01:48:59.548Z", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:48:59.548Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 662 + "'", int6 == 662);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0L, chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology7);
        mutableDateTime9.setMillis(1606268865447L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfCeiling();
        int int21 = mutableDateTime20.getWeekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime25, dateTimeZone28);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime29, dateTimeZone34);
        int int37 = mutableDateTime36.getMinuteOfHour();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime36.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:18.596Z", dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime20.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) 356, dateTimeZone41);
        boolean boolean49 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:46.749Z" + "'", str5, "2020-11-25T01:49:46.749Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:46.749Z" + "'", str27, "2020-11-25T01:49:46.749Z");
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 49 + "'", int37 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.addHours(20);
        mutableDateTime0.setWeekyear(0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime0.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime0.toMutableDateTime();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundHalfCeiling();
        mutableDateTime7.setSecondOfDay(20);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime7.copy();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10);
        boolean boolean12 = mutableDateTime10.isEqualNow();
        boolean boolean14 = mutableDateTime10.isEqual((long) 309);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        mutableDateTime7.setChronology(chronology15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime7.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.monthOfYear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        mutableDateTime40.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.minuteOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime40.property(dateTimeFieldType51);
        int int53 = mutableDateTime36.get(dateTimeFieldType51);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str4, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str13, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str23, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str31, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str42, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2020 + "'", int53 == 2020);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime12.setDate((long) 10);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        java.lang.String str24 = mutableDateTime18.toString();
        mutableDateTime18.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime18.toGregorianCalendar();
        java.lang.Object obj28 = mutableDateTime18.clone();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        mutableDateTime31.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) -1);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        mutableDateTime43.setSecondOfDay((int) '#');
        int int47 = mutableDateTime43.getMonthOfYear();
        org.joda.time.DateTime dateTime48 = mutableDateTime43.toDateTimeISO();
        int int49 = property38.compareTo((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property38.getFieldType();
        int int51 = mutableDateTime31.get(dateTimeFieldType50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime18.property(dateTimeFieldType50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = mutableDateTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime55.add(readablePeriod58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.hourOfDay();
        java.lang.String str61 = mutableDateTime55.toString();
        mutableDateTime55.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar64 = mutableDateTime55.toGregorianCalendar();
        java.lang.Object obj65 = mutableDateTime55.clone();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.Instant instant69 = mutableDateTime68.toInstant();
        mutableDateTime68.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property75.add((long) (short) -1);
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(obj78, chronology79);
        org.joda.time.Instant instant81 = mutableDateTime80.toInstant();
        mutableDateTime80.setSecondOfDay((int) '#');
        int int84 = mutableDateTime80.getMonthOfYear();
        org.joda.time.DateTime dateTime85 = mutableDateTime80.toDateTimeISO();
        int int86 = property75.compareTo((org.joda.time.ReadableInstant) mutableDateTime80);
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property75.getFieldType();
        int int88 = mutableDateTime68.get(dateTimeFieldType87);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime55.property(dateTimeFieldType87);
        boolean boolean90 = mutableDateTime18.isSupported(dateTimeFieldType87);
        boolean boolean91 = mutableDateTime12.isSupported(dateTimeFieldType87);
        long long92 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:47.117Z" + "'", str20, "2020-11-25T01:49:47.117Z");
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:47.117Z" + "'", str24, "2020-11-25T01:49:47.117Z");
        org.junit.Assert.assertNotNull(gregorianCalendar27);
        org.junit.Assert.assertNotNull(obj28);
// flaky:         org.junit.Assert.assertEquals(obj28.toString(), "2020-11-25T00:00:02.117Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "2020-11-25T00:00:02.117Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "2020-11-25T00:00:02.117Z");
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 11 + "'", int47 == 11);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 330 + "'", int51 == 330);
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2020-11-25T01:49:47.117Z" + "'", str57, "2020-11-25T01:49:47.117Z");
        org.junit.Assert.assertNotNull(property60);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "2020-11-25T01:49:47.117Z" + "'", str61, "2020-11-25T01:49:47.117Z");
        org.junit.Assert.assertNotNull(gregorianCalendar64);
        org.junit.Assert.assertNotNull(obj65);
// flaky:         org.junit.Assert.assertEquals(obj65.toString(), "2020-11-25T00:00:02.117Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "2020-11-25T00:00:02.117Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "2020-11-25T00:00:02.117Z");
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(instant81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 11 + "'", int84 == 11);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 330 + "'", int88 == 330);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 18597L + "'", long92 == 18597L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        mutableDateTime17.addMillis(994);
        long long20 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime mutableDateTime22 = property8.add((long) 299);
        int int23 = mutableDateTime22.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.306Z" + "'", str4, "2020-11-25T01:49:47.306Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 18592L + "'", long20 == 18592L);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 263 + "'", int23 == 263);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime6.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.372Z" + "'", str4, "2020-11-25T01:49:47.372Z");
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:47.372Z" + "'", str12, "2020-11-25T01:49:47.372Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 258);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        java.lang.String str10 = mutableDateTime4.toString();
        mutableDateTime4.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime4.toGregorianCalendar();
        java.lang.Object obj14 = mutableDateTime4.clone();
        org.joda.time.DateTime dateTime15 = mutableDateTime4.toDateTime();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getYearOfCentury();
        int int24 = mutableDateTime18.getSecondOfMinute();
        boolean boolean26 = mutableDateTime18.isBefore((long) (byte) 1);
        boolean boolean27 = dateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        boolean boolean28 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime0.add(readableDuration29, 365);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:47.471Z" + "'", str6, "2020-11-25T01:49:47.471Z");
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:47.471Z" + "'", str10, "2020-11-25T01:49:47.471Z");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "2020-11-25T00:00:02.471Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "2020-11-25T00:00:02.471Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "2020-11-25T00:00:02.471Z");
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:47.471Z" + "'", str20, "2020-11-25T01:49:47.471Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfEven();
        int int13 = mutableDateTime12.getDayOfMonth();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        int int15 = mutableDateTime2.getWeekyear();
        mutableDateTime2.setWeekyear(108);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add(16);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.monthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
        int int13 = mutableDateTime2.getCenturyOfEra();
        int int14 = mutableDateTime2.getYearOfEra();
        int int15 = mutableDateTime2.getDayOfMonth();
        boolean boolean17 = mutableDateTime2.isAfter((long) 158);
        int int18 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.yearOfCentury();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.698Z" + "'", str4, "2020-11-25T01:49:47.698Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:47.698Z" + "'", str8, "2020-11-25T01:49:47.698Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20" + "'", str21, "20");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.millisOfSecond();
        int int9 = mutableDateTime7.getMonthOfYear();
        boolean boolean11 = mutableDateTime7.isEqual((-1549491019635L));
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        java.lang.String str8 = property7.getAsShortText();
        java.lang.String str9 = property7.getAsShortText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.798Z" + "'", str4, "2020-11-25T01:49:47.798Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wed" + "'", str8, "Wed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wed" + "'", str9, "Wed");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime((long) 'a');
        mutableDateTime2.addMillis(747);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setSecondOfMinute(78438);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 78438 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.910Z" + "'", str4, "2020-11-25T01:49:47.910Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        mutableDateTime8.setChronology(chronology16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj0, chronology16);
        mutableDateTime20.addDays(109);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:47.986Z" + "'", str5, "2020-11-25T01:49:47.986Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:47.986Z" + "'", str14, "2020-11-25T01:49:47.986Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.era();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setRounding(dateTimeField19, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 105");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.067Z" + "'", str4, "2020-11-25T01:49:48.067Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:48.067Z" + "'", str8, "2020-11-25T01:49:48.067Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime14.toCalendar(locale15);
        int int17 = mutableDateTime14.getMillisOfSecond();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.year();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        mutableDateTime22.addWeekyears((int) (byte) 1);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:54.658Z", dateTimeZone30);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.yearOfCentury();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime37.toMutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime36.toMutableDateTime(dateTimeZone43);
        mutableDateTime32.setZone(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime22.toMutableDateTime(dateTimeZone43);
        mutableDateTime14.setZoneRetainFields(dateTimeZone43);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.110Z" + "'", str4, "2020-11-25T01:49:48.110Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:48.110Z" + "'", str8, "2020-11-25T01:49:48.110Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1606262402210,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=2,MILLISECOND=210,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 210 + "'", int17 == 210);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime49);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        mutableDateTime5.setRounding(dateTimeField13);
        boolean boolean16 = mutableDateTime5.isBefore((long) 298);
        java.lang.String str17 = mutableDateTime5.toString();
        int int18 = mutableDateTime5.getEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str17, "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.lang.Object obj7 = mutableDateTime2.clone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundHalfCeiling();
        mutableDateTime15.setSecondOfDay(20);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.copy();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18);
        boolean boolean20 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.monthOfYear();
        java.lang.String str22 = property21.getName();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1970-01-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1970-01-01T00:00:52.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1970-01-01T00:00:52.001Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "monthOfYear" + "'", str22, "monthOfYear");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime8.add(readablePeriod16, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime8.toString(dateTimeFormatter19);
        int int21 = mutableDateTime8.getMillisOfDay();
        mutableDateTime8.add((long) 1970);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        java.lang.String str32 = mutableDateTime26.toString();
        mutableDateTime26.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime26.toGregorianCalendar();
        int int36 = mutableDateTime26.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime26.weekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        mutableDateTime40.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime40.millisOfSecond();
        java.lang.String str50 = property49.toString();
        org.joda.time.MutableDateTime mutableDateTime52 = property49.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime53 = property49.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime53.copy();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime54.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 'a');
        int int58 = mutableDateTime57.getDayOfYear();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField65 = property63.getField();
        int int66 = mutableDateTime57.get(dateTimeField65);
        mutableDateTime54.setRounding(dateTimeField65);
        mutableDateTime26.setRounding(dateTimeField65);
        mutableDateTime8.setRounding(dateTimeField65);
        mutableDateTime8.addYears(6439318);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str10, "2020-11-25T01:49:48.390Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str20, "2020-11-25T01:49:48.390Z");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6588390 + "'", int21 == 6588390);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str28, "2020-11-25T01:49:48.390Z");
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str32, "2020-11-25T01:49:48.390Z");
        org.junit.Assert.assertNotNull(gregorianCalendar35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str42, "2020-11-25T01:49:48.390Z");
        org.junit.Assert.assertNotNull(property45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:48.390Z" + "'", str46, "2020-11-25T01:49:48.390Z");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Property[millisOfSecond]" + "'", str50, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, dateTimeZone19);
        mutableDateTime2.setZone(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.468Z" + "'", str4, "2020-11-25T01:49:48.468Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:48.468Z" + "'", str12, "2020-11-25T01:49:48.468Z");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addHours(299);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a');
        int int11 = mutableDateTime10.getDayOfYear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        int int19 = mutableDateTime10.get(dateTimeField18);
        int int20 = mutableDateTime2.get(dateTimeField18);
        int int21 = mutableDateTime2.getWeekyear();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime2.add(readableDuration22, 299);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.557Z" + "'", str4, "2020-11-25T01:49:48.557Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2020 + "'", int21 == 2020);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property15.getMutableDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.616Z" + "'", str4, "2020-11-25T01:49:48.616Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundFloor();
        mutableDateTime15.addDays(589);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.weekyear();
        java.lang.String str19 = property18.getName();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.era();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.dayOfWeek();
        mutableDateTime28.add((long) (short) -1);
        mutableDateTime28.addMillis(2);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfMonth();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone44);
        mutableDateTime39.setZoneRetainFields(dateTimeZone44);
        mutableDateTime28.setZone(dateTimeZone44);
        mutableDateTime22.setZoneRetainFields(dateTimeZone44);
        mutableDateTime22.addSeconds((-6408900));
        int int52 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean54 = mutableDateTime22.equals((java.lang.Object) "2020-11-25T01:49:31.953Z");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.758Z" + "'", str4, "2020-11-25T01:49:48.758Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:48.758Z" + "'", str8, "2020-11-25T01:49:48.758Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weekyear" + "'", str19, "weekyear");
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:48.758Z" + "'", str30, "2020-11-25T01:49:48.758Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime4, dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone13);
        int int16 = mutableDateTime15.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime15.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 2020, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 599, dateTimeZone20);
        mutableDateTime26.setMinuteOfDay(2);
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = mutableDateTime26.toString("2020-11-25T01:46:49.003Z", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:49.036Z" + "'", str6, "2020-11-25T01:49:49.036Z");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 44);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        int int3 = mutableDateTime1.getMinuteOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        int int3 = property1.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime5 = property1.add(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property1.getFieldType();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property1.getAsText(locale7);
        java.lang.String str9 = property1.getAsText();
        java.lang.String str10 = property1.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16" + "'", str8, "16");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16" + "'", str9, "16");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfMonth]" + "'", str10, "Property[dayOfMonth]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        boolean boolean8 = mutableDateTime6.isEqualNow();
        mutableDateTime6.addHours(336);
        int int11 = mutableDateTime6.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.245Z" + "'", str4, "2020-11-25T01:49:49.245Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        int int15 = mutableDateTime14.getWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, dateTimeZone22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, dateTimeZone28);
        int int31 = mutableDateTime30.getMinuteOfHour();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime30.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:18.596Z", dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime14.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(107, 690, 25, 2120, 6540072, 6540072, (int) (byte) 10, dateTimeZone35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:49.285Z" + "'", str21, "2020-11-25T01:49:49.285Z");
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 49 + "'", int31 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.toMutableDateTime();
        int int13 = mutableDateTime2.getEra();
        mutableDateTime2.setDayOfMonth(25);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.341Z" + "'", str4, "2020-11-25T01:49:49.341Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:49.341Z" + "'", str8, "2020-11-25T01:49:49.341Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundHalfEven();
        mutableDateTime6.addSeconds((int) (short) -1);
        int int9 = mutableDateTime6.getMonthOfYear();
        mutableDateTime6.addHours(54);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        mutableDateTime2.addDays(105);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.550Z" + "'", str4, "2020-11-25T01:49:49.550Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTimeISO();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology30);
        mutableDateTime22.setChronology(chronology30);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime36, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime40.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime22.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime14.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 292278993, chronology48);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str5, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str19, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str28, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str38, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str46, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutableDateTime6.setDate(readableInstant12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime6.secondOfMinute();
        java.util.Date date15 = mutableDateTime6.toDate();
        boolean boolean16 = property3.equals((java.lang.Object) mutableDateTime6);
        org.joda.time.Instant instant17 = mutableDateTime6.toInstant();
        int int18 = mutableDateTime6.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:49.684Z" + "'", str8, "2020-11-25T01:49:49.684Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 01:49:49 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 684 + "'", int18 == 684);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        int int16 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.String str17 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime18 = property7.getMutableDateTime();
        int int19 = mutableDateTime18.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.setSecondOfMinute(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.737Z" + "'", str4, "2020-11-25T01:49:49.737Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:49.737Z" + "'", str12, "2020-11-25T01:49:49.737Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20" + "'", str17, "20");
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        mutableDateTime7.addYears(100);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.809Z" + "'", str4, "2020-11-25T01:49:49.809Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        int int10 = property7.getMaximumValue();
        int int11 = property7.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.roundHalfEven();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.873Z" + "'", str4, "2020-11-25T01:49:49.873Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2922789 + "'", int10 == 2922789);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2922789 + "'", int11 == 2922789);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.addMonths(486);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        boolean boolean9 = property4.isLeap();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.add(16);
        boolean boolean17 = property4.equals((java.lang.Object) mutableDateTime16);
        mutableDateTime16.addWeekyears((int) (byte) -1);
        int int20 = mutableDateTime16.getMinuteOfHour();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime6.toMutableDateTime(chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime23 = property19.roundHalfCeiling();
        mutableDateTime23.addSeconds((int) (short) -1);
        boolean boolean26 = mutableDateTime23.isBeforeNow();
        mutableDateTime23.setMillis((-1L));
        boolean boolean29 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        long long30 = mutableDateTime23.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.072Z" + "'", str4, "2020-11-25T01:49:50.072Z");
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:50.072Z" + "'", str12, "2020-11-25T01:49:50.072Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = mutableDateTime2.clone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setSecondOfDay((int) '#');
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = mutableDateTime27.toDateTimeISO();
        int int33 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property22.getFieldType();
        int int35 = mutableDateTime15.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.property(dateTimeFieldType34);
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.minuteOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.162Z" + "'", str4, "2020-11-25T01:49:50.162Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:50.162Z" + "'", str8, "2020-11-25T01:49:50.162Z");
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "2020-11-25T00:00:02.162Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "2020-11-25T00:00:02.162Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "2020-11-25T00:00:02.162Z");
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11 + "'", int31 == 11);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 330 + "'", int35 == 330);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime6, dateTimeZone11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        int int20 = mutableDateTime13.get(dateTimeFieldType19);
        mutableDateTime13.setMillis(1604188800000L);
        boolean boolean24 = mutableDateTime13.isBefore((long) 101);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.248Z" + "'", str4, "2020-11-25T01:49:50.248Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        mutableDateTime4.setTime((long) 48);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime14.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime4.toMutableDateTime(chronology22);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime29, dateTimeZone32);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime33, dateTimeZone38);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime33.minuteOfHour();
        org.joda.time.DateTime dateTime42 = mutableDateTime33.toDateTime();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        mutableDateTime45.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.minuteOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime53.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime45.property(dateTimeFieldType56);
        int int58 = dateTime42.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime26.property(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:50.282Z" + "'", str11, "2020-11-25T01:49:50.282Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:50.282Z" + "'", str20, "2020-11-25T01:49:50.282Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:50.282Z" + "'", str31, "2020-11-25T01:49:50.282Z");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:50.282Z" + "'", str47, "2020-11-25T01:49:50.282Z");
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2020 + "'", int58 == 2020);
        org.junit.Assert.assertNotNull(property59);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        int int12 = mutableDateTime8.getMonthOfYear();
        org.joda.time.DateTime dateTime13 = mutableDateTime8.toDateTimeISO();
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        boolean boolean21 = mutableDateTime17.isEqualNow();
        mutableDateTime17.setDate((long) 20);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.minuteOfHour();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime31.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime31.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.DurationField durationField35 = property34.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime8.property(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:50.394Z" + "'", str19, "2020-11-25T01:49:50.394Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        mutableDateTime13.setTime((long) 48);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology31);
        mutableDateTime23.setChronology(chronology31);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime13.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime35.toMutableDateTimeISO();
        mutableDateTime38.setDayOfYear(100);
        long long41 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.493Z" + "'", str4, "2020-11-25T01:49:50.493Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:50.493Z" + "'", str20, "2020-11-25T01:49:50.493Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:50.493Z" + "'", str29, "2020-11-25T01:49:50.493Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 230L + "'", long41 == 230L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime3.setDate(readableInstant9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.secondOfMinute();
        java.util.Date date12 = mutableDateTime3.toDate();
        mutableDateTime3.setMillis((long) 30);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime17.add(readablePeriod23, (int) (byte) 0);
        boolean boolean26 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime3.secondOfMinute();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime31, dateTimeZone34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime35, dateTimeZone40);
        int int43 = mutableDateTime42.getMinuteOfHour();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime42.toMutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:18.596Z", dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime3.toMutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:49.590Z", dateTimeZone47);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:50.566Z" + "'", str5, "2020-11-25T01:49:50.566Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 01:49:50 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:50.566Z" + "'", str19, "2020-11-25T01:49:50.566Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:50.566Z" + "'", str33, "2020-11-25T01:49:50.566Z");
        org.junit.Assert.assertNotNull(dateTimeZone40);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 49 + "'", int43 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        mutableDateTime5.addSeconds(6439318);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundFloor();
        boolean boolean12 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsShortText(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfYear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology40);
        mutableDateTime32.setChronology(chronology40);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime46, dateTimeZone49);
        org.joda.time.DateTime dateTime51 = mutableDateTime50.toDateTimeISO();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        int int57 = mutableDateTime54.getYearOfCentury();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime50.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime32.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime24.toMutableDateTime(chronology58);
        boolean boolean63 = mutableDateTime10.equals((java.lang.Object) mutableDateTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str4, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20" + "'", str9, "20");
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str15, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str29, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str38, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str48, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertNotNull(dateTime51);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2020-11-25T01:49:50.732Z" + "'", str56, "2020-11-25T01:49:50.732Z");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20 + "'", int57 == 20);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        mutableDateTime14.add((long) 330);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime14.getZone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.870Z" + "'", str4, "2020-11-25T01:49:50.870Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:50.870Z" + "'", str8, "2020-11-25T01:49:50.870Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfSecond();
        java.lang.String str12 = property11.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.copy();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        java.lang.String str25 = mutableDateTime19.toString();
        mutableDateTime19.setSecondOfDay(2);
        mutableDateTime19.setSecondOfDay(58);
        boolean boolean30 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime19.setHourOfDay(0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.909Z" + "'", str4, "2020-11-25T01:49:50.909Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:50.909Z" + "'", str8, "2020-11-25T01:49:50.909Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfSecond]" + "'", str12, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:50.909Z" + "'", str21, "2020-11-25T01:49:50.909Z");
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:50.909Z" + "'", str25, "2020-11-25T01:49:50.909Z");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        int int14 = mutableDateTime2.getYear();
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        mutableDateTime18.setDate(readableInstant24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.secondOfMinute();
        java.util.Date date27 = mutableDateTime18.toDate();
        mutableDateTime18.setMillis((long) 30);
        mutableDateTime18.addDays(1);
        int int32 = mutableDateTime18.getDayOfYear();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.954Z" + "'", str4, "2020-11-25T01:49:50.954Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:50.954Z" + "'", str20, "2020-11-25T01:49:50.954Z");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed Nov 25 01:49:50 UTC 2020");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology15);
        mutableDateTime7.setChronology(chronology15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime25.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime7.toMutableDateTime(chronology33);
        mutableDateTime7.setDate((long) 34);
        int int39 = mutableDateTime7.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.026Z" + "'", str4, "2020-11-25T01:49:51.026Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:51.026Z" + "'", str13, "2020-11-25T01:49:51.026Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:51.026Z" + "'", str23, "2020-11-25T01:49:51.026Z");
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:51.026Z" + "'", str31, "2020-11-25T01:49:51.026Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 747, dateTimeZone4);
        mutableDateTime8.addYears(0);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.copy();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTimeISO();
        int int14 = mutableDateTime13.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.era();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.yearOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.153Z" + "'", str4, "2020-11-25T01:49:51.153Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:30.877Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.centuryOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        int int19 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.String str20 = property10.getAsShortText();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        java.lang.String str29 = mutableDateTime23.toString();
        mutableDateTime23.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime23.secondOfDay();
        int int34 = mutableDateTime23.getCenturyOfEra();
        int int35 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DurationField durationField36 = property10.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime38 = property10.add(97);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime38);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime42, dateTimeZone45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.199Z", dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime46, dateTimeZone51);
        int int54 = mutableDateTime53.getMinuteOfHour();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime53.toMutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime38, dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:47.881Z", dateTimeZone58);
        org.junit.Assert.assertNotNull(mutableDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:51.202Z" + "'", str7, "2020-11-25T01:49:51.202Z");
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:51.202Z" + "'", str15, "2020-11-25T01:49:51.202Z");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "20" + "'", str20, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:51.203Z" + "'", str25, "2020-11-25T01:49:51.203Z");
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:51.203Z" + "'", str29, "2020-11-25T01:49:51.203Z");
        org.junit.Assert.assertNotNull(gregorianCalendar32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(durationField36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:51.203Z" + "'", str44, "2020-11-25T01:49:51.203Z");
        org.junit.Assert.assertNotNull(dateTimeZone51);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 49 + "'", int54 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime61);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.property(dateTimeFieldType13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.secondOfDay();
        int int16 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime22.toGregorianCalendar();
        mutableDateTime22.setDate((long) 10);
        mutableDateTime22.setTime((long) 1);
        java.util.Date date28 = mutableDateTime22.toDate();
        int int29 = mutableDateTime22.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.dayOfWeek();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        java.lang.String str39 = mutableDateTime33.toString();
        mutableDateTime33.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar42 = mutableDateTime33.toGregorianCalendar();
        java.lang.Object obj43 = mutableDateTime33.clone();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        mutableDateTime46.setSecondOfDay((int) '#');
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) (short) -1);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.Instant instant59 = mutableDateTime58.toInstant();
        mutableDateTime58.setSecondOfDay((int) '#');
        int int62 = mutableDateTime58.getMonthOfYear();
        org.joda.time.DateTime dateTime63 = mutableDateTime58.toDateTimeISO();
        int int64 = property53.compareTo((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property53.getFieldType();
        int int66 = mutableDateTime46.get(dateTimeFieldType65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime33.property(dateTimeFieldType65);
        mutableDateTime22.set(dateTimeFieldType65, 58);
        int int70 = mutableDateTime2.get(dateTimeFieldType65);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.334Z" + "'", str4, "2020-11-25T01:49:51.334Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:51.334Z" + "'", str35, "2020-11-25T01:49:51.334Z");
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:51.334Z" + "'", str39, "2020-11-25T01:49:51.334Z");
        org.junit.Assert.assertNotNull(gregorianCalendar42);
        org.junit.Assert.assertNotNull(obj43);
// flaky:         org.junit.Assert.assertEquals(obj43.toString(), "2020-11-25T00:00:02.334Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "2020-11-25T00:00:02.334Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "2020-11-25T00:00:02.334Z");
        org.junit.Assert.assertNotNull(instant47);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(instant59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 11 + "'", int62 == 11);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 330 + "'", int66 == 330);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 330 + "'", int70 == 330);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        mutableDateTime4.setTime((long) 48);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime14.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime4.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.hourOfDay();
        org.joda.time.DateTime dateTime28 = mutableDateTime26.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:51.442Z" + "'", str11, "2020-11-25T01:49:51.442Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:51.442Z" + "'", str20, "2020-11-25T01:49:51.442Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
    }
}
