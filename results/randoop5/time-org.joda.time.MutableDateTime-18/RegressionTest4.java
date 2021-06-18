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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        mutableDateTime9.setWeekOfWeekyear((int) '4');
        int int12 = mutableDateTime9.getYearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        mutableDateTime15.addDays((int) (byte) 100);
        mutableDateTime15.addSeconds(43);
        java.util.Locale locale22 = null;
        java.util.Calendar calendar23 = mutableDateTime15.toCalendar(locale22);
        boolean boolean24 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime15);
        int int25 = mutableDateTime15.getEra();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        int int32 = mutableDateTime30.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime30.toMutableDateTimeISO();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        mutableDateTime30.setRounding(dateTimeField42);
        mutableDateTime26.setRounding(dateTimeField42);
        long long45 = mutableDateTime26.getMillis();
        int int46 = mutableDateTime26.getEra();
        org.joda.time.DateTimeField dateTimeField47 = mutableDateTime26.getRoundingField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setRounding(dateTimeField47, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 57");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1614909020393,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=64,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=50,SECOND=20,MILLISECOND=393,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 37 + "'", int32 == 37);
        org.junit.Assert.assertNotNull(mutableDateTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:37.393Z" + "'", str38, "2020-11-25T01:49:37.393Z");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 946684800000L + "'", long45 == 946684800000L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        int int6 = mutableDateTime5.getDayOfWeek();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        mutableDateTime9.setSecondOfDay(2);
        boolean boolean18 = mutableDateTime9.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime19.setZone(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime5.toMutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:37.445Z" + "'", str11, "2020-11-25T01:49:37.445Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:37.445Z" + "'", str15, "2020-11-25T01:49:37.445Z");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        int int16 = mutableDateTime15.getYearOfEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsText(locale21);
        java.lang.String str23 = property20.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property20.getFieldType();
        boolean boolean25 = mutableDateTime15.isSupported(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime2.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfCeiling();
        org.joda.time.DurationField durationField29 = property27.getDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.481Z" + "'", str4, "2020-11-25T01:49:37.481Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:37.481Z" + "'", str12, "2020-11-25T01:49:37.481Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(durationField29);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        int int9 = property7.getMaximumValue();
        java.lang.String str10 = property7.getAsText();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfEven();
        org.joda.time.Interval interval12 = property7.toInterval();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property7.getAsText(locale13);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.529Z" + "'", str4, "2020-11-25T01:49:37.529Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2922789 + "'", int9 == 2922789);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20" + "'", str10, "20");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "20" + "'", str14, "20");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        int int8 = mutableDateTime5.getHourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime5.getRoundingField();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime5.add(readablePeriod10);
        mutableDateTime5.addMinutes((int) (short) 1);
        mutableDateTime5.setDayOfYear(8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.dayOfMonth();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        mutableDateTime1.add(98L);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.set(11);
        int int17 = mutableDateTime16.getDayOfYear();
        int int18 = mutableDateTime16.getEra();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.centuryOfEra();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        boolean boolean23 = mutableDateTime1.isSupported(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay(71726366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71726366 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:37.600Z" + "'", str9, "2020-11-25T01:49:37.600Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 330 + "'", int17 == 330);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20" + "'", str21, "20");
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime2.add(readablePeriod16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:37.634Z" + "'", str10, "2020-11-25T01:49:37.634Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        java.util.Locale locale12 = null;
        int int13 = property10.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.setDate((long) 9);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        mutableDateTime15.setDayOfYear(2);
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.weekyear();
        mutableDateTime22.add(98L);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.dayOfWeek();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime28.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.set(11);
        int int38 = mutableDateTime37.getDayOfYear();
        int int39 = mutableDateTime37.getEra();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime37.centuryOfEra();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsText(locale41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property40.getFieldType();
        boolean boolean44 = mutableDateTime22.isSupported(dateTimeFieldType43);
        int int45 = dateTime20.get(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:37.721Z" + "'", str10, "2020-11-25T01:49:37.721Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:37.721Z" + "'", str30, "2020-11-25T01:49:37.721Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 330 + "'", int38 == 330);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "20" + "'", str42, "20");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20 + "'", int45 == 20);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.era();
        java.lang.String str10 = property9.getAsText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.773Z" + "'", str4, "2020-11-25T01:49:37.773Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        int int14 = mutableDateTime13.getSecondOfMinute();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.secondOfDay();
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime13.centuryOfEra();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:37.803Z" + "'", str10, "2020-11-25T01:49:37.803Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:37.803Z" + "'", str19, "2020-11-25T01:49:37.803Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.addMillis((int) 'a');
        boolean boolean9 = mutableDateTime6.isEqualNow();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime6.toMutableDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology16);
        mutableDateTime19.addSeconds(1970);
        mutableDateTime19.setDayOfYear(2);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property25.getAsShortText(locale26);
        org.joda.time.DurationField durationField28 = property25.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime30 = property25.addWrapField(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        long long34 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime30);
        int int35 = mutableDateTime30.getYearOfEra();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        boolean boolean42 = mutableDateTime38.isBefore((long) 10);
        int int43 = mutableDateTime38.getYearOfCentury();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.DateTime dateTime51 = mutableDateTime38.toDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime30.toMutableDateTime(chronology50);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:37.836Z" + "'", str14, "2020-11-25T01:49:37.836Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25" + "'", str27, "25");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-06T01:49:37.836Z" + "'", str32, "2020-11-06T01:49:37.836Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 19L + "'", long34 == 19L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2020 + "'", int35 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:37.836Z" + "'", str40, "2020-11-25T01:49:37.836Z");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2020-11-25T01:49:37.836Z" + "'", str48, "2020-11-25T01:49:37.836Z");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        int int8 = mutableDateTime7.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.centuryOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.915Z" + "'", str4, "2020-11-25T01:49:37.915Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6577916 + "'", int8 == 6577916);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(24);
        boolean boolean11 = mutableDateTime10.isEqualNow();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsText(locale7);
        java.lang.String str9 = property4.getAsString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "December" + "'", str8, "December");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12" + "'", str9, "12");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone4);
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime9.toCalendar(locale10);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=14,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=14,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        mutableDateTime20.setTime((long) '#');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        java.lang.String str33 = mutableDateTime27.toString();
        int int34 = mutableDateTime20.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime27.dayOfYear();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        mutableDateTime27.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime15.toMutableDateTime(chronology42);
        boolean boolean46 = mutableDateTime45.isEqualNow();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.057Z" + "'", str10, "2020-11-25T01:49:38.057Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:38.057Z" + "'", str22, "2020-11-25T01:49:38.057Z");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:38.057Z" + "'", str29, "2020-11-25T01:49:38.057Z");
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:38.057Z" + "'", str33, "2020-11-25T01:49:38.057Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:38.057Z" + "'", str40, "2020-11-25T01:49:38.057Z");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        long long10 = property7.remainder();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfYear();
        mutableDateTime9.setTime((long) 330);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        mutableDateTime22.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.addWrapField(4);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.secondOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.centuryOfEra();
        boolean boolean32 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime29.setMillisOfDay(970);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.121Z" + "'", str4, "2020-11-25T01:49:38.121Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:38.122Z" + "'", str11, "2020-11-25T01:49:38.122Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:38.122Z" + "'", str15, "2020-11-25T01:49:38.122Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        boolean boolean7 = property6.isLeap();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        mutableDateTime5.setDate((long) 10);
        boolean boolean9 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setMinuteOfHour(6541);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6541 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime2.toCalendar(locale13);
        long long15 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        int int22 = mutableDateTime20.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime20.toMutableDateTimeISO();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        mutableDateTime20.setRounding(dateTimeField32);
        mutableDateTime16.setRounding(dateTimeField32);
        int int35 = mutableDateTime2.get(dateTimeField32);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime2.add(readableDuration36, 264);
        int int39 = mutableDateTime2.getMillisOfDay();
        int int40 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfMonth();
        int int43 = mutableDateTime41.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        int int47 = mutableDateTime2.get(dateTimeFieldType46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime50.dayOfYear();
        int int53 = mutableDateTime50.getYearOfEra();
        boolean boolean54 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.203Z" + "'", str4, "2020-11-25T01:49:38.203Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1606268978203,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=38,MILLISECOND=203,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1606268978203L + "'", long15 == 1606268978203L);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 38 + "'", int22 == 38);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:38.204Z" + "'", str28, "2020-11-25T01:49:38.204Z");
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6578203 + "'", int39 == 6578203);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2020 + "'", int40 == 2020);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2020 + "'", int53 == 2020);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setSecondOfMinute(0);
        boolean boolean16 = mutableDateTime2.isAfter(1606268869786L);
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
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        boolean boolean33 = mutableDateTime30.isEqualNow();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime30.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology40);
        mutableDateTime19.setChronology(chronology40);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfMonth();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        int int50 = mutableDateTime48.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime48.toMutableDateTimeISO();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        mutableDateTime48.setRounding(dateTimeField60);
        mutableDateTime44.setRounding(dateTimeField60);
        int int63 = mutableDateTime19.get(dateTimeField60);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setRounding(dateTimeField60, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 36");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str21, "2020-11-25T01:49:38.254Z");
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str25, "2020-11-25T01:49:38.254Z");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str38, "2020-11-25T01:49:38.254Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeZone49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 38 + "'", int50 == 38);
        org.junit.Assert.assertNotNull(mutableDateTime51);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2020-11-25T01:49:38.254Z" + "'", str56, "2020-11-25T01:49:38.254Z");
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20 + "'", int63 == 20);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        mutableDateTime14.setSecondOfDay(2);
        int int23 = mutableDateTime14.getMinuteOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.add((long) (short) -1);
        int int30 = mutableDateTime29.getWeekyear();
        int int31 = mutableDateTime29.getDayOfWeek();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        mutableDateTime34.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.secondOfMinute();
        long long40 = property39.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        mutableDateTime29.set(dateTimeFieldType41, 1);
        boolean boolean44 = mutableDateTime14.isSupported(dateTimeFieldType41);
        mutableDateTime11.set(dateTimeFieldType41, 31);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (short) 100, dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime11.toMutableDateTime(dateTimeZone50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        mutableDateTime55.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.addWrapField(4);
        boolean boolean64 = mutableDateTime62.isEqual(100L);
        mutableDateTime62.add((long) 48);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.Instant instant70 = mutableDateTime69.toInstant();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime69.monthOfYear();
        mutableDateTime69.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.secondOfMinute();
        int int75 = property74.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime76 = property74.roundFloor();
        boolean boolean77 = mutableDateTime62.isBefore((org.joda.time.ReadableInstant) mutableDateTime76);
        boolean boolean79 = mutableDateTime62.equals((java.lang.Object) "2020-11-25T01:45:47.682Z");
        org.joda.time.Chronology chronology80 = mutableDateTime62.getChronology();
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.Instant instant84 = mutableDateTime83.toInstant();
        mutableDateTime83.setSecondOfDay((int) '#');
        int int87 = mutableDateTime83.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime83.yearOfCentury();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime83.weekOfWeekyear();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.MutableDateTime mutableDateTime92 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology91);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime92.dayOfYear();
        java.util.Locale locale94 = null;
        java.lang.String str95 = property93.getAsText(locale94);
        org.joda.time.DateTimeFieldType dateTimeFieldType96 = property93.getFieldType();
        boolean boolean97 = mutableDateTime83.isSupported(dateTimeFieldType96);
        int int98 = mutableDateTime62.get(dateTimeFieldType96);
        org.joda.time.MutableDateTime.Property property99 = mutableDateTime52.property(dateTimeFieldType96);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.312Z" + "'", str4, "2020-11-25T01:49:38.312Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:38.312Z" + "'", str16, "2020-11-25T01:49:38.312Z");
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:38.312Z" + "'", str20, "2020-11-25T01:49:38.312Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 312L + "'", long40 == 312L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertNotNull(instant84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 11 + "'", int87 == 11);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1" + "'", str95, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 64 + "'", int98 == 64);
        org.junit.Assert.assertNotNull(property99);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:42.086Z");
        org.joda.time.Chronology chronology2 = mutableDateTime1.getChronology();
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.addMillis((int) 'a');
        boolean boolean6 = mutableDateTime3.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime3.toMutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        mutableDateTime17.addWeekyears((int) (byte) -1);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone23);
        mutableDateTime17.setZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:25.024Z", dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime27.setDayOfWeek(6516849);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6516849 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:38.476Z" + "'", str11, "2020-11-25T01:49:38.476Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.setTime((long) 785);
        int int6 = mutableDateTime0.getSecondOfDay();
        mutableDateTime0.addMonths(136);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setDayOfYear(6544);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6544 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.557Z" + "'", str10, "2020-11-25T01:49:38.557Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        int int8 = mutableDateTime5.getHourOfDay();
        int int9 = mutableDateTime5.getSecondOfMinute();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = mutableDateTime5.toCalendar(locale10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setHourOfDay(31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1606780800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        int int11 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addMonths(0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.yearOfEra();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        mutableDateTime17.setTime((long) '#');
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        java.lang.String str30 = mutableDateTime24.toString();
        int int31 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        mutableDateTime24.setTime((long) 330);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfMonth();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property36.getAsShortText(locale37);
        org.joda.time.DurationField durationField39 = property36.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime40 = property36.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime42 = property36.add(366);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology44);
        mutableDateTime45.addMillis((int) 'a');
        boolean boolean48 = mutableDateTime45.isEqualNow();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime45.toMutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology55);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime42.toMutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology55);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime24.toMutableDateTime(chronology55);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime60);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:38.630Z" + "'", str19, "2020-11-25T01:49:38.630Z");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:38.630Z" + "'", str26, "2020-11-25T01:49:38.630Z");
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:38.630Z" + "'", str30, "2020-11-25T01:49:38.630Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "25" + "'", str38, "25");
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T01:49:38.630Z" + "'", str53, "2020-11-25T01:49:38.630Z");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        int int16 = mutableDateTime15.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.DurationField durationField19 = property18.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.add(34);
        org.joda.time.DateTimeField dateTimeField22 = property18.getField();
        mutableDateTime15.setRounding(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.695Z" + "'", str10, "2020-11-25T01:49:38.695Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property9.add(6362878);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:49.156Z");
        boolean boolean16 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfWeek();
        int int19 = mutableDateTime17.getMillisOfDay();
        java.util.Date date20 = mutableDateTime17.toDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.743Z" + "'", str4, "2020-11-25T01:49:38.743Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6349156 + "'", int19 == 6349156);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Nov 25 01:45:49 UTC 2020");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 2020);
        int int12 = property7.get();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = property7.set("2020-11-25T01:47:35.771Z", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:35.771Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        boolean boolean10 = mutableDateTime2.isBefore(1612316839538L);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime2.add(readablePeriod11, 1601516850);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime16.toMutableDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime16.setRounding(dateTimeField28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime16.weekyear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.roundCeiling();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((int) '#', (int) (short) 10, 18, (int) (byte) 1, (int) (short) 0, 19, (int) (byte) 1, dateTimeZone45);
        mutableDateTime33.setZoneRetainFields(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) 1601516850, dateTimeZone45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.852Z" + "'", str4, "2020-11-25T01:49:38.852Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:38.853Z" + "'", str24, "2020-11-25T01:49:38.853Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(108, 437, 94, 1601516928, 20, 6489, 201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1601516928 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfDay();
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumShortTextLength(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = property4.set("2020-11-25T01:47:03.822Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:03.822Z\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        mutableDateTime9.setChronology(chronology24);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime9.toGregorianCalendar();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setHourOfDay(2);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        mutableDateTime37.addMillis((int) 'a');
        boolean boolean40 = mutableDateTime37.isEqualNow();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime37.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology47);
        mutableDateTime30.setChronology(chronology47);
        org.joda.time.DateTime dateTime52 = mutableDateTime9.toDateTime(chronology47);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime9.yearOfEra();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology55);
        mutableDateTime56.addMillis((int) 'a');
        boolean boolean59 = mutableDateTime56.isEqualNow();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        int int65 = mutableDateTime62.getYearOfCentury();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime56.toMutableDateTime(chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = org.joda.time.MutableDateTime.now(chronology66);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime68.millisOfSecond();
        java.util.Locale locale70 = null;
        java.util.Calendar calendar71 = mutableDateTime68.toCalendar(locale70);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime74.getZone();
        int int76 = mutableDateTime74.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime74.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime77.dayOfYear();
        java.lang.String str79 = property78.getAsShortText();
        java.lang.String str80 = property78.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property78.getFieldType();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime68.property(dateTimeFieldType81);
        int int83 = mutableDateTime9.get(dateTimeFieldType81);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str4, "2020-11-25T01:49:38.941Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str11, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str15, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str22, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str32, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str45, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2020-11-25T01:49:38.941Z" + "'", str64, "2020-11-25T01:49:38.941Z");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20 + "'", int65 == 20);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(calendar71);
// flaky:         org.junit.Assert.assertEquals(calendar71.toString(), "java.util.GregorianCalendar[time=1606268978941,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=38,MILLISECOND=941,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone75);
// flaky:         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 38 + "'", int76 == 38);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "330" + "'", str79, "330");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Property[dayOfYear]" + "'", str80, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 330 + "'", int83 == 330);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.addWrapField(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        mutableDateTime6.addWeekyears(6440645);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.add(durationFieldType12, 6544861);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-06T01:49:39.035Z" + "'", str8, "2020-11-06T01:49:39.035Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.minuteOfDay();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.centuryOfEra();
        java.lang.String str3 = property2.getAsString();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6572000);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-06T01:47:48.165Z");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        mutableDateTime2.setRounding(dateTimeField14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekyear();
        org.joda.time.DurationField durationField17 = property16.getRangeDurationField();
        java.util.Locale locale18 = null;
        int int19 = property16.getMaximumShortTextLength(locale18);
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.Chronology chronology21 = mutableDateTime20.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:39.177Z" + "'", str10, "2020-11-25T01:49:39.177Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumTextLength(locale18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:39.227Z" + "'", str10, "2020-11-25T01:49:39.227Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        int int9 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.toMutableDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        java.util.Date date22 = mutableDateTime16.toDate();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.add((long) (short) -1);
        mutableDateTime28.setWeekOfWeekyear(9);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = mutableDateTime28.toDateTime(dateTimeZone34);
        boolean boolean37 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime28.minuteOfHour();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(1606268729646L, dateTimeZone43);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = mutableDateTime46.toDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime28.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime56 = mutableDateTime12.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime7.toMutableDateTime(chronology57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(6389, 6523, 65, 490, 1601516941, 330, 294, chronology57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 490 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:39.282Z" + "'", str18, "2020-11-25T01:49:39.282Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed Nov 25 01:49:39 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.addWrapField(11);
        org.joda.time.DurationField durationField7 = property1.getRangeDurationField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        mutableDateTime15.setDayOfYear(2);
        int int20 = mutableDateTime15.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.monthOfYear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:39.417Z" + "'", str10, "2020-11-25T01:49:39.417Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getWeekOfWeekyear();
        int int9 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.set(51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property10.add(1606268899230L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1606268899230 * 86400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.493Z" + "'", str4, "2020-11-25T01:49:39.493Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        boolean boolean12 = mutableDateTime3.isAfterNow();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        boolean boolean18 = mutableDateTime15.isEqualNow();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime15.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime3.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 100, chronology25);
        int int29 = mutableDateTime28.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:39.558Z" + "'", str5, "2020-11-25T01:49:39.558Z");
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:39.558Z" + "'", str9, "2020-11-25T01:49:39.558Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:39.558Z" + "'", str23, "2020-11-25T01:49:39.558Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundCeiling();
        int int12 = mutableDateTime11.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.weekOfWeekyear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6580000 + "'", int12 == 6580000);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        int int9 = property7.getMaximumValue();
        java.lang.String str10 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfEven();
        org.joda.time.Chronology chronology12 = mutableDateTime11.getChronology();
        int int13 = mutableDateTime11.getYear();
        mutableDateTime11.setMinuteOfDay(106);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.810Z" + "'", str4, "2020-11-25T01:49:39.810Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2922789 + "'", int9 == 2922789);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[centuryOfEra]" + "'", str10, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.set(0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = mutableDateTime10.getRoundingField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 861L + "'", long8 == 861L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(dateTimeField12);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.dayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime8.property(dateTimeFieldType17);
        java.lang.String str19 = property18.getAsText();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField(98);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        mutableDateTime24.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.secondOfMinute();
        boolean boolean30 = property29.isLeap();
        org.joda.time.MutableDateTime mutableDateTime32 = property29.addWrapField(58);
        org.joda.time.MutableDateTime mutableDateTime33 = property29.roundFloor();
        boolean boolean34 = property18.equals((java.lang.Object) mutableDateTime33);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "336" + "'", str19, "336");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        int int12 = mutableDateTime11.getSecondOfDay();
        int int13 = mutableDateTime11.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.era();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.997Z" + "'", str4, "2020-11-25T01:49:39.997Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6579 + "'", int12 == 6579);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6579000 + "'", int13 == 6579000);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.getMutableDateTime();
        int int13 = mutableDateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology14 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar3, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        int int17 = mutableDateTime15.getWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(gregorianCalendar3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfEra();
        boolean boolean16 = mutableDateTime14.isEqualNow();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:40.129Z" + "'", str5, "2020-11-25T01:49:40.129Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        mutableDateTime15.setDayOfYear(2);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property21.getAsShortText(locale22);
        org.joda.time.DurationField durationField24 = property21.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime26 = property21.addWrapField(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfWeek();
        java.lang.String str39 = property38.getAsText();
        org.joda.time.MutableDateTime mutableDateTime41 = property38.add(4);
        boolean boolean42 = mutableDateTime26.equals((java.lang.Object) property38);
        boolean boolean43 = mutableDateTime26.isBeforeNow();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:40.174Z" + "'", str10, "2020-11-25T01:49:40.174Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "25" + "'", str23, "25");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-06T01:49:40.174Z" + "'", str28, "2020-11-06T01:49:40.174Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:40.174Z" + "'", str34, "2020-11-25T01:49:40.174Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Wednesday" + "'", str39, "Wednesday");
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        boolean boolean19 = mutableDateTime16.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        int int29 = mutableDateTime28.getYearOfCentury();
        boolean boolean30 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        int int31 = mutableDateTime13.getSecondOfDay();
        boolean boolean33 = mutableDateTime13.isEqual((long) 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:40.242Z" + "'", str10, "2020-11-25T01:49:40.242Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:40.242Z" + "'", str24, "2020-11-25T01:49:40.242Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        java.util.Date date8 = mutableDateTime2.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime2.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.year();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.398Z" + "'", str4, "2020-11-25T01:49:40.398Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.addWrapField(821);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        int int6 = mutableDateTime2.getMonthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        mutableDateTime0.setMinuteOfHour((int) (short) 0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6551);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        mutableDateTime6.setHourOfDay(2);
        int int11 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.copy();
        mutableDateTime12.setSecondOfDay(42);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.minuteOfDay();
        int int16 = mutableDateTime12.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(gregorianCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:40.857Z" + "'", str8, "2020-11-25T01:49:40.857Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        mutableDateTime9.add((long) 48);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        mutableDateTime16.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfMinute();
        int int22 = property21.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundFloor();
        boolean boolean24 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTime dateTime25 = mutableDateTime9.toDateTime();
        mutableDateTime9.addHours(53);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime25);
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
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.addWrapField(6535);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property10.add(1606268956053L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 1606268956053");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.075Z" + "'", str4, "2020-11-25T01:49:41.075Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) 1606268729646L, chronology10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology10);
        mutableDateTime2.setChronology(chronology10);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 22, chronology10);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 4, chronology10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        mutableDateTime17.setTime(1606268920090L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:41.121Z" + "'", str8, "2020-11-25T01:49:41.121Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1612316839538L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        java.util.Date date6 = mutableDateTime5.toDate();
        boolean boolean8 = mutableDateTime5.equals((java.lang.Object) 18);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.minuteOfHour();
        java.lang.String str10 = property9.toString();
        java.lang.String str11 = property9.getAsString();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[minuteOfHour]" + "'", str10, "Property[minuteOfHour]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "49" + "'", str11, "49");
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = mutableDateTime2.getRoundingField();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.minuteOfDay();
        int int10 = property9.get();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(6472004);
        mutableDateTime12.addMonths(6351317);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setMinuteOfHour(276);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 276 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 109 + "'", int10 == 109);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        mutableDateTime9.setChronology(chronology24);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime9.toGregorianCalendar();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setHourOfDay(2);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        mutableDateTime37.addMillis((int) 'a');
        boolean boolean40 = mutableDateTime37.isEqualNow();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime37.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology47);
        mutableDateTime30.setChronology(chronology47);
        org.joda.time.DateTime dateTime52 = mutableDateTime9.toDateTime(chronology47);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime9.yearOfEra();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime9.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime57 = property54.add((-173L));
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str4, "2020-11-25T01:49:41.404Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str11, "2020-11-25T01:49:41.404Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str15, "2020-11-25T01:49:41.404Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str22, "2020-11-25T01:49:41.404Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str32, "2020-11-25T01:49:41.404Z");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:41.404Z" + "'", str45, "2020-11-25T01:49:41.404Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime57);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.String str7 = property6.getAsShortText();
        java.lang.String str8 = property6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property6.getFieldType();
        int int10 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = property6.roundHalfEven();
        java.lang.String str13 = property6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[dayOfYear]" + "'", str8, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 366 + "'", int10 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[dayOfYear]" + "'", str13, "Property[dayOfYear]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:41.845Z" + "'", str10, "2020-11-25T01:49:41.845Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        org.joda.time.DurationField durationField16 = property13.getDurationField();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfMinute();
        long long25 = property24.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = property13.equals((java.lang.Object) dateTimeFieldType26);
        mutableDateTime2.set(dateTimeFieldType26, (int) (short) 1);
        mutableDateTime2.addWeeks((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.monthOfYear();
        int int33 = mutableDateTime2.getWeekOfWeekyear();
        int int34 = mutableDateTime2.getMinuteOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.914Z" + "'", str4, "2020-11-25T01:49:41.914Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 914L + "'", long25 == 914L);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 49 + "'", int33 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 109 + "'", int34 == 109);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        int int12 = property9.getMaximumValueOverall();
        int int13 = property9.getMaximumValue();
        java.lang.String str14 = property9.getAsShortText();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.984Z" + "'", str4, "2020-11-25T01:49:41.984Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86399 + "'", int12 == 86399);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399 + "'", int13 == 86399);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11" + "'", str14, "11");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        int int6 = mutableDateTime5.getYearOfCentury();
        mutableDateTime5.addHours(47);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime5.add(readablePeriod9, 6474212);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42 + "'", int4 == 42);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfYear();
        java.lang.String str13 = property12.getAsString();
        int int14 = property12.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.roundHalfEven();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime15);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        int int12 = mutableDateTime11.getSecondOfDay();
        int int13 = mutableDateTime11.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.160Z" + "'", str4, "2020-11-25T01:49:42.160Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6582 + "'", int12 == 6582);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 330 + "'", int13 == 330);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        int int24 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        int int26 = mutableDateTime10.getDayOfWeek();
        org.joda.time.DateTime dateTime27 = mutableDateTime10.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.219Z" + "'", str4, "2020-11-25T01:49:42.219Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:42.219Z" + "'", str12, "2020-11-25T01:49:42.219Z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:42.219Z" + "'", str19, "2020-11-25T01:49:42.219Z");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:42.219Z" + "'", str23, "2020-11-25T01:49:42.219Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMinimumValueOverall();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumShortTextLength(locale9);
        int int11 = property7.getMinimumValue();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.minuteOfHour();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime11.setMinuteOfDay(4);
        int int15 = mutableDateTime11.getYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.String str17 = mutableDateTime5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T00:04:42.341Z" + "'", str17, "2020-11-25T00:04:42.341Z");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setMillis((long) 18);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) "4");
        mutableDateTime2.setMillisOfSecond(3);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfEven();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        int int6 = property3.get();
        long long7 = property3.remainder();
        java.util.Locale locale8 = null;
        int int9 = property3.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        int int14 = mutableDateTime13.getDayOfMonth();
        org.joda.time.Chronology chronology15 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar4, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:23.698Z", chronology15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        java.lang.String str20 = mutableDateTime19.toString();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:46:23.698Z" + "'", str20, "2020-11-25T01:46:23.698Z");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        boolean boolean6 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime4);
        int int9 = mutableDateTime8.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.copy();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.add(durationFieldType11, 6541);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getWeekOfWeekyear();
        int int9 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        int int11 = mutableDateTime2.getCenturyOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.663Z" + "'", str4, "2020-11-25T01:49:42.663Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        long long10 = mutableDateTime2.getMillis();
        mutableDateTime2.setTime((long) 20);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime(109, 6496, 0, (int) (short) 100, (int) (short) 1, (-18692), 437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.759Z" + "'", str4, "2020-11-25T01:49:42.759Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1606268982759L + "'", long10 == 1606268982759L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(dateTimeZone12);
        mutableDateTime13.setMonthOfYear((int) (short) 10);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        mutableDateTime13.setZoneRetainFields(dateTimeZone19);
        int int22 = mutableDateTime13.getDayOfYear();
        mutableDateTime13.setWeekyear(1439);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setMinuteOfDay(6534);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6534 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.842Z" + "'", str4, "2020-11-25T01:49:42.842Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 01:49:42 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 299 + "'", int22 == 299);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfDay();
        int int14 = property13.getLeapAmount();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.909Z" + "'", str4, "2020-11-25T01:49:42.909Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        boolean boolean6 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.dayOfYear();
        int int8 = property7.getLeapAmount();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsShortText(locale7);
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfEven();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = mutableDateTime10.toString("2020-11-25T01:47:10.926Z", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43 + "'", int4 == 43);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "330" + "'", str8, "330");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property7.getAsText(locale10);
        long long12 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime13 = property7.getMutableDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43" + "'", str11, "43");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add(6492);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:43.302Z" + "'", str10, "2020-11-25T01:49:43.302Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
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
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        int int14 = mutableDateTime13.getWeekOfWeekyear();
        mutableDateTime13.setMinuteOfDay(10);
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime13.getRoundingField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.412Z" + "'", str4, "2020-11-25T01:49:43.412Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertNull(dateTimeField17);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.dayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setMonthOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:10.797Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime5.toGregorianCalendar();
        int int9 = mutableDateTime5.getDayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 336 + "'", int9 == 336);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        int int12 = property11.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property11.set("2020-11-25T01:46:25.917Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:46:25.917Z\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86399999 + "'", int12 == 86399999);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        int int12 = mutableDateTime11.getYearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property16.getAsText(locale17);
        java.lang.String str19 = property16.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property16.getFieldType();
        boolean boolean21 = mutableDateTime11.isSupported(dateTimeFieldType20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.property(dateTimeFieldType20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(gregorianCalendar3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:43.818Z" + "'", str8, "2020-11-25T01:49:43.818Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        boolean boolean8 = property7.isLeap();
        java.lang.String str9 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfCeiling();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(9);
        boolean boolean8 = mutableDateTime5.isAfterNow();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        int int14 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.dayOfMonth();
        mutableDateTime11.setMillis((long) 18);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfEven();
        boolean boolean34 = mutableDateTime32.isBefore((long) ' ');
        boolean boolean35 = mutableDateTime5.equals((java.lang.Object) mutableDateTime32);
        mutableDateTime5.addSeconds((int) (byte) 100);
        boolean boolean38 = mutableDateTime5.isEqualNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:43.954Z" + "'", str24, "2020-11-25T01:49:43.954Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.dayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsText(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime8.property(dateTimeFieldType17);
        java.lang.String str19 = property18.getAsText();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField(98);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundHalfCeiling();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "336" + "'", str19, "336");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime2.toGregorianCalendar();
        int int4 = mutableDateTime2.getWeekyear();
        int int5 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addMillis(56);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(gregorianCalendar3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
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
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property9.getAsShortText(locale10);
        org.joda.time.DurationField durationField12 = property9.getDurationField();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        org.joda.time.MutableDateTime mutableDateTime14 = property9.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        int int24 = property16.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property28.getAsText(locale29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property28.getFieldType();
        boolean boolean32 = mutableDateTime19.isSupported(dateTimeFieldType31);
        mutableDateTime14.set(dateTimeFieldType31, 46);
        boolean boolean35 = mutableDateTime2.isSupported(dateTimeFieldType31);
        int int36 = mutableDateTime2.getDayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.253Z" + "'", str4, "2020-11-25T01:49:44.253Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:44.253Z" + "'", str21, "2020-11-25T01:49:44.253Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25 + "'", int36 == 25);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.add((long) (short) 0);
        mutableDateTime7.addYears(7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        int int17 = mutableDateTime7.get(dateTimeField16);
        java.lang.Class<?> wildcardClass18 = mutableDateTime7.getClass();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.String str8 = property7.getAsText();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = property7.compareTo(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.490Z" + "'", str4, "2020-11-25T01:49:44.490Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:24.760Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfDay();
        java.util.Date date3 = mutableDateTime1.toDate();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Nov 25 01:47:24 UTC 2020");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        mutableDateTime2.setTime(0L);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        mutableDateTime10.setSecondOfDay((int) '#');
        int int14 = mutableDateTime10.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.weekOfWeekyear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsText(locale21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property20.getFieldType();
        boolean boolean24 = mutableDateTime10.isSupported(dateTimeFieldType23);
        int int25 = mutableDateTime2.get(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("70");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.add(34);
        org.joda.time.Interval interval5 = property1.toInterval();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime6.toDateTime(chronology13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        java.lang.String str25 = mutableDateTime18.toString();
        int int26 = mutableDateTime18.getYear();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone31);
        mutableDateTime32.setSecondOfDay(30);
        boolean boolean35 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        mutableDateTime32.addWeeks(28);
        boolean boolean39 = mutableDateTime32.isEqual((long) '4');
        boolean boolean40 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:44.756Z" + "'", str11, "2020-11-25T01:49:44.756Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:44.756Z" + "'", str20, "2020-11-25T01:49:44.756Z");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:44.756Z" + "'", str25, "2020-11-25T01:49:44.756Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2020 + "'", int26 == 2020);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set(58);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        boolean boolean18 = mutableDateTime14.isBefore((long) 10);
        int int19 = mutableDateTime14.getYearOfCentury();
        long long20 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTime dateTime21 = mutableDateTime14.toDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:44.859Z" + "'", str16, "2020-11-25T01:49:44.859Z");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8640013L + "'", long20 == 8640013L);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        int int8 = mutableDateTime5.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.minuteOfHour();
        java.lang.String str10 = property9.getAsString();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfCeiling();
        int int12 = mutableDateTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        long long10 = mutableDateTime2.getMillis();
        boolean boolean11 = mutableDateTime2.isEqualNow();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime2.add(readableDuration12, 0);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.weekOfWeekyear();
        int int18 = mutableDateTime16.getSecondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.977Z" + "'", str4, "2020-11-25T01:49:44.977Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1606268984977L + "'", long10 == 1606268984977L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6584 + "'", int18 == 6584);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        int int12 = mutableDateTime11.getDayOfYear();
        int int13 = mutableDateTime11.getEra();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.millisOfSecond();
        int int15 = mutableDateTime11.getMonthOfYear();
        mutableDateTime11.setSecondOfDay(57);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        mutableDateTime24.setWeekOfWeekyear(9);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime24.toDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(879L, dateTimeZone30);
        mutableDateTime11.setZone(dateTimeZone30);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.055Z" + "'", str4, "2020-11-25T01:49:45.055Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        boolean boolean8 = mutableDateTime6.isEqual((long) 49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime6.toString(dateTimeFormatter9);
        int int11 = mutableDateTime6.getMinuteOfHour();
        int int12 = mutableDateTime6.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setWeekOfWeekyear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str10, "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property1.getField();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.getMutableDateTime();
        int int7 = property1.getMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.centuryOfEra();
        java.util.Date date13 = mutableDateTime7.toDate();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime7.toMutableDateTime(dateTimeZone17);
        int int19 = mutableDateTime18.getYearOfCentury();
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundFloor();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:45.286Z" + "'", str9, "2020-11-25T01:49:45.286Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 01:49:45 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        int int9 = property7.getLeapAmount();
        org.joda.time.Interval interval10 = property7.toInterval();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfCeiling();
        org.joda.time.DurationField durationField11 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime13 = property7.set("12");
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime5 = property1.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property1.add(366);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        mutableDateTime10.addMillis((int) 'a');
        boolean boolean13 = mutableDateTime10.isEqualNow();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime10.toMutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime7.toMutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.DurationFieldType durationFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime25.add(durationFieldType26, 6328);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:45.415Z" + "'", str18, "2020-11-25T01:49:45.415Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setMillis((long) 18);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) "4");
        mutableDateTime2.setMillisOfSecond(3);
        org.joda.time.DateTime dateTime14 = mutableDateTime2.toDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime2.add(readableDuration15, 6496);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        boolean boolean19 = mutableDateTime16.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        int int29 = mutableDateTime28.getYearOfCentury();
        boolean boolean30 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime13.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundCeiling();
        mutableDateTime32.addMillis(6397);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 365);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime36.toMutableDateTime(dateTimeZone40);
        mutableDateTime32.setZone(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:45.592Z" + "'", str10, "2020-11-25T01:49:45.592Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:45.593Z" + "'", str24, "2020-11-25T01:49:45.593Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        boolean boolean10 = property9.isLeap();
        int int11 = property9.get();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        mutableDateTime17.setWeekOfWeekyear(9);
        mutableDateTime17.add(10L);
        int int22 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.String str23 = property9.getAsString();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property25.getAsShortText(locale26);
        org.joda.time.DurationField durationField28 = property25.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime29 = property25.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property25.add(366);
        int int32 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.716Z" + "'", str4, "2020-11-25T01:49:45.716Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6585 + "'", int11 == 6585);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1601516985 + "'", int22 == 1601516985);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6585" + "'", str23, "6585");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25" + "'", str27, "25");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        int int11 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addMonths(0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.dayOfWeek();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) str4);
        boolean boolean6 = mutableDateTime5.isEqualNow();
        int int7 = mutableDateTime5.getRoundingMode();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime5.toCalendar(locale8);
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-62135596800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime5 = property1.roundFloor();
        java.lang.String str6 = property1.getAsText();
        java.lang.String str7 = property1.getAsString();
        java.lang.String str8 = property1.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25" + "'", str6, "25");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25" + "'", str7, "25");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[dayOfMonth]" + "'", str8, "Property[dayOfMonth]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        int int7 = mutableDateTime2.getEra();
        int int8 = mutableDateTime2.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6586102 + "'", int8 == 6586102);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime7.add(readableDuration9, 0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add(107);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:46.271Z" + "'", str10, "2020-11-25T01:49:46.271Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.lang.String str12 = property8.getAsString();
        boolean boolean13 = property8.isLeap();
        java.lang.String str14 = property8.getAsString();
        org.joda.time.MutableDateTime mutableDateTime16 = property8.add((long) 37);
        org.joda.time.MutableDateTime mutableDateTime17 = property8.roundCeiling();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.318Z" + "'", str4, "2020-11-25T01:49:46.318Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "3" + "'", str14, "3");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        mutableDateTime5.setDate((long) 10);
        boolean boolean9 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1606268754895L);
        int int2 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        int int5 = property4.getMaximumValueOverall();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1439 + "'", int5 == 1439);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.addMillis((int) 'a');
        boolean boolean6 = mutableDateTime3.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime3.toMutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        mutableDateTime16.addSeconds(1970);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        mutableDateTime21.setTime((long) '#');
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        java.lang.String str34 = mutableDateTime28.toString();
        int int35 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime28.dayOfYear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime28.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime16.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology43);
        java.lang.String str48 = mutableDateTime47.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:46.542Z" + "'", str11, "2020-11-25T01:49:46.542Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:46.542Z" + "'", str23, "2020-11-25T01:49:46.542Z");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:46.542Z" + "'", str30, "2020-11-25T01:49:46.542Z");
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:46.542Z" + "'", str34, "2020-11-25T01:49:46.542Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:46.542Z" + "'", str41, "2020-11-25T01:49:46.542Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str48, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsShortText(locale7);
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "330" + "'", str8, "330");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfMonth();
        java.lang.String str4 = property3.getAsShortText();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfYear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        java.util.Date date16 = mutableDateTime10.toDate();
        boolean boolean17 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime20.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.set(11);
        int int30 = property27.getMaximumValueOverall();
        int int31 = property27.getMaximumValue();
        int int32 = property27.get();
        org.joda.time.MutableDateTime mutableDateTime33 = property27.roundFloor();
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime33);
        mutableDateTime10.setSecondOfMinute(55);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:46.765Z" + "'", str12, "2020-11-25T01:49:46.765Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 01:49:46 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:46.765Z" + "'", str22, "2020-11-25T01:49:46.765Z");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 86399 + "'", int30 == 86399);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 86399 + "'", int31 == 86399);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.Interval interval10 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add((int) (byte) 0);
        mutableDateTime12.addDays(6440645);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.853Z" + "'", str4, "2020-11-25T01:49:46.853Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        boolean boolean19 = mutableDateTime16.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        int int29 = mutableDateTime28.getYearOfCentury();
        boolean boolean30 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        int int35 = mutableDateTime33.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime33.toMutableDateTimeISO();
        mutableDateTime36.setMillis((long) 24);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        int int43 = mutableDateTime41.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime41.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField47 = property45.getField();
        int int48 = mutableDateTime36.get(dateTimeField47);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setRounding(dateTimeField47, 6582);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 6582");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str10, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:46.930Z" + "'", str24, "2020-11-25T01:49:46.930Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 46 + "'", int35 == 46);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 46 + "'", int43 == 46);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        int int9 = mutableDateTime2.getHourOfDay();
        int int10 = mutableDateTime2.getEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfCeiling();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = mutableDateTime12.toString("1970-01-01T01:47:07.282Z", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime9.toGregorianCalendar();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        int int6 = mutableDateTime5.getDayOfWeek();
        java.lang.String str8 = mutableDateTime5.toString("1999");
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1999" + "'", str8, "1999");
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfYear();
        java.lang.String str13 = property12.getAsString();
        int int14 = property12.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = property12.add(98);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        int int9 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundCeiling();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.298Z" + "'", str4, "2020-11-25T01:49:47.298Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:47.298Z" + "'", str8, "2020-11-25T01:49:47.298Z");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getLeapAmount();
        java.lang.String str9 = property7.toString();
        java.util.Locale locale10 = null;
        int int11 = property7.getMaximumShortTextLength(locale10);
        org.joda.time.MutableDateTime mutableDateTime13 = property7.add(6394);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getDayOfMonth();
        int int7 = mutableDateTime2.getYearOfCentury();
        int int8 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfEra();
        java.lang.String str11 = property10.toString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 47 + "'", int8 == 47);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[yearOfEra]" + "'", str11, "Property[yearOfEra]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:09.435Z");
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
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        int int16 = mutableDateTime15.getWeekOfWeekyear();
        mutableDateTime15.setMinuteOfDay(10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        boolean boolean20 = mutableDateTime1.isEqualNow();
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:47.480Z" + "'", str6, "2020-11-25T01:49:47.480Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        int int8 = mutableDateTime7.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        mutableDateTime9.addDays(6453079);
        mutableDateTime9.setSecondOfDay(525);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.578Z" + "'", str4, "2020-11-25T01:49:47.578Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6587578 + "'", int8 == 6587578);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        boolean boolean6 = mutableDateTime4.equals((java.lang.Object) "2020-11-25T01:45:57.478Z");
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        boolean boolean18 = mutableDateTime15.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setDate(6539199, 0, 6567);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:47.705Z" + "'", str10, "2020-11-25T01:49:47.705Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
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
        mutableDateTime4.setMillisOfDay(59);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime4.dayOfMonth();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime4.dayOfMonth();
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:47.784Z" + "'", str6, "2020-11-25T01:49:47.784Z");
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:47.784Z" + "'", str10, "2020-11-25T01:49:47.784Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        int int6 = mutableDateTime4.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.toMutableDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime4.setRounding(dateTimeField16);
        mutableDateTime0.setRounding(dateTimeField16);
        long long19 = mutableDateTime0.getMillis();
        int int20 = mutableDateTime0.getEra();
        org.joda.time.DateTimeField dateTimeField21 = mutableDateTime0.getRoundingField();
        int int22 = mutableDateTime0.getHourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime0.dayOfYear();
        org.joda.time.DurationField durationField24 = property23.getLeapDurationField();
        java.lang.String str25 = property23.getAsString();
        long long26 = property23.remainder();
        java.lang.String str27 = property23.toString();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47 + "'", int6 == 47);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:47.878Z" + "'", str12, "2020-11-25T01:49:47.878Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 946684800000L + "'", long19 == 946684800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNull(durationField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[dayOfYear]" + "'", str27, "Property[dayOfYear]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear(9);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime13.toDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(879L, dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(739, 6440695, 366, 45, 6478966, 2024, (int) (short) 1, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        int int7 = mutableDateTime6.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfMonth(6544);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6544 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getEra();
        mutableDateTime5.addSeconds(34);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.secondOfDay();
        int int11 = mutableDateTime5.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(590L, chronology2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        int int17 = mutableDateTime16.getDayOfMonth();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7, chronology18);
        org.joda.time.DateTime dateTime20 = mutableDateTime3.toDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(1606268957217L, chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:36.160Z");
        int int2 = mutableDateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getDayOfMonth();
        int int7 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime11.toMutableDateTimeISO();
        int int15 = mutableDateTime14.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.weekyear();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setSecondOfMinute(6516);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6516 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(9);
        boolean boolean8 = mutableDateTime5.isAfterNow();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        int int14 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.dayOfMonth();
        mutableDateTime11.setMillis((long) 18);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.add((long) 2020);
        int int12 = property7.get();
        org.joda.time.MutableDateTime mutableDateTime14 = property7.add(0);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 28 + "'", int12 == 28);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfSecond();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.weekyear();
        mutableDateTime14.setYear((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:48.628Z" + "'", str10, "2020-11-25T01:49:48.628Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        int int10 = mutableDateTime8.getHourOfDay();
        int int11 = mutableDateTime8.getMillisOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.737Z" + "'", str4, "2020-11-25T01:49:48.737Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6588737 + "'", int11 == 6588737);
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
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.797Z" + "'", str4, "2020-11-25T01:49:48.797Z");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        org.joda.time.DurationField durationField16 = property13.getDurationField();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfMinute();
        long long25 = property24.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = property13.equals((java.lang.Object) dateTimeFieldType26);
        mutableDateTime2.set(dateTimeFieldType26, (int) (short) 1);
        mutableDateTime2.addWeeks((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.monthOfYear();
        java.lang.String str33 = property32.getAsShortText();
        java.lang.String str34 = property32.getName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.853Z" + "'", str4, "2020-11-25T01:49:48.853Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 854L + "'", long25 == 854L);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Dec" + "'", str33, "Dec");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "monthOfYear" + "'", str34, "monthOfYear");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime5.setMillis((long) 24);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        int int17 = mutableDateTime5.get(dateTimeField16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime5.toMutableDateTime();
        boolean boolean19 = mutableDateTime5.isBeforeNow();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime5.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.String str7 = property6.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        int int9 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundHalfFloor();
        boolean boolean12 = mutableDateTime10.isBefore((long) 6558183);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 366 + "'", int9 == 366);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property7.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundFloor();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.centuryOfEra();
        int int13 = mutableDateTime11.getMillisOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.set(11);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        java.lang.String str34 = mutableDateTime28.toString();
        mutableDateTime28.setSecondOfDay(2);
        int int37 = mutableDateTime28.getMinuteOfDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) (short) -1);
        int int44 = mutableDateTime43.getWeekyear();
        int int45 = mutableDateTime43.getDayOfWeek();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.monthOfYear();
        mutableDateTime48.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.secondOfMinute();
        long long54 = property53.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        mutableDateTime43.set(dateTimeFieldType55, 1);
        boolean boolean58 = mutableDateTime28.isSupported(dateTimeFieldType55);
        mutableDateTime25.set(dateTimeFieldType55, 31);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime11.property(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:49.095Z" + "'", str18, "2020-11-25T01:49:49.095Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:49.095Z" + "'", str30, "2020-11-25T01:49:49.095Z");
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:49.095Z" + "'", str34, "2020-11-25T01:49:49.095Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 95L + "'", long54 == 95L);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(property61);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:55.056Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.add(34);
        mutableDateTime4.addWeeks(2020);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.yearOfCentury();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59" + "'", str9, "59");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(9);
        boolean boolean8 = mutableDateTime5.isAfterNow();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        int int14 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.dayOfMonth();
        mutableDateTime11.setMillis((long) 18);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        int int21 = mutableDateTime19.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.era();
        java.lang.String str23 = property22.getAsString();
        int int24 = property22.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.roundCeiling();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime25.setSecondOfDay(6579000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6579000 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2020 + "'", int14 == 2020);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70 + "'", int21 == 70);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.DurationField durationField6 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.add(11);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(13);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property17.getAsText(locale20);
        org.joda.time.DateTimeField dateTimeField22 = property17.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.setRounding(dateTimeField22, 6461);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 6461");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "December" + "'", str21, "December");
        org.junit.Assert.assertNotNull(dateTimeField22);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        boolean boolean14 = mutableDateTime12.isBefore((long) ' ');
        int int15 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.DateTime dateTime16 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Instant instant17 = mutableDateTime12.toInstant();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.608Z" + "'", str4, "2020-11-25T01:49:49.608Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        long long10 = mutableDateTime2.getMillis();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        int int20 = mutableDateTime19.getDayOfMonth();
        org.joda.time.Chronology chronology21 = mutableDateTime19.getChronology();
        boolean boolean22 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.698Z" + "'", str4, "2020-11-25T01:49:49.698Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1606268989698L + "'", long10 == 1606268989698L);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.hourOfDay();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        mutableDateTime5.setTime((long) '#');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.lang.String str18 = mutableDateTime12.toString();
        int int19 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        int int20 = property2.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        long long21 = property2.remainder();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:49.764Z" + "'", str7, "2020-11-25T01:49:49.764Z");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:49.764Z" + "'", str14, "2020-11-25T01:49:49.764Z");
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:49.764Z" + "'", str18, "2020-11-25T01:49:49.764Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6589764L + "'", long21 == 6589764L);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        int int11 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addMonths(0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.yearOfEra();
        boolean boolean16 = mutableDateTime2.isEqual(0L);
        mutableDateTime2.setDate((long) 6588737);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(86399, (-1606268910), 59, (int) (byte) 1, 6557456, 276, 330, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6557456 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        int int23 = mutableDateTime22.getYearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property27.getAsText(locale28);
        java.lang.String str30 = property27.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property27.getFieldType();
        boolean boolean32 = mutableDateTime22.isSupported(dateTimeFieldType31);
        boolean boolean33 = mutableDateTime9.isSupported(dateTimeFieldType31);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime9.yearOfEra();
        mutableDateTime9.setMinuteOfDay(9);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        mutableDateTime9.setZoneRetainFields(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(6530294, 62233, 109, 547, (int) (byte) 1, 56, 11452008, dateTimeZone39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 547 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:49.949Z" + "'", str11, "2020-11-25T01:49:49.949Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:49.950Z" + "'", str19, "2020-11-25T01:49:49.950Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2020 + "'", int23 == 2020);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1" + "'", str29, "1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        boolean boolean12 = mutableDateTime3.isAfterNow();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        boolean boolean18 = mutableDateTime15.isEqualNow();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime15.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime3.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 8, chronology25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime28, chronology29);
        int int31 = mutableDateTime30.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:50.008Z" + "'", str5, "2020-11-25T01:49:50.008Z");
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:50.008Z" + "'", str9, "2020-11-25T01:49:50.008Z");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:50.008Z" + "'", str23, "2020-11-25T01:49:50.008Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:49:42.909Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.centuryOfEra();
        mutableDateTime6.add((long) 22);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime12.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) 22, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:50.182Z" + "'", str14, "2020-11-25T01:49:50.182Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsShortText(locale15);
        org.joda.time.DurationField durationField17 = property14.getDurationField();
        org.joda.time.DateTimeField dateTimeField18 = property14.getField();
        org.joda.time.MutableDateTime mutableDateTime19 = property14.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime21 = property14.addWrapField(50);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfSecond();
        boolean boolean23 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        int int24 = mutableDateTime12.getMillisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.305Z" + "'", str4, "2020-11-25T01:49:50.305Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "25" + "'", str16, "25");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 305 + "'", int24 == 305);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        mutableDateTime2.addMonths(2020);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        mutableDateTime2.addHours(6372453);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.add(834L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setMonthOfYear(1999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        int int10 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.add((long) (short) -1);
        org.joda.time.DurationField durationField23 = property20.getDurationField();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        mutableDateTime26.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.secondOfMinute();
        long long32 = property31.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        boolean boolean34 = property20.equals((java.lang.Object) dateTimeFieldType33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime2.property(dateTimeFieldType33);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime2.weekyear();
        mutableDateTime2.setDayOfWeek(7);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime45.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime49 = property47.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property47.getFieldType();
        int int51 = mutableDateTime2.get(dateTimeFieldType50);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.454Z" + "'", str4, "2020-11-25T01:49:50.454Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:50.454Z" + "'", str9, "2020-11-25T01:49:50.454Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 454L + "'", long32 == 454L);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20 + "'", int51 == 20);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        java.lang.String str10 = property7.getAsString();
        boolean boolean11 = property7.isLeap();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.roundHalfEven();
        org.joda.time.Interval interval13 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime15 = property7.addWrapField(1970);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNull(durationField9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "50" + "'", str10, "50");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        int int6 = mutableDateTime4.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.toMutableDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime4.setRounding(dateTimeField16);
        mutableDateTime0.setRounding(dateTimeField16);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime0.add(readableDuration19);
        int int21 = mutableDateTime0.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMonthOfYear(6474212);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6474212 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:50.606Z" + "'", str12, "2020-11-25T01:49:50.606Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsText(locale11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property10.getFieldType();
        int int14 = mutableDateTime6.get(dateTimeFieldType13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime6.era();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsShortText(locale18);
        org.joda.time.DurationField durationField20 = property17.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = property17.add(366);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        mutableDateTime26.addMillis((int) 'a');
        boolean boolean29 = mutableDateTime26.isEqualNow();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime26.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime23.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime6.toMutableDateTime(chronology36);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 330 + "'", int14 == 330);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "25" + "'", str19, "25");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:50.672Z" + "'", str34, "2020-11-25T01:49:50.672Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        java.util.Date date7 = mutableDateTime5.toDate();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.copy();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime9.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setHourOfDay(2);
        int int19 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime14.setRounding(dateTimeField28);
        mutableDateTime5.setRounding(dateTimeField28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime5.toMutableDateTimeISO();
        mutableDateTime5.setWeekyear((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:45:09 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:50.758Z" + "'", str16, "2020-11-25T01:49:50.758Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:50.758Z" + "'", str24, "2020-11-25T01:49:50.758Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime31);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime5);
        mutableDateTime5.addMillis(13);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        int int5 = property3.getMinimumValue();
        java.lang.String str6 = property3.toString();
        org.joda.time.DurationField durationField7 = property3.getLeapDurationField();
        int int8 = property3.get();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[dayOfYear]" + "'", str6, "Property[dayOfYear]");
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setMonthOfYear(38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:51.005Z" + "'", str10, "2020-11-25T01:49:51.005Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        mutableDateTime9.add((long) 48);
        int int14 = mutableDateTime9.getMillisOfDay();
        mutableDateTime9.setMinuteOfHour(54);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = mutableDateTime9.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6595179 + "'", int14 == 6595179);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        mutableDateTime15.addSeconds(1970);
        mutableDateTime15.setDayOfYear(2);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime15.toGregorianCalendar();
        int int21 = mutableDateTime15.getMillisOfSecond();
        mutableDateTime15.setYear(41);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime15.centuryOfEra();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:51.179Z" + "'", str10, "2020-11-25T01:49:51.179Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 179 + "'", int21 == 179);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        int int9 = mutableDateTime8.getDayOfWeek();
        mutableDateTime8.addWeekyears(54);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        mutableDateTime14.setSecondOfDay((int) '#');
        int int18 = mutableDateTime14.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.weekOfWeekyear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsText(locale21);
        org.joda.time.DateTimeField dateTimeField23 = property20.getField();
        int int24 = mutableDateTime8.get(dateTimeField23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfWeek(522);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 522 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "48" + "'", str22, "48");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        int int6 = mutableDateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        int int6 = mutableDateTime5.getRoundingMode();
        boolean boolean7 = mutableDateTime5.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.weekyear();
        int int9 = mutableDateTime5.getYearOfEra();
        int int10 = mutableDateTime5.getMillisOfSecond();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        mutableDateTime14.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.addWrapField(4);
        boolean boolean23 = mutableDateTime21.isEqual(100L);
        mutableDateTime21.add((long) 48);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        mutableDateTime28.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.secondOfMinute();
        int int34 = property33.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundFloor();
        boolean boolean36 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateTime dateTime37 = mutableDateTime21.toDateTime();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) (short) -1);
        int int44 = mutableDateTime43.getWeekyear();
        int int45 = mutableDateTime43.getDayOfWeek();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.monthOfYear();
        mutableDateTime48.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.secondOfMinute();
        long long54 = property53.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        mutableDateTime43.set(dateTimeFieldType55, 1);
        int int58 = dateTime37.get(dateTimeFieldType55);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime2.property(dateTimeFieldType55);
        org.joda.time.Interval interval60 = property59.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.642Z" + "'", str4, "2020-11-25T01:49:51.642Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:51.642Z" + "'", str8, "2020-11-25T01:49:51.642Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 642L + "'", long54 == 642L);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 55 + "'", int58 == 55);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        boolean boolean19 = mutableDateTime16.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        int int29 = mutableDateTime28.getYearOfCentury();
        boolean boolean30 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime13.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.getMutableDateTime();
        int int33 = mutableDateTime32.getYear();
        int int34 = mutableDateTime32.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:51.750Z" + "'", str10, "2020-11-25T01:49:51.750Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:51.750Z" + "'", str24, "2020-11-25T01:49:51.750Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        int int24 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        int int26 = mutableDateTime10.getDayOfWeek();
        int int27 = mutableDateTime10.getMinuteOfDay();
        int int28 = mutableDateTime10.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.addYears(1601516859);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1601518879 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.853Z" + "'", str4, "2020-11-25T01:49:51.853Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:51.854Z" + "'", str12, "2020-11-25T01:49:51.854Z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:51.854Z" + "'", str19, "2020-11-25T01:49:51.854Z");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:51.854Z" + "'", str23, "2020-11-25T01:49:51.854Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        boolean boolean6 = mutableDateTime2.isBefore((long) 10);
        int int7 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology14);
        mutableDateTime16.addMillis(44);
        mutableDateTime16.setWeekyear(1);
        mutableDateTime16.addWeekyears(105);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.dayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.929Z" + "'", str4, "2020-11-25T01:49:51.929Z");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:51.929Z" + "'", str12, "2020-11-25T01:49:51.929Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.centuryOfEra();
        java.util.Date date12 = mutableDateTime6.toDate();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((long) (short) -1);
        mutableDateTime18.setWeekOfWeekyear(9);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = mutableDateTime18.toDateTime(dateTimeZone24);
        boolean boolean27 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime18.minuteOfHour();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(1606268729646L, dateTimeZone33);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = mutableDateTime36.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime18.toMutableDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = mutableDateTime2.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime46.toMutableDateTime();
        org.junit.Assert.assertNotNull(mutableDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:52.035Z" + "'", str8, "2020-11-25T01:49:52.035Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        int int11 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) 6329646);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        int int9 = mutableDateTime2.getHourOfDay();
        java.util.Date date10 = mutableDateTime2.toDate();
        boolean boolean12 = mutableDateTime2.isEqual((long) 2021);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Feb 03 01:49:52 UTC 2021");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        mutableDateTime9.add((long) 48);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        mutableDateTime16.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfMinute();
        int int22 = property21.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundFloor();
        boolean boolean24 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.addWrapField(64);
        org.joda.time.DateTimeField dateTimeField28 = mutableDateTime27.getRoundingField();
        int int29 = mutableDateTime27.getYearOfEra();
        mutableDateTime27.addWeeks(6461);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2021 + "'", int29 == 2021);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime2.getZone();
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1606268992357,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=52,MILLISECOND=357,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.set(0);
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getYearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.dayOfMonth();
        mutableDateTime14.addWeeks((int) (short) 10);
        mutableDateTime14.addWeekyears((-1));
        int int23 = mutableDateTime14.getWeekOfWeekyear();
        int int24 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime14.centuryOfEra();
        int int26 = property25.getMaximumValue();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 467L + "'", long8 == 467L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2922789 + "'", int26 == 2922789);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology12);
        int int17 = mutableDateTime16.getYearOfEra();
        int int18 = mutableDateTime16.getMinuteOfDay();
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutableDateTime16.setTime(readableInstant19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:52.507Z" + "'", str10, "2020-11-25T01:49:52.507Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109 + "'", int18 == 109);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        int int15 = mutableDateTime12.getYearOfEra();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.dayOfMonth();
        mutableDateTime12.addWeeks((int) (short) 10);
        mutableDateTime12.addWeekyears((-1));
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime12.millisOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime12.minuteOfDay();
        int int23 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.573Z" + "'", str4, "2020-11-25T01:49:52.573Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 59, dateTimeZone4);
        mutableDateTime5.addMinutes(6467080);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime10.toMutableDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        mutableDateTime10.setRounding(dateTimeField22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime10.weekyear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.roundCeiling();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        int int35 = mutableDateTime30.getWeekOfWeekyear();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.DateTime dateTime40 = mutableDateTime30.toDateTime(dateTimeZone39);
        java.util.Locale locale41 = null;
        java.util.Calendar calendar42 = mutableDateTime30.toCalendar(locale41);
        long long43 = mutableDateTime30.getMillis();
        mutableDateTime30.addMonths(6428);
        org.joda.time.Chronology chronology46 = mutableDateTime30.getChronology();
        mutableDateTime27.setChronology(chronology46);
        mutableDateTime5.setChronology(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:52.657Z" + "'", str18, "2020-11-25T01:49:52.657Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:52.657Z" + "'", str32, "2020-11-25T01:49:52.657Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 48 + "'", int35 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1606268992657,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=52,MILLISECOND=657,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1606268992657L + "'", long43 == 1606268992657L);
        org.junit.Assert.assertNotNull(chronology46);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology4);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        java.util.Date date15 = mutableDateTime9.toDate();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add((long) (short) -1);
        mutableDateTime21.setWeekOfWeekyear(9);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = mutableDateTime21.toDateTime(dateTimeZone27);
        boolean boolean30 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime21.minuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(1606268729646L, dateTimeZone36);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = mutableDateTime39.toDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime21.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = mutableDateTime5.toDateTime(dateTimeZone43);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime0.toMutableDateTime(chronology50);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setHourOfDay(6457);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6457 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:52.779Z" + "'", str11, "2020-11-25T01:49:52.779Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.minuteOfDay();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        int int9 = property1.compareTo((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        boolean boolean17 = mutableDateTime4.isSupported(dateTimeFieldType16);
        mutableDateTime4.setSecondOfMinute(44);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setMonthOfYear(6455286);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6455286 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:52.992Z" + "'", str6, "2020-11-25T01:49:52.992Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfYear();
        org.joda.time.DurationField durationField13 = property12.getRangeDurationField();
        java.util.Locale locale14 = null;
        int int15 = property12.getMaximumTextLength(locale14);
        java.util.Locale locale16 = null;
        int int17 = property12.getMaximumTextLength(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property12.roundHalfEven();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        boolean boolean10 = property9.isLeap();
        int int11 = property9.get();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        mutableDateTime17.setWeekOfWeekyear(9);
        mutableDateTime17.add(10L);
        int int22 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int23 = property9.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.189Z" + "'", str4, "2020-11-25T01:49:53.189Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6593 + "'", int11 == 6593);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1601516993 + "'", int22 == 1601516993);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 86399 + "'", int23 == 86399);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.centuryOfEra();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.add(503L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.339Z" + "'", str4, "2020-11-25T01:49:53.339Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
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
        mutableDateTime4.setMillisOfDay(59);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime4.dayOfMonth();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime4.dayOfYear();
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:53.407Z" + "'", str6, "2020-11-25T01:49:53.407Z");
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:53.407Z" + "'", str10, "2020-11-25T01:49:53.407Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        int int16 = mutableDateTime15.getYearOfEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsText(locale21);
        java.lang.String str23 = property20.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property20.getFieldType();
        boolean boolean25 = mutableDateTime15.isSupported(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime2.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.yearOfEra();
        int int28 = mutableDateTime2.getDayOfYear();
        int int29 = mutableDateTime2.getDayOfYear();
        mutableDateTime2.setMillisOfDay(39);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.481Z" + "'", str4, "2020-11-25T01:49:53.481Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:53.481Z" + "'", str12, "2020-11-25T01:49:53.481Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 330 + "'", int28 == 330);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 330 + "'", int29 == 330);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        int int12 = mutableDateTime11.getDayOfYear();
        int int13 = mutableDateTime11.getEra();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.toMutableDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.565Z" + "'", str4, "2020-11-25T01:49:53.565Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setDayOfYear(48);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        boolean boolean14 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.secondOfMinute();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.yearOfCentury();
        mutableDateTime12.addMonths(53);
        long long19 = mutableDateTime12.getMillis();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.669Z" + "'", str4, "2020-11-25T01:49:53.669Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1745545793669L + "'", long19 == 1745545793669L);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1604627271356L);
        mutableDateTime1.addHours(34);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        org.joda.time.DurationField durationField16 = property13.getDurationField();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfMinute();
        long long25 = property24.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = property13.equals((java.lang.Object) dateTimeFieldType26);
        mutableDateTime2.set(dateTimeFieldType26, (int) (short) 1);
        mutableDateTime2.addWeeks((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.monthOfYear();
        int int33 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime2.add(readablePeriod34, (int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.819Z" + "'", str4, "2020-11-25T01:49:53.819Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 819L + "'", long25 == 819L);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 49 + "'", int33 == 49);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.lang.String str12 = property8.getAsString();
        boolean boolean13 = property8.isLeap();
        java.lang.String str14 = property8.getAsString();
        org.joda.time.MutableDateTime mutableDateTime16 = property8.add((long) 37);
        org.joda.time.MutableDateTime mutableDateTime18 = property8.add((long) 46);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.905Z" + "'", str4, "2020-11-25T01:49:53.905Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "3" + "'", str14, "3");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setMillis((long) 5);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property10.set("2020-11-25T01:47:24.274Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:47:24.274Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfEven();
        int int8 = property6.getLeapAmount();
        java.lang.String str9 = property6.getAsString();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.add(0L);
        java.lang.String str12 = property6.getAsText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "330" + "'", str9, "330");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "330" + "'", str12, "330");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addMonths(0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add((long) 6420218);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.minuteOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone26);
        mutableDateTime28.addWeekyears(17);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfMonth();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property32.getAsShortText(locale33);
        org.joda.time.DurationField durationField35 = property32.getDurationField();
        org.joda.time.DateTimeField dateTimeField36 = property32.getField();
        mutableDateTime28.setRounding(dateTimeField36);
        int int38 = mutableDateTime21.get(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:54.074Z" + "'", str10, "2020-11-25T01:49:54.074Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "25" + "'", str34, "25");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 17 + "'", int38 == 17);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        int int14 = mutableDateTime13.getSecondOfMinute();
        java.lang.String str15 = mutableDateTime13.toString();
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime13.add(readableDuration16);
        mutableDateTime13.add((long) 2100);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.roundFloor();
        boolean boolean28 = mutableDateTime26.isEqual((long) 49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime26.toString(dateTimeFormatter29);
        int int31 = mutableDateTime26.getMinuteOfHour();
        boolean boolean32 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:54.189Z" + "'", str10, "2020-11-25T01:49:54.189Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01T00:00:00.098Z" + "'", str15, "1970-01-01T00:00:00.098Z");
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str30, "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        mutableDateTime2.setRounding(dateTimeField14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundCeiling();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        int int27 = mutableDateTime22.getWeekOfWeekyear();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTime dateTime32 = mutableDateTime22.toDateTime(dateTimeZone31);
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime22.toCalendar(locale33);
        long long35 = mutableDateTime22.getMillis();
        mutableDateTime22.addMonths(6428);
        org.joda.time.Chronology chronology38 = mutableDateTime22.getChronology();
        mutableDateTime19.setChronology(chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime19.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:54.390Z" + "'", str10, "2020-11-25T01:49:54.390Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:54.390Z" + "'", str24, "2020-11-25T01:49:54.390Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(calendar34);
// flaky:         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1606268994390,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=54,MILLISECOND=390,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1606268994390L + "'", long35 == 1606268994390L);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        mutableDateTime2.setMillisOfDay(59);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfMonth();
        int int14 = mutableDateTime2.getMillisOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.477Z" + "'", str4, "2020-11-25T01:49:54.477Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:54.477Z" + "'", str8, "2020-11-25T01:49:54.477Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add(490L);
        java.lang.String str11 = property7.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) property7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "yearOfCentury" + "'", str11, "yearOfCentury");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        int int10 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumShortTextLength(locale18);
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundCeiling();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = property17.set("2020-11-25T01:49:17.429Z", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:49:17.429Z\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.597Z" + "'", str4, "2020-11-25T01:49:54.597Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:54.597Z" + "'", str9, "2020-11-25T01:49:54.597Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime20);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.add(34);
        mutableDateTime4.setMillisOfSecond(0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.secondOfMinute();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime4.toString(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-12-29T01:49:54.000Z" + "'", str10, "2020-12-29T01:49:54.000Z");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addWeekyears(17);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.dayOfWeek();
        int int9 = mutableDateTime5.getSecondOfMinute();
        java.lang.Object obj10 = null;
        boolean boolean11 = mutableDateTime5.equals(obj10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology12);
        mutableDateTime16.addWeekyears((int) (byte) -1);
        mutableDateTime16.addDays((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add(6579);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:54.937Z" + "'", str10, "2020-11-25T01:49:54.937Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfYear();
        mutableDateTime9.setTime((long) 330);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone24);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:55.056Z" + "'", str4, "2020-11-25T01:49:55.056Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:55.056Z" + "'", str11, "2020-11-25T01:49:55.056Z");
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:55.056Z" + "'", str15, "2020-11-25T01:49:55.056Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.getMutableDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone12);
        mutableDateTime14.addWeekyears((-9));
        mutableDateTime14.addMinutes(10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:55.174Z" + "'", str5, "2020-11-25T01:49:55.174Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        mutableDateTime2.setRounding(dateTimeField14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.secondOfMinute();
        int int19 = property18.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 55 + "'", int4 == 55);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:55.252Z" + "'", str10, "2020-11-25T01:49:55.252Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setDayOfYear(48);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        boolean boolean14 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.secondOfMinute();
        org.joda.time.Instant instant16 = mutableDateTime12.toInstant();
        java.util.Date date17 = mutableDateTime12.toDate();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:55.310Z" + "'", str4, "2020-11-25T01:49:55.310Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 01:49:55 UTC 2020");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.add(34);
        mutableDateTime4.addWeeks(2020);
        int int7 = mutableDateTime4.getYearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        mutableDateTime10.addMillis((int) 'a');
        boolean boolean13 = mutableDateTime10.isEqualNow();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime10.toMutableDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        boolean boolean26 = mutableDateTime21.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.year();
        org.joda.time.Instant instant28 = mutableDateTime21.toInstant();
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) instant28);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2059 + "'", int7 == 2059);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:55.346Z" + "'", str18, "2020-11-25T01:49:55.346Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(instant28);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTime();
        mutableDateTime4.setMillis(873L);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumTextLength(locale17);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.getMutableDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime19.add(readableDuration20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.weekyear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.minuteOfDay();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, chronology27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:55.469Z" + "'", str10, "2020-11-25T01:49:55.469Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        mutableDateTime2.setWeekOfWeekyear((int) '#');
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime2.getRoundingField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime12.toDateTime(dateTimeZone21);
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = mutableDateTime12.toCalendar(locale23);
        long long25 = mutableDateTime12.getMillis();
        int int26 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime12.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:55.623Z" + "'", str4, "2020-11-25T01:49:55.623Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNull(dateTimeField9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:55.623Z" + "'", str14, "2020-11-25T01:49:55.623Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1606268995623,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=55,MILLISECOND=623,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606268995623L + "'", long25 == 1606268995623L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        boolean boolean8 = property7.isLeap();
        boolean boolean10 = property7.equals((java.lang.Object) "2020-11-25T01:45:20.723Z");
        org.joda.time.MutableDateTime mutableDateTime12 = property7.addWrapField(0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.secondOfMinute();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime2.add((-1L));
        int int8 = mutableDateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 55 + "'", int4 == 55);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        int int5 = property3.getMinimumValue();
        java.lang.String str6 = property3.toString();
        org.joda.time.Interval interval7 = property3.toInterval();
        long long8 = property3.remainder();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[dayOfYear]" + "'", str6, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsText(locale4);
        java.lang.String str6 = property3.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property3.getFieldType();
        int int8 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property3.getLeapDurationField();
        org.joda.time.Interval interval10 = property3.toInterval();
        org.joda.time.MutableDateTime mutableDateTime11 = property3.getMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 366 + "'", int8 == 366);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) 1606268729646L, chronology10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology10);
        mutableDateTime2.setChronology(chronology10);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 22, chronology10);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 4, chronology10);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology10);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:55.962Z" + "'", str8, "2020-11-25T01:49:55.962Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        int int10 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumShortTextLength(locale18);
        java.lang.String str20 = property17.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property17.getFieldType();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.centuryOfEra();
        java.util.Date date30 = mutableDateTime24.toDate();
        boolean boolean31 = mutableDateTime24.isEqualNow();
        mutableDateTime24.setMillisOfDay(4);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        boolean boolean41 = mutableDateTime37.isBefore((long) 10);
        int int42 = mutableDateTime37.getYearOfCentury();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.DateTime dateTime50 = mutableDateTime37.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) 8, chronology49);
        mutableDateTime24.setChronology(chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFieldType21, chronology49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.091Z" + "'", str4, "2020-11-25T01:49:56.091Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:56.091Z" + "'", str9, "2020-11-25T01:49:56.091Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "20" + "'", str20, "20");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:56.091Z" + "'", str26, "2020-11-25T01:49:56.091Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:56.091Z" + "'", str39, "2020-11-25T01:49:56.091Z");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:56.091Z" + "'", str47, "2020-11-25T01:49:56.091Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        java.lang.String str10 = property8.getAsString();
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumShortTextLength(locale11);
        long long13 = property8.remainder();
        org.joda.time.Interval interval14 = property8.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.287Z" + "'", str4, "2020-11-25T01:49:56.287Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3" + "'", str10, "3");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 6596287L + "'", long13 == 6596287L);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsText(locale13);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.350Z" + "'", str4, "2020-11-25T01:49:56.350Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "November" + "'", str14, "November");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(9);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime5.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime5.millisOfSecond();
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
        boolean boolean27 = mutableDateTime18.isAfterNow();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        boolean boolean33 = mutableDateTime30.isEqualNow();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime30.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime18.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 100, chronology40);
        org.joda.time.DateTime dateTime44 = mutableDateTime5.toDateTime(chronology40);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:56.424Z" + "'", str20, "2020-11-25T01:49:56.424Z");
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:56.424Z" + "'", str24, "2020-11-25T01:49:56.424Z");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:56.424Z" + "'", str38, "2020-11-25T01:49:56.424Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.secondOfDay();
        org.joda.time.DateTime dateTime7 = mutableDateTime5.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setMillis((long) 18);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfDay();
        boolean boolean10 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        java.util.GregorianCalendar gregorianCalendar3 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set(30);
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfEven();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        java.lang.String str16 = mutableDateTime10.toString();
        int int17 = mutableDateTime10.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.secondOfMinute();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        mutableDateTime24.setWeekOfWeekyear(9);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime24.toDateTime(dateTimeZone30);
        int int33 = dateTime32.getWeekyear();
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) dateTime32);
        int int35 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(gregorianCalendar3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:56.644Z" + "'", str12, "2020-11-25T01:49:56.644Z");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:56.644Z" + "'", str16, "2020-11-25T01:49:56.644Z");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        mutableDateTime3.addMillis((int) 'a');
        boolean boolean6 = mutableDateTime3.isEqualNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime3.toMutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(1606268947848L, chronology13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:56.759Z" + "'", str11, "2020-11-25T01:49:56.759Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        int int8 = mutableDateTime2.getWeekOfWeekyear();
        int int9 = mutableDateTime2.getDayOfMonth();
        mutableDateTime2.setWeekyear(6372000);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.800Z" + "'", str4, "2020-11-25T01:49:56.800Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(2100, 57, 6430000, 6451, 0, 6473026, 6536238);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6451 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.String str4 = property3.getAsString();
        int int5 = property3.getMinimumValue();
        java.lang.String str6 = property3.toString();
        org.joda.time.DurationField durationField7 = property3.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.set(70);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[dayOfYear]" + "'", str6, "Property[dayOfYear]");
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        int int10 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.year();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) 1606268729646L, chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime2.toMutableDateTime(chronology26);
        mutableDateTime2.addSeconds(15);
        int int34 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfMonth();
        int int37 = mutableDateTime35.getCenturyOfEra();
        boolean boolean38 = mutableDateTime35.isBeforeNow();
        mutableDateTime35.setDate((long) 22);
        boolean boolean41 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime35);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.938Z" + "'", str4, "2020-11-25T01:49:56.938Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:56.938Z" + "'", str9, "2020-11-25T01:49:56.938Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:56.938Z" + "'", str24, "2020-11-25T01:49:56.938Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        int int7 = mutableDateTime5.getEra();
        mutableDateTime5.addSeconds(34);
        int int10 = mutableDateTime5.getYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setDayOfYear(6516849);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6516849 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(330, 650, 50, 29, 350, 0, 34, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        long long9 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        boolean boolean11 = mutableDateTime10.isBeforeNow();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28425635182L + "'", long9 == 28425635182L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        boolean boolean10 = mutableDateTime2.isBefore(1612316839538L);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime2.add(readablePeriod11, 1601516850);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime14.addMinutes(106);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.226Z" + "'", str4, "2020-11-25T01:49:57.226Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        int int12 = mutableDateTime9.getYearOfEra();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.dayOfMonth();
        mutableDateTime9.setMillis((long) 18);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime9.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(6537, 6329646, 387, 15012453, 6516, 1601516941, 6558183, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15012453 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        mutableDateTime9.setYear(48);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime9.era();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.dayOfWeek();
        org.joda.time.Chronology chronology20 = mutableDateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(6450450, 6428, 746, 48, 52, 7, 100, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:57.325Z" + "'", str11, "2020-11-25T01:49:57.325Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.String str7 = property6.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        mutableDateTime8.setWeekyear(7);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 57 + "'", int4 == 57);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        java.util.GregorianCalendar gregorianCalendar13 = dateTime12.toGregorianCalendar();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        mutableDateTime16.setSecondOfDay(2);
        boolean boolean25 = mutableDateTime16.isAfterNow();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        boolean boolean31 = mutableDateTime28.isEqualNow();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime28.toMutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime16.toMutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime12.toMutableDateTime(chronology38);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        mutableDateTime44.addMillis((int) 'a');
        boolean boolean47 = mutableDateTime44.isEqualNow();
        int int48 = dateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime44);
        boolean boolean50 = mutableDateTime44.isBefore((long) 746);
        mutableDateTime44.addMinutes(6499865);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.433Z" + "'", str4, "2020-11-25T01:49:57.433Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:57.434Z" + "'", str18, "2020-11-25T01:49:57.434Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:57.434Z" + "'", str22, "2020-11-25T01:49:57.434Z");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:57.434Z" + "'", str36, "2020-11-25T01:49:57.434Z");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20 + "'", int37 == 20);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        mutableDateTime2.setDate((long) 17);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime16.toMutableDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime16.setRounding(dateTimeField28);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setRounding(dateTimeField28, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 40");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 57 + "'", int18 == 57);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:57.489Z" + "'", str24, "2020-11-25T01:49:57.489Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(dateTimeZone12);
        int int14 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        boolean boolean20 = mutableDateTime17.isEqualNow();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime17.toMutableDateTime(chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        mutableDateTime31.addMillis((int) 'a');
        boolean boolean34 = mutableDateTime31.isEqualNow();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime31.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology41);
        int int44 = mutableDateTime43.getYearOfCentury();
        boolean boolean45 = mutableDateTime28.isEqual((org.joda.time.ReadableInstant) mutableDateTime43);
        mutableDateTime43.addMonths(45);
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime13.monthOfYear();
        int int50 = mutableDateTime13.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.626Z" + "'", str4, "2020-11-25T01:49:57.626Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 01:49:57 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:57.626Z" + "'", str25, "2020-11-25T01:49:57.626Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:57.626Z" + "'", str39, "2020-11-25T01:49:57.626Z");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 57 + "'", int50 == 57);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getMillisOfSecond();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 749 + "'", int3 == 749);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:24.606Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mutableDateTime1.toString("2020-11-25T01:48:56.071Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.addWrapField(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        boolean boolean10 = mutableDateTime6.isAfter(0L);
        int int11 = mutableDateTime6.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-06T01:49:57.909Z" + "'", str8, "2020-11-06T01:49:57.909Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        mutableDateTime9.setWeekOfWeekyear((int) '4');
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add(1L);
        org.joda.time.MutableDateTime mutableDateTime16 = property13.roundHalfCeiling();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property13.getAsShortText(locale17);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2023" + "'", str18, "2023");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.year();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.minuteOfHour();
        int int9 = mutableDateTime6.getSecondOfDay();
        mutableDateTime6.addDays(42);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField2 = property1.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime4 = property1.add(34);
        org.joda.time.Interval interval5 = property1.toInterval();
        int int6 = property1.getMinimumValueOverall();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        int int15 = mutableDateTime14.getYearOfEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        java.lang.String str22 = property19.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property19.getFieldType();
        boolean boolean24 = mutableDateTime14.isSupported(dateTimeFieldType23);
        mutableDateTime14.addMinutes((int) (short) 100);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime14.year();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfMonth();
        int int30 = mutableDateTime28.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.dayOfMonth();
        mutableDateTime28.setTime((long) 785);
        int int34 = mutableDateTime28.getSecondOfDay();
        long long35 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime28);
        long long36 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:58.142Z" + "'", str11, "2020-11-25T01:49:58.142Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 34L + "'", long36 == 34L);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        int int6 = mutableDateTime4.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.toMutableDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime4.setRounding(dateTimeField16);
        mutableDateTime0.setRounding(dateTimeField16);
        int int19 = mutableDateTime0.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 58 + "'", int6 == 58);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:58.222Z" + "'", str12, "2020-11-25T01:49:58.222Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        org.joda.time.DurationField durationField16 = property13.getDurationField();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfMinute();
        long long25 = property24.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = property13.equals((java.lang.Object) dateTimeFieldType26);
        mutableDateTime2.set(dateTimeFieldType26, (int) (short) 1);
        mutableDateTime2.addWeeks((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.monthOfYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property36.getAsText(locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property36.getFieldType();
        boolean boolean40 = mutableDateTime2.isSupported(dateTimeFieldType39);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.295Z" + "'", str4, "2020-11-25T01:49:58.295Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 295L + "'", long25 == 295L);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        boolean boolean14 = mutableDateTime12.isBefore((long) ' ');
        int int15 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime12.toMutableDateTimeISO();
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime12.getRoundingField();
        mutableDateTime12.setYear(6499865);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.hourOfDay();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = property20.set("2020-11-25T01:49:00.717Z", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:49:00.717Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.377Z" + "'", str4, "2020-11-25T01:49:58.377Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.copy();
        boolean boolean6 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.dayOfYear();
        int int8 = property7.getLeapAmount();
        java.lang.String str9 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfYear" + "'", str9, "dayOfYear");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.minuteOfDay();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        int int9 = property1.compareTo((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((int) '#', (int) (short) 10, 18, (int) (byte) 1, (int) (short) 0, 19, (int) (byte) 1, dateTimeZone21);
        boolean boolean24 = mutableDateTime4.isEqual((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime4.add(readableDuration25, 6481341);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:58.498Z" + "'", str6, "2020-11-25T01:49:58.498Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfFloor();
        boolean boolean13 = property9.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = property9.set("2020-11-25T01:48:51.747Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:48:51.747Z\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.560Z" + "'", str4, "2020-11-25T01:49:58.560Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        boolean boolean11 = mutableDateTime9.isEqual(100L);
        mutableDateTime9.add((long) 48);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        mutableDateTime16.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfMinute();
        int int22 = property21.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundFloor();
        boolean boolean24 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTime dateTime25 = mutableDateTime9.toDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime9.centuryOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        boolean boolean4 = mutableDateTime2.isEqual((long) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5, 16);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.set(58);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        boolean boolean18 = mutableDateTime14.isBefore((long) 10);
        int int19 = mutableDateTime14.getYearOfCentury();
        long long20 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        int int21 = mutableDateTime14.getDayOfWeek();
        mutableDateTime14.addWeeks(6555);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:58.825Z" + "'", str16, "2020-11-25T01:49:58.825Z");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8639999L + "'", long20 == 8639999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfYear();
        java.lang.String str7 = property6.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfFloor();
        mutableDateTime8.setWeekyear(7);
        mutableDateTime8.setSecondOfDay(64);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        int int12 = mutableDateTime11.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTime();
        int int14 = mutableDateTime11.getRoundingMode();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime27 = mutableDateTime17.toDateTime(dateTimeZone26);
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime17.toCalendar(locale28);
        long long30 = mutableDateTime17.getMillis();
        mutableDateTime17.addMonths(6428);
        org.joda.time.Chronology chronology33 = mutableDateTime17.getChronology();
        mutableDateTime11.setChronology(chronology33);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:58.929Z" + "'", str4, "2020-11-25T01:49:58.929Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:58.929Z" + "'", str19, "2020-11-25T01:49:58.929Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1606268998929,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=58,MILLISECOND=929,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1606268998929L + "'", long30 == 1606268998929L);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = property8.getAsText();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.add(4);
        org.joda.time.MutableDateTime mutableDateTime13 = property8.add((long) 6489);
        java.lang.String str14 = property8.getAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.006Z" + "'", str4, "2020-11-25T01:49:59.006Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wednesday" + "'", str9, "Wednesday");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "7" + "'", str14, "7");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = property4.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property4.getFieldType();
        int int9 = property4.getMinimumValueOverall();
        java.lang.String str10 = property4.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = property4.add(1598406372174L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 1598406372174");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) 1606268729646L, chronology10);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology10);
        mutableDateTime2.setChronology(chronology10);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 22, chronology10);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:49:33.245Z", chronology10);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:59.130Z" + "'", str8, "2020-11-25T01:49:59.130Z");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.era();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a');
        int int12 = mutableDateTime11.getDayOfYear();
        boolean boolean14 = mutableDateTime11.isEqual(706L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        mutableDateTime11.setRounding(dateTimeField23);
        int int25 = mutableDateTime8.get(dateTimeField23);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.218Z" + "'", str4, "2020-11-25T01:49:59.218Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 59 + "'", int19 == 59);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 330 + "'", int25 == 330);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(24);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(1606268729646L, dateTimeZone16);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.DateTime dateTime27 = mutableDateTime19.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 25, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone23);
        boolean boolean30 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDateTime(6544, 6450450, 6544, 0, 746, (-6554), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 746 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:02.517Z");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.set(0);
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getYearOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.dayOfMonth();
        mutableDateTime14.addWeeks((int) (short) 10);
        mutableDateTime14.addWeekyears((-1));
        int int23 = mutableDateTime14.getWeekOfWeekyear();
        int int24 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime14.centuryOfEra();
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((-1549491220356L));
        int int29 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        int int30 = mutableDateTime14.getSecondOfDay();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 443L + "'", long8 == 443L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6599 + "'", int30 == 6599);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        long long7 = mutableDateTime2.getMillis();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime2.add(readablePeriod8);
        java.lang.Object obj10 = mutableDateTime2.clone();
        mutableDateTime2.addMillis(0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:59.506Z" + "'", str4, "2020-11-25T01:49:59.506Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1606268999506L + "'", long7 == 1606268999506L);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "2020-11-25T01:49:59.506Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "2020-11-25T01:49:59.506Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "2020-11-25T01:49:59.506Z");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:48:44.121Z");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime16.toDateTime(dateTimeZone25);
        java.util.GregorianCalendar gregorianCalendar27 = dateTime26.toGregorianCalendar();
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
        boolean boolean39 = mutableDateTime30.isAfterNow();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology41);
        mutableDateTime42.addMillis((int) 'a');
        boolean boolean45 = mutableDateTime42.isEqualNow();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        int int51 = mutableDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime42.toMutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime30.toMutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime26.toMutableDateTime(chronology52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology57);
        mutableDateTime58.addMillis((int) 'a');
        boolean boolean61 = mutableDateTime58.isEqualNow();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        int int67 = mutableDateTime64.getYearOfCentury();
        org.joda.time.Chronology chronology68 = mutableDateTime64.getChronology();
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime58.toMutableDateTime(chronology68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        mutableDateTime58.add(readableDuration70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime58.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property72.getFieldType();
        boolean boolean74 = mutableDateTime55.isSupported(dateTimeFieldType73);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.set(dateTimeFieldType73, 6522614);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6522614 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:59.637Z" + "'", str10, "2020-11-25T01:49:59.637Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:59.637Z" + "'", str18, "2020-11-25T01:49:59.637Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(gregorianCalendar27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:59.637Z" + "'", str32, "2020-11-25T01:49:59.637Z");
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:59.637Z" + "'", str36, "2020-11-25T01:49:59.637Z");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2020-11-25T01:49:59.638Z" + "'", str50, "2020-11-25T01:49:59.638Z");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20 + "'", int51 == 20);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T01:49:59.638Z" + "'", str66, "2020-11-25T01:49:59.638Z");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20 + "'", int67 == 20);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        mutableDateTime2.addMonths(2020);
        int int8 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(8);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setWeekOfWeekyear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.set(0);
        org.joda.time.DateTimeField dateTimeField11 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.roundHalfCeiling();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 825L + "'", long8 == 825L);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        int int6 = mutableDateTime5.getWeekyear();
        int int7 = mutableDateTime5.getDayOfWeek();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        mutableDateTime10.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.secondOfMinute();
        long long16 = property15.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        mutableDateTime5.set(dateTimeFieldType17, 1);
        int int20 = mutableDateTime5.getYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 882L + "'", long16 == 882L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        java.lang.String str3 = property1.getAsShortText(locale2);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property1.addWrapField(11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        boolean boolean10 = mutableDateTime6.isAfter(0L);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.era();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setHourOfDay(2);
        int int19 = mutableDateTime14.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.minuteOfHour();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        mutableDateTime23.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.addWrapField(4);
        mutableDateTime30.setWeekOfWeekyear((int) '4');
        int int33 = mutableDateTime30.getSecondOfDay();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime14.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime6.add(readablePeriod37, 69);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-06T01:49:59.944Z" + "'", str8, "2020-11-06T01:49:59.944Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:59.944Z" + "'", str16, "2020-11-25T01:49:59.944Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6543 + "'", int33 == 6543);
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:09.814Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.secondOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        int int3 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.centuryOfEra();
        java.util.Date date13 = mutableDateTime7.toDate();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime7.toMutableDateTime(dateTimeZone17);
        int int19 = mutableDateTime18.getYearOfCentury();
        int int20 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.weekOfWeekyear();
        mutableDateTime18.setWeekOfWeekyear(9);
        java.lang.String str24 = mutableDateTime18.toString();
        int int25 = mutableDateTime18.getMonthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:50:00.084Z" + "'", str9, "2020-11-25T01:50:00.084Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 01:50:00 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-02-26T01:50:00.084Z" + "'", str24, "2020-02-26T01:50:00.084Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(52, 6543, 56, 1601516993, 6562987, 6433438, (int) (byte) 1, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1601516993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:50:00.154Z" + "'", str11, "2020-11-25T01:50:00.154Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addWeeks((int) (short) 10);
        mutableDateTime2.addWeekyears((-1));
        int int11 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addMonths(0);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.yearOfEra();
        boolean boolean16 = mutableDateTime2.isEqual(0L);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        mutableDateTime20.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.secondOfMinute();
        mutableDateTime20.setMillis((long) 5);
        boolean boolean29 = mutableDateTime20.isBefore(50L);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime32.copy();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime32.toGregorianCalendar();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime40.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.getMutableDateTime();
        int int44 = mutableDateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology45 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar34, chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:23.698Z", chronology45);
        org.joda.time.DateTime dateTime48 = mutableDateTime20.toDateTime(chronology45);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime2.addMinutes(1601516985);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        mutableDateTime2.setRounding(dateTimeField14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        mutableDateTime17.setHourOfDay((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:50:00.294Z" + "'", str10, "2020-11-25T01:50:00.294Z");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        int int12 = mutableDateTime11.getRoundingMode();
        int int13 = mutableDateTime11.getWeekOfWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:00.381Z" + "'", str4, "2020-11-25T01:50:00.381Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        int int7 = mutableDateTime6.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.DurationField durationField9 = property8.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addWeekyears(17);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.dayOfWeek();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        boolean boolean15 = mutableDateTime12.isEqualNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime26.setZoneRetainFields(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:25.024Z", dateTimeZone32);
        mutableDateTime5.setZoneRetainFields(dateTimeZone32);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime5.era();
        org.joda.time.DurationField durationField39 = property38.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:50:00.673Z" + "'", str20, "2020-11-25T01:50:00.673Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNull(durationField39);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime19.toGregorianCalendar();
        boolean boolean22 = mutableDateTime2.equals((java.lang.Object) mutableDateTime19);
        int int23 = mutableDateTime19.getWeekyear();
        mutableDateTime19.addMinutes(78);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:50:00.881Z" + "'", str10, "2020-11-25T01:50:00.881Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        int int10 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.minuteOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.031Z" + "'", str4, "2020-11-25T01:50:01.031Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:50:01.031Z" + "'", str9, "2020-11-25T01:50:01.031Z");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        boolean boolean5 = mutableDateTime2.isEqualNow();
        mutableDateTime2.addMonths(2020);
        int int8 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfMonth();
        int int10 = mutableDateTime2.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        boolean boolean8 = property7.isLeap();
        boolean boolean10 = property7.equals((java.lang.Object) "2020-11-25T01:45:20.723Z");
        org.joda.time.MutableDateTime mutableDateTime12 = property7.addWrapField(0);
        long long13 = property7.remainder();
        org.joda.time.MutableDateTime mutableDateTime15 = property7.add(739);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 493L + "'", long13 == 493L);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone12);
        mutableDateTime14.addWeekyears((-9));
        int int17 = mutableDateTime14.getMonthOfYear();
        int int18 = mutableDateTime14.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setSecondOfMinute(6430000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6430000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:50:01.601Z" + "'", str5, "2020-11-25T01:50:01.601Z");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set(11);
        int int12 = mutableDateTime11.getDayOfYear();
        int int13 = mutableDateTime11.getEra();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.centuryOfEra();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsText(locale15);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTimeISO();
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = mutableDateTime18.toCalendar(locale19);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:01.656Z" + "'", str4, "2020-11-25T01:50:01.656Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "20" + "'", str16, "20");
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=946684800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2000,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        long long9 = property7.remainder();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        int int17 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DurationField durationField18 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime19 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28425635745L + "'", long9 == 28425635745L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(durationField18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setMillis((long) 5);
        boolean boolean11 = mutableDateTime2.isBefore(50L);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime14.toGregorianCalendar();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.getMutableDateTime();
        int int26 = mutableDateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology27 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar16, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:23.698Z", chronology27);
        org.joda.time.DateTime dateTime30 = mutableDateTime2.toDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 14, dateTimeZone4);
        mutableDateTime9.setMinuteOfHour(26);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        int int11 = mutableDateTime2.getMinuteOfDay();
        mutableDateTime2.setMinuteOfDay(59);
        mutableDateTime2.addHours(6539199);
        int int16 = mutableDateTime2.getDayOfMonth();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:50:02.002Z" + "'", str4, "2020-11-25T01:50:02.002Z");
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:50:02.002Z" + "'", str8, "2020-11-25T01:50:02.002Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime5.toString(dateTimeFormatter8);
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-12-01T00:00:00.000Z" + "'", str9, "2020-12-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        long long9 = property7.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property7.set(6564098);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6564098 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28425635153L + "'", long9 == 28425635153L);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        org.joda.time.Chronology chronology5 = mutableDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(78);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 78 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:12.840Z");
        mutableDateTime1.addSeconds(336);
        boolean boolean4 = mutableDateTime1.isEqualNow();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        mutableDateTime7.addMillis((int) 'a');
        boolean boolean10 = mutableDateTime7.isEqualNow();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime7.toMutableDateTime(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime7.add(readableDuration19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime22 = mutableDateTime7.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime24.toGregorianCalendar();
        boolean boolean27 = mutableDateTime7.equals((java.lang.Object) mutableDateTime24);
        long long28 = mutableDateTime7.getMillis();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(1606268729646L, dateTimeZone33);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = mutableDateTime36.toDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime7.toMutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime1.toMutableDateTime(dateTimeZone40);
        mutableDateTime1.addWeekyears(37);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.weekyear();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime51.minuteOfDay();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        mutableDateTime1.setChronology(chronology55);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:50:02.338Z" + "'", str15, "2020-11-25T01:50:02.338Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 98L + "'", long28 == 98L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(chronology55);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundCeiling();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setMinuteOfHour(522);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 522 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfCentury]" + "'", str8, "Property[yearOfCentury]");
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setMillis((long) 18);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime12.copy();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        mutableDateTime21.setWeekOfWeekyear((int) '#');
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Chronology chronology29 = mutableDateTime12.getChronology();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        int int31 = mutableDateTime9.getHourOfDay();
        java.lang.String str32 = mutableDateTime9.toString();
        org.joda.time.ReadableInstant readableInstant33 = null;
        mutableDateTime9.setTime(readableInstant33);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:50:02.652Z" + "'", str23, "2020-11-25T01:50:02.652Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-08-26T01:50:02.652Z" + "'", str32, "2020-08-26T01:50:02.652Z");
    }
}
