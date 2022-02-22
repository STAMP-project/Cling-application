import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property5.getFieldType();
        org.joda.time.LocalTime localTime7 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime9 = property5.setCopy("1");
        org.joda.time.LocalTime localTime11 = property5.addWrapFieldToCopy(53714254);
        org.joda.time.LocalTime localTime13 = property5.addCopy(0L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        java.util.Locale locale8 = new java.util.Locale("2022-02-21");
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale8);
        calendar10.roll(5, 53692270);
        calendar10.set(53855002, 53774869, (int) (byte) 1, 53811305, 53851085, 53823020);
        calendar10.setTimeInMillis((long) 53905051);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertEquals(locale8.toString(), "2022-02-21");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1646665417519,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=519,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=53905051,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=25,MILLISECOND=51,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime11 = property7.addNoWrapToCopy(0);
        org.joda.time.LocalTime localTime13 = property7.addCopy(1646664841221L);
        org.joda.time.LocalTime localTime14 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property7.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54217529 + "'", int5 == 54217529);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        int int23 = calendar14.getFirstDayOfWeek();
        calendar14.setMinimalDaysInFirstWeek(5);
        calendar14.clear(14);
        calendar14.clear();
        java.time.Instant instant29 = calendar14.toInstant();
        boolean boolean31 = calendar14.after((java.lang.Object) 1646665255488L);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=5,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime6.plusYears((int) (byte) 100);
        org.joda.time.DateTime.Property property11 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime6.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        boolean boolean18 = durationFieldType14.isSupported(chronology16);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        int int26 = property24.get();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = property24.compareTo((org.joda.time.ReadablePartial) localDate27);
        int[] intArray35 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology16.validate((org.joda.time.ReadablePartial) localDate27, intArray35);
        org.joda.time.DurationField durationField37 = chronology16.minutes();
        org.joda.time.DateTimeField dateTimeField38 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology16.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) property12, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property2 = localDate0.year();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int4 = dateTimeField3.getMinimumValue();
        long long7 = dateTimeField3.add(1646665260640L, 0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-292275054) + "'", int4 == (-292275054));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1646665260640L + "'", long7 == 1646665260640L);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setMinimalDaysInFirstWeek(9);
        calendar14.setFirstDayOfWeek(0);
        boolean boolean26 = calendar14.after((java.lang.Object) 1646664829442L);
        int int27 = calendar14.getMinimalDaysInFirstWeek();
        calendar14.set(58, 8, 17);
        java.time.Instant instant32 = calendar14.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = calendar14.isSet(53762570);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53762570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-60314396962417,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=9,ERA=1,YEAR=58,MONTH=8,WEEK_OF_YEAR=37,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=262,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=37,MILLISECOND=583,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(instant32);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(53627676);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMonths(53638227);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusMonths(100);
        int int10 = localDateTime9.getWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusMonths(53924966);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusHours(54064261);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1025815) + "'", int10 == (-1025815));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField11 = dateTimeField5.getDurationField();
        long long13 = durationField11.getValueAsLong((long) 53710430);
        org.joda.time.DurationFieldType durationFieldType14 = durationField11.getType();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        java.lang.String str16 = durationFieldType15.getName();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        org.joda.time.DurationField durationField21 = chronology19.months();
        org.joda.time.DurationField durationField22 = durationFieldType17.getField(chronology19);
        org.joda.time.DurationField durationField23 = chronology19.years();
        org.joda.time.DurationField durationField24 = durationFieldType15.getField(chronology19);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology19);
        org.joda.time.DateTimeField dateTimeField26 = chronology19.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = durationFieldType14.getField(chronology19);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53710430L + "'", long13 == 53710430L);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hours" + "'", str16, "hours");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        java.util.Locale locale2 = new java.util.Locale("2022-03-08T05:56:53.143+14:54:41.393", "0032-03-01T14:57:37.665");
        org.junit.Assert.assertEquals(locale2.toString(), "2022-03-08t05:56:53.143+14:54:41.393_0032-03-01T14:57:37.665");
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate4.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate4.plus(readablePeriod8);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(0);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(14);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime10.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime10.minusMillis(53745209);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.seconds();
        int int23 = durationField20.getValue(1646665085957L, 1645455566117L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1646665085 + "'", int23 == 1646665085);
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusWeeks((int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(53683219);
        java.lang.String str9 = localDate8.toString();
        org.joda.time.LocalDate localDate11 = localDate8.minusDays(53687963);
        int int12 = localDate8.getWeekyear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4475623-09-14" + "'", str9, "4475623-09-14");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4475623 + "'", int12 == 4475623);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eras");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        long long10 = dateTime8.getMillis();
        org.joda.time.DateTime dateTime12 = dateTime8.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime12, dateTimeZone13);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusSeconds(4);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withYear(53637612);
        org.joda.time.DateTime dateTime21 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes(21351301);
        boolean boolean24 = languageRange1.equals((java.lang.Object) dateTime23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eras" + "'", str2, "eras");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eras" + "'", str3, "eras");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1646665417652L + "'", long10 == 1646665417652L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(43293146);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.size();
        java.util.Date date12 = localDate8.toDate();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        boolean boolean17 = durationFieldType13.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.yearOfEra();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        int int20 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate19.withDayOfWeek(1);
        java.util.Locale locale26 = new java.util.Locale("hi!", "", "");
        java.lang.String str27 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDate22, locale26);
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj28, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property33 = dateTime32.weekyear();
        java.lang.String str34 = property33.getAsText();
        int int35 = property33.get();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        int int38 = property33.compareTo((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate localDate39 = localDate22.withFields((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate localDate41 = localDate39.minusMonths(32769);
        org.joda.time.LocalDate localDate43 = localDate41.withDayOfMonth(21);
        org.joda.time.LocalDate localDate45 = localDate43.minusDays(61);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        boolean boolean50 = durationFieldType46.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.yearOfEra();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        int int53 = localDate52.getDayOfWeek();
        org.joda.time.LocalDate localDate55 = localDate52.withDayOfWeek(1);
        java.util.Locale locale59 = new java.util.Locale("hi!", "", "");
        java.lang.String str60 = dateTimeField51.getAsShortText((org.joda.time.ReadablePartial) localDate55, locale59);
        java.lang.Object obj61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj61, dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property66 = dateTime65.weekyear();
        java.lang.String str67 = property66.getAsText();
        int int68 = property66.get();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology70 = localDate69.getChronology();
        int int71 = property66.compareTo((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate localDate72 = localDate55.withFields((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.months();
        boolean boolean74 = localDate55.isSupported(durationFieldType73);
        boolean boolean75 = localDate45.isSupported(durationFieldType73);
        boolean boolean76 = localDate8.isSupported(durationFieldType73);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022" + "'", str27, "2022");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2022" + "'", str34, "2022");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertEquals(locale59.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2022" + "'", str60, "2022");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022" + "'", str67, "2022");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2022 + "'", int68 == 2022);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime9 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property7.getLocalTime();
        org.joda.time.LocalTime localTime13 = property7.addCopy(53946497);
        org.joda.time.LocalTime localTime14 = property7.getLocalTime();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54217710 + "'", int5 == 54217710);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53635446);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = chronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.hourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withChronology(chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear(53643687);
        java.lang.Integer int15 = dateTimeFormatter12.getPivotYear();
        boolean boolean16 = dateTimeFormatter12.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53710430);
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear(53772415);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology14 = dateTimeFormatter2.getChronology();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(1);
        org.joda.time.LocalDate.Property property6 = localDate3.yearOfEra();
        org.joda.time.LocalDate localDate8 = localDate3.plusMonths(53649071);
        org.joda.time.Interval interval9 = localDate3.toInterval();
        org.joda.time.LocalDate localDate11 = localDate3.plusWeeks(74);
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks(74);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate16.toDateTimeAtStartOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withYear(53638476);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours((-1025815));
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.minus(readablePeriod13);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime.Property property9 = dateTime4.dayOfMonth();
        org.joda.time.DateTime.Property property10 = dateTime4.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight11 = dateTime4.toDateMidnight();
        org.joda.time.Instant instant12 = dateMidnight11.toInstant();
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.DateTime dateTime16 = localDate9.toDateTimeAtCurrentTime();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMonths((int) (short) 100);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        java.lang.String str25 = dateTimeZone23.getID();
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(dateTimeZone23);
        boolean boolean27 = mutableDateTime17.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime29 = dateTime22.plus((long) 53786276);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.minus(readablePeriod31);
        org.joda.time.DateTime.Property property33 = dateTime29.secondOfDay();
        int int34 = dateTime29.getSecondOfMinute();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 26 + "'", int34 == 26);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(86399);
        org.joda.time.DateTime dateTime6 = dateTime4.plusDays((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean8 = dateTime4.isSupported(dateTimeFieldType7);
        int int9 = dateTime4.getHourOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        long long17 = dateTime15.getMillis();
        org.joda.time.DateTime dateTime19 = dateTime15.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime19, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusHours(507);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readableDuration26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime29 = property28.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = property28.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField31 = property28.getField();
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = locale32.getISO3Language();
        java.lang.String str34 = locale32.getDisplayLanguage();
        int int35 = dateTimeField31.getMaximumShortTextLength(locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dateTime4.toString("weekyears", locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1646665417792L + "'", long17 == 1646665417792L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "eng" + "'", str33, "eng");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.LocalDate.Property property16 = localDate9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        org.joda.time.LocalDate localDate19 = property16.roundFloorCopy();
        org.joda.time.LocalDate localDate21 = property16.setCopy(53);
        org.joda.time.DateTimeField dateTimeField22 = property16.getField();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.TimeZone timeZone21 = calendar14.getTimeZone();
        java.time.ZoneId zoneId22 = timeZone21.toZoneId();
        java.lang.String str23 = timeZone21.getDisplayName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=32,MINUTE=1970,SECOND=37,MILLISECOND=818,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(2);
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(0);
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfDay((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime8.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(0);
        org.joda.time.DateTime.Property property11 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime12 = property11.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = property11.addToCopy((long) (short) -1);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra((int) 'u');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        boolean boolean22 = durationFieldType18.isSupported(chronology20);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        int int30 = property28.get();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        int int33 = property28.compareTo((org.joda.time.ReadablePartial) localDate31);
        int[] intArray39 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology20.validate((org.joda.time.ReadablePartial) localDate31, intArray39);
        org.joda.time.LocalDate localDate42 = localDate31.withYearOfEra(16);
        int int43 = localDate42.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        boolean boolean48 = durationFieldType44.isSupported(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.yearOfEra();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        int int51 = localDate50.getDayOfWeek();
        org.joda.time.LocalDate localDate53 = localDate50.withDayOfWeek(1);
        java.util.Locale locale57 = new java.util.Locale("hi!", "", "");
        java.lang.String str58 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) localDate53, locale57);
        java.lang.Object obj59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(obj59, dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime61.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property64 = dateTime63.weekyear();
        java.lang.String str65 = property64.getAsText();
        int int66 = property64.get();
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology68 = localDate67.getChronology();
        int int69 = property64.compareTo((org.joda.time.ReadablePartial) localDate67);
        org.joda.time.LocalDate localDate70 = localDate53.withFields((org.joda.time.ReadablePartial) localDate67);
        org.joda.time.LocalDate localDate72 = localDate70.minusMonths(32769);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology74 = localDate73.getChronology();
        int int75 = localDate73.getDayOfWeek();
        int int76 = localDate73.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone77);
        org.joda.time.DateTime dateTime79 = localDate73.toDateTimeAtStartOfDay(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone80);
        long long83 = dateTimeZone77.getMillisKeepLocal(dateTimeZone80, (long) (byte) 0);
        java.util.TimeZone timeZone84 = dateTimeZone80.toTimeZone();
        java.lang.String str86 = dateTimeZone80.getShortName(0L);
        org.joda.time.DateTime dateTime87 = localDate72.toDateTimeAtCurrentTime(dateTimeZone80);
        boolean boolean88 = localDate42.equals((java.lang.Object) localDate72);
        org.joda.time.LocalDate localDate90 = localDate42.minusYears(26);
        org.joda.time.LocalDate localDate92 = localDate42.plusWeeks(53817887);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDate42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665417851L + "'", long6 == 1646665417851L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertEquals(locale57.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2022" + "'", str58, "2022");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "2022" + "'", str65, "2022");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2022 + "'", int76 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(timeZone84);
        org.junit.Assert.assertEquals(timeZone84.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+00:00" + "'", str86, "+00:00");
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(localDate92);
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        long long8 = chronology2.add((long) 2, (long) 59, 53628688);
        org.joda.time.DurationField durationField9 = chronology2.seconds();
        org.joda.time.DurationField durationField10 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.dayOfYear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(1646611200000L, chronology2);
        org.joda.time.DurationField durationField14 = chronology2.days();
        org.joda.time.DateTimeField dateTimeField15 = chronology2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3164092594L + "'", long8 == 3164092594L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.lang.String str13 = timeZone11.getID();
        int int15 = timeZone11.getOffset((long) (-18));
        java.util.TimeZone.setDefault(timeZone11);
        java.util.TimeZone.setDefault(timeZone11);
        int int19 = timeZone11.getOffset(0L);
        java.time.ZoneId zoneId20 = timeZone11.toZoneId();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone(zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeZone21.getOffset(21377255, 31, 146, 53669851, 0, 21379846);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 53640182);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        boolean boolean15 = timeZone14.observesDaylightTime();
        int int16 = timeZone14.getRawOffset();
        java.time.ZoneId zoneId17 = timeZone14.toZoneId();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone(zoneId17);
        java.util.Calendar.Builder builder19 = builder0.setTimeZone(timeZone18);
        java.util.Date date25 = new java.util.Date(53638476, 53675141, 53679530, 292278993, 53635724);
        java.util.Date date27 = new java.util.Date((long) 2000);
        int int28 = date27.getTimezoneOffset();
        long long29 = date27.getTime();
        java.util.Date date31 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.fromDateFields(date31);
        java.util.Date date36 = new java.util.Date(7, (int) (byte) -1, 32769);
        boolean boolean37 = date31.before(date36);
        boolean boolean38 = date27.before(date31);
        int int39 = date27.getYear();
        boolean boolean40 = date25.before(date27);
        java.util.Calendar.Builder builder41 = builder19.setInstant(date27);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("yearOfEra");
        java.util.Calendar.Builder builder44 = builder19.setTimeZone(timeZone43);
        java.util.Calendar.Builder builder48 = builder44.setWeekDate(53712139, 507, (int) (short) 10);
        java.util.Calendar.Builder builder52 = builder44.setTimeOfDay(53815747, 53926555, 37);
        java.util.Calendar.Builder builder56 = builder52.setWeekDate(691, 53952444, 54038267);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Dec 25 09:44:00 UTC 58293718");
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:02 UTC 1970");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2000L + "'", long29 == 2000L);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder4 = builder0.setExtension('a', "months");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale locale12 = builder11.build();
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale7.getDisplayLanguage(locale12);
        java.util.Locale.Builder builder15 = builder6.setLocale(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Italian" + "'", str14, "Italian");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        java.lang.String str2 = localDate0.toString();
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtCurrentTime();
        int int4 = localDate0.getDayOfYear();
        org.joda.time.LocalDate.Property property5 = localDate0.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        org.joda.time.Chronology chronology9 = chronology6.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        java.lang.String str11 = durationField10.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21" + "'", str2, "2022-02-21");
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "weeks" + "'", str11, "weeks");
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant1 = instant0.toInstant();
        long long2 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant0.plus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 53656897);
        org.joda.time.Instant instant10 = instant7.withDurationAdded((long) 53682380, 53675117);
        org.joda.time.Instant instant12 = instant7.withMillis(1646664919239L);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, 53646113);
        org.joda.time.DateTime dateTime16 = instant12.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(53849522);
        org.joda.time.DateTime dateTime20 = dateTime18.plusSeconds(54087799);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1645455817925L + "'", long2 == 1645455817925L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.LocalDate localDate24 = localDate13.withYearOfEra(16);
        org.joda.time.LocalDate localDate26 = localDate24.plusYears(36);
        int int27 = localDate24.size();
        org.joda.time.Chronology chronology28 = localDate24.getChronology();
        org.joda.time.LocalDate localDate30 = localDate24.withWeekyear(74);
        org.joda.time.DateTime dateTime31 = localDate24.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology37 = chronology33.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.hourOfHalfday();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateTime31, chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.millisOfDay();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.LocalTime localTime7 = localTime0.withSecondOfMinute(3);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.minus(readablePeriod8);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(38);
        org.joda.time.LocalTime localTime13 = localTime11.plusHours(53646394);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        boolean boolean18 = durationFieldType14.isSupported(chronology16);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        int int26 = property24.get();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = property24.compareTo((org.joda.time.ReadablePartial) localDate27);
        int[] intArray35 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology16.validate((org.joda.time.ReadablePartial) localDate27, intArray35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = localDate27.getFieldType((int) (short) 1);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        int int40 = localDate39.getDayOfWeek();
        org.joda.time.LocalDate localDate42 = localDate39.withCenturyOfEra((int) 'u');
        int int43 = localDate42.getYearOfEra();
        org.joda.time.LocalDate localDate45 = localDate42.withWeekyear(1970);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.minuteOfDay();
        org.joda.time.DurationField durationField49 = chronology47.months();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology47.getZone();
        org.joda.time.DateTime dateTime52 = localDate42.toDateTimeAtMidnight(dateTimeZone51);
        int int53 = localDate27.compareTo((org.joda.time.ReadablePartial) localDate42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = localTime13.isEqual((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54217952 + "'", int5 == 54217952);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11722 + "'", int43 == 11722);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(0);
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.time.Instant instant22 = calendar14.toInstant();
        int int23 = calendar14.getWeekYear();
        calendar14.setTimeInMillis(1646665091444L);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        int int28 = localDate26.getDayOfWeek();
        int int29 = localDate26.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        long long36 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) (byte) 0);
        java.util.TimeZone timeZone37 = dateTimeZone33.toTimeZone();
        boolean boolean38 = timeZone37.observesDaylightTime();
        int int39 = timeZone37.getRawOffset();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone37);
        calendar40.set(48, (int) '4', 32769, 32, 1970);
        calendar40.clear();
        java.util.TimeZone timeZone48 = calendar40.getTimeZone();
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromCalendarFields(calendar40);
        long long50 = calendar40.getTimeInMillis();
        calendar40.setFirstDayOfWeek(53648759);
        boolean boolean53 = calendar40.isWeekDateSupported();
        java.lang.String str54 = calendar40.getCalendarType();
        int int55 = calendar14.compareTo(calendar40);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1646665091444,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=11,MILLISECOND=444,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=53648759,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "gregory" + "'", str54, "gregory");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("0032-03-01T14:56:26.343");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale6 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        java.lang.String str7 = locale6.toLanguageTag();
        java.lang.String str8 = locale6.toLanguageTag();
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleAttributes();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone1, locale6);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals(locale6.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "und" + "'", str7, "und");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "und" + "'", str8, "und");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645455817996,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=996,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        int int9 = localDate7.getDayOfWeek();
        int int10 = localDate7.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) (byte) 0);
        java.util.TimeZone timeZone18 = dateTimeZone14.toTimeZone();
        java.lang.String str20 = dateTimeZone14.getShortName(0L);
        org.joda.time.DateMidnight dateMidnight21 = localDate6.toDateMidnight(dateTimeZone14);
        long long23 = dateTimeZone14.previousTransition(1645455369891L);
        long long25 = dateTimeZone14.nextTransition(1646665272242L);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1645455369891L + "'", long23 == 1645455369891L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1646665272242L + "'", long25 == 1646665272242L);
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = chronology1.halfdays();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        boolean boolean11 = property9.equals((java.lang.Object) 1646665070715L);
        org.joda.time.LocalTime localTime12 = property9.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.DurationFieldType durationFieldType4 = durationField3.getType();
        long long6 = durationField3.getMillis((-701));
        boolean boolean7 = durationField3.isPrecise();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-22121423352000L) + "'", long6 == (-22121423352000L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(749);
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfDay();
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology6);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfYear(14);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusMinutes((int) (short) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.year();
        int int22 = property21.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = property21.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418053L + "'", long6 == 1646665418053L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 292278993 + "'", int22 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(2000L, chronology27);
        boolean boolean34 = calendar14.after((java.lang.Object) 2000L);
        calendar14.roll(13, 53705735);
        int int39 = calendar14.getMaximum(13);
        java.time.Instant instant40 = calendar14.toInstant();
        java.util.Date date41 = java.util.Date.from(instant40);
        int int42 = date41.getDay();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553786935,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=13,MILLISECOND=65,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:38 GMT 142");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 59 + "'", int39 == 59);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 19 16:50:13 GMT 142");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        int int10 = dateTime8.getYear();
        org.joda.time.DateTime dateTime12 = dateTime8.plusWeeks(59);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        int int15 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(1646665000322L, dateTimeZone1);
        int int17 = localDateTime16.size();
        int int18 = localDateTime16.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Aug 18, 53658740 4:20:00 PM");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.lang.String str16 = timeZone14.getID();
        calendar2.setTimeZone(timeZone14);
        calendar2.setTimeInMillis((long) 43147053);
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setTime(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=43147053,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=59,SECOND=7,MILLISECOND=53,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate5 = property1.addToCopy(0);
        int int6 = localDate5.getMonthOfYear();
        org.joda.time.LocalDate.Property property7 = localDate5.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate.Property property10 = localDate5.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusHours(507);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekyear(32770);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusDays(53816407);
        int int19 = localDateTime11.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418114L + "'", long6 == 1646665418114L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 114 + "'", int19 == 114);
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property5.getFieldType();
        org.joda.time.LocalTime localTime7 = property5.roundCeilingCopy();
        org.joda.time.LocalTime localTime9 = property5.setCopy("1");
        org.joda.time.LocalTime localTime11 = property5.addCopy(26);
        org.joda.time.LocalTime localTime12 = property5.getLocalTime();
        org.joda.time.LocalTime localTime13 = property5.getLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        boolean boolean5 = dateTimeFormatter3.isPrinter();
        boolean boolean6 = dateTimeFormatter3.isParser();
        int int7 = dateTimeFormatter3.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter3.getZone();
        org.joda.time.Chronology chronology9 = dateTimeFormatter3.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(53637875);
        long long15 = dateTimeZone12.adjustOffset((long) 53811537, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter3.withZone(dateTimeZone12);
        boolean boolean17 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(1646664919274L);
        org.joda.time.DateTime dateTime20 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear(248);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter3.withChronology(chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.parse("0032-03-01T05:56:57.244", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53811537L + "'", long15 == 53811537L);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusHours(507);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMinutes(14);
        int int17 = localDateTime16.getDayOfMonth();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        int int21 = localDate18.getWeekyear();
        int int22 = localDate18.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        boolean boolean27 = durationFieldType23.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = dateTimeField28.getType();
        boolean boolean30 = localDate18.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = localDate18.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate18.minus(readablePeriod32);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDate18.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDate18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418149L + "'", long6 == 1646665418149L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusHours(507);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.year();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418160L + "'", long6 == 1646665418160L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(22);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis(292278993);
        org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(0);
        org.joda.time.LocalTime localTime9 = localTime5.minusSeconds(53921439);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone4);
        java.lang.String str7 = dateTimeZone4.toString();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek(4);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        java.lang.String str17 = property16.getAsText();
        int int18 = property16.get();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = property16.compareTo((org.joda.time.ReadablePartial) localDate19);
        int int22 = localDate19.size();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = localDate23.getDayOfWeek();
        int int26 = localDate23.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = localDate8.toDateTimeAtStartOfDay(dateTimeZone27);
        int int32 = localDate8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone34);
        org.joda.time.LocalTime localTime37 = localTime35.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localTime35.toDateTimeToday(dateTimeZone38);
        int int40 = dateTime39.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int42 = dateTime39.get(dateTimeFieldType41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.minus(readableDuration43);
        org.joda.time.DateTime dateTime46 = dateTime44.withYear(6);
        org.joda.time.DateTime dateTime48 = dateTime46.minusWeeks(53846341);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean50 = dateTime46.isSupported(dateTimeFieldType49);
        java.lang.String str51 = dateTimeFieldType49.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int52 = localDate8.get(dateTimeFieldType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022" + "'", str17, "2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2022 + "'", int40 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 22 + "'", int42 == 22);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "clockhourOfHalfday" + "'", str51, "clockhourOfHalfday");
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = chronology7.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) dateTime4, chronology11);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.LocalDate.Property property15 = localDate13.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property15.roundFloorCopy();
        org.joda.time.LocalDate localDate17 = property15.withMaximumValue();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.Chronology chronology20 = chronology19.withUTC();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.minuteOfDay();
        org.joda.time.DurationField durationField25 = chronology23.months();
        org.joda.time.DurationField durationField26 = chronology23.years();
        boolean boolean27 = dateTime21.equals((java.lang.Object) durationField26);
        long long28 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        int int29 = dateTime21.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 13L + "'", long28 == 13L);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime11 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        int int14 = property13.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate4 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate5 = property1.withMaximumValue();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        long long9 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime11, dateTimeZone12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusHours(507);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        boolean boolean23 = calendar2.before((java.lang.Object) localDateTime21);
        boolean boolean24 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455818224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=38,MILLISECOND=224,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1646665418224L + "'", long9 == 1646665418224L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime.Property property9 = dateTime4.dayOfMonth();
        java.lang.String str10 = property9.toString();
        org.joda.time.DateTime dateTime11 = property9.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[dayOfMonth]" + "'", str10, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.lang.String str13 = timeZone11.getID();
        int int15 = timeZone11.getOffset((long) (-18));
        java.util.TimeZone.setDefault(timeZone11);
        java.util.TimeZone.setDefault(timeZone11);
        int int19 = timeZone11.getOffset(0L);
        timeZone11.setRawOffset(53758009);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean23 = calendar22.isWeekDateSupported();
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = calendar22.getDisplayName(0, 64712803, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455818249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=53758009,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=59,SECOND=36,MILLISECOND=258,ZONE_OFFSET=53758009,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfDay((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        int int20 = dateTime19.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int22 = dateTime19.get(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone24);
        org.joda.time.LocalTime localTime27 = localTime25.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localTime25.toDateTimeToday(dateTimeZone28);
        int int30 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime34 = dateTime19.withDate(36, 2, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime.Property property36 = dateTime34.property(dateTimeFieldType35);
        boolean boolean37 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime39 = dateTime12.plusMinutes(142);
        org.joda.time.DateTime.Property property40 = dateTime12.millisOfSecond();
        org.joda.time.DateTime.Property property41 = dateTime12.hourOfDay();
        org.joda.time.DateTime dateTime43 = dateTime12.withYearOfEra(53864499);
        org.joda.time.DateTime dateTime45 = dateTime12.minus(213503982334L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusYears(50);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.year();
        int int19 = localDateTime11.size();
        int int20 = localDateTime11.getYearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime11.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime11.withPeriodAdded(readablePeriod22, 9);
        org.joda.time.LocalDateTime.Property property25 = localDateTime11.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418288L + "'", long6 == 1646665418288L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime11 = property7.addNoWrapToCopy(0);
        org.joda.time.LocalTime localTime13 = property7.addCopy(1646664841221L);
        org.joda.time.LocalTime localTime14 = property7.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime15 = property7.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime17 = property7.addWrapFieldToCopy(32);
        java.lang.String str18 = localTime17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime17.plus(readablePeriod19);
        org.joda.time.Chronology chronology21 = localTime17.getChronology();
        org.joda.time.LocalTime.Property property22 = localTime17.hourOfDay();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54218302 + "'", int5 == 54218302);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "23:03:38.302" + "'", str18, "23:03:38.302");
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese (China)" + "'", str2, "Chinese (China)");
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        long long7 = dateTimeZone4.nextTransition((long) 3);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        int int14 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant16 = instant11.withMillis(1646664905560L);
        org.joda.time.Instant instant18 = instant16.withMillis(1646665031593L);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant16.plus(readableDuration19);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime2.monthOfYear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(53668064);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(0);
        org.joda.time.LocalTime localTime12 = localTime8.withSecondOfMinute((int) (short) 0);
        int int13 = localTime8.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localTime8.getFields();
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.withMaximumValue();
        org.joda.time.LocalTime localTime17 = property15.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime18 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField19 = property15.getField();
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale23 = new java.util.Locale("2022-02-21");
        java.lang.String str24 = locale23.getDisplayScript();
        java.lang.String str25 = locale21.getDisplayScript(locale23);
        java.lang.String str26 = dateTimeField19.getAsText((int) (short) 1, locale21);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.lang.String str29 = locale21.getDisplayScript(locale27);
        java.lang.String str30 = property5.getAsShortText(locale27);
        java.lang.String str31 = property5.getAsString();
        org.joda.time.DateTime dateTime33 = property5.addWrapFieldToCopy(43141160);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime33.withDate(0, 0, 21417629);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54218331 + "'", int13 == 54218331);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale23.toString(), "2022-02-21");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uc6d4" + "'", str30, "\uc6d4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2" + "'", str31, "2");
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale3.getDisplayCountry(locale7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale7);
        boolean boolean10 = calendar9.isWeekDateSupported();
        int int11 = calendar9.getFirstDayOfWeek();
        int int13 = calendar9.getGreatestMinimum(0);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455818342,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=53758009,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=59,SECOND=36,MILLISECOND=351,ZONE_OFFSET=53758009,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfEvenCopy();
        java.util.Date date9 = dateTime8.toDate();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        java.util.Date date12 = dateTime8.toDate();
        java.lang.String str13 = date12.toLocaleString();
        date12.setDate(53871656);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Mon Jan 03 14:55:58 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Aug 02 14:55:58 UTC 149517");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Jan 3, 2022 2:55:58 PM" + "'", str13, "Jan 3, 2022 2:55:58 PM");
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.joda.time.LocalTime localTime4 = localTime2.plusHours(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean6 = localTime2.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.seconds();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(1646664910283L, chronology7);
        org.joda.time.ReadableInstant readableInstant10 = null;
        boolean boolean11 = dateTime9.isEqual(readableInstant10);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        java.util.Date date5 = new java.util.Date(141, 53739380, 53718335, 53663998, 53649584);
        int int6 = date5.getYear();
        int int7 = date5.getSeconds();
        org.junit.Assert.assertEquals(date5.toString(), "Tue Jun 07 13:44:00 UTC 4633622");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4631722 + "'", int6 == 4631722);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.DateTime dateTime16 = localDate9.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate18 = localDate9.plusMonths(53634194);
        org.joda.time.LocalDate localDate20 = localDate9.plusDays(53770792);
        org.joda.time.LocalDate localDate22 = localDate9.withWeekyear(53847651);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localDate22.getFieldTypes();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getEra();
        org.joda.time.LocalDate localDate4 = localDate0.plusDays(53635175);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.dayOfYear();
        org.joda.time.DurationField durationField10 = durationFieldType5.getField(chronology7);
        boolean boolean11 = localDate0.isSupported(durationFieldType5);
        org.joda.time.LocalDate localDate13 = localDate0.plusWeeks(0);
        org.joda.time.LocalDate localDate15 = localDate13.minusYears(53663998);
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds(53692992);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.util.Date date6 = new java.util.Date(32770, 21360706, 53879555, 53832567, 32772, 21388841);
        java.util.Date date12 = new java.util.Date(53638476, 53675141, 53679530, 292278993, 53635724);
        java.time.Instant instant13 = date12.toInstant();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = localDate14.getDayOfWeek();
        int int17 = localDate14.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) (byte) 0);
        java.util.TimeZone timeZone25 = dateTimeZone21.toTimeZone();
        boolean boolean26 = timeZone25.observesDaylightTime();
        int int27 = timeZone25.getRawOffset();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone25);
        calendar28.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date35 = calendar28.getTime();
        calendar28.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.minuteOfDay();
        boolean boolean43 = durationFieldType39.isSupported(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.yearOfEra();
        org.joda.time.DurationField durationField45 = chronology41.halfdays();
        org.joda.time.DurationField durationField46 = chronology41.centuries();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(2000L, chronology41);
        boolean boolean48 = calendar28.after((java.lang.Object) 2000L);
        int int49 = calendar28.getWeekYear();
        int int50 = calendar28.getWeekYear();
        java.util.Date date52 = new java.util.Date((long) 2000);
        int int53 = date52.getTimezoneOffset();
        long long54 = date52.getTime();
        java.util.Date date56 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.fromDateFields(date56);
        java.util.Date date61 = new java.util.Date(7, (int) (byte) -1, 32769);
        boolean boolean62 = date56.before(date61);
        boolean boolean63 = date52.before(date56);
        date56.setMinutes(749);
        calendar28.setTime(date56);
        boolean boolean67 = date12.before(date56);
        java.lang.String str68 = date56.toLocaleString();
        boolean boolean69 = date6.after(date56);
        int int70 = date56.getYear();
        org.junit.Assert.assertEquals(date6.toString(), "Mon Dec 21 22:32:41 UTC 1968387");
        org.junit.Assert.assertEquals(date12.toString(), "Sun Dec 25 09:44:00 UTC 58293718");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=41640893,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=34,SECOND=0,MILLISECOND=893,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 20 07:46:36 UTC 142");
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 142 + "'", int49 == 142);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 142 + "'", int50 == 142);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 14:56:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-895) + "'", int53 == (-895));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 2000L + "'", long54 == 2000L);
        org.junit.Assert.assertEquals(date56.toString(), "Fri Jan 02 02:29:58 UTC 1970");
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertEquals(date61.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Jan 2, 1970 2:29:58 AM" + "'", str68, "Jan 2, 1970 2:29:58 AM");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 70 + "'", int70 == 70);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        long long14 = dateTimeZone7.adjustOffset((long) 292278993, true);
        long long16 = dateTimeZone7.previousTransition(1645487999003L);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate.Property property18 = localDate17.weekyear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 292278993L + "'", long14 == 292278993L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1645487999003L + "'", long16 == 1645487999003L);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53928250, 0, 53662969, 54054745, 21396176);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54054745 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.LocalDate.Property property16 = localDate9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.LocalDate localDate18 = property16.withMaximumValue();
        org.joda.time.LocalDate localDate19 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getDurationType();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.Instant instant4 = instant3.toInstant();
        long long5 = instant3.getMillis();
        org.joda.time.Chronology chronology6 = instant3.getChronology();
        org.joda.time.Chronology chronology7 = instant3.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType1.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(1646664894517L, chronology7);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        boolean boolean16 = durationFieldType12.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.yearOfEra();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        int[] intArray22 = chronology14.get((org.joda.time.ReadablePartial) localDate18, (long) (-1));
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = localDate23.getDayOfWeek();
        boolean boolean27 = localDate23.equals((java.lang.Object) 7);
        int int28 = localDate18.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate29 = localDate11.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate31 = localDate11.withCenturyOfEra(247);
        int int32 = localDate31.getEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1645455818450L + "'", long5 == 1645455818450L);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime6.plusYears((int) (byte) 100);
        org.joda.time.DateTime.Property property11 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime12 = property11.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        int[] intArray10 = chronology2.get((org.joda.time.ReadablePartial) localDate6, (long) (-1));
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = localDate11.getDayOfWeek();
        boolean boolean15 = localDate11.equals((java.lang.Object) 7);
        int int16 = localDate6.compareTo((org.joda.time.ReadablePartial) localDate11);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("dayOfMonth");
        boolean boolean19 = localDate6.equals((java.lang.Object) "dayOfMonth");
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        int int22 = localDate20.getDayOfWeek();
        int int23 = localDate20.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long30 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) (byte) 0);
        boolean boolean32 = dateTimeZone27.isStandardOffset(1646664888938L);
        org.joda.time.DateTime dateTime33 = localDate6.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTime.Property property34 = dateTime33.weekOfWeekyear();
        int int35 = dateTime33.getEra();
        org.joda.time.Chronology chronology36 = dateTime33.getChronology();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusHours(507);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusDays(53640182);
        int int17 = localDateTime11.size();
        org.joda.time.ReadablePartial readablePartial18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withFields(readablePartial18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime11.minusMillis(53728853);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime11.plusHours(53822390);
        org.joda.time.LocalDateTime.Property property24 = localDateTime11.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418493L + "'", long6 == 1646665418493L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        timeZone22.setID("AM");
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=AM,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.LocalDate localDate24 = localDate13.withYearOfEra(16);
        int int25 = localDate24.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate24.withPeriodAdded(readablePeriod26, 53642865);
        org.joda.time.LocalDate.Property property29 = localDate28.era();
        org.joda.time.LocalDate localDate31 = localDate28.plusMonths(134);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.monthOfYear();
        org.joda.time.LocalDate localDate34 = property33.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate35 = property33.roundHalfEvenCopy();
        int int36 = property33.getMinimumValueOverall();
        org.joda.time.LocalDate localDate37 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        int int39 = localDate38.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology45 = chronology41.withZone(dateTimeZone44);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.now(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDate38.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone44);
        java.lang.String str50 = dateTimeZone44.getShortName((long) 53868668);
        java.lang.String str52 = dateTimeZone44.getNameKey((long) 53710430);
        org.joda.time.DateTime dateTime53 = localDate37.toDateTimeAtCurrentTime(dateTimeZone44);
        long long56 = dateTimeZone44.convertLocalToUTC(1646665162427L, true);
        long long58 = dateTimeZone44.previousTransition(1646611420172L);
        org.joda.time.DateTime dateTime59 = localDate28.toDateTimeAtStartOfDay(dateTimeZone44);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1646665162427L + "'", long56 == 1646665162427L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1646611420172L + "'", long58 == 1646611420172L);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusMillis(48);
        org.joda.time.LocalTime localTime6 = localTime4.minusMinutes(52);
        org.joda.time.LocalTime localTime8 = localTime4.minusMillis(16);
        int int9 = localTime4.getHourOfDay();
        org.joda.time.LocalTime localTime11 = localTime4.plusSeconds(141);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.plus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime11.minusSeconds(21345872);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        boolean boolean23 = dateTime20.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property24 = dateTime20.millisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime26 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("0032-03-02T05:56:58.667");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.dayOfWeek();
        int int5 = dateTimeField4.getMinimumValue();
        long long7 = dateTimeField4.roundHalfEven(1645455254891L);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        boolean boolean13 = dateTimeFormatter10.isParser();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = localDate14.getDayOfWeek();
        int int17 = localDate14.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) (byte) 0);
        java.util.TimeZone timeZone25 = dateTimeZone21.toTimeZone();
        java.lang.String str27 = dateTimeZone21.getShortName(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter10.withZone(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale34 = new java.util.Locale("hi!", "", "");
        java.lang.String str35 = locale34.getDisplayScript();
        java.util.Locale.setDefault(locale34);
        java.lang.String str37 = locale34.getDisplayLanguage();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale34.getDisplayCountry(locale38);
        java.lang.String str40 = dateTimeZone29.getName((long) 507, locale34);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale34.getDisplayName(locale41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter10.withLocale(locale34);
        int int44 = dateTimeField4.getMaximumTextLength(locale34);
        int int47 = dateTimeField4.getDifference(1646664842377L, 1646664854670L);
        int int49 = dateTimeField4.get(1646665041497L);
        int int51 = dateTimeField4.getLeapAmount((long) 75);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645488000000L + "'", long7 == 1645488000000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 9 + "'", int44 == 9);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone4);
        java.lang.String str7 = dateTimeZone4.toString();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek(4);
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.LocalDate localDate12 = property11.withMinimumValue();
        int int13 = localDate12.getMonthOfYear();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.LocalDate localDate24 = localDate13.withYearOfEra(16);
        org.joda.time.LocalDate localDate26 = localDate24.plusYears(36);
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate26.withPeriodAdded(readablePeriod28, 53663486);
        org.joda.time.LocalDate.Property property31 = localDate30.yearOfCentury();
        org.joda.time.LocalDate localDate33 = property31.addWrapFieldToCopy(21401290);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate33);
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        int int9 = property7.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property7.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.plus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime10.minusHours(53737993);
        int int15 = localTime10.getHourOfDay();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54218614 + "'", int5 == 54218614);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) 1646664833670L);
        long long2 = instant1.getMillis();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        boolean boolean15 = timeZone14.observesDaylightTime();
        int int16 = timeZone14.getRawOffset();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        calendar17.set(48, (int) '4', 32769, 32, 1970);
        calendar17.clear();
        java.util.TimeZone timeZone25 = calendar17.getTimeZone();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar17);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int31 = dateTime29.get(dateTimeFieldType30);
        boolean boolean32 = localDate26.equals((java.lang.Object) int31);
        org.joda.time.DateMidnight dateMidnight33 = localDate26.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.DateTime dateTime37 = dateTime36.withEarlierOffsetAtOverlap();
        int int38 = dateTime37.getDayOfMonth();
        java.util.GregorianCalendar gregorianCalendar39 = dateTime37.toGregorianCalendar();
        org.joda.time.DateTime dateTime40 = localDate26.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime43 = instant1.toMutableDateTime(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.secondOfMinute();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1646664833670L + "'", long2 == 1646664833670L);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 21 + "'", int38 == 21);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 53640182);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        int int6 = localDate3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTimeAtStartOfDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) (byte) 0);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.time.ZoneId zoneId16 = timeZone14.toZoneId();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone14);
        java.util.Calendar.Builder builder18 = builder0.setTimeZone(timeZone14);
        java.util.Calendar.Builder builder22 = builder0.setWeekDate(53770058, 53733421, 53684206);
        java.util.Locale.Category category23 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "");
        java.lang.String str28 = locale27.getDisplayScript();
        java.util.Locale.setDefault(locale27);
        java.lang.String str30 = locale27.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale27.getDisplayCountry(locale31);
        java.lang.String str33 = locale27.getISO3Country();
        java.util.Locale.setDefault(category23, locale27);
        java.util.Locale locale35 = java.util.Locale.getDefault(category23);
        java.util.Calendar.Builder builder36 = builder22.setLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar37 = builder36.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53684206");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455818645,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=38,MILLISECOND=645,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + category23 + "' != '" + java.util.Locale.Category.FORMAT + "'", category23.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.withPeriodAdded(readablePeriod5, 53689856);
        org.joda.time.DateTime dateTime9 = dateTime7.plus(1646665322356L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.lang.String str2 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(53664147);
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 1645455254891L);
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime17 = dateTime13.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(507);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readableDuration24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy(8);
        org.joda.time.LocalDateTime localDateTime30 = property27.roundHalfCeilingCopy();
        java.lang.Object obj31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj31, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        long long37 = dateTime35.getMillis();
        org.joda.time.DateTime dateTime39 = dateTime35.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime39, dateTimeZone40);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.plusHours(507);
        int int46 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.weekyear();
        org.joda.time.LocalDateTime localDateTime48 = property47.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime49 = property47.roundHalfCeilingCopy();
        boolean boolean50 = dateTimeZone0.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone0.convertLocalToUTC(1646664952813L, true, 1646664884206L);
        boolean boolean55 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645401590744L + "'", long7 == 1645401590744L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1646665418664L + "'", long15 == 1646665418664L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1646665418664L + "'", long37 == 1646665418664L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1646664952813L + "'", long54 == 1646664952813L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        int int9 = dateTime6.getEra();
        org.joda.time.DateTime dateTime11 = dateTime6.minusHours(0);
        org.joda.time.DateTime dateTime13 = dateTime6.minusDays(99);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime dateTime15 = property14.getDateTime();
        org.joda.time.DurationField durationField16 = property14.getRangeDurationField();
        boolean boolean17 = durationField16.isPrecise();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(70);
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 21383888);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear(21353152);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        java.io.Writer writer7 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.joda.time.LocalTime localTime11 = localTime9.plusHours(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean13 = localTime9.isSupported(dateTimeFieldType12);
        org.joda.time.LocalTime localTime15 = localTime9.plusHours(893);
        org.joda.time.LocalTime.Property property16 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime18 = localTime9.plusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime20 = localTime9.plus(readablePeriod19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime9.minus(readablePeriod21);
        int int23 = localTime22.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadablePartial) localTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(2);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime.Property property12 = dateTime8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.DateTime dateTime14 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(53955013);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime14.withTime(42986241, 21410282, 54052432, 53643773);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42986241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale2.getDisplayVariant();
        java.lang.String str6 = nameProvider0.getShortName(locale2, "14:53:50.326", "ISOChronology[Etc/UTC]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale9 = null;
        java.lang.String str12 = nameProvider0.getName(locale9, "-1", "53995");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = dateTimeZone0.getShortName(1646664825911L, locale3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.DurationField durationField13 = property10.getLeapDurationField();
        boolean boolean14 = dateTimeZone0.equals((java.lang.Object) property10);
        java.lang.String str15 = dateTimeZone0.getID();
        int int17 = dateTimeZone0.getOffsetFromLocal((long) 53759048);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone0);
        java.util.Locale locale22 = new java.util.Locale("Jan 1, 1970 12:00:02 AM", "minutes");
        java.lang.String str23 = dateTimeZone0.getName((long) 54037845, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals(locale22.toString(), "jan 1, 1970 12:00:02 am_MINUTES");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int int2 = localDate1.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate1.withDayOfWeek(1);
        int int5 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        int int9 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone10);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        org.joda.time.DateMidnight dateMidnight14 = localDate1.toDateMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(1646664833748L, dateTimeZone10);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks(18);
        org.joda.time.LocalDate localDate19 = localDate15.plusYears(53893612);
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property25 = dateTime24.weekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.minusMillis(53749052);
        org.joda.time.DateTime dateTime29 = dateTime24.plusWeeks(53829393);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime24.getZone();
        org.joda.time.DateMidnight dateMidnight31 = localDate15.toDateMidnight(dateTimeZone30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean33 = localDate15.isSupported(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType32.getRangeDurationType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(durationFieldType34);
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        long long9 = calendar8.getTimeInMillis();
        java.util.TimeZone timeZone10 = calendar8.getTimeZone();
        calendar8.setTimeInMillis(1646665014224L);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(53736606);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1646665014224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=56,SECOND=54,MILLISECOND=224,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645455818772L + "'", long9 == 1645455818772L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime.Property property8 = dateTime6.millisOfDay();
        org.joda.time.DateTime.Property property9 = dateTime6.yearOfEra();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime11 = property7.setCopy((int) (byte) 1);
        boolean boolean12 = property7.isLeap();
        org.joda.time.LocalTime localTime14 = property7.addCopy(1646664987691L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay(53809179);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53809179 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54218792 + "'", int5 == 54218792);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = property7.addCopy((long) 7);
        org.joda.time.DateTimeField dateTimeField13 = property7.getField();
        org.joda.time.LocalTime localTime15 = property7.addCopy(53770311);
        org.joda.time.LocalTime localTime16 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54218805 + "'", int5 == 54218805);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        java.util.Date date3 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromDateFields(date3);
        date3.setMinutes((int) (byte) 100);
        date3.setDate(16);
        java.lang.String str9 = date3.toLocaleString();
        java.util.Date date11 = new java.util.Date((long) 2000);
        int int12 = date11.getTimezoneOffset();
        long long13 = date11.getTime();
        java.util.Date date15 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromDateFields(date15);
        java.util.Date date20 = new java.util.Date(7, (int) (byte) -1, 32769);
        boolean boolean21 = date15.before(date20);
        boolean boolean22 = date11.before(date15);
        date15.setMinutes(749);
        boolean boolean25 = date3.before(date15);
        int int26 = date3.getSeconds();
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date3);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) localDate27);
        org.joda.time.LocalDate.Property property29 = localDate27.dayOfMonth();
        org.joda.time.LocalDate localDate30 = property29.withMaximumValue();
        org.joda.time.LocalDate localDate32 = property29.addWrapFieldToCopy(21469318);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Jan 16 15:40:58 UTC 1970");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jan 16, 1970 3:40:58 PM" + "'", str9, "Jan 16, 1970 3:40:58 PM");
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 14:56:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-895) + "'", int12 == (-895));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2000L + "'", long13 == 2000L);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 02:29:58 UTC 1970");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 58 + "'", int26 == 58);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53635446);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("Temps universel coordonn\351");
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        boolean boolean14 = durationFieldType10.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfEra();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        int int17 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate19 = localDate16.withDayOfWeek(1);
        java.util.Locale locale23 = new java.util.Locale("hi!", "", "");
        java.lang.String str24 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localDate19, locale23);
        java.util.Locale locale29 = new java.util.Locale("hi!", "", "");
        java.lang.String str30 = locale29.getDisplayScript();
        java.util.Locale.setDefault(locale29);
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str33 = locale29.getLanguage();
        java.util.Locale locale36 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        java.lang.String str37 = locale29.getDisplayLanguage(locale36);
        java.lang.String str38 = dateTimeField15.getAsShortText(53647989, locale36);
        java.util.Locale locale42 = new java.util.Locale("hi!", "", "");
        int int43 = dateTimeField15.getMaximumShortTextLength(locale42);
        java.lang.String str44 = locale42.getISO3Language();
        java.lang.String str45 = locale9.getDisplayVariant(locale42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter4.withLocale(locale42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withPivotYear((java.lang.Integer) 53736088);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals(locale36.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "53647989" + "'", str38, "53647989");
        org.junit.Assert.assertEquals(locale42.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime3 = dateTime2.withEarlierOffsetAtOverlap();
        int int4 = dateTime2.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        boolean boolean9 = durationFieldType5.isSupported(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfEra();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate11.withDayOfWeek(1);
        java.util.Locale locale18 = new java.util.Locale("hi!", "", "");
        java.lang.String str19 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDate14, locale18);
        int[] intArray20 = localDate14.getValues();
        org.joda.time.DateTime dateTime21 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = chronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.LocalDate.Property property31 = localDate30.dayOfWeek();
        org.joda.time.LocalDate localDate33 = property31.addToCopy(53647);
        org.joda.time.LocalDate localDate34 = property31.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property36 = localDate35.monthOfYear();
        org.joda.time.LocalDate localDate37 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate39 = property36.addToCopy(53632276);
        org.joda.time.LocalDate.Property property40 = localDate39.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = localDate34.isSupported(dateTimeFieldType41);
        org.joda.time.DateTime.Property property43 = dateTime21.property(dateTimeFieldType41);
        int int44 = dateTime2.get(dateTimeFieldType41);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime46 = dateTime2.minus(readablePeriod45);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022" + "'", str19, "2022");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        java.util.Locale locale2 = new java.util.Locale("years", "Coordinated Universal Time");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        calendar3.clear();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        long long11 = dateTime9.getMillis();
        org.joda.time.DateTime dateTime13 = dateTime9.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, dateTimeZone14);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusSeconds(4);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withYearOfEra(53668064);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime24 = property23.getLocalDateTime();
        boolean boolean25 = calendar3.before((java.lang.Object) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfDay(503);
        int int28 = localDateTime24.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withMillisOfDay(54000895);
        org.junit.Assert.assertEquals(locale2.toString(), "years_COORDINATED UNIVERSAL TIME");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=53758009,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646665418872L + "'", long11 == 1646665418872L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.halfdays();
        org.joda.time.DurationField durationField8 = chronology3.centuries();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(2000L, chronology3);
        org.joda.time.DateTimeField dateTimeField10 = chronology3.dayOfWeek();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale12.getDisplayVariant();
        java.lang.String str14 = dateTimeField10.getAsText(1646664833117L, locale12);
        long long17 = dateTimeField10.add(0L, 53774940);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField10.set(1646664840004L, "0032-05-10T14:59:14.698");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0032-05-10T14:59:14.698\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u661f\u671f\u4e00" + "'", str14, "\u661f\u671f\u4e00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4646154816000000L + "'", long17 == 4646154816000000L);
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusHours(507);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.property(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime19 = property18.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        boolean boolean21 = localDateTime19.isSupported(durationFieldType20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        long long28 = dateTime26.getMillis();
        org.joda.time.DateTime dateTime30 = dateTime26.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime30, dateTimeZone31);
        int int34 = localDateTime33.getHourOfDay();
        int int35 = localDateTime33.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.minus(readableDuration37);
        int int39 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime19.withPeriodAdded(readablePeriod40, 53774744);
        java.lang.Object obj43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(obj43, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property48 = dateTime47.weekyear();
        long long49 = dateTime47.getMillis();
        org.joda.time.DateTime dateTime51 = dateTime47.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime51, dateTimeZone52);
        int int55 = localDateTime54.getYear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.plusWeeks((int) (short) -1);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.weeks();
        java.lang.String str59 = durationFieldType58.toString();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime54.withFieldAdded(durationFieldType58, 53796741);
        boolean boolean62 = localDateTime19.isSupported(durationFieldType58);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime19.minusMinutes(53772415);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646665418899L + "'", long6 == 1646665418899L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1646665418899L + "'", long28 == 1646665418899L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 54218899 + "'", int35 == 54218899);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1646665418899L + "'", long49 == 1646665418899L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "weeks" + "'", str59, "weeks");
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localDateTime64);
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        java.util.Locale locale2 = new java.util.Locale("11:52:24.215", "13:58:05.747");
        org.junit.Assert.assertEquals(locale2.toString(), "11:52:24.215_13:58:05.747");
    }
}
