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
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        mutableDateTime3.setTime((long) '#');
        boolean boolean8 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 6437888, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:36.530Z" + "'", str5, "2020-11-25T01:49:36.530Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property7.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:36.555Z" + "'", str6, "2020-11-25T01:49:36.555Z");
        org.junit.Assert.assertNotNull(property7);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime2.add(readableDuration11);
        int int13 = mutableDateTime2.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = mutableDateTime2.toString("2020-11-25T01:46:04.251Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.593Z" + "'", str4, "2020-11-25T01:49:36.593Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:36 UTC 2020");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:15.681Z");
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        boolean boolean7 = mutableDateTime2.isBeforeNow();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.setMillis((long) 3);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        java.util.Date date22 = mutableDateTime17.toDate();
        boolean boolean23 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime17.weekyear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.era();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime29.add(readablePeriod36);
        org.joda.time.Chronology chronology38 = mutableDateTime29.getChronology();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        java.lang.String str43 = mutableDateTime41.toString();
        mutableDateTime41.setDayOfYear((int) ' ');
        mutableDateTime41.addWeekyears(48);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology49);
        mutableDateTime50.addMillis((int) 'a');
        mutableDateTime50.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = property55.getField();
        int int57 = mutableDateTime41.get(dateTimeField56);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.hourOfDay();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime60.era();
        java.util.Locale locale67 = null;
        java.lang.String str68 = property66.getAsText(locale67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property66.getFieldType();
        int int70 = mutableDateTime41.get(dateTimeFieldType69);
        boolean boolean71 = mutableDateTime29.isSupported(dateTimeFieldType69);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime17.property(dateTimeFieldType69);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime2.property(dateTimeFieldType69);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDateTime(6415, 6377, 0, 911, 6557286, 807, 3196799);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 911 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.677Z" + "'", str4, "2020-11-25T01:49:36.677Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:36.678Z" + "'", str19, "2020-11-25T01:49:36.678Z");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed Nov 25 01:49:36 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2020-11-25T01:49:36.678Z" + "'", str31, "2020-11-25T01:49:36.678Z");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2020-11-25T01:49:36.678Z" + "'", str43, "2020-11-25T01:49:36.678Z");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20 + "'", int57 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2020-11-25T01:49:36.678Z" + "'", str62, "2020-11-25T01:49:36.678Z");
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "AD" + "'", str68, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        mutableDateTime2.addYears(33);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfMonth();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.add((int) (short) 1);
        int int24 = mutableDateTime23.getSecondOfDay();
        mutableDateTime23.add((long) 58);
        mutableDateTime23.setTime((long) 57);
        boolean boolean29 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        int int30 = mutableDateTime23.getSecondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.727Z" + "'", str4, "2020-11-25T01:49:36.727Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606288776727,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=19,SECOND=36,MILLISECOND=727,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:36.727Z" + "'", str17, "2020-11-25T01:49:36.727Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10176 + "'", int24 == 10176);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
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
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        int int10 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setSecondOfDay(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setHourOfDay(176);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 176 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.764Z" + "'", str4, "2020-11-25T01:49:36.764Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        mutableDateTime0.setMinuteOfHour(48);
        java.lang.Object obj13 = mutableDateTime0.clone();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        java.util.Date date28 = mutableDateTime23.toDate();
        boolean boolean29 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime23.secondOfMinute();
        int int31 = mutableDateTime23.getSecondOfMinute();
        org.joda.time.Chronology chronology32 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj13, chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology32);
        java.lang.String str37 = mutableDateTime35.toString("3");
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime35.setMillisOfSecond(292278994);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:36.831Z" + "'", str6, "2020-11-25T01:49:36.831Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6576831 + "'", int9 == 6576831);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "2020-11-25T01:48:36.831Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "2020-11-25T01:48:36.831Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "2020-11-25T01:48:36.831Z");
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:36.831Z" + "'", str25, "2020-11-25T01:49:36.831Z");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed Nov 25 01:49:36 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 36 + "'", int31 == 36);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "3" + "'", str37, "3");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime2.add(readableDuration8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        java.lang.Object obj11 = mutableDateTime2.clone();
        int int12 = mutableDateTime2.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "2020-11-25T01:49:36.873Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "2020-11-25T01:49:36.873Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "2020-11-25T01:49:36.873Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        mutableDateTime0.addMonths(7);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime0.weekOfWeekyear();
        mutableDateTime0.addMinutes(6545765);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:36.918Z" + "'", str6, "2020-11-25T01:49:36.918Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6576918 + "'", int9 == 6576918);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        boolean boolean12 = mutableDateTime10.isEqual((long) 27);
        boolean boolean13 = mutableDateTime10.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setWeekOfWeekyear(6573);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6573 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) 'a');
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfCeiling();
        int int16 = mutableDateTime15.getDayOfYear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime15.toMutableDateTime(chronology29);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime10.hourOfDay();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        mutableDateTime36.addMinutes(330);
        java.util.Date date42 = mutableDateTime36.toDate();
        mutableDateTime36.add((long) 48);
        mutableDateTime36.setTime((long) 6325);
        long long47 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime mutableDateTime48 = property33.roundFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:36.980Z" + "'", str4, "2020-11-25T01:49:36.980Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:36.981Z" + "'", str27, "2020-11-25T01:49:36.981Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:36.981Z" + "'", str38, "2020-11-25T01:49:36.981Z");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed Nov 25 07:19:36 UTC 2020");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 887L + "'", long47 == 887L);
        org.junit.Assert.assertNotNull(mutableDateTime48);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime2.setZone(dateTimeZone15);
        int int17 = mutableDateTime2.getCenturyOfEra();
        int int18 = mutableDateTime2.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setTime((int) (byte) -1, 32, 253, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.042Z" + "'", str4, "2020-11-25T01:49:37.042Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6577042 + "'", int18 == 6577042);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        mutableDateTime2.addWeekyears(48);
        boolean boolean10 = mutableDateTime2.isBefore((long) 23);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.yearOfCentury();
        int int12 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setWeekyear(838);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.082Z" + "'", str4, "2020-11-25T01:49:37.082Z");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.year();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        mutableDateTime13.addDays(100);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.secondOfMinute();
        java.lang.Object obj21 = null;
        boolean boolean22 = mutableDateTime13.equals(obj21);
        long long23 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setMinuteOfDay(6464);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6464 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:37.127Z" + "'", str15, "2020-11-25T01:49:37.127Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:11.872Z");
        mutableDateTime1.setMillis((long) 24);
        int int4 = mutableDateTime1.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime5, dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        java.lang.String str15 = mutableDateTime13.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.toMutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime(dateTimeZone17);
        boolean boolean22 = mutableDateTime1.equals((java.lang.Object) 59599L);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:37.192Z" + "'", str15, "2020-11-25T01:49:37.192Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) 'a');
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        int int12 = property11.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.249Z" + "'", str4, "2020-11-25T01:49:37.249Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        boolean boolean7 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getDurationField();
        int int10 = property8.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = mutableDateTime15.toDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime16.toDateTime(chronology23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        int int29 = mutableDateTime27.getSecondOfMinute();
        mutableDateTime27.setMillis((long) 3);
        boolean boolean32 = dateTime24.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.DateTimeField dateTimeField33 = mutableDateTime27.getRoundingField();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        java.util.Date date41 = mutableDateTime36.toDate();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime36.copy();
        java.util.Date date43 = mutableDateTime36.toDate();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        mutableDateTime46.addMillis((int) 'a');
        mutableDateTime46.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        int int53 = mutableDateTime36.get(dateTimeField52);
        int int54 = mutableDateTime27.get(dateTimeField52);
        java.util.Locale locale55 = null;
        java.util.Calendar calendar56 = mutableDateTime27.toCalendar(locale55);
        long long57 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:37.304Z" + "'", str21, "2020-11-25T01:49:37.304Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 37 + "'", int29 == 37);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dateTimeField33);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:37.304Z" + "'", str38, "2020-11-25T01:49:37.304Z");
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed Nov 25 01:49:37 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed Nov 25 01:49:37 UTC 2020");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 19 + "'", int54 == 19);
        org.junit.Assert.assertNotNull(calendar56);
        org.junit.Assert.assertEquals(calendar56.toString(), "java.util.GregorianCalendar[time=3,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=3,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundFloor();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime8.getRoundingField();
        mutableDateTime8.addDays(6348);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNull(dateTimeField9);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:48:24.305Z");
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.minuteOfHour();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        mutableDateTime7.setHourOfDay((int) (byte) 0);
        boolean boolean11 = mutableDateTime7.isBefore((long) 6417230);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        java.util.Date date19 = mutableDateTime14.toDate();
        mutableDateTime14.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.yearOfCentury();
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        mutableDateTime26.setTime((long) '#');
        boolean boolean31 = mutableDateTime26.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime14.setZone(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(6568, 6549, 10, 55, 6464, 6444802, 0, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:37.445Z" + "'", str16, "2020-11-25T01:49:37.445Z");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 01:49:37 UTC 2020");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:37.445Z" + "'", str28, "2020-11-25T01:49:37.445Z");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.yearOfCentury();
        boolean boolean9 = property8.isLeap();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property8.getAsShortText(locale10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime17.toDateTime(chronology24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        int int30 = mutableDateTime28.getSecondOfMinute();
        mutableDateTime28.setMillis((long) 3);
        boolean boolean33 = dateTime25.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.centuryOfEra();
        mutableDateTime28.setYear(1);
        mutableDateTime28.addWeeks(2);
        boolean boolean39 = property8.equals((java.lang.Object) mutableDateTime28);
        mutableDateTime28.addMillis(10135);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:37.509Z" + "'", str6, "2020-11-25T01:49:37.509Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20" + "'", str11, "20");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:37.510Z" + "'", str22, "2020-11-25T01:49:37.510Z");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37 + "'", int30 == 37);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsShortText(locale6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add((long) 6407827);
        org.joda.time.DurationField durationField10 = property4.getRangeDurationField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dec" + "'", str7, "Dec");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
        int int14 = property8.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.roundHalfFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.600Z" + "'", str4, "2020-11-25T01:49:37.600Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:37.634Z" + "'", str6, "2020-11-25T01:49:37.634Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) 'a');
        mutableDateTime10.setSecondOfDay(105);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfDay();
        int int14 = mutableDateTime10.getSecondOfMinute();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.centuryOfEra();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.yearOfEra();
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.677Z" + "'", str4, "2020-11-25T01:49:37.677Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 45 + "'", int14 == 45);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime14.getRoundingField();
        boolean boolean16 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone23);
        int int25 = mutableDateTime24.getYearOfCentury();
        mutableDateTime24.addWeeks(863);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.719Z" + "'", str4, "2020-11-25T01:49:37.719Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:37.719Z" + "'", str21, "2020-11-25T01:49:37.719Z");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundCeiling();
        org.joda.time.DurationField durationField9 = property6.getRangeDurationField();
        int int10 = property6.getMinimumValue();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundFloor();
        mutableDateTime10.setMinuteOfDay(4);
        mutableDateTime10.addMinutes(6425430);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.millisOfSecond();
        int int16 = mutableDateTime10.getYearOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.879Z" + "'", str4, "2020-11-25T01:49:37.879Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int2 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfEra();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfDay();
        mutableDateTime9.setMillis((long) 6);
        int int13 = mutableDateTime9.getYearOfCentury();
        long long14 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1969L) + "'", long14 == (-1969L));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        mutableDateTime11.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.era();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime25.add(readablePeriod32);
        org.joda.time.Chronology chronology34 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(0L, chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        java.lang.String str41 = mutableDateTime39.toString();
        mutableDateTime39.setDayOfYear((int) ' ');
        mutableDateTime39.addWeekyears(48);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        mutableDateTime48.addMillis((int) 'a');
        mutableDateTime48.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = property53.getField();
        int int55 = mutableDateTime39.get(dateTimeField54);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime58.add(readablePeriod61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime58.hourOfDay();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime58.era();
        java.util.Locale locale65 = null;
        java.lang.String str66 = property64.getAsText(locale65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property64.getFieldType();
        int int68 = mutableDateTime39.get(dateTimeFieldType67);
        boolean boolean69 = mutableDateTime36.isSupported(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime21.property(dateTimeFieldType67);
        mutableDateTime11.set(dateTimeFieldType67, 1);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime11.minuteOfDay();
        mutableDateTime11.addYears(6517);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:37.935Z" + "'", str4, "2020-11-25T01:49:37.935Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:37.936Z" + "'", str27, "2020-11-25T01:49:37.936Z");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeZone40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:37.936Z" + "'", str41, "2020-11-25T01:49:37.936Z");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20 + "'", int55 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:37.936Z" + "'", str60, "2020-11-25T01:49:37.936Z");
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "AD" + "'", str66, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(property73);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        int int3 = mutableDateTime2.getMillisOfDay();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        java.lang.String str8 = mutableDateTime6.toString();
        mutableDateTime6.setDayOfYear((int) ' ');
        mutableDateTime6.addWeekyears(48);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.addMillis((int) 'a');
        mutableDateTime15.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = mutableDateTime6.get(dateTimeField21);
        mutableDateTime2.setRounding(dateTimeField21);
        mutableDateTime2.setDayOfYear(106);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime2.dayOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:38.002Z" + "'", str8, "2020-11-25T01:49:38.002Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime9.toString(dateTimeFormatter11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = mutableDateTime17.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime17.toDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime9.toMutableDateTime(chronology26);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.era();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime31.add(readablePeriod38);
        org.joda.time.Chronology chronology40 = mutableDateTime31.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.DateTime dateTime42 = mutableDateTime28.toDateTime(chronology40);
        boolean boolean43 = dateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        int int44 = mutableDateTime28.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:38.033Z" + "'", str12, "2020-11-25T01:49:38.033Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:38.033Z" + "'", str24, "2020-11-25T01:49:38.033Z");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:38.033Z" + "'", str33, "2020-11-25T01:49:38.033Z");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.centuryOfEra();
        mutableDateTime16.setYear(1);
        mutableDateTime16.addWeeks(2);
        int int27 = mutableDateTime16.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.102Z" + "'", str10, "2020-11-25T01:49:38.102Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfDay();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfFloor();
        long long21 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime23 = property4.add(58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime25 = property4.set(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86399 + "'", int18 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        int int7 = property6.getMinimumValue();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.setMillis((long) 3);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        java.util.Date date22 = mutableDateTime17.toDate();
        boolean boolean23 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime17.getZone();
        mutableDateTime17.setSecondOfDay(46);
        boolean boolean27 = property6.equals((java.lang.Object) 46);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:38.197Z" + "'", str19, "2020-11-25T01:49:38.197Z");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed Nov 25 01:49:38 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Interval interval13 = property11.toInterval();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.241Z" + "'", str4, "2020-11-25T01:49:38.241Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:38 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        int int10 = mutableDateTime5.getEra();
        mutableDateTime5.addMillis(41);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.era();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:49:21.887Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.Object obj4 = mutableDateTime2.clone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(6377, 552, 6551, 292278994, 6569, 3196799, 709, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:38.359Z" + "'", str11, "2020-11-25T01:49:38.359Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        int int10 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime2.copy();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 56);
        java.lang.String str16 = mutableDateTime12.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.377Z" + "'", str4, "2020-11-25T01:49:38.377Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:38 UTC 2020");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.048Z" + "'", str16, "1970-01-01T00:00:00.048Z");
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
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        int int8 = mutableDateTime7.getYear();
        int int9 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.dayOfWeek();
        boolean boolean11 = property10.isLeap();
        java.util.Locale locale12 = null;
        int int13 = property10.getMaximumTextLength(locale12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.era();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsText(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property22.getFieldType();
        org.joda.time.DurationField durationField26 = property22.getRangeDurationField();
        java.lang.String str27 = property22.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime28 = property22.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfDay();
        mutableDateTime28.addWeeks(6545765);
        int int32 = property10.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.415Z" + "'", str4, "2020-11-25T01:49:38.415Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:38.415Z" + "'", str18, "2020-11-25T01:49:38.415Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AD" + "'", str24, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AD" + "'", str27, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfEven();
        java.lang.String str11 = property9.toString();
        int int12 = property9.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfFloor();
        java.util.Locale locale14 = null;
        int int15 = property9.getMaximumShortTextLength(locale14);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.476Z" + "'", str4, "2020-11-25T01:49:38.476Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.501Z" + "'", str4, "2020-11-25T01:49:38.501Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        int int12 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.millisOfSecond();
        int int14 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.hourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.521Z" + "'", str4, "2020-11-25T01:49:38.521Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:38 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        mutableDateTime2.addWeekyears(48);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setDate((long) 6340418);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime2.toMutableDateTime(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        mutableDateTime21.setRounding(dateTimeField30);
        int int32 = mutableDateTime21.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.setMinuteOfHour(6557588);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6557588 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.570Z" + "'", str4, "2020-11-25T01:49:38.570Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:38.570Z" + "'", str17, "2020-11-25T01:49:38.570Z");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:38.571Z" + "'", str26, "2020-11-25T01:49:38.571Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
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
        int int6 = mutableDateTime2.getMinuteOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.613Z" + "'", str4, "2020-11-25T01:49:38.613Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 109 + "'", int6 == 109);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.668Z" + "'", str10, "2020-11-25T01:49:38.668Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        java.util.Date date9 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        mutableDateTime12.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime2.toString(dateTimeFormatter21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime2.add(readableDuration23, 2046);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.728Z" + "'", str4, "2020-11-25T01:49:38.728Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:38 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:38 UTC 2020");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:38.728Z" + "'", str22, "2020-11-25T01:49:38.728Z");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundCeiling();
        mutableDateTime9.setMonthOfYear(2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setMinuteOfHour(972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 972 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:38.773Z" + "'", str6, "2020-11-25T01:49:38.773Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        mutableDateTime0.setDate((long) 6426938);
        java.util.Date date4 = mutableDateTime0.toDate();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2020-11-25T01:49:38.798Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2020-11-25T01:49:38.798Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2020-11-25T01:49:38.798Z");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:49:38 UTC 1970");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeField dateTimeField22 = mutableDateTime16.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime16.yearOfCentury();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property24.getAsShortText(locale25);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:38.826Z" + "'", str10, "2020-11-25T01:49:38.826Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "70" + "'", str26, "70");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, 17);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.centuryOfEra();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfCeiling();
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) "2020-11-25T01:46:16.614Z");
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime14.toMutableDateTime();
        mutableDateTime17.setDate((-1), 10, 12);
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime17.setZoneRetainFields(dateTimeZone28);
        boolean boolean31 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setSecondOfDay(6543806);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6543806 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 41 + "'", int22 == 41);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:38.885Z" + "'", str27, "2020-11-25T01:49:38.885Z");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.dayOfWeek();
        java.lang.String str6 = property5.getAsString();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.getMutableDateTime();
        int int8 = mutableDateTime7.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
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
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        int int10 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setSecondOfDay(0);
        org.joda.time.Chronology chronology13 = mutableDateTime2.getChronology();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:38.983Z" + "'", str4, "2020-11-25T01:49:38.983Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology13);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        int int12 = mutableDateTime11.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime11.add(readablePeriod13);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.014Z" + "'", str4, "2020-11-25T01:49:39.014Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:39 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isAfterNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfMonth();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.String str10 = mutableDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime5.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        java.lang.String str19 = mutableDateTime17.toString();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime14.toMutableDateTime(dateTimeZone20);
        mutableDateTime22.setMillisOfDay(2068);
        int int25 = mutableDateTime22.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:39.139Z" + "'", str10, "2020-11-25T01:49:39.139Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:39.139Z" + "'", str19, "2020-11-25T01:49:39.139Z");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime21.isSupported(dateTimeFieldType52);
        boolean boolean55 = mutableDateTime2.isSupported(dateTimeFieldType52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        int int63 = mutableDateTime58.getWeekOfWeekyear();
        mutableDateTime58.addWeekyears((int) (short) -1);
        boolean boolean66 = mutableDateTime58.isAfterNow();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        int int72 = mutableDateTime69.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime74 = property73.getMutableDateTime();
        mutableDateTime74.setSecondOfMinute(11);
        mutableDateTime58.setTime((org.joda.time.ReadableInstant) mutableDateTime74);
        boolean boolean78 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime2.centuryOfEra();
        int int80 = mutableDateTime2.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        mutableDateTime2.add(readablePeriod81, 6430);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str4, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str12, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str26, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str45, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AD" + "'", str51, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str60, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 48 + "'", int63 == 48);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "2020-11-25T01:49:39.180Z" + "'", str71, "2020-11-25T01:49:39.180Z");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20 + "'", int72 == 20);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2020 + "'", int80 == 2020);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        java.util.Date date9 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        mutableDateTime12.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        java.lang.String str24 = mutableDateTime22.toString();
        mutableDateTime22.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime28, dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField35 = mutableDateTime34.getRoundingField();
        boolean boolean36 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        java.lang.String str41 = mutableDateTime39.toString();
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime39.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime22.toMutableDateTime(dateTimeZone43);
        mutableDateTime2.setZone(dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfYear(6549);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6549 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.254Z" + "'", str4, "2020-11-25T01:49:39.254Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:39 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:39 UTC 2020");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:39.254Z" + "'", str24, "2020-11-25T01:49:39.254Z");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:39.254Z" + "'", str41, "2020-11-25T01:49:39.254Z");
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6457109);
        mutableDateTime1.addMinutes(41);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        int int3 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        int int11 = mutableDateTime6.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.yearOfEra();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        int int16 = mutableDateTime15.getMillisOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear((int) ' ');
        mutableDateTime19.addWeekyears(48);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        mutableDateTime28.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = mutableDateTime19.get(dateTimeField34);
        mutableDateTime15.setRounding(dateTimeField34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = property44.getField();
        mutableDateTime15.setRounding(dateTimeField45);
        int int47 = mutableDateTime6.get(dateTimeField45);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setRounding(dateTimeField45, 6497);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 6497");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-11-25T01:49:39.442Z" + "'", str8, "2020-11-25T01:49:39.442Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:39.442Z" + "'", str21, "2020-11-25T01:49:39.442Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2020-11-25T01:49:39.442Z" + "'", str41, "2020-11-25T01:49:39.442Z");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime2.setZone(dateTimeZone15);
        int int17 = mutableDateTime2.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime19, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone23);
        int int26 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.millisOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.499Z" + "'", str4, "2020-11-25T01:49:39.499Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        int int9 = property7.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundHalfFloor();
        org.joda.time.DurationField durationField11 = property7.getDurationField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.550Z" + "'", str4, "2020-11-25T01:49:39.550Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime10.setZoneRetainFields(dateTimeZone22);
        int int25 = property6.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime27, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone31);
        int int35 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        int int36 = property6.get();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property6.getAsText(locale37);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.658Z" + "'", str4, "2020-11-25T01:49:39.658Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.658Z" + "'", str12, "2020-11-25T01:49:39.658Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        mutableDateTime10.addDays(100);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime10.setRounding(dateTimeField25);
        long long27 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        int int28 = mutableDateTime10.getMonthOfYear();
        int int29 = mutableDateTime10.getEra();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.addWrapField(2021);
        org.joda.time.ReadablePartial readablePartial33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = property30.compareTo(readablePartial33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:39.750Z" + "'", str4, "2020-11-25T01:49:39.750Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:39.750Z" + "'", str12, "2020-11-25T01:49:39.750Z");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:39.750Z" + "'", str21, "2020-11-25T01:49:39.750Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-8633420L) + "'", long27 == (-8633420L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(mutableDateTime32);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        int int10 = mutableDateTime9.getYear();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime15.add(readablePeriod22);
        org.joda.time.Chronology chronology24 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(0L, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1L, chronology24);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.hourOfDay();
        java.util.Date date35 = mutableDateTime30.toDate();
        int int36 = mutableDateTime30.getDayOfYear();
        int int37 = mutableDateTime30.getDayOfYear();
        int int38 = mutableDateTime30.getEra();
        mutableDateTime30.setDate((long) 7);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime43.add(readablePeriod50);
        org.joda.time.Chronology chronology52 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime27.toMutableDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology52);
        mutableDateTime9.setChronology(chronology52);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:39.860Z" + "'", str6, "2020-11-25T01:49:39.860Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:39.860Z" + "'", str17, "2020-11-25T01:49:39.860Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T01:49:39.860Z" + "'", str32, "2020-11-25T01:49:39.860Z");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Wed Nov 25 01:49:39 UTC 2020");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 330 + "'", int36 == 330);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 330 + "'", int37 == 330);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:39.860Z" + "'", str45, "2020-11-25T01:49:39.860Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        int int7 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        int int11 = mutableDateTime10.getMillisOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.String str16 = mutableDateTime14.toString();
        mutableDateTime14.setDayOfYear((int) ' ');
        mutableDateTime14.addWeekyears(48);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        mutableDateTime23.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = mutableDateTime14.get(dateTimeField29);
        mutableDateTime10.setRounding(dateTimeField29);
        mutableDateTime2.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.weekyear();
        int int34 = mutableDateTime2.getMonthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.025Z" + "'", str4, "2020-11-25T01:49:40.025Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:40.025Z" + "'", str16, "2020-11-25T01:49:40.025Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.toMutableDateTimeISO();
        int int22 = mutableDateTime20.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:40.109Z" + "'", str11, "2020-11-25T01:49:40.109Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2020 + "'", int22 == 2020);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setHourOfDay(6548685);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6548685 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.149Z" + "'", str4, "2020-11-25T01:49:40.149Z");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        mutableDateTime8.addDays(100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime8.secondOfMinute();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.String str20 = mutableDateTime18.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime18.getZone();
        mutableDateTime8.setZone(dateTimeZone21);
        mutableDateTime2.setZone(dateTimeZone21);
        mutableDateTime2.setYear(6430958);
        java.lang.Class<?> wildcardClass26 = mutableDateTime2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:40.365Z" + "'", str10, "2020-11-25T01:49:40.365Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:40.365Z" + "'", str20, "2020-11-25T01:49:40.365Z");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.era();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime11.add(readablePeriod18);
        org.joda.time.Chronology chronology20 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.String str27 = mutableDateTime25.toString();
        mutableDateTime25.setDayOfYear((int) ' ');
        mutableDateTime25.addWeekyears(48);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        mutableDateTime34.addMillis((int) 'a');
        mutableDateTime34.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        int int41 = mutableDateTime25.get(dateTimeField40);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.era();
        java.util.Locale locale51 = null;
        java.lang.String str52 = property50.getAsText(locale51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property50.getFieldType();
        int int54 = mutableDateTime25.get(dateTimeFieldType53);
        boolean boolean55 = mutableDateTime22.isSupported(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime7.property(dateTimeFieldType53);
        int int57 = mutableDateTime0.get(dateTimeFieldType53);
        int int58 = mutableDateTime0.getHourOfDay();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        int int63 = mutableDateTime61.getSecondOfMinute();
        mutableDateTime61.setMillis((long) 3);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        mutableDateTime68.add(readablePeriod71);
        java.util.Date date73 = mutableDateTime68.toDate();
        boolean boolean74 = mutableDateTime61.isAfter((org.joda.time.ReadableInstant) mutableDateTime68);
        mutableDateTime61.setDayOfYear(10);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime61.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property77.getFieldType();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime0.property(dateTimeFieldType78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime0.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T01:49:40.437Z" + "'", str13, "2020-11-25T01:49:40.437Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:40.437Z" + "'", str27, "2020-11-25T01:49:40.437Z");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:40.437Z" + "'", str46, "2020-11-25T01:49:40.437Z");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "AD" + "'", str52, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 40 + "'", int63 == 40);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:40.437Z" + "'", str70, "2020-11-25T01:49:40.437Z");
        org.junit.Assert.assertNotNull(date73);
// flaky:         org.junit.Assert.assertEquals(date73.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property80);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime8.add(readableDuration10);
        int int12 = mutableDateTime8.getDayOfYear();
        java.util.Date date13 = mutableDateTime8.toDate();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:40.553Z" + "'", str5, "2020-11-25T01:49:40.553Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:06 UTC 1970");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.yearOfCentury();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        mutableDateTime11.setMillis((long) 3);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        java.util.Date date23 = mutableDateTime18.toDate();
        boolean boolean24 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime18.secondOfMinute();
        int int26 = mutableDateTime18.getSecondOfMinute();
        org.joda.time.Chronology chronology27 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime0.toMutableDateTime(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:40.653Z" + "'", str6, "2020-11-25T01:49:40.653Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 40 + "'", int13 == 40);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:40.653Z" + "'", str20, "2020-11-25T01:49:40.653Z");
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 40 + "'", int26 == 40);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(mutableDateTime30);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.minuteOfHour();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:40.752Z" + "'", str5, "2020-11-25T01:49:40.752Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        java.lang.String str13 = property8.getAsShortText();
        java.util.Locale locale14 = null;
        int int15 = property8.getMaximumShortTextLength(locale14);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:40.841Z" + "'", str4, "2020-11-25T01:49:40.841Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime2.setDayOfYear(10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.minuteOfDay();
        java.lang.String str19 = property18.getAsText();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        java.util.Date date27 = mutableDateTime22.toDate();
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime22.toCalendar(locale28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime22.copy();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.year();
        boolean boolean33 = property18.equals((java.lang.Object) mutableDateTime22);
        org.joda.time.MutableDateTime mutableDateTime34 = property18.roundHalfEven();
        int int35 = mutableDateTime34.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime34.toMutableDateTimeISO();
        org.joda.time.DateTimeField dateTimeField37 = mutableDateTime36.getRoundingField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:40.924Z" + "'", str11, "2020-11-25T01:49:40.924Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:40.924Z" + "'", str24, "2020-11-25T01:49:40.924Z");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed Nov 25 01:49:40 UTC 2020");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1606268980924,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=40,MILLISECOND=924,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNull(dateTimeField37);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:32.775Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekOfWeekyear();
        int int3 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        mutableDateTime2.addWeekyears(48);
        mutableDateTime2.setWeekyear((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.era();
        int int12 = property11.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.102Z" + "'", str4, "2020-11-25T01:49:41.102Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:41.154Z" + "'", str10, "2020-11-25T01:49:41.154Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(property7);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfMonth();
        long long19 = property18.remainder();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.256Z" + "'", str4, "2020-11-25T01:49:41.256Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:41.256Z" + "'", str14, "2020-11-25T01:49:41.256Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3881256L + "'", long19 == 3881256L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        int int10 = mutableDateTime9.getYearOfCentury();
        boolean boolean12 = mutableDateTime9.isBefore(28432149809L);
        int int13 = mutableDateTime9.getDayOfYear();
        mutableDateTime9.setMillisOfDay(6481);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:41.324Z" + "'", str6, "2020-11-25T01:49:41.324Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 330 + "'", int13 == 330);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        boolean boolean22 = mutableDateTime20.isBefore((long) 230);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:41.394Z" + "'", str11, "2020-11-25T01:49:41.394Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        java.util.Date date9 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        mutableDateTime12.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        int int20 = mutableDateTime2.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime2.add(readableDuration21, 2);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        mutableDateTime26.addMillis((int) 'a');
        int int29 = mutableDateTime26.getDayOfYear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        mutableDateTime32.setTime((long) '#');
        mutableDateTime32.addDays(100);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime32.secondOfMinute();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        java.lang.String str44 = mutableDateTime42.toString();
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime42.getZone();
        mutableDateTime32.setZone(dateTimeZone45);
        mutableDateTime26.setZone(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime2.toMutableDateTime(dateTimeZone45);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        java.util.Date date57 = mutableDateTime52.toDate();
        java.util.Locale locale58 = null;
        java.util.Calendar calendar59 = mutableDateTime52.toCalendar(locale58);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime52.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime52.copy();
        int int62 = mutableDateTime52.getSecondOfDay();
        boolean boolean63 = mutableDateTime49.isAfter((org.joda.time.ReadableInstant) mutableDateTime52);
        int int64 = mutableDateTime52.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.482Z" + "'", str4, "2020-11-25T01:49:41.482Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T01:49:41.482Z" + "'", str34, "2020-11-25T01:49:41.482Z");
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeZone43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:41.482Z" + "'", str44, "2020-11-25T01:49:41.482Z");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(mutableDateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2020-11-25T01:49:41.482Z" + "'", str54, "2020-11-25T01:49:41.482Z");
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertNotNull(calendar59);
// flaky:         org.junit.Assert.assertEquals(calendar59.toString(), "java.util.GregorianCalendar[time=1606268981482,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=41,MILLISECOND=482,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime61);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 6581 + "'", int62 == 6581);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 49 + "'", int64 == 49);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.minuteOfHour();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property8.getAsText(locale10);
        int int12 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime13 = property8.roundHalfCeiling();
        int int14 = mutableDateTime13.getYearOfCentury();
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime13.toCalendar(locale15);
        mutableDateTime13.addSeconds(30);
        boolean boolean19 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "December" + "'", str11, "December");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1606780800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.String str10 = mutableDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime3.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:14.038Z", dateTimeZone11);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        mutableDateTime17.addMinutes(330);
        java.util.Date date23 = mutableDateTime17.toDate();
        mutableDateTime17.setMillisOfDay((int) (byte) 100);
        boolean boolean26 = mutableDateTime17.isAfterNow();
        mutableDateTime17.addDays(37);
        mutableDateTime17.addMinutes(0);
        int int31 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        java.util.Date date39 = mutableDateTime34.toDate();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime34.copy();
        java.util.Date date41 = mutableDateTime34.toDate();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        mutableDateTime44.addMillis((int) 'a');
        mutableDateTime44.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        int int51 = mutableDateTime34.get(dateTimeField50);
        int int52 = mutableDateTime34.getDayOfMonth();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = mutableDateTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime55.add(readablePeriod58);
        int int60 = mutableDateTime55.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime55.yearOfEra();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology63);
        int int65 = mutableDateTime64.getMillisOfDay();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        java.lang.String str70 = mutableDateTime68.toString();
        mutableDateTime68.setDayOfYear((int) ' ');
        mutableDateTime68.addWeekyears(48);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology76);
        mutableDateTime77.addMillis((int) 'a');
        mutableDateTime77.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime77.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField83 = property82.getField();
        int int84 = mutableDateTime68.get(dateTimeField83);
        mutableDateTime64.setRounding(dateTimeField83);
        java.lang.Object obj86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(obj86, chronology87);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = null;
        java.lang.String str90 = mutableDateTime88.toString(dateTimeFormatter89);
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        mutableDateTime88.add(readablePeriod91);
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime88.hourOfDay();
        org.joda.time.DateTimeField dateTimeField94 = property93.getField();
        mutableDateTime64.setRounding(dateTimeField94);
        int int96 = mutableDateTime55.get(dateTimeField94);
        int int97 = mutableDateTime34.get(dateTimeField94);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setRounding(dateTimeField94, 6453336);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 6453336");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str5, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str10, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str19, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 07:19:41 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str36, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Wed Nov 25 01:49:41 UTC 2020");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20 + "'", int51 == 20);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 25 + "'", int52 == 25);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str57, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20 + "'", int60 == 20);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str70, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 20 + "'", int84 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "2020-11-25T01:49:41.676Z" + "'", str90, "2020-11-25T01:49:41.676Z");
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(dateTimeField94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.year();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:48:53.482Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
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
        mutableDateTime2.setTime((long) '#');
        int int7 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        int int11 = mutableDateTime10.getMillisOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.String str16 = mutableDateTime14.toString();
        mutableDateTime14.setDayOfYear((int) ' ');
        mutableDateTime14.addWeekyears(48);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        mutableDateTime23.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = mutableDateTime14.get(dateTimeField29);
        mutableDateTime10.setRounding(dateTimeField29);
        mutableDateTime2.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.weekyear();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime2.add(readableDuration34);
        mutableDateTime2.addSeconds(57);
        int int38 = mutableDateTime2.getMonthOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.849Z" + "'", str4, "2020-11-25T01:49:41.849Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:41.849Z" + "'", str16, "2020-11-25T01:49:41.849Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        int int8 = mutableDateTime7.getYear();
        mutableDateTime7.setMinuteOfDay(19);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.dayOfYear();
        int int12 = mutableDateTime7.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfDay();
        mutableDateTime7.setYear(9);
        mutableDateTime7.setTime((long) 2020);
        java.lang.String str18 = mutableDateTime7.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:41.923Z" + "'", str4, "2020-11-25T01:49:41.923Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 923 + "'", int12 == 923);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0009-11-25T00:00:02.020Z" + "'", str18, "0009-11-25T00:00:02.020Z");
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillis((long) 7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfSecond();
        int int9 = property8.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        org.joda.time.Interval interval11 = property8.toInterval();
        org.joda.time.DurationField durationField12 = property8.getLeapDurationField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNull(durationField12);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        int int10 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        java.util.Locale locale12 = null;
        java.util.Calendar calendar13 = mutableDateTime2.toCalendar(locale12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.039Z" + "'", str4, "2020-11-25T01:49:42.039Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:42 UTC 2020");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=48,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=48,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getEra();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.era();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime12.add(readablePeriod19);
        org.joda.time.Chronology chronology21 = mutableDateTime12.getChronology();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime12.isSupported(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.set(dateTimeFieldType52, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:42.140Z" + "'", str5, "2020-11-25T01:49:42.140Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:42.140Z" + "'", str14, "2020-11-25T01:49:42.140Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:42.140Z" + "'", str26, "2020-11-25T01:49:42.140Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:42.140Z" + "'", str45, "2020-11-25T01:49:42.140Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AD" + "'", str51, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        java.lang.String str13 = property8.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.addWrapField(6454145);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime15.add(readablePeriod16, 6434714);
        int int19 = mutableDateTime15.getCenturyOfEra();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime15.toCalendar(locale20);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.198Z" + "'", str4, "2020-11-25T01:49:42.198Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-125883843017802,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2021,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=347,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=42,MILLISECOND=198,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setHourOfDay((int) (byte) 0);
        boolean boolean4 = mutableDateTime0.isBefore((long) 6417230);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        java.util.Date date12 = mutableDateTime7.toDate();
        mutableDateTime7.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime7.yearOfCentury();
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime7.setSecondOfMinute((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setDateTime(972, 513, 6545766, 2020, 7200, 6438899, 9986);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:42.266Z" + "'", str9, "2020-11-25T01:49:42.266Z");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 01:49:42 UTC 2020");
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime2.setZoneRetainFields(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfWeek();
        boolean boolean19 = mutableDateTime2.isAfter(0L);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime24, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField31 = mutableDateTime30.getRoundingField();
        boolean boolean33 = mutableDateTime30.isEqual((long) 5);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime34.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfCeiling();
        int int38 = mutableDateTime37.getDayOfYear();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime44 = mutableDateTime43.toDateTimeISO();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.DateTime dateTime52 = dateTime44.toDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime37.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = mutableDateTime30.toDateTime(chronology51);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime20.toMutableDateTime(chronology51);
        int int56 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        int int57 = mutableDateTime20.getYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.290Z" + "'", str4, "2020-11-25T01:49:42.290Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(gregorianCalendar35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2020-11-25T01:49:42.290Z" + "'", str49, "2020-11-25T01:49:42.290Z");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2020 + "'", int57 == 2020);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumShortTextLength(locale9);
        java.lang.String str11 = property6.getName();
        java.util.Locale locale12 = null;
        int int13 = property6.getMaximumTextLength(locale12);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "secondOfDay" + "'", str11, "secondOfDay");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.centuryOfEra();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.DurationField durationField10 = property6.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = property4.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfCeiling();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime7);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        int int7 = mutableDateTime2.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDate(6506, 292278993, 6560);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.598Z" + "'", str4, "2020-11-25T01:49:42.598Z");
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 109 + "'", int7 == 109);
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
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(48);
        boolean boolean10 = property7.isLeap();
        int int11 = property7.get();
        int int12 = property7.getMinimumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.677Z" + "'", str4, "2020-11-25T01:49:42.677Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setMinuteOfHour(10079);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10079 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.727Z" + "'", str4, "2020-11-25T01:49:42.727Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:42 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add(58);
        mutableDateTime8.addYears(64);
        java.lang.Class<?> wildcardClass11 = mutableDateTime8.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.760Z" + "'", str4, "2020-11-25T01:49:42.760Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getYearOfCentury();
        int int7 = mutableDateTime5.getRoundingMode();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfSecond();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        int int6 = mutableDateTime2.getSecondOfDay();
        int int7 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) 'a');
        mutableDateTime10.setSecondOfDay(105);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.secondOfDay();
        int int21 = property20.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundHalfEven();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.monthOfYear();
        boolean boolean24 = property13.equals((java.lang.Object) property23);
        int int25 = property23.getLeapAmount();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property23.getAsText(locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = property23.set("2020-11-25T01:49:19.351Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:49:19.351Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:42.950Z" + "'", str4, "2020-11-25T01:49:42.950Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86399 + "'", int21 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "November" + "'", str27, "November");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:22.207Z");
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int15 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime13.setMillis((long) 3);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        int int22 = property21.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        boolean boolean24 = mutableDateTime13.isSupported(dateTimeFieldType23);
        int int25 = mutableDateTime9.get(dateTimeFieldType23);
        int int26 = mutableDateTime2.get(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43 + "'", int4 == 43);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6322 + "'", int25 == 6322);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6583 + "'", int26 == 6583);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        mutableDateTime0.setMinuteOfHour(48);
        int int13 = mutableDateTime0.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, dateTimeZone18);
        java.lang.String str20 = mutableDateTime14.toString();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.centuryOfEra();
        int int23 = mutableDateTime14.getMillisOfDay();
        int int24 = mutableDateTime14.getDayOfYear();
        mutableDateTime14.setMinuteOfHour(48);
        java.lang.Object obj27 = mutableDateTime14.clone();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        java.lang.String str33 = mutableDateTime31.toString();
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone34);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfMonth();
        boolean boolean38 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime36);
        int int39 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DurationFieldType durationFieldType40 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.add(durationFieldType40, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:43.102Z" + "'", str6, "2020-11-25T01:49:43.102Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6583102 + "'", int9 == 6583102);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 108 + "'", int13 == 108);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T01:49:43.102Z" + "'", str20, "2020-11-25T01:49:43.102Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6583102 + "'", int23 == 6583102);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 330 + "'", int24 == 330);
        org.junit.Assert.assertNotNull(obj27);
// flaky:         org.junit.Assert.assertEquals(obj27.toString(), "2020-11-25T01:48:43.102Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "2020-11-25T01:48:43.102Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "2020-11-25T01:48:43.102Z");
        org.junit.Assert.assertNotNull(dateTimeZone32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:43.103Z" + "'", str33, "2020-11-25T01:49:43.103Z");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        java.lang.String str13 = property8.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.addWrapField(6454145);
        org.joda.time.MutableDateTime mutableDateTime16 = property8.roundFloor();
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.203Z" + "'", str4, "2020-11-25T01:49:43.203Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        mutableDateTime2.setChronology(chronology19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.millisOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.261Z" + "'", str4, "2020-11-25T01:49:43.261Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:43.261Z" + "'", str12, "2020-11-25T01:49:43.261Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(property22);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        int int12 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.millisOfSecond();
        mutableDateTime11.addSeconds(6442);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.349Z" + "'", str4, "2020-11-25T01:49:43.349Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:43 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        mutableDateTime2.addWeekyears(48);
        int int9 = mutableDateTime2.getSecondOfDay();
        mutableDateTime2.setYear(108);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        mutableDateTime12.setHourOfDay((int) (byte) 0);
        boolean boolean16 = mutableDateTime12.isBefore((long) 6417230);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        java.util.Date date24 = mutableDateTime19.toDate();
        mutableDateTime19.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.yearOfCentury();
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        mutableDateTime31.setTime((long) '#');
        boolean boolean36 = mutableDateTime31.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        mutableDateTime19.setZone(dateTimeZone37);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Chronology chronology41 = mutableDateTime2.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.437Z" + "'", str4, "2020-11-25T01:49:43.437Z");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6583 + "'", int9 == 6583);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:43.437Z" + "'", str21, "2020-11-25T01:49:43.437Z");
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Wed Nov 25 01:49:43 UTC 2020");
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:43.437Z" + "'", str33, "2020-11-25T01:49:43.437Z");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        mutableDateTime5.setDate((-1), 10, 12);
        int int10 = mutableDateTime5.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeField dateTimeField12 = mutableDateTime11.getRoundingField();
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNull(dateTimeField12);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 10, chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(69, 794, 6534901, 6539, 509, 44, 6439906, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6539 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:43.601Z" + "'", str12, "2020-11-25T01:49:43.601Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillis((long) 7);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.millisOfSecond();
        int int9 = property8.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        org.joda.time.DurationField durationField11 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.roundHalfCeiling();
        int int10 = mutableDateTime9.getYearOfCentury();
        java.util.Locale locale11 = null;
        java.util.Calendar calendar12 = mutableDateTime9.toCalendar(locale11);
        mutableDateTime9.addSeconds(30);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.monthOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1606780800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        mutableDateTime9.setSecondOfMinute(19);
        org.joda.time.Instant instant12 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 6483806);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:43.796Z" + "'", str6, "2020-11-25T01:49:43.796Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
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
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime2.add(readableDuration5, 24);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((-8633635L));
        int int11 = mutableDateTime10.getMinuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.833Z" + "'", str4, "2020-11-25T01:49:43.833Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.year();
        long long22 = property21.remainder();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43 + "'", int4 == 43);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:43.867Z" + "'", str11, "2020-11-25T01:49:43.867Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:43 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28432183867L + "'", long22 == 28432183867L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        mutableDateTime11.setDateTime(5, (int) (byte) 1, (int) (byte) 1, 2, (int) (byte) 1, 15, 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        mutableDateTime21.setWeekyear(46);
        int int24 = mutableDateTime21.getRoundingMode();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.weekOfWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:43.940Z" + "'", str4, "2020-11-25T01:49:43.940Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) 10.0f);
        mutableDateTime9.add((long) 64);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setMinuteOfDay(6444);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6444 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
        int int14 = property8.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.roundCeiling();
        int int16 = mutableDateTime15.getYearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime15.getRoundingField();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.041Z" + "'", str4, "2020-11-25T01:49:44.041Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278994 + "'", int16 == 292278994);
        org.junit.Assert.assertNull(dateTimeField17);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfEven();
        boolean boolean19 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime2.addSeconds(31);
        boolean boolean22 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.era();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.216Z" + "'", str4, "2020-11-25T01:49:44.216Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:44 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:44.216Z" + "'", str15, "2020-11-25T01:49:44.216Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        boolean boolean11 = mutableDateTime2.isAfterNow();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime2.add(readablePeriod12);
        mutableDateTime2.setYear(259);
        int int16 = mutableDateTime2.getWeekyear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.278Z" + "'", str4, "2020-11-25T01:49:44.278Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:44 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 259 + "'", int16 == 259);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        int int16 = mutableDateTime2.getCenturyOfEra();
        boolean boolean17 = mutableDateTime2.isEqualNow();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 44 + "'", int4 == 44);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:44.370Z" + "'", str11, "2020-11-25T01:49:44.370Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:44 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        mutableDateTime2.addDays(100);
        mutableDateTime2.setMinuteOfDay(5);
        java.util.Date date11 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.centuryOfEra();
        boolean boolean13 = mutableDateTime2.isBeforeNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.449Z" + "'", str4, "2020-11-25T01:49:44.449Z");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 05 00:05:00 UTC 2021");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime();
        boolean boolean12 = dateTime10.isEqual((long) 34);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.minuteOfDay();
        java.lang.String str23 = property22.getAsText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:44.639Z" + "'", str10, "2020-11-25T01:49:44.639Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj8 = mutableDateTime7.clone();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime7.toMutableDateTime(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(52, 43, (int) (byte) 0, 6505294, 6548685, 47, 6472689, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6505294 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "2020-11-25T01:49:44.766Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "2020-11-25T01:49:44.766Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "2020-11-25T01:49:44.766Z");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:44.766Z" + "'", str14, "2020-11-25T01:49:44.766Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime17);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.secondOfMinute();
        int int14 = mutableDateTime11.getSecondOfMinute();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.837Z" + "'", str4, "2020-11-25T01:49:44.837Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:44 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime21.isSupported(dateTimeFieldType52);
        boolean boolean55 = mutableDateTime2.isSupported(dateTimeFieldType52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        int int63 = mutableDateTime58.getWeekOfWeekyear();
        mutableDateTime58.addWeekyears((int) (short) -1);
        boolean boolean66 = mutableDateTime58.isAfterNow();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        int int72 = mutableDateTime69.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime74 = property73.getMutableDateTime();
        mutableDateTime74.setSecondOfMinute(11);
        mutableDateTime58.setTime((org.joda.time.ReadableInstant) mutableDateTime74);
        boolean boolean78 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime2.centuryOfEra();
        java.lang.String str80 = property79.getName();
        org.joda.time.MutableDateTime mutableDateTime81 = property79.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime82 = property79.roundHalfFloor();
        mutableDateTime82.addHours(6564209);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str4, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str12, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str26, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str45, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AD" + "'", str51, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str60, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 48 + "'", int63 == 48);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "2020-11-25T01:49:44.907Z" + "'", str71, "2020-11-25T01:49:44.907Z");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20 + "'", int72 == 20);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "centuryOfEra" + "'", str80, "centuryOfEra");
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertNotNull(mutableDateTime82);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.centuryOfEra();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfCeiling();
        long long10 = property6.remainder();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.roundHalfFloor();
        java.lang.String str12 = property6.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = property6.add((long) 6532146);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 653216600 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20" + "'", str8, "20");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2208988800000L) + "'", long10 == (-2208988800000L));
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "20" + "'", str12, "20");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        mutableDateTime9.setTime((long) 10127);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:45.097Z" + "'", str5, "2020-11-25T01:49:45.097Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6482658);
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        org.joda.time.Chronology chronology11 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfYear();
        java.lang.String str13 = property12.getAsString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.196Z" + "'", str4, "2020-11-25T01:49:45.196Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "330" + "'", str13, "330");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:45.248Z" + "'", str9, "2020-11-25T01:49:45.248Z");
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.lang.Object obj1 = mutableDateTime0.clone();
        mutableDateTime0.addYears(86399);
        boolean boolean4 = mutableDateTime0.isEqualNow();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "2020-11-25T01:49:45.345Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "2020-11-25T01:49:45.345Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "2020-11-25T01:49:45.345Z");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.copy();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        mutableDateTime14.setMillis((long) 3);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.util.Date date26 = mutableDateTime21.toDate();
        boolean boolean27 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.secondOfMinute();
        int int29 = mutableDateTime21.getSecondOfMinute();
        org.joda.time.Chronology chronology30 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime11.toMutableDateTime(chronology30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime11.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime33.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.yearOfCentury();
        long long36 = property35.remainder();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.roundHalfCeiling();
        int int38 = property32.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        int int39 = mutableDateTime37.getMillisOfDay();
        long long40 = mutableDateTime37.getMillis();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.377Z" + "'", str4, "2020-11-25T01:49:45.377Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:45 UTC 2020");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606268985377,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=45,MILLISECOND=377,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:45.377Z" + "'", str23, "2020-11-25T01:49:45.377Z");
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Nov 25 01:49:45 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 45 + "'", int29 == 45);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(gregorianCalendar34);
        org.junit.Assert.assertNotNull(property35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 28432185377L + "'", long36 == 28432185377L);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1609459200000L + "'", long40 == 1609459200000L);
        org.junit.Assert.assertNotNull(property41);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime21.isSupported(dateTimeFieldType52);
        boolean boolean55 = mutableDateTime2.isSupported(dateTimeFieldType52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        int int63 = mutableDateTime58.getWeekOfWeekyear();
        mutableDateTime58.addWeekyears((int) (short) -1);
        boolean boolean66 = mutableDateTime58.isAfterNow();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        int int72 = mutableDateTime69.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime74 = property73.getMutableDateTime();
        mutableDateTime74.setSecondOfMinute(11);
        mutableDateTime58.setTime((org.joda.time.ReadableInstant) mutableDateTime74);
        boolean boolean78 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime74);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime2.centuryOfEra();
        java.lang.String str80 = property79.getName();
        org.joda.time.MutableDateTime mutableDateTime81 = property79.roundHalfEven();
        java.util.Locale locale82 = null;
        int int83 = property79.getMaximumTextLength(locale82);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str4, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str12, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str26, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str45, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AD" + "'", str51, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str60, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 48 + "'", int63 == 48);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "2020-11-25T01:49:45.467Z" + "'", str71, "2020-11-25T01:49:45.467Z");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20 + "'", int72 == 20);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "centuryOfEra" + "'", str80, "centuryOfEra");
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 7 + "'", int83 == 7);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        mutableDateTime0.addYears(550);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:45.562Z" + "'", str6, "2020-11-25T01:49:45.562Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6585562 + "'", int9 == 6585562);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfFloor();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.637Z" + "'", str4, "2020-11-25T01:49:45.637Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfCeiling();
        java.lang.String str13 = property11.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.785Z" + "'", str4, "2020-11-25T01:49:45.785Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:45 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[millisOfDay]" + "'", str13, "Property[millisOfDay]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getYearOfCentury();
        int int7 = mutableDateTime5.getRoundingMode();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add(24);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property7.getFieldType();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:45.885Z" + "'", str4, "2020-11-25T01:49:45.885Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
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
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        int int18 = mutableDateTime2.getMinuteOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.010Z" + "'", str4, "2020-11-25T01:49:46.010Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:46.010Z" + "'", str14, "2020-11-25T01:49:46.010Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        int int4 = mutableDateTime3.getDayOfYear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.add(53);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        boolean boolean17 = property5.equals((java.lang.Object) property16);
        java.lang.String str18 = property16.getAsShortText();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:46.050Z" + "'", str12, "2020-11-25T01:49:46.050Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AD" + "'", str18, "AD");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        java.lang.String str11 = property7.getAsString();
        org.joda.time.Interval interval12 = property7.toInterval();
        java.util.Locale locale13 = null;
        int int14 = property7.getMaximumTextLength(locale13);
        org.joda.time.MutableDateTime mutableDateTime15 = property7.roundHalfCeiling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = mutableDateTime15.toString("2020-11-25T01:49:14.166Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.126Z" + "'", str4, "2020-11-25T01:49:46.126Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:46.179Z" + "'", str11, "2020-11-25T01:49:46.179Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:46 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime9.add(readablePeriod10, (int) '#');
        org.joda.time.DateTimeField dateTimeField13 = null;
        mutableDateTime9.setRounding(dateTimeField13);
        int int15 = mutableDateTime9.getDayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 336 + "'", int15 == 336);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.273Z" + "'", str4, "2020-11-25T01:49:46.273Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:46 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        org.joda.time.Chronology chronology11 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfYear();
        int int13 = property12.getMinimumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.318Z" + "'", str4, "2020-11-25T01:49:46.318Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        boolean boolean7 = mutableDateTime2.isEqualNow();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.String str10 = mutableDateTime9.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.353Z" + "'", str4, "2020-11-25T01:49:46.353Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T00:00:00.035Z" + "'", str10, "2020-11-25T00:00:00.035Z");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        int int8 = mutableDateTime7.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.weekOfWeekyear();
        java.lang.String str10 = property9.getAsString();
        int int11 = property9.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfEven();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.416Z" + "'", str4, "2020-11-25T01:49:46.416Z");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "48" + "'", str10, "48");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = property7.getMaximumValue();
        java.lang.String str9 = property7.getAsString();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        int int17 = mutableDateTime12.getWeekOfWeekyear();
        mutableDateTime12.addWeekyears((int) (short) -1);
        int int20 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        java.util.Locale locale21 = null;
        int int22 = property7.getMaximumShortTextLength(locale21);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2922789 + "'", int8 == 2922789);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:46.502Z" + "'", str14, "2020-11-25T01:49:46.502Z");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime10.add(readablePeriod11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.Chronology chronology23 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime10.toMutableDateTime(chronology23);
        java.lang.String str25 = mutableDateTime24.toString();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:46.582Z" + "'", str6, "2020-11-25T01:49:46.582Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:46.582Z" + "'", str25, "2020-11-25T01:49:46.582Z");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((long) 6348);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        long long15 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:46.658Z" + "'", str6, "2020-11-25T01:49:46.658Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 6348L + "'", long15 == 6348L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        mutableDateTime5.setZone(dateTimeZone6);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime5.toCalendar(locale8);
        int int10 = mutableDateTime5.getYearOfEra();
        int int11 = mutableDateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606780800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=49,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=336,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        mutableDateTime0.setSecondOfDay((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDateTime(6545, 84, 0, 6444650, 6454145, 26348, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6444650 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:46.908Z" + "'", str6, "2020-11-25T01:49:46.908Z");
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
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        java.util.Date date9 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        mutableDateTime12.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime2.toString(dateTimeFormatter21);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfDay(6549);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6549 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:46.961Z" + "'", str4, "2020-11-25T01:49:46.961Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:46 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 01:49:46 UTC 2020");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:46.961Z" + "'", str22, "2020-11-25T01:49:46.961Z");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        java.lang.String str11 = property7.getAsString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property7.getAsShortText(locale12);
        int int14 = property7.getLeapAmount();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.017Z" + "'", str4, "2020-11-25T01:49:47.017Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        mutableDateTime2.setYear(4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfHour();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getSecondOfMinute();
        mutableDateTime9.addWeeks(1);
        int int20 = mutableDateTime9.getSecondOfDay();
        mutableDateTime9.add((long) 17);
        int int23 = mutableDateTime9.getEra();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime9.centuryOfEra();
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = mutableDateTime9.toString("2020-11-25T01:47:26.098Z", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 47 + "'", int4 == 47);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:47.162Z" + "'", str11, "2020-11-25T01:49:47.162Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:47 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 47 + "'", int17 == 47);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6587 + "'", int20 == 6587);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        java.lang.String str7 = property6.getAsText();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.getMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime3, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = mutableDateTime9.getRoundingField();
        boolean boolean12 = mutableDateTime9.isEqual((long) 5);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfCeiling();
        int int17 = mutableDateTime16.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTimeISO();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime23.toDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime16.toMutableDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = mutableDateTime9.toDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 29, chronology30);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 5, chronology30);
        boolean boolean37 = mutableDateTime35.equals((java.lang.Object) "2020-11-25T01:47:08.393Z");
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add(38);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:47.332Z" + "'", str28, "2020-11-25T01:49:47.332Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20 + "'", int29 == 20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int2 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = mutableDateTime1.getRoundingField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(dateTimeField6);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime();
        boolean boolean11 = mutableDateTime5.isEqualNow();
        int int12 = mutableDateTime5.getRoundingMode();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.dayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        boolean boolean8 = mutableDateTime2.isEqual((long) 6522);
        mutableDateTime2.setSecondOfMinute(45);
        int int11 = mutableDateTime2.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMonthOfYear(6480731);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6480731 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
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
        int int7 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTime();
        boolean boolean10 = dateTime8.isEqual((long) 6453087);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.617Z" + "'", str4, "2020-11-25T01:49:47.617Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeField dateTimeField22 = mutableDateTime16.getRoundingField();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.util.Date date30 = mutableDateTime25.toDate();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime25.copy();
        java.util.Date date32 = mutableDateTime25.toDate();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        mutableDateTime35.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        int int42 = mutableDateTime25.get(dateTimeField41);
        int int43 = mutableDateTime16.get(dateTimeField41);
        java.util.Locale locale44 = null;
        java.util.Calendar calendar45 = mutableDateTime16.toCalendar(locale44);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDayOfWeek(16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:47.706Z" + "'", str10, "2020-11-25T01:49:47.706Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateTimeField22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:47.706Z" + "'", str27, "2020-11-25T01:49:47.706Z");
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed Nov 25 01:49:47 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed Nov 25 01:49:47 UTC 2020");
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 19 + "'", int43 == 19);
        org.junit.Assert.assertNotNull(calendar45);
        org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=3,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=3,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime9.weekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.era();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime22.add(readablePeriod29);
        org.joda.time.Chronology chronology31 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology31);
        int int34 = mutableDateTime33.getMonthOfYear();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        int int39 = mutableDateTime37.getSecondOfMinute();
        mutableDateTime37.setMillis((long) 3);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        java.util.Date date49 = mutableDateTime44.toDate();
        boolean boolean50 = mutableDateTime37.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime44.getZone();
        mutableDateTime33.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 47 + "'", int4 == 47);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:47.782Z" + "'", str11, "2020-11-25T01:49:47.782Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:47 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:47.782Z" + "'", str24, "2020-11-25T01:49:47.782Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 11 + "'", int34 == 11);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 47 + "'", int39 == 47);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:47.782Z" + "'", str46, "2020-11-25T01:49:47.782Z");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed Nov 25 01:49:47 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeZone51);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        boolean boolean9 = mutableDateTime2.isEqualNow();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.910Z" + "'", str4, "2020-11-25T01:49:47.910Z");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        mutableDateTime2.addDays(20);
        java.util.Date date11 = mutableDateTime2.toDate();
        org.joda.time.DateTimeField dateTimeField12 = mutableDateTime2.getRoundingField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        int int20 = mutableDateTime15.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime15.getZone();
        java.lang.Object obj22 = mutableDateTime15.clone();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        mutableDateTime25.setTime((long) '#');
        int int30 = mutableDateTime25.getYearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        int int34 = mutableDateTime33.getMillisOfDay();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        java.lang.String str39 = mutableDateTime37.toString();
        mutableDateTime37.setDayOfYear((int) ' ');
        mutableDateTime37.addWeekyears(48);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        mutableDateTime46.addMillis((int) 'a');
        mutableDateTime46.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        int int53 = mutableDateTime37.get(dateTimeField52);
        mutableDateTime33.setRounding(dateTimeField52);
        mutableDateTime25.setRounding(dateTimeField52);
        mutableDateTime15.setRounding(dateTimeField52);
        mutableDateTime2.setRounding(dateTimeField52);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:47.972Z" + "'", str4, "2020-11-25T01:49:47.972Z");
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 23 01:49:47 UTC 2021");
        org.junit.Assert.assertNull(dateTimeField12);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:47.972Z" + "'", str17, "2020-11-25T01:49:47.972Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(obj22);
// flaky:         org.junit.Assert.assertEquals(obj22.toString(), "2020-11-25T01:49:47.972Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "2020-11-25T01:49:47.972Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "2020-11-25T01:49:47.972Z");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:47.972Z" + "'", str27, "2020-11-25T01:49:47.972Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2020 + "'", int30 == 2020);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:47.972Z" + "'", str39, "2020-11-25T01:49:47.972Z");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.minuteOfHour();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        int int11 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:48.029Z" + "'", str5, "2020-11-25T01:49:48.029Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.addWeekyears(48);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        mutableDateTime33.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        int int40 = mutableDateTime24.get(dateTimeField39);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property49.getAsText(locale50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = mutableDateTime24.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime21.isSupported(dateTimeFieldType52);
        boolean boolean55 = mutableDateTime2.isSupported(dateTimeFieldType52);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        int int63 = mutableDateTime58.getWeekOfWeekyear();
        mutableDateTime58.addWeekyears((int) (short) -1);
        boolean boolean66 = mutableDateTime58.isAfterNow();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        int int72 = mutableDateTime69.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime69.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime74 = property73.getMutableDateTime();
        mutableDateTime74.setSecondOfMinute(11);
        mutableDateTime58.setTime((org.joda.time.ReadableInstant) mutableDateTime74);
        boolean boolean78 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime74);
        java.lang.Object obj79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(obj79, chronology80);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = null;
        java.lang.String str83 = mutableDateTime81.toString(dateTimeFormatter82);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        mutableDateTime81.add(readablePeriod84);
        java.util.Date date86 = mutableDateTime81.toDate();
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime81.copy();
        java.util.Date date88 = mutableDateTime81.toDate();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime81);
        mutableDateTime2.addMillis(6581);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.105Z" + "'", str4, "2020-11-25T01:49:48.105Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:48.105Z" + "'", str12, "2020-11-25T01:49:48.105Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:48.105Z" + "'", str26, "2020-11-25T01:49:48.105Z");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:48.106Z" + "'", str45, "2020-11-25T01:49:48.106Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "AD" + "'", str51, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2020-11-25T01:49:48.106Z" + "'", str60, "2020-11-25T01:49:48.106Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 48 + "'", int63 == 48);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "2020-11-25T01:49:48.106Z" + "'", str71, "2020-11-25T01:49:48.106Z");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20 + "'", int72 == 20);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "2020-11-25T01:49:48.106Z" + "'", str83, "2020-11-25T01:49:48.106Z");
        org.junit.Assert.assertNotNull(date86);
// flaky:         org.junit.Assert.assertEquals(date86.toString(), "Wed Nov 25 01:49:48 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime87);
        org.junit.Assert.assertNotNull(date88);
// flaky:         org.junit.Assert.assertEquals(date88.toString(), "Wed Nov 25 01:49:48 UTC 2020");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsShortText(locale6);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.add((long) 6407827);
        java.lang.String str10 = property4.getAsText();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dec" + "'", str7, "Dec");
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "July" + "'", str10, "July");
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime2.getChronology();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.363Z" + "'", str4, "2020-11-25T01:49:48.363Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isAfterNow();
        java.lang.Class<?> wildcardClass7 = mutableDateTime5.getClass();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.util.Date date7 = mutableDateTime2.toDate();
        int int8 = mutableDateTime2.getDayOfYear();
        int int9 = mutableDateTime2.getDayOfYear();
        int int10 = mutableDateTime2.getEra();
        mutableDateTime2.setDate((long) 7);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime15.add(readablePeriod22);
        org.joda.time.Chronology chronology24 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = mutableDateTime25.getRoundingField();
        mutableDateTime25.addMonths(6557734);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.497Z" + "'", str4, "2020-11-25T01:49:48.497Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:48 UTC 2020");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 330 + "'", int8 == 330);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 330 + "'", int9 == 330);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:48.497Z" + "'", str17, "2020-11-25T01:49:48.497Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNull(dateTimeField26);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        boolean boolean11 = mutableDateTime8.isBefore(1L);
        long long12 = mutableDateTime8.getMillis();
        java.util.Date date13 = mutableDateTime8.toDate();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1606262436000L + "'", long12 == 1606262436000L);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 00:00:36 UTC 2020");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        mutableDateTime2.addHours(15);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone16);
        mutableDateTime19.setDate((long) (short) 100);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.era();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime24.add(readablePeriod31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime24.setZoneRetainFields(dateTimeZone36);
        mutableDateTime19.setZone(dateTimeZone36);
        int int40 = mutableDateTime19.getYear();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.era();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime43.add(readablePeriod50);
        org.joda.time.Chronology chronology52 = mutableDateTime43.getChronology();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        java.lang.String str57 = mutableDateTime55.toString();
        mutableDateTime55.setDayOfYear((int) ' ');
        mutableDateTime55.addWeekyears(48);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology63);
        mutableDateTime64.addMillis((int) 'a');
        mutableDateTime64.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField70 = property69.getField();
        int int71 = mutableDateTime55.get(dateTimeField70);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        mutableDateTime74.add(readablePeriod77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime74.hourOfDay();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime74.era();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property80.getAsText(locale81);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property80.getFieldType();
        int int84 = mutableDateTime55.get(dateTimeFieldType83);
        boolean boolean85 = mutableDateTime43.isSupported(dateTimeFieldType83);
        int int86 = mutableDateTime19.get(dateTimeFieldType83);
        int int87 = mutableDateTime2.get(dateTimeFieldType83);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.609Z" + "'", str4, "2020-11-25T01:49:48.609Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:48 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:48.609Z" + "'", str26, "2020-11-25T01:49:48.609Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:48.609Z" + "'", str45, "2020-11-25T01:49:48.609Z");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeZone56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2020-11-25T01:49:48.609Z" + "'", str57, "2020-11-25T01:49:48.609Z");
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20 + "'", int71 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "2020-11-25T01:49:48.609Z" + "'", str76, "2020-11-25T01:49:48.609Z");
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "AD" + "'", str82, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:48.269Z");
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        mutableDateTime2.addWeekyears(48);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setDate((long) 6340418);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime15.add(readablePeriod22);
        org.joda.time.Instant instant24 = mutableDateTime15.toInstant();
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) instant24);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.780Z" + "'", str4, "2020-11-25T01:49:48.780Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:48.780Z" + "'", str17, "2020-11-25T01:49:48.780Z");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.weekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTime();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.834Z" + "'", str4, "2020-11-25T01:49:48.834Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        mutableDateTime2.addDays(20);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.hourOfDay();
        int int12 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.addMillis(34);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add(58);
        mutableDateTime23.setWeekyear(43);
        java.lang.Object obj26 = mutableDateTime23.clone();
        mutableDateTime23.addMinutes(45);
        mutableDateTime23.addWeekyears(6372);
        boolean boolean31 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime23);
        int int32 = mutableDateTime2.getHourOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:48.901Z" + "'", str4, "2020-11-25T01:49:48.901Z");
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:48.902Z" + "'", str19, "2020-11-25T01:49:48.902Z");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(obj26);
// flaky:         org.junit.Assert.assertEquals(obj26.toString(), "0043-11-27T11:49:48.902Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "0043-11-27T11:49:48.902Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "0043-11-27T11:49:48.902Z");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime2.toString(dateTimeFormatter4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        mutableDateTime8.addMinutes(330);
        java.util.Date date14 = mutableDateTime8.toDate();
        mutableDateTime8.setMillisOfDay((int) (byte) 100);
        boolean boolean17 = mutableDateTime8.isAfterNow();
        mutableDateTime8.addDays(37);
        mutableDateTime8.addMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime23 = mutableDateTime2.toDateTime(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        int int31 = mutableDateTime26.getCenturyOfEra();
        mutableDateTime26.setMinuteOfHour(4);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        java.lang.String str38 = mutableDateTime36.toString();
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        mutableDateTime26.setZone(dateTimeZone39);
        mutableDateTime2.setZone(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:48.983Z" + "'", str5, "2020-11-25T01:49:48.983Z");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:48.983Z" + "'", str10, "2020-11-25T01:49:48.983Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 07:19:48 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:48.983Z" + "'", str28, "2020-11-25T01:49:48.983Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2020-11-25T01:49:48.983Z" + "'", str38, "2020-11-25T01:49:48.983Z");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        int int9 = mutableDateTime5.getMinuteOfHour();
        int int10 = mutableDateTime5.getEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:25.568Z");
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.secondOfDay();
        int int19 = property11.getDifference((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8532 + "'", int19 == 8532);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16);
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        java.lang.String str25 = mutableDateTime23.toString();
        mutableDateTime23.setDayOfYear((int) ' ');
        mutableDateTime23.addWeekyears(48);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        mutableDateTime32.addMillis((int) 'a');
        mutableDateTime32.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = mutableDateTime23.get(dateTimeField38);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime42.era();
        java.util.Locale locale49 = null;
        java.lang.String str50 = property48.getAsText(locale49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        int int52 = mutableDateTime23.get(dateTimeFieldType51);
        boolean boolean53 = mutableDateTime20.isSupported(dateTimeFieldType51);
        int int54 = mutableDateTime2.get(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:49.181Z" + "'", str11, "2020-11-25T01:49:49.181Z");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:49.181Z" + "'", str25, "2020-11-25T01:49:49.181Z");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2020-11-25T01:49:49.182Z" + "'", str44, "2020-11-25T01:49:49.182Z");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AD" + "'", str50, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        mutableDateTime10.addDays(100);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime10.setRounding(dateTimeField25);
        long long27 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        int int28 = mutableDateTime10.getMonthOfYear();
        int int29 = mutableDateTime10.getEra();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.monthOfYear();
        mutableDateTime10.setWeekyear((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime10.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime10.setDayOfMonth(55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.241Z" + "'", str4, "2020-11-25T01:49:49.241Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:49.241Z" + "'", str12, "2020-11-25T01:49:49.241Z");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:49.241Z" + "'", str21, "2020-11-25T01:49:49.241Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-8633410L) + "'", long27 == (-8633410L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        mutableDateTime8.addYears(27);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.minuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.dayOfYear();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add(durationFieldType2, 707);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime14.getRoundingField();
        boolean boolean16 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.hourOfDay();
        int int24 = mutableDateTime19.getDayOfYear();
        mutableDateTime14.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        int int26 = mutableDateTime19.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime19.add(readableDuration27, 6547);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.484Z" + "'", str4, "2020-11-25T01:49:49.484Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:49.484Z" + "'", str21, "2020-11-25T01:49:49.484Z");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 330 + "'", int24 == 330);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime24.getRoundingField();
        boolean boolean26 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        int int27 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:51.569Z");
        int int30 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.652Z" + "'", str4, "2020-11-25T01:49:49.652Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:49 UTC 2020");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:49.652Z" + "'", str14, "2020-11-25T01:49:49.652Z");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime3.add(readablePeriod10);
        org.joda.time.Chronology chronology12 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.minuteOfDay();
        org.joda.time.Chronology chronology16 = mutableDateTime14.getChronology();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:49.710Z" + "'", str5, "2020-11-25T01:49:49.710Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setHourOfDay((int) (byte) 0);
        boolean boolean4 = mutableDateTime0.isBefore((long) 26);
        org.joda.time.DateTime dateTime5 = mutableDateTime0.toDateTimeISO();
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.copy();
        org.joda.time.Chronology chronology12 = mutableDateTime11.getChronology();
        int int13 = mutableDateTime11.getDayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:49.843Z" + "'", str4, "2020-11-25T01:49:49.843Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:49 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 330 + "'", int13 == 330);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.addWrapField(44);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:49.982Z" + "'", str10, "2020-11-25T01:49:49.982Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        boolean boolean6 = mutableDateTime2.isBefore((long) 105);
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        mutableDateTime2.setWeekyear(6481102);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.129Z" + "'", str4, "2020-11-25T01:49:50.129Z");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        mutableDateTime0.setMinuteOfHour(48);
        boolean boolean14 = mutableDateTime0.isBefore((long) (short) 10);
        boolean boolean16 = mutableDateTime0.isBefore(63741865678232L);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime0.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:50.271Z" + "'", str6, "2020-11-25T01:49:50.271Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6590271 + "'", int9 == 6590271);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.minuteOfHour();
        boolean boolean14 = property9.equals((java.lang.Object) property13);
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "49" + "'", str16, "49");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime10.setZoneRetainFields(dateTimeZone22);
        int int25 = property6.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime mutableDateTime26 = property6.getMutableDateTime();
        java.util.Locale locale27 = null;
        int int28 = property6.getMaximumShortTextLength(locale27);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.445Z" + "'", str4, "2020-11-25T01:49:50.445Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:50.446Z" + "'", str12, "2020-11-25T01:49:50.446Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.dayOfWeek();
        java.lang.String str6 = property5.getAsString();
        java.lang.String str7 = property5.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wed" + "'", str7, "Wed");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setHourOfDay((int) (byte) 0);
        boolean boolean4 = mutableDateTime0.isBefore((long) 6417230);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        java.util.Date date12 = mutableDateTime7.toDate();
        mutableDateTime7.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime7.yearOfCentury();
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime7.dayOfMonth();
        mutableDateTime7.setSecondOfMinute(51);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-11-25T01:49:50.561Z" + "'", str9, "2020-11-25T01:49:50.561Z");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 01:49:50 UTC 2020");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        int int17 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTime dateTime18 = mutableDateTime16.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:50.607Z" + "'", str6, "2020-11-25T01:49:50.607Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.minuteOfDay();
        java.lang.String str7 = mutableDateTime2.toString();
        boolean boolean8 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str7, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        mutableDateTime10.add((long) 70);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        mutableDateTime15.addDays(100);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime15.secondOfMinute();
        java.lang.Object obj23 = null;
        boolean boolean24 = mutableDateTime15.equals(obj23);
        int int25 = mutableDateTime15.getEra();
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        int int27 = mutableDateTime10.getYearOfCentury();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:50.758Z" + "'", str17, "2020-11-25T01:49:50.758Z");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime11.toMutableDateTime();
        mutableDateTime14.setDate((-1), 10, 12);
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        java.lang.String str24 = mutableDateTime22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        mutableDateTime14.setZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime8.setZoneRetainFields(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 41 + "'", int19 == 41);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:50.827Z" + "'", str24, "2020-11-25T01:49:50.827Z");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:11.872Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        mutableDateTime2.setMillisOfDay((int) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfEven();
        boolean boolean19 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.setYear(52);
        int int24 = mutableDateTime2.getMonthOfYear();
        int int25 = mutableDateTime2.getEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:50.982Z" + "'", str4, "2020-11-25T01:49:50.982Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:50 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:50.982Z" + "'", str15, "2020-11-25T01:49:50.982Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setTime(3, (int) (short) 10, 10, (int) (short) 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.weekyear();
        int int14 = property13.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.getMutableDateTime();
        mutableDateTime15.addYears(6530308);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.064Z" + "'", str4, "2020-11-25T01:49:51.064Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-292275054) + "'", int14 == (-292275054));
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.110Z" + "'", str4, "2020-11-25T01:49:51.110Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:51.110Z" + "'", str14, "2020-11-25T01:49:51.110Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = mutableDateTime2.getWeekyear();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime3 = mutableDateTime1.toDateTimeISO();
        boolean boolean5 = dateTime3.equals((java.lang.Object) "2020-11-25T01:49:29.542Z");
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:22.011Z");
        int int2 = mutableDateTime1.getMinuteOfHour();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        mutableDateTime5.addWeeks(10);
        mutableDateTime5.addDays(20);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        java.util.Date date28 = mutableDateTime23.toDate();
        boolean boolean29 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime23.secondOfMinute();
        int int31 = mutableDateTime23.getSecondOfMinute();
        org.joda.time.Chronology chronology32 = mutableDateTime23.getChronology();
        mutableDateTime5.setChronology(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime1.toMutableDateTime(chronology32);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = mutableDateTime39.toDateTimeISO();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.DateTime dateTime48 = dateTime40.toDateTime(chronology47);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        int int53 = mutableDateTime51.getSecondOfMinute();
        mutableDateTime51.setMillis((long) 3);
        boolean boolean56 = dateTime48.isBefore((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime51.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime51.getZone();
        mutableDateTime34.setZoneRetainFields(dateTimeZone58);
        mutableDateTime34.add((long) 838);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:51.389Z" + "'", str7, "2020-11-25T01:49:51.389Z");
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:51.389Z" + "'", str25, "2020-11-25T01:49:51.389Z");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed Nov 25 01:49:51 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 51 + "'", int31 == 51);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2020-11-25T01:49:51.389Z" + "'", str45, "2020-11-25T01:49:51.389Z");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone52);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 51 + "'", int53 == 51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        java.util.Date date7 = mutableDateTime2.toDate();
        int int8 = mutableDateTime2.getDayOfYear();
        mutableDateTime2.addDays(562);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.492Z" + "'", str4, "2020-11-25T01:49:51.492Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:51 UTC 2020");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 330 + "'", int8 == 330);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        mutableDateTime2.add((long) 37);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        int int11 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfDay();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.541Z" + "'", str4, "2020-11-25T01:49:51.541Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 330 + "'", int11 == 330);
        org.junit.Assert.assertNotNull(property12);
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
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime12.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = mutableDateTime2.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        java.util.Locale locale27 = null;
        java.util.Calendar calendar28 = mutableDateTime26.toCalendar(locale27);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.621Z" + "'", str4, "2020-11-25T01:49:51.621Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:51 UTC 2020");
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:51.622Z" + "'", str14, "2020-11-25T01:49:51.622Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:51.622Z" + "'", str21, "2020-11-25T01:49:51.622Z");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1606268991622,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=51,MILLISECOND=622,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property8.getFieldType();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        java.lang.String str13 = property8.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime15 = property8.addWrapField(6454145);
        org.joda.time.MutableDateTime mutableDateTime16 = property8.roundFloor();
        int int17 = mutableDateTime16.getSecondOfMinute();
        int int18 = mutableDateTime16.getCenturyOfEra();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.715Z" + "'", str4, "2020-11-25T01:49:51.715Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2922750 + "'", int18 == 2922750);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.era();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime12.add(readablePeriod19);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime12.toGregorianCalendar();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        mutableDateTime12.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        boolean boolean28 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Chronology chronology35 = mutableDateTime31.getChronology();
        int int36 = mutableDateTime31.getWeekOfWeekyear();
        mutableDateTime31.addWeekyears((int) (short) -1);
        boolean boolean39 = mutableDateTime31.isAfterNow();
        boolean boolean40 = mutableDateTime31.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime41, dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone45);
        mutableDateTime31.setZoneRetainFields(dateTimeZone45);
        mutableDateTime27.setZone(dateTimeZone45);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.786Z" + "'", str4, "2020-11-25T01:49:51.786Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:51 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:51.786Z" + "'", str14, "2020-11-25T01:49:51.786Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:51.786Z" + "'", str33, "2020-11-25T01:49:51.786Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 48 + "'", int36 == 48);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        boolean boolean11 = property9.equals((java.lang.Object) 28431927259L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = property9.getAsText(locale12);
        java.lang.String str14 = property9.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.853Z" + "'", str4, "2020-11-25T01:49:51.853Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[secondOfMinute]" + "'", str14, "Property[secondOfMinute]");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        mutableDateTime2.addDays(20);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone16);
        java.lang.String str18 = mutableDateTime12.toString();
        mutableDateTime12.addYears(10020);
        boolean boolean21 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.883Z" + "'", str4, "2020-11-25T01:49:51.883Z");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:51.883Z" + "'", str18, "2020-11-25T01:49:51.883Z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        int int18 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.secondOfMinute();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTime(chronology20);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:51.921Z" + "'", str4, "2020-11-25T01:49:51.921Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:51 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("12");
        org.junit.Assert.assertNotNull(mutableDateTime1);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property4.getFieldType();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property4.getAsText(locale7);
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 3);
        java.lang.String str11 = property4.getAsString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "December" + "'", str8, "December");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        boolean boolean8 = property4.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        int int13 = mutableDateTime11.getYearOfCentury();
        int int14 = mutableDateTime11.getDayOfMonth();
        int int15 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 70 + "'", int13 == 70);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 610 + "'", int15 == 610);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime10.add(readablePeriod17);
        org.joda.time.Chronology chronology19 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, chronology19);
        mutableDateTime2.setChronology(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.era();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime24.add(readablePeriod31);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime24.toGregorianCalendar();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        mutableDateTime24.setZone(dateTimeZone37);
        mutableDateTime2.setZone(dateTimeZone37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        int int44 = mutableDateTime42.getSecondOfMinute();
        mutableDateTime42.setMillis((long) 3);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        java.util.Date date54 = mutableDateTime49.toDate();
        boolean boolean55 = mutableDateTime42.isAfter((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime49.secondOfMinute();
        int int57 = mutableDateTime49.getWeekyear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime49);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime49.toMutableDateTimeISO();
        boolean boolean60 = mutableDateTime49.isAfterNow();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime49.dayOfWeek();
        boolean boolean62 = mutableDateTime49.isBeforeNow();
        boolean boolean64 = mutableDateTime49.isBefore((long) 18);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.182Z" + "'", str4, "2020-11-25T01:49:52.182Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:52.182Z" + "'", str12, "2020-11-25T01:49:52.182Z");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:52.182Z" + "'", str26, "2020-11-25T01:49:52.182Z");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(gregorianCalendar33);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2020-11-25T01:49:52.182Z" + "'", str51, "2020-11-25T01:49:52.182Z");
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2020 + "'", int57 == 2020);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.era();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime12.add(readablePeriod19);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime12.toGregorianCalendar();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        mutableDateTime12.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        boolean boolean28 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        boolean boolean30 = mutableDateTime2.isEqual((long) 109);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.262Z" + "'", str4, "2020-11-25T01:49:52.262Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:52 UTC 2020");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:52.262Z" + "'", str14, "2020-11-25T01:49:52.262Z");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:15.872Z");
        mutableDateTime4.addYears(708);
        mutableDateTime4.setSecondOfDay(29);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime4);
        int int10 = mutableDateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.centuryOfEra();
        java.lang.String str23 = property22.getName();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(6557249);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:52.405Z" + "'", str10, "2020-11-25T01:49:52.405Z");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "centuryOfEra" + "'", str23, "centuryOfEra");
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfEven();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        java.lang.String str17 = mutableDateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime10.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.486Z" + "'", str4, "2020-11-25T01:49:52.486Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:52.486Z" + "'", str17, "2020-11-25T01:49:52.486Z");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        java.lang.String str4 = property3.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.add(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        int int9 = mutableDateTime0.getMillisOfDay();
        int int10 = mutableDateTime0.getDayOfYear();
        mutableDateTime0.setMinuteOfHour(48);
        java.lang.Object obj13 = mutableDateTime0.clone();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        int int18 = mutableDateTime16.getSecondOfMinute();
        mutableDateTime16.setMillis((long) 3);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        java.util.Date date28 = mutableDateTime23.toDate();
        boolean boolean29 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime23.secondOfMinute();
        int int31 = mutableDateTime23.getSecondOfMinute();
        org.joda.time.Chronology chronology32 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj13, chronology32);
        int int35 = mutableDateTime34.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:52.662Z" + "'", str6, "2020-11-25T01:49:52.662Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6592662 + "'", int9 == 6592662);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals(obj13.toString(), "2020-11-25T01:48:52.662Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "2020-11-25T01:48:52.662Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "2020-11-25T01:48:52.662Z");
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2020-11-25T01:49:52.662Z" + "'", str25, "2020-11-25T01:49:52.662Z");
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6532662 + "'", int35 == 6532662);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        int int9 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone14);
        java.lang.String str16 = mutableDateTime10.toString();
        boolean boolean17 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.782Z" + "'", str4, "2020-11-25T01:49:52.782Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:52 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(dateTimeZone14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:52.782Z" + "'", str16, "2020-11-25T01:49:52.782Z");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        mutableDateTime10.addDays(100);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime10.setRounding(dateTimeField25);
        long long27 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addWeekyears(2020);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime32.toString(dateTimeFormatter34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.centuryOfEra();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.DateTime dateTime50 = mutableDateTime40.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime32.toMutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology49);
        mutableDateTime10.setChronology(chronology49);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.866Z" + "'", str4, "2020-11-25T01:49:52.866Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T01:49:52.866Z" + "'", str12, "2020-11-25T01:49:52.866Z");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:52.866Z" + "'", str21, "2020-11-25T01:49:52.866Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-8633407L) + "'", long27 == (-8633407L));
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2020-11-25T01:49:52.866Z" + "'", str35, "2020-11-25T01:49:52.866Z");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2020-11-25T01:49:52.866Z" + "'", str47, "2020-11-25T01:49:52.866Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        java.lang.String str10 = property9.getName();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundCeiling();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:52.950Z" + "'", str4, "2020-11-25T01:49:52.950Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:52 UTC 2020");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime8.getRoundingField();
        boolean boolean11 = mutableDateTime8.isEqual((long) 5);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfCeiling();
        int int16 = mutableDateTime15.getDayOfYear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTimeISO();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime15.toMutableDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = mutableDateTime8.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 29, chronology29);
        java.lang.String str34 = mutableDateTime33.toString();
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:53.075Z" + "'", str27, "2020-11-25T01:49:53.075Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01T00:00:00.029Z" + "'", str34, "1970-01-01T00:00:00.029Z");
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.copy();
        int int12 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.millisOfSecond();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.175Z" + "'", str4, "2020-11-25T01:49:53.175Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:53 UTC 2020");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606268993175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=53,MILLISECOND=175,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6593 + "'", int12 == 6593);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMinutes(330);
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        java.lang.String str10 = property9.getName();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundCeiling();
        mutableDateTime11.addMinutes(6372);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.add((int) (short) 1);
        int int25 = mutableDateTime24.getWeekyear();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        int int32 = mutableDateTime30.getSecondOfMinute();
        mutableDateTime30.setMillis((long) 3);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        java.util.Date date42 = mutableDateTime37.toDate();
        boolean boolean43 = mutableDateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:47.274Z", dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 330, dateTimeZone44);
        mutableDateTime24.setZoneRetainFields(dateTimeZone44);
        mutableDateTime11.setZone(dateTimeZone44);
        mutableDateTime11.addDays(6350201);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.250Z" + "'", str4, "2020-11-25T01:49:53.250Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 07:19:53 UTC 2020");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:53.250Z" + "'", str18, "2020-11-25T01:49:53.250Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
        org.junit.Assert.assertNotNull(dateTimeZone31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 53 + "'", int32 == 53);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2020-11-25T01:49:53.250Z" + "'", str39, "2020-11-25T01:49:53.250Z");
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed Nov 25 01:49:53 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsText(locale11);
        java.lang.String str13 = property4.getName();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = property4.getDifference(readableInstant14);
        java.util.Locale locale16 = null;
        java.lang.String str17 = property4.getAsText(locale16);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "December" + "'", str12, "December");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "monthOfYear" + "'", str13, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "December" + "'", str17, "December");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        int int4 = property3.getMaximumValue();
        java.lang.String str5 = property3.getAsText();
        boolean boolean6 = property3.isLeap();
        org.joda.time.Interval interval7 = property3.toInterval();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(chronology20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        int int26 = mutableDateTime24.getSecondOfMinute();
        mutableDateTime24.setMillis((long) 3);
        boolean boolean29 = dateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.minuteOfDay();
        long long31 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 86399 + "'", int4 == 86399);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6593" + "'", str5, "6593");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:53.414Z" + "'", str18, "2020-11-25T01:49:53.414Z");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1606268993L + "'", long31 == 1606268993L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int2 = mutableDateTime1.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundFloor();
        boolean boolean7 = mutableDateTime5.isBefore(1L);
        mutableDateTime5.addWeeks((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime5.toString(dateTimeFormatter10);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        mutableDateTime15.setMillis((long) 3);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        java.util.Date date27 = mutableDateTime22.toDate();
        boolean boolean28 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:47.274Z", dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) str11, dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-03-12T00:00:00.010Z" + "'", str11, "1970-03-12T00:00:00.010Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2020-11-25T01:49:53.537Z" + "'", str24, "2020-11-25T01:49:53.537Z");
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed Nov 25 01:49:53 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.centuryOfEra();
        boolean boolean10 = mutableDateTime7.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:53.629Z" + "'", str5, "2020-11-25T01:49:53.629Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 7);
        boolean boolean12 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.secondOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfCeiling();
        int int19 = mutableDateTime18.getDayOfYear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = mutableDateTime24.toDateTimeISO();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime18.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology32);
        boolean boolean36 = property13.equals((java.lang.Object) mutableDateTime35);
        java.lang.Object obj37 = mutableDateTime35.clone();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.708Z" + "'", str4, "2020-11-25T01:49:53.708Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6593" + "'", str14, "6593");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(gregorianCalendar16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2020-11-25T01:49:53.709Z" + "'", str30, "2020-11-25T01:49:53.709Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
// flaky:         org.junit.Assert.assertEquals(obj37.toString(), "2020-11-25T01:49:53.709Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "2020-11-25T01:49:53.709Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "2020-11-25T01:49:53.709Z");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime8.addDays(0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.millisOfSecond();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property11);
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime2.setZoneRetainFields(dateTimeZone14);
        mutableDateTime2.setWeekyear(27);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.year();
        long long20 = property19.remainder();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:53.845Z" + "'", str4, "2020-11-25T01:49:53.845Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 28864193845L + "'", long20 == 28864193845L);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.setMillisOfDay((int) '#');
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean8 = mutableDateTime2.equals((java.lang.Object) "2020-11-25T01:46:39.549Z");
        mutableDateTime2.setDate(1606268947628L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        mutableDateTime7.setHourOfDay((int) (byte) 0);
        boolean boolean11 = mutableDateTime7.isBefore((long) 6417230);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        java.util.Date date19 = mutableDateTime14.toDate();
        mutableDateTime14.setMillis((long) 48);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.yearOfCentury();
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        mutableDateTime26.setTime((long) '#');
        boolean boolean31 = mutableDateTime26.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime14.setZone(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(10051, 647, 988, 6553, 10, 6448131, 10020, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6553 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:54.019Z" + "'", str16, "2020-11-25T01:49:54.019Z");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 01:49:54 UTC 2020");
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T01:49:54.019Z" + "'", str28, "2020-11-25T01:49:54.019Z");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 54, dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(39, 988, 57, 707, 742, 6426938, 6518, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 707 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.toMutableDateTimeISO();
        int int11 = mutableDateTime10.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:54.158Z" + "'", str5, "2020-11-25T01:49:54.158Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:49:38.728Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:19.298Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime5.add(readablePeriod8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime5.add(readablePeriod12);
        org.joda.time.Chronology chronology14 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(0L, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.String str21 = mutableDateTime19.toString();
        mutableDateTime19.setDayOfYear((int) ' ');
        mutableDateTime19.addWeekyears(48);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        mutableDateTime28.addMillis((int) 'a');
        mutableDateTime28.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = mutableDateTime19.get(dateTimeField34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.era();
        java.util.Locale locale45 = null;
        java.lang.String str46 = property44.getAsText(locale45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        int int48 = mutableDateTime19.get(dateTimeFieldType47);
        boolean boolean49 = mutableDateTime16.isSupported(dateTimeFieldType47);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime1.property(dateTimeFieldType47);
        int int51 = mutableDateTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T01:49:54.334Z" + "'", str7, "2020-11-25T01:49:54.334Z");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:54.334Z" + "'", str21, "2020-11-25T01:49:54.334Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2020-11-25T01:49:54.334Z" + "'", str40, "2020-11-25T01:49:54.334Z");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AD" + "'", str46, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 298 + "'", int51 == 298);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setSecondOfDay(292278994);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.399Z" + "'", str4, "2020-11-25T01:49:54.399Z");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        java.lang.String str8 = property7.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (short) 0);
        org.joda.time.DurationField durationField11 = property7.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:54.451Z" + "'", str6, "2020-11-25T01:49:54.451Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:25.568Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.era();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime21.add(readablePeriod28);
        org.joda.time.Chronology chronology30 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, chronology30);
        mutableDateTime13.setChronology(chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime2.toMutableDateTime(chronology30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology30);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str4, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:54 UTC 2020");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606268994574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=54,MILLISECOND=574,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str15, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T01:49:54.574Z" + "'", str23, "2020-11-25T01:49:54.574Z");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDayOfYear((int) ' ');
        boolean boolean7 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTime();
        mutableDateTime2.addWeeks(610);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.705Z" + "'", str4, "2020-11-25T01:49:54.705Z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        int int8 = mutableDateTime7.getYear();
        mutableDateTime7.setMinuteOfDay(19);
        int int11 = mutableDateTime7.getEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        java.lang.String str17 = mutableDateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone18);
        mutableDateTime7.setZoneRetainFields(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone18);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:54.781Z" + "'", str4, "2020-11-25T01:49:54.781Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T01:49:54.781Z" + "'", str17, "2020-11-25T01:49:54.781Z");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        int int9 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        mutableDateTime9.setSecondOfMinute(19);
        org.joda.time.Instant instant12 = mutableDateTime9.toInstant();
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime9.toCalendar(locale13);
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:54.925Z" + "'", str6, "2020-11-25T01:49:54.925Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=28431919259,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=330,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=45,SECOND=19,MILLISECOND=259,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = mutableDateTime2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setMinuteOfDay(6581);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6581 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getMonthOfYear();
        int int7 = mutableDateTime5.getMonthOfYear();
        int int8 = mutableDateTime5.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.dayOfWeek();
        mutableDateTime5.addMillis(380);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone5);
        mutableDateTime8.setDate((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.toMutableDateTime();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.String str16 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, dateTimeZone17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = mutableDateTime23.toDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(chronology31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        int int37 = mutableDateTime35.getSecondOfMinute();
        mutableDateTime35.setMillis((long) 3);
        boolean boolean40 = dateTime32.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateTimeField dateTimeField41 = mutableDateTime35.getRoundingField();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        java.util.Date date49 = mutableDateTime44.toDate();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime44.copy();
        java.util.Date date51 = mutableDateTime44.toDate();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology53);
        mutableDateTime54.addMillis((int) 'a');
        mutableDateTime54.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = property59.getField();
        int int61 = mutableDateTime44.get(dateTimeField60);
        int int62 = mutableDateTime35.get(dateTimeField60);
        int int63 = mutableDateTime8.get(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:55.138Z" + "'", str16, "2020-11-25T01:49:55.138Z");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2020-11-25T01:49:55.138Z" + "'", str29, "2020-11-25T01:49:55.138Z");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 55 + "'", int37 == 55);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(dateTimeField41);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:55.138Z" + "'", str46, "2020-11-25T01:49:55.138Z");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(date51);
// flaky:         org.junit.Assert.assertEquals(date51.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 19 + "'", int62 == 19);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 19 + "'", int63 == 19);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime3.add(readablePeriod10);
        org.joda.time.Chronology chronology12 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTimeISO();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:55.257Z" + "'", str5, "2020-11-25T01:49:55.257Z");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        boolean boolean14 = mutableDateTime12.isEqual((long) 45);
        mutableDateTime12.addDays(70);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.era();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime19.add(readablePeriod26);
        org.joda.time.Chronology chronology28 = mutableDateTime19.getChronology();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        java.lang.String str33 = mutableDateTime31.toString();
        mutableDateTime31.setDayOfYear((int) ' ');
        mutableDateTime31.addWeekyears(48);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        mutableDateTime40.addMillis((int) 'a');
        mutableDateTime40.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        int int47 = mutableDateTime31.get(dateTimeField46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime50.era();
        java.util.Locale locale57 = null;
        java.lang.String str58 = property56.getAsText(locale57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property56.getFieldType();
        int int60 = mutableDateTime31.get(dateTimeFieldType59);
        boolean boolean61 = mutableDateTime19.isSupported(dateTimeFieldType59);
        boolean boolean62 = mutableDateTime12.isSupported(dateTimeFieldType59);
        boolean boolean63 = mutableDateTime9.isSupported(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2922789 + "'", int8 == 2922789);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T01:49:55.321Z" + "'", str21, "2020-11-25T01:49:55.321Z");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeZone32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T01:49:55.321Z" + "'", str33, "2020-11-25T01:49:55.321Z");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2020-11-25T01:49:55.321Z" + "'", str52, "2020-11-25T01:49:55.321Z");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "AD" + "'", str58, "AD");
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfDay();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfFloor();
        long long21 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.MutableDateTime mutableDateTime23 = property4.add(58);
        mutableDateTime23.setYear(838);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = mutableDateTime23.get(dateTimeFieldType26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86399 + "'", int18 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:32.775Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        int int7 = property6.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.set((int) ' ');
        int int11 = property6.getMaximumValueOverall();
        boolean boolean12 = property6.isLeap();
        org.joda.time.MutableDateTime mutableDateTime13 = property6.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        mutableDateTime16.addWeeks(10);
        mutableDateTime16.addDays(20);
        java.util.Date date25 = mutableDateTime16.toDate();
        long long26 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        mutableDateTime29.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.secondOfDay();
        int int34 = property33.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime37 = property33.set((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property33.getFieldType();
        int int39 = mutableDateTime16.get(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 86399 + "'", int11 == 86399);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mutableDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T01:49:55.478Z" + "'", str18, "2020-11-25T01:49:55.478Z");
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Feb 23 01:49:55 UTC 2021");
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-7782563L) + "'", long26 == (-7782563L));
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 86399 + "'", int34 == 86399);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6595 + "'", int39 == 6595);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.String str6 = mutableDateTime0.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime0.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfWeek(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:55.582Z" + "'", str6, "2020-11-25T01:49:55.582Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        mutableDateTime2.add((long) 19);
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime2.toGregorianCalendar();
        int int7 = mutableDateTime2.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        mutableDateTime2.setMillis((long) 48);
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        int int12 = mutableDateTime11.getYearOfEra();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.millisOfSecond();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.secondOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = mutableDateTime17.getSecondOfMinute();
        mutableDateTime17.setMillis((long) 3);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        java.util.Date date29 = mutableDateTime24.toDate();
        boolean boolean30 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime24.getZone();
        mutableDateTime24.addWeekyears(84);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        int int39 = mutableDateTime37.getSecondOfMinute();
        mutableDateTime37.setMillis((long) 3);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        java.util.Date date49 = mutableDateTime44.toDate();
        boolean boolean50 = mutableDateTime37.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime44.secondOfMinute();
        int int52 = mutableDateTime44.getSecondOfMinute();
        mutableDateTime44.addWeeks(1);
        org.joda.time.Chronology chronology55 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology55);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = mutableDateTime61.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.centuryOfEra();
        java.util.Locale locale64 = null;
        java.lang.String str65 = property63.getAsText(locale64);
        org.joda.time.DateTimeField dateTimeField66 = property63.getField();
        mutableDateTime56.setRounding(dateTimeField66);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime56);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:55.736Z" + "'", str4, "2020-11-25T01:49:55.736Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 55 + "'", int19 == 55);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:55.736Z" + "'", str26, "2020-11-25T01:49:55.736Z");
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 55 + "'", int39 == 55);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T01:49:55.736Z" + "'", str46, "2020-11-25T01:49:55.736Z");
        org.junit.Assert.assertNotNull(date49);
// flaky:         org.junit.Assert.assertEquals(date49.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 55 + "'", int52 == 55);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "20" + "'", str65, "20");
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.setMillis((long) 3);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        java.util.Date date22 = mutableDateTime17.toDate();
        boolean boolean23 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.secondOfMinute();
        int int25 = mutableDateTime17.getSecondOfMinute();
        mutableDateTime17.addWeeks(1);
        org.joda.time.Chronology chronology28 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(chronology28);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime7.setDate(0, 6485050, 57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6485050 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:55.889Z" + "'", str5, "2020-11-25T01:49:55.889Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T01:49:55.889Z" + "'", str19, "2020-11-25T01:49:55.889Z");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Wed Nov 25 01:49:55 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 55 + "'", int25 == 55);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        java.lang.String str6 = mutableDateTime4.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T01:49:55.962Z" + "'", str6, "2020-11-25T01:49:55.962Z");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone5);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.hourOfDay();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.add((long) 6372);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime14 = property8.add(6372);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        long long5 = mutableDateTime4.getMillis();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.dayOfYear();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.MutableDateTime mutableDateTime10 = property6.add((long) 6557286);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1606268996101L + "'", long5 == 1606268996101L);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "330" + "'", str8, "330");
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(6434714);
        boolean boolean13 = mutableDateTime11.isEqual(201678366153600003L);
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:56.149Z" + "'", str5, "2020-11-25T01:49:56.149Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        mutableDateTime2.setTime((long) '#');
        int int7 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        int int11 = mutableDateTime10.getMillisOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.String str16 = mutableDateTime14.toString();
        mutableDateTime14.setDayOfYear((int) ' ');
        mutableDateTime14.addWeekyears(48);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        mutableDateTime23.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        int int30 = mutableDateTime14.get(dateTimeField29);
        mutableDateTime10.setRounding(dateTimeField29);
        mutableDateTime2.setRounding(dateTimeField29);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.weekyear();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime2.add(readableDuration34);
        mutableDateTime2.addSeconds(57);
        mutableDateTime2.addWeeks(27);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.250Z" + "'", str4, "2020-11-25T01:49:56.250Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2020-11-25T01:49:56.250Z" + "'", str16, "2020-11-25T01:49:56.250Z");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property33);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.setWeekyear(32);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.millisOfDay();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        int int7 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setMinuteOfHour(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime2.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = property18.getMaximumValue();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.394Z" + "'", str4, "2020-11-25T01:49:56.394Z");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:56.394Z" + "'", str14, "2020-11-25T01:49:56.394Z");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 6457109);
        org.joda.time.ReadableInstant readableInstant2 = null;
        mutableDateTime1.setTime(readableInstant2);
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
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getWeekyear();
        java.util.Date date18 = mutableDateTime9.toDate();
        int int19 = mutableDateTime9.getDayOfYear();
        java.lang.Object obj20 = mutableDateTime9.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime9.millisOfSecond();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.hourOfDay();
        java.util.Date date29 = mutableDateTime24.toDate();
        int int30 = mutableDateTime24.getDayOfYear();
        int int31 = mutableDateTime24.getDayOfYear();
        int int32 = mutableDateTime24.getEra();
        org.joda.time.DateTime dateTime33 = mutableDateTime24.toDateTimeISO();
        int int34 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:56.561Z" + "'", str11, "2020-11-25T01:49:56.561Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 330 + "'", int19 == 330);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2020-11-25T01:49:56.561Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2020-11-25T01:49:56.561Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2020-11-25T01:49:56.561Z");
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2020-11-25T01:49:56.562Z" + "'", str26, "2020-11-25T01:49:56.562Z");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 01:49:56 UTC 2020");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 330 + "'", int30 == 330);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 330 + "'", int31 == 330);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone6);
        int int8 = mutableDateTime7.getEra();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime7.copy();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:56.642Z" + "'", str5, "2020-11-25T01:49:56.642Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.addWeekyears(105);
        int int7 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setYear(176);
        org.joda.time.Chronology chronology11 = mutableDateTime2.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6596 + "'", int7 == 6596);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        int int10 = property7.getMaximumValueOverall();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.781Z" + "'", str4, "2020-11-25T01:49:56.781Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 86399 + "'", int10 == 86399);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.setMillisOfSecond((int) (short) 100);
        mutableDateTime2.setDate((long) 7);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        int int17 = mutableDateTime14.getMinuteOfHour();
        boolean boolean18 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime14.add(readableDuration19, 4);
        int int22 = mutableDateTime14.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime14.setHourOfDay(6462596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6462596 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.845Z" + "'", str4, "2020-11-25T01:49:56.845Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
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
        mutableDateTime2.addMinutes(330);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        mutableDateTime2.addYears(33);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfMonth();
        boolean boolean14 = mutableDateTime2.isAfter((long) 298);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.938Z" + "'", str4, "2020-11-25T01:49:56.938Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606288796938,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=19,SECOND=56,MILLISECOND=938,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.addDays(100);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        java.util.Date date10 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.year();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfWeek(513);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 513 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:56.994Z" + "'", str4, "2020-11-25T01:49:56.994Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Mar 05 00:00:00 UTC 2021");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setMonthOfYear(6452608);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6452608 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.069Z" + "'", str4, "2020-11-25T01:49:57.069Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:57 UTC 2020");
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(28431927259L, dateTimeZone5);
        mutableDateTime8.setDate((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.toMutableDateTime();
        mutableDateTime8.addMonths((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.year();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfYear();
        long long12 = property11.remainder();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.addWrapField(5);
        int int15 = property11.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 366 + "'", int15 == 366);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.yearOfCentury();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        int int7 = mutableDateTime5.getSecondOfMinute();
        mutableDateTime5.setMillis((long) 3);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        java.util.Date date17 = mutableDateTime12.toDate();
        boolean boolean18 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime0.toDateTime(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(gregorianCalendar1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T01:49:57.327Z" + "'", str14, "2020-11-25T01:49:57.327Z");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 01:49:57 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:15.681Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime4 = property2.add((long) 2020);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.Date date7 = mutableDateTime2.toDate();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfYear();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.441Z" + "'", str4, "2020-11-25T01:49:57.441Z");
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 01:49:57 UTC 2020");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1606268997441,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=330,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=49,SECOND=57,MILLISECOND=441,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property8.getAsText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfCeiling();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
        int int14 = property8.getMinimumValueOverall();
        int int15 = property8.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime16 = property8.roundHalfEven();
        mutableDateTime16.setMillisOfDay(6327);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.489Z" + "'", str4, "2020-11-25T01:49:57.489Z");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AD" + "'", str10, "AD");
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AD" + "'", str13, "AD");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add(0);
        boolean boolean12 = mutableDateTime10.isEqual((long) 27);
        boolean boolean13 = mutableDateTime10.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime10.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:22.207Z");
        mutableDateTime1.setSecondOfDay(64);
        long long4 = mutableDateTime1.getMillis();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1606262464207L + "'", long4 == 1606262464207L);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        int int8 = mutableDateTime7.getYear();
        int int9 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.weekOfWeekyear();
        int int11 = mutableDateTime7.getHourOfDay();
        mutableDateTime7.addHours(109);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.670Z" + "'", str4, "2020-11-25T01:49:57.670Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) '4');
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        mutableDateTime11.setHourOfDay((int) (byte) 0);
        mutableDateTime11.addDays(12);
        mutableDateTime11.setMonthOfYear((int) (short) 1);
        boolean boolean18 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime11);
        int int19 = mutableDateTime10.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime10.add(readablePeriod20, 6528967);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "December" + "'", str7, "December");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        int int8 = mutableDateTime7.getYear();
        int int9 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add(63741865770332L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T01:49:57.841Z" + "'", str4, "2020-11-25T01:49:57.841Z");
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 6364, dateTimeZone6);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = property9.set("2020-11-25T01:48:03.146Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T01:48:03.146Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2020-11-25T01:49:57.909Z" + "'", str5, "2020-11-25T01:49:57.909Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property9);
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
        mutableDateTime2.setMillis((long) 3);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        java.util.Date date14 = mutableDateTime9.toDate();
        boolean boolean15 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.secondOfMinute();
        int int17 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.Chronology chronology18 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        java.lang.String str21 = property20.getAsText();
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T01:49:58.009Z" + "'", str11, "2020-11-25T01:49:58.009Z");
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Wed Nov 25 01:49:58 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 58 + "'", int17 == 58);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "48" + "'", str21, "48");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        boolean boolean6 = mutableDateTime2.isEqual((long) 6438899);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        mutableDateTime9.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundFloor();
        org.joda.time.DurationField durationField16 = property14.getLeapDurationField();
        java.lang.String str17 = property14.toString();
        org.joda.time.DateTimeField dateTimeField18 = property14.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[centuryOfEra]" + "'", str17, "Property[centuryOfEra]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.String str10 = mutableDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime5.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime19.toString(dateTimeFormatter21);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        mutableDateTime25.addMinutes(330);
        java.util.Date date31 = mutableDateTime25.toDate();
        mutableDateTime25.setMillisOfDay((int) (byte) 100);
        boolean boolean34 = mutableDateTime25.isAfterNow();
        mutableDateTime25.addDays(37);
        mutableDateTime25.addMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime40 = mutableDateTime19.toDateTime(dateTimeZone39);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 54, dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime40.toMutableDateTime(dateTimeZone45);
        boolean boolean48 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T01:49:58.203Z" + "'", str10, "2020-11-25T01:49:58.203Z");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2020-11-25T01:49:58.203Z" + "'", str22, "2020-11-25T01:49:58.203Z");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T01:49:58.203Z" + "'", str27, "2020-11-25T01:49:58.203Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 07:19:58 UTC 2020");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }
}
