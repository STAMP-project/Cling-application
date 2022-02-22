import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test21501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21501");
        java.util.Locale locale2 = new java.util.Locale("\u683c\u6797\u5a01\u6cbb\u6642\u9593", "10:31:59.999");
        java.lang.String str3 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593_10:31:59.999");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u6642\u9593 (10:31:59.999)" + "'", str3, "\u683c\u6797\u5a01\u6cbb\u6642\u9593 (10:31:59.999)");
    }

    @Test
    public void test21502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime6 = property4.addToCopy((long) 97);
        org.joda.time.DurationField durationField7 = property4.getDurationField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test21503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekyearOfCentury();
        boolean boolean26 = dateTimeFieldType6.isSupported(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) dateTime2, chronology21);
        org.joda.time.DurationField durationField28 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology21.weekyearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test21504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21504");
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        java.lang.String str8 = durationFieldType7.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.year();
        org.joda.time.DurationField durationField28 = durationFieldType7.getField(chronology23);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property31.setCopy(31);
        org.joda.time.LocalTime localTime35 = property31.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime37 = property31.addCopy(22);
        org.joda.time.LocalTime localTime38 = property31.withMinimumValue();
        org.joda.time.LocalTime localTime39 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property31.roundHalfFloorCopy();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime43.toMutableDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime43.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTime();
        int int49 = dateTime43.getMonthOfYear();
        org.joda.time.DateTime dateTime51 = dateTime43.plus((long) 1970);
        int int52 = dateTime43.getEra();
        int int53 = property31.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology54 = dateTime43.getChronology();
        boolean boolean55 = durationFieldType7.isSupported(chronology54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(5987, 215, 5614561, 0, (-17), 54834, 0, chronology54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -17 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eras" + "'", str8, "eras");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37920000 + "'", int17 == 37920000);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 37920 + "'", int53 == 37920);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test21505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21505");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone1.setID("South Korea");
        timeZone1.setRawOffset(15);
        java.lang.String str6 = timeZone1.getID();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Korea" + "'", str6, "South Korea");
    }

    @Test
    public void test21506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21506");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2011-05-31T11:41:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2011-05-31T11:41:00.000\" is malformed at \"T11:41:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime6 = property3.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test21508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21508");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, 22);
        org.joda.time.DateTime dateTime30 = dateTime28.plusDays(5420956);
        int int31 = dateTime30.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime30.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16864 + "'", int31 == 16864);
        org.junit.Assert.assertNotNull(mutableDateTime32);
    }

    @Test
    public void test21509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21509");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology14.add(readablePeriod19, (long) 32769, 292278993);
        org.joda.time.Chronology chronology23 = chronology14.withUTC();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32769L + "'", long22 == 32769L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test21510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21510");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        int int14 = localDate4.getWeekyear();
        org.joda.time.Chronology chronology15 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        org.joda.time.DurationField durationField19 = chronology15.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.weekyear();
        java.lang.String str21 = dateTimeField20.toString();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 631);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 0, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.plus(readableDuration33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int36 = dateTime34.get(dateTimeFieldType35);
        org.joda.time.DateTime dateTime37 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime34.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType28.getField(chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.weekOfWeekyear();
        java.lang.String str45 = dateTimeField44.getName();
        org.joda.time.ReadablePartial readablePartial46 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType47.getField(chronology48);
        long long52 = dateTimeField49.set((long) 6, "1");
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone54);
        org.joda.time.LocalDate.Property property56 = localDate55.weekOfWeekyear();
        org.joda.time.LocalDate localDate57 = property56.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 0, chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTime dateTime63 = dateTime60.plus(readableDuration62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int65 = dateTime63.get(dateTimeFieldType64);
        boolean boolean66 = localDate57.equals((java.lang.Object) dateTime63);
        int int67 = localDate57.getWeekyear();
        int int68 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDate57);
        org.joda.time.LocalDate.Property property69 = localDate57.yearOfCentury();
        int[] intArray70 = localDate57.getValues();
        int int71 = dateTimeField44.getMinimumValue(readablePartial46, intArray70);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray73 = dateTimeField20.add((org.joda.time.ReadablePartial) localDateTime23, 327735, intArray70, 5981391);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 327735");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[weekyear]" + "'", str21, "DateTimeField[weekyear]");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 37920000 + "'", int36 == 37920000);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "weekOfWeekyear" + "'", str45, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(dateTimeField49);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-37919999L) + "'", long52 == (-37919999L));
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 37920000 + "'", int65 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1970 + "'", int67 == 1970);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 86399999 + "'", int68 == 86399999);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[1969, 12, 29]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test21511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.weekyearOfCentury();
        boolean boolean26 = dateTimeFieldType6.isSupported(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) dateTime2, chronology21);
        org.joda.time.DurationField durationField28 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.dayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test21512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21512");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime localTime14 = localTime10.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime.Property property17 = localTime14.minuteOfHour();
        org.joda.time.LocalTime localTime18 = property17.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test21513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21513");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField10 = localTime8.getField(1);
        org.joda.time.LocalTime localTime12 = localTime8.withMinuteOfHour(50);
        org.joda.time.LocalTime.Property property13 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime15 = property13.addCopy((long) 5509835);
        org.joda.time.LocalTime localTime17 = localTime15.plusMillis(24358224);
        int int18 = localTime17.size();
        org.joda.time.LocalTime.Property property19 = localTime17.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test21514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21514");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime15.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime15.minus(readablePeriod23);
        long long25 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime26 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime28 = localTime26.plusHours(1972);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime31 = localTime28.minusMillis(27);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 632L + "'", long25 == 632L);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test21515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean3 = dateTimeField2.isLenient();
        long long5 = dateTimeField2.roundCeiling((long) 5);
        java.lang.String str7 = dateTimeField2.getAsText(32L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        org.joda.time.LocalDate localDate17 = dateTime10.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.plus(readablePeriod18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        int int21 = localDate19.size();
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        java.lang.String str27 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate19, 53, locale24);
        java.lang.String str28 = locale24.getDisplayVariant();
        boolean boolean29 = locale24.hasExtensions();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5L + "'", long5 == 5L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37920032" + "'", str7, "37920032");
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "53" + "'", str27, "53");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test21516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21516");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.millisOfSecond();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfCentury();
        org.joda.time.DateTime.Property property24 = dateTime22.yearOfCentury();
        org.joda.time.DateTime dateTime25 = property24.roundFloorCopy();
        org.joda.time.DateTime dateTime26 = property24.roundFloorCopy();
        int int27 = property24.getMaximumValue();
        java.util.Locale locale31 = new java.util.Locale("", "South Korea", "1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime36 = localTime33.withFields((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime41 = localTime38.withFields((org.joda.time.ReadablePartial) localTime40);
        int int42 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime38);
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = localTime35.toString("1", locale44);
        java.lang.String str46 = locale31.getDisplayScript(locale44);
        int int47 = property24.getMaximumShortTextLength(locale44);
        java.lang.String str48 = dateTimeField18.getAsShortText(2022, locale44);
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str51 = locale49.getExtension('a');
        java.lang.String str52 = locale49.getScript();
        java.util.Locale locale53 = java.util.Locale.PRC;
        java.lang.String str54 = locale49.getDisplayName(locale53);
        int int55 = dateTimeField18.getMaximumTextLength(locale49);
        int int56 = dateTimeField18.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertEquals(locale31.toString(), "_SOUTH KOREA_1970-01-01");
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2022" + "'", str48, "2022");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str54, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 999 + "'", int56 == 999);
    }

    @Test
    public void test21517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime16.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime23 = dateTime16.minusMillis(100);
        int int24 = dateTime23.getCenturyOfEra();
        int int25 = property12.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DurationField durationField26 = property12.getLeapDurationField();
        org.joda.time.DurationField durationField27 = property12.getLeapDurationField();
        org.joda.time.LocalDate localDate28 = property12.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight29 = localDate28.toDateMidnight();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test21518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21518");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.halfdayOfDay();
        org.joda.time.DurationField durationField32 = chronology28.hours();
        org.joda.time.DateTime dateTime33 = dateTime10.toDateTime(chronology28);
        org.joda.time.DurationField durationField34 = chronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology36 = chronology28.withZone(dateTimeZone35);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = chronology36.add(readablePeriod39, 1L, 37920097);
        java.lang.String str43 = chronology36.toString();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = chronology36.get(readablePeriod44, (long) 5509835);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ISOChronology[UTC]" + "'", str43, "ISOChronology[UTC]");
    }

    @Test
    public void test21519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21519");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-9223372016611199989L));
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = dateTime4.withYear(10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        boolean boolean18 = dateTime10.equals((java.lang.Object) "eras");
        boolean boolean19 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.lang.String str22 = locale21.getScript();
        java.util.Calendar calendar23 = dateTime10.toCalendar(locale21);
        org.joda.time.DateTime.Property property24 = dateTime10.millisOfSecond();
        org.joda.time.DateTime dateTime26 = property24.setCopy((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = instant1.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant1.withDurationAdded(readableDuration29, 53);
        org.joda.time.Instant instant33 = instant31.plus(70L);
        org.joda.time.Instant instant36 = instant33.withDurationAdded((long) 5443066, 41);
        org.joda.time.Chronology chronology37 = instant33.getChronology();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 0, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.DateTime dateTime43 = property41.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime47 = dateTime43.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay48 = dateTime43.toYearMonthDay();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime51 = dateTime43.withDurationAdded(readableDuration49, (int) '#');
        org.joda.time.DateTime dateTime52 = dateTime43.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime54 = dateTime52.minusHours(5482542);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime56 = dateTime52.minus(readablePeriod55);
        org.joda.time.DateTime dateTime58 = dateTime52.plusDays(33);
        int int59 = instant33.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(yearMonthDay48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test21520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21520");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21521");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(11);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.weekyear();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundFloorCopy();
        int int27 = localDateTime26.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test21522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21522");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str6 = nameProvider0.getName(locale2, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime12.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfMonth(2);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Calendar calendar20 = dateTime16.toCalendar(locale19);
        java.lang.String str23 = nameProvider0.getShortName(locale19, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTime dateTime41 = dateTime36.withWeekOfWeekyear((int) (short) 10);
        int int42 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone33);
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.lang.String str46 = dateTimeZone33.getShortName((long) 37920, locale45);
        java.lang.String str49 = nameProvider0.getName(locale45, "1970-01-01", "fr_CA");
        java.lang.String str50 = locale45.getDisplayVariant();
        java.util.Locale.setDefault(locale45);
        java.lang.String str52 = locale45.getISO3Language();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37920000 + "'", int42 == 37920000);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+10:32" + "'", str46, "+10:32");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "eng" + "'", str52, "eng");
    }

    @Test
    public void test21523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property11 = dateTime5.era();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        int int16 = dateTime15.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime21.toMutableDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime21.minus((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime21.withDayOfWeek(4);
        boolean boolean29 = dateTime21.equals((java.lang.Object) "eras");
        boolean boolean30 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int31 = dateTime15.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long36 = dateTimeZone33.adjustOffset((long) 9, true);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime15, dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 0, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTime dateTime44 = dateTime41.plus(readableDuration43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int46 = dateTime44.get(dateTimeFieldType45);
        org.joda.time.DateTime dateTime47 = dateTime44.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime51 = dateTime44.toDateTime(dateTimeZone50);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType38.getField(chronology52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withField(dateTimeFieldType55, 5);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusHours(23);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfYear();
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime();
        boolean boolean64 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 0, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime67.toMutableDateTime(chronology68);
        int int70 = mutableDateTime69.getDayOfWeek();
        org.joda.time.Chronology chronology71 = mutableDateTime69.getChronology();
        int int72 = dateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime69);
        boolean boolean73 = property11.equals((java.lang.Object) mutableDateTime69);
        org.joda.time.DateTime dateTime74 = property11.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 37920 + "'", int31 == 37920);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9L + "'", long36 == 9L);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 37920000 + "'", int46 == 37920000);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(mutableDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTime74);
    }

    @Test
    public void test21524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime2.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(2);
        org.joda.time.DateTime dateTime13 = dateTime11.plus(0L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime16.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime23 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime16.minus(readablePeriod24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime.Property property30 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime31 = property30.roundFloorCopy();
        boolean boolean32 = dateTime25.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime35.minus((long) '#');
        org.joda.time.DateTime dateTime41 = dateTime35.withDayOfWeek(4);
        org.joda.time.DateTime.Property property42 = dateTime35.weekyear();
        org.joda.time.DateTime dateTime44 = dateTime35.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int46 = dateTime44.get(dateTimeFieldType45);
        boolean boolean47 = dateTime31.isSupported(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int51 = dateTimeZone49.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime52 = dateTime31.withZoneRetainFields(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = dateTime13.withZoneRetainFields(dateTimeZone49);
        java.util.Date date55 = new java.util.Date((long) ' ');
        boolean boolean56 = dateTime13.equals((java.lang.Object) ' ');
        boolean boolean57 = dateTime13.isEqualNow();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 0, chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfCentury();
        org.joda.time.DateTime.Property property62 = dateTime60.yearOfCentury();
        org.joda.time.DateTime dateTime63 = property62.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime65 = dateTime63.withYearOfEra(5415578);
        java.util.Date date66 = dateTime63.toDate();
        boolean boolean67 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime63);
        int int68 = dateTime63.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime73 = localTime70.withFields((org.joda.time.ReadablePartial) localTime72);
        org.joda.time.LocalTime localTime75 = localTime70.withMinuteOfHour((int) (short) 10);
        org.joda.time.LocalTime localTime77 = localTime75.withMillisOfDay(37920);
        int[] intArray78 = localTime75.getValues();
        boolean boolean79 = dateTime63.equals((java.lang.Object) localTime75);
        org.joda.time.LocalTime localTime81 = localTime75.minusMillis((-10));
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime53);
// flaky:         org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 13:28:00 GMT 1969");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(intArray78);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[1, 10, 58, 659]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(localTime81);
    }

    @Test
    public void test21525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime8.withCenturyOfEra(1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property15.roundFloorCopy();
        boolean boolean17 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime11.yearOfEra();
        org.joda.time.DateTime dateTime20 = dateTime11.withYearOfEra(5594997);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test21526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21526");
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("");
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale5.getDisplayLanguage(locale8);
        java.util.Set<java.lang.String> strSet11 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str12 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        int int16 = dateTime15.getDayOfMonth();
        int int17 = dateTime15.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime15.getZone();
        boolean boolean19 = strSet11.remove((java.lang.Object) dateTimeZone18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        int int33 = dateTimeField29.getMinimumValue((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.LocalTime localTime35 = localTime31.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property36 = localTime35.minuteOfHour();
        org.joda.time.DateTime dateTime37 = dateTime26.withFields((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 0, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTime(chronology41);
        int int43 = mutableDateTime42.getDayOfWeek();
        org.joda.time.Chronology chronology44 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime26.toMutableDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.weekOfWeekyear();
        java.lang.String str47 = dateTimeField46.getName();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("");
        java.lang.String str54 = locale53.getScript();
        java.lang.String str55 = locale50.getDisplayLanguage(locale53);
        java.lang.String str56 = locale53.getVariant();
        java.lang.String str57 = dateTimeField46.getAsShortText((int) (short) 1, locale53);
        java.lang.String str58 = dateTimeZone18.getName(125999905L, locale53);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(4287725825L, dateTimeZone18);
        long long64 = dateTimeZone18.convertLocalToUTC((long) 5438242, false, 5587332L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int67 = dateTimeZone18.getOffsetFromLocal(1645455715630L);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "weekOfWeekyear" + "'", str47, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1" + "'", str57, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+10:32" + "'", str58, "+10:32");
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-32481758L) + "'", long64 == (-32481758L));
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 37920000 + "'", int67 == 37920000);
    }

    @Test
    public void test21527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21527");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21T01:05:15.374", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21528");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology27 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test21529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21529");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withDefaultYear((-632));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter5.parseMillis("5767-02-22T00:05:53.291");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test21530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21530");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.setCopy(31);
        org.joda.time.LocalTime localTime7 = property3.addWrapFieldToCopy(37920000);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(0L, chronology8);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.DurationField durationField11 = property10.getRangeDurationField();
        org.joda.time.LocalTime localTime13 = property10.setCopy((int) ' ');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test21531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21531");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.centuryOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.minus((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.withDayOfWeek(4);
        org.joda.time.LocalDate localDate31 = dateTime24.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate31.plus(readablePeriod32);
        org.joda.time.LocalDate.Property property34 = localDate33.weekyear();
        org.joda.time.LocalDate localDate35 = property34.withMinimumValue();
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfEra();
        long long38 = chronology18.set((org.joda.time.ReadablePartial) localDate35, (long) 11);
        org.joda.time.DurationField durationField39 = chronology18.months();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 0, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime45.plus(readableDuration47);
        org.joda.time.DateTime dateTime50 = dateTime45.withWeekOfWeekyear((int) (short) 10);
        int int51 = dateTimeZone42.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Chronology chronology52 = chronology18.withZone(dateTimeZone42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(2023, 0, 5965784, 1937, chronology52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-9223372016611199989L) + "'", long38 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 37920000 + "'", int51 == 37920000);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test21532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        java.util.Date date12 = localDate9.toDate();
        int int13 = date12.getTimezoneOffset();
        date12.setDate(562);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Fri Jul 16 00:00:00 GMT 1971");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test21533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime8 = property6.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime12 = dateTime8.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay13 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime8.toMutableDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField33 = chronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.dayOfWeek();
        org.joda.time.DurationField durationField35 = chronology28.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology28.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone38);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = dateTimeField41.getType();
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = dateTimeField41.getAsText(86399999, locale44);
        java.lang.String str46 = locale44.getDisplayCountry();
        int int47 = dateTimeField36.getMaximumTextLength(locale44);
        java.util.Locale.Builder builder48 = builder0.setLocale(locale44);
        java.util.Locale.Builder builder49 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder51 = builder0.addUnicodeLocaleAttribute("2022-02-22T00:05:40.277");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-22T00:05:40.277 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "86399999" + "'", str45, "86399999");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Canada" + "'", str46, "Canada");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test21534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21534");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.halfdayOfDay();
        org.joda.time.DurationField durationField32 = chronology28.hours();
        org.joda.time.DateTime dateTime33 = dateTime10.toDateTime(chronology28);
        org.joda.time.DurationField durationField34 = chronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology36 = chronology28.withZone(dateTimeZone35);
        org.joda.time.Chronology chronology37 = chronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField39 = chronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = chronology28.clockhourOfDay();
        org.joda.time.DurationField durationField41 = chronology28.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
    }

    @Test
    public void test21535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21535");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.weekyearOfCentury();
        boolean boolean20 = dateTimeFieldType0.isSupported(chronology15);
        java.lang.String str21 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfSecond" + "'", str21, "millisOfSecond");
    }

    @Test
    public void test21536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField33 = chronology25.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology25.monthOfYear();
        org.joda.time.DurationField durationField35 = chronology25.weeks();
        org.joda.time.DateTimeField dateTimeField36 = chronology25.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37920000 + "'", int19 == 37920000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test21537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime9 = dateTime2.withFieldAdded(durationFieldType7, (int) ' ');
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.DateTime dateTime22 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime26 = dateTime19.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType13.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.weekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.weekyearOfCentury();
        boolean boolean32 = dateTimeFieldType12.isSupported(chronology27);
        boolean boolean33 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.Chronology chronology34 = dateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int44 = dateTime42.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime45 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime49 = dateTime42.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType36.getField(chronology50);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withField(dateTimeFieldType53, 5);
        int int56 = localDateTime55.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.plusMonths(44940);
        int int59 = localDateTime58.getWeekyear();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plusMinutes((int) (short) 100);
        int int62 = dateTimeField35.getMinimumValue((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.minusDays(3909);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37920000 + "'", int21 == 37920000);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 37920000 + "'", int44 == 37920000);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 22 + "'", int56 == 22);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5767 + "'", int59 == 5767);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(localDateTime64);
    }

    @Test
    public void test21538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        int int8 = dateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.plus((long) 1970);
        org.joda.time.DateTime dateTime12 = dateTime2.withYearOfEra(4);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime2.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond(37694633);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37694633 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test21539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.adjustOffset((long) 9, true);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (short) -1);
        long long11 = dateTimeZone1.nextTransition(126000005L);
        long long15 = dateTimeZone1.convertLocalToUTC(259200000L, false, (long) 5504791);
        long long17 = dateTimeZone1.nextTransition(1196642681343015578L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-37919901L) + "'", long9 == (-37919901L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 126000005L + "'", long11 == 126000005L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 259199900L + "'", long15 == 259199900L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1196642681343015578L + "'", long17 == 1196642681343015578L);
    }

    @Test
    public void test21540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        int int4 = localDate2.getCenturyOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        int int7 = localDate2.indexOf(dateTimeFieldType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        java.lang.String str15 = dateTime13.toString("1970-01-01");
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        int int17 = dateTime13.getSecondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.DateTime dateTime23 = property21.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime27 = dateTime23.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay28 = dateTime23.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime35.toDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType29.getField(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.weekyear();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime23.toMutableDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField48 = chronology43.millisOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField50 = chronology43.weekyear();
        org.joda.time.DateTime dateTime51 = dateTime13.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField52 = chronology43.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long58 = chronology43.getDateTimeMillis((-1801402360000L), 7, 811, 5961593, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 811 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 37920000 + "'", int37 == 37920000);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeField52);
    }

    @Test
    public void test21541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime24.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay29 = dateTime24.toYearMonthDay();
        boolean boolean30 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime24);
        java.util.GregorianCalendar gregorianCalendar31 = dateTime2.toGregorianCalendar();
        java.lang.String str32 = gregorianCalendar31.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]" + "'", str32, "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
    }

    @Test
    public void test21542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.LocalDate localDate15 = property12.withMaximumValue();
        org.joda.time.LocalDate localDate16 = property12.roundHalfEvenCopy();
        int int17 = property12.getLeapAmount();
        org.joda.time.LocalDate localDate18 = property12.getLocalDate();
        boolean boolean19 = property12.isLeap();
        org.joda.time.LocalDate localDate20 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate22 = property12.addToCopy(590733);
        int int23 = localDate22.getDayOfWeek();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test21543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21543");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.addCopy((int) '4');
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        int int9 = dateTimeField8.getMaximumValue();
        int int10 = dateTimeField8.getMaximumValue();
        java.lang.String str11 = dateTimeField8.toString();
        java.util.Locale locale12 = null;
        int int13 = dateTimeField8.getMaximumShortTextLength(locale12);
        org.joda.time.DurationField durationField14 = dateTimeField8.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[secondOfMinute]" + "'", str11, "DateTimeField[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test21544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21544");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.joda.time.DurationField durationField19 = chronology14.weeks();
        org.joda.time.DurationField durationField20 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.hourOfDay();
        org.joda.time.DurationField durationField22 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField23 = chronology14.dayOfMonth();
        int int24 = dateTimeField23.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    public void test21545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21545");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.LocalDate localDate6 = localDate2.withWeekOfWeekyear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate6.getFieldType((int) (byte) 0);
        int int9 = localDate6.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weeks();
        boolean boolean11 = localDate6.isSupported(durationFieldType10);
        org.joda.time.LocalDate localDate13 = localDate6.plusMonths(5416138);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfCentury((int) (byte) 1);
        int int30 = dateTime27.getWeekyear();
        boolean boolean31 = localDate6.equals((java.lang.Object) int30);
        int int32 = localDate6.getEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate6.minus(readablePeriod33);
        org.joda.time.LocalDate localDate36 = localDate34.withYear(52);
        int int37 = localDate36.size();
        java.lang.String str39 = localDate36.toString("86399999");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "86399999" + "'", str39, "86399999");
    }

    @Test
    public void test21546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21546");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long15 = dateTimeZone2.convertLocalToUTC((long) 23, false);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        int int32 = localDate31.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.plus(readableDuration38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        org.joda.time.DateTime dateTime42 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime46 = dateTime39.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType33.getField(chronology47);
        org.joda.time.DateTimeField dateTimeField49 = chronology47.weekyear();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 0, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime53.toMutableDateTime(chronology54);
        org.joda.time.DateTime dateTime57 = dateTime53.minus((long) '#');
        org.joda.time.DateTime dateTime59 = dateTime53.withDayOfWeek(4);
        org.joda.time.LocalDate localDate60 = dateTime53.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDate localDate62 = localDate60.plus(readablePeriod61);
        org.joda.time.LocalDate.Property property63 = localDate62.weekyear();
        org.joda.time.LocalDate localDate64 = property63.withMinimumValue();
        org.joda.time.LocalDate.Property property65 = localDate64.yearOfEra();
        long long67 = chronology47.set((org.joda.time.ReadablePartial) localDate64, (long) 11);
        org.joda.time.LocalDate.Property property68 = localDate64.era();
        org.joda.time.LocalDate localDate69 = localDate31.withFields((org.joda.time.ReadablePartial) localDate64);
        org.joda.time.DateMidnight dateMidnight70 = localDate31.toDateMidnight();
        int int71 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateMidnight70);
        java.util.Date date72 = dateTime16.toDate();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-37919977L) + "'", long15 == (-37919977L));
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37920000 + "'", int24 == 37920000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 37920000 + "'", int41 == 37920000);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-9223372016611199989L) + "'", long67 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(dateMidnight70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(date72);
// flaky:         org.junit.Assert.assertEquals(date72.toString(), "Mon Feb 21 15:07:59 GMT 2022");
    }

    @Test
    public void test21547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21547");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType5.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = chronology19.hours();
        org.joda.time.DurationField durationField24 = chronology19.weeks();
        org.joda.time.DurationField durationField25 = chronology19.weeks();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 100, chronology19);
        org.joda.time.DurationField durationField27 = chronology19.centuries();
        org.joda.time.DateTimeField dateTimeField28 = chronology19.minuteOfDay();
        org.joda.time.DurationField durationField29 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = chronology19.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(5847477, 541, 5613873, (-620), chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5847477 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37920000 + "'", int13 == 37920000);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test21548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        long long7 = dateTimeZone1.convertLocalToUTC(1645455534081L, false, (long) 50);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setScript("");
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale.Builder builder12 = builder10.clear();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("37920100");
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str21 = nameProvider15.getName(locale17, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime27.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime33 = dateTime31.withDayOfMonth(2);
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Calendar calendar35 = dateTime31.toCalendar(locale34);
        java.lang.String str38 = nameProvider15.getShortName(locale34, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 0, chronology40);
        int int42 = dateTime41.getSecondOfMinute();
        org.joda.time.DateTime dateTime44 = dateTime41.withYear(10);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 0, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime47.toMutableDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime47.minus((long) '#');
        org.joda.time.DateTime dateTime53 = dateTime47.withDayOfWeek(4);
        boolean boolean55 = dateTime47.equals((java.lang.Object) "eras");
        boolean boolean56 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime47);
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("");
        java.lang.String str59 = locale58.getScript();
        java.util.Calendar calendar60 = dateTime47.toCalendar(locale58);
        java.lang.String str63 = nameProvider15.getShortName(locale58, "SOUTH KOREA (1970-01-01)", "Chinese (China)");
        java.util.Locale.Builder builder64 = builder12.setLocale(locale58);
        java.util.Locale.Builder builder65 = builder64.clear();
        java.util.Locale.Builder builder67 = builder64.removeUnicodeLocaleAttribute("37920001");
        boolean boolean68 = dateTimeZone1.equals((java.lang.Object) builder67);
        java.util.Locale.Builder builder69 = builder67.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder71 = builder67.setVariant("2024-01-26T01:05:21.206");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2024-01-26T01:05:21.206 [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645455534081L + "'", long7 == 1645455534081L);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(calendar60);
        org.junit.Assert.assertEquals(calendar60.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test21549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillis((long) (short) -1);
        org.joda.time.Instant instant7 = dateTime2.toInstant();
        org.joda.time.DateTime.Property property8 = dateTime2.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property8.addToCopy(1645455781284L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645455781284 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test21550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21550");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime1.property(dateTimeFieldType8);
        java.lang.String str11 = property10.getName();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = property10.getAsShortText(locale12);
        org.joda.time.LocalTime localTime14 = property10.getLocalTime();
        int int15 = property10.getMinimumValueOverall();
        org.joda.time.LocalTime localTime17 = property10.addWrapFieldToCopy(5427565);
        int int18 = property10.getMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        int int23 = dateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime22.withYear(10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime28.toMutableDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.minus((long) '#');
        org.joda.time.DateTime dateTime34 = dateTime28.withDayOfWeek(4);
        boolean boolean36 = dateTime28.equals((java.lang.Object) "eras");
        boolean boolean37 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime28);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("");
        java.lang.String str40 = locale39.getScript();
        java.util.Calendar calendar41 = dateTime28.toCalendar(locale39);
        java.util.TimeZone timeZone42 = calendar41.getTimeZone();
        java.time.ZoneId zoneId43 = timeZone42.toZoneId();
        timeZone42.setRawOffset(14);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        int int48 = dateTimeZone46.getStandardOffset(100L);
        java.lang.String str50 = dateTimeZone46.getName((long) 37330536);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 5436855, dateTimeZone46);
        long long53 = dateTimeZone46.previousTransition(5601051L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((java.lang.Object) property10, dateTimeZone46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfDay" + "'", str11, "millisOfDay");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37920001" + "'", str13, "37920001");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=14,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 37920000 + "'", int48 == 37920000);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+10:32" + "'", str50, "+10:32");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 5601051L + "'", long53 == 5601051L);
    }

    @Test
    public void test21551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.millisOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.millisOfDay();
        org.joda.time.Chronology chronology29 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime21.minusHours(5415578);
        java.util.Date date33 = localDateTime21.toDate();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime21.minusMinutes(343992);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 21 01:06:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test21552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.LocalDate localDate14 = property12.withMinimumValue();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test21553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21553");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645456055840L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTime dateTime9 = dateTime4.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withPeriodAdded(readablePeriod12, 11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        boolean boolean21 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime32 = dateTime27.withYear(11);
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int43 = dateTime40.get(dateTimeFieldType42);
        int int44 = dateTime32.get(dateTimeFieldType42);
        int int45 = dateTime11.get(dateTimeFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = localTime1.get(dateTimeFieldType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 37920000 + "'", int29 == 37920000);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 70 + "'", int43 == 70);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 11 + "'", int44 == 11);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 70 + "'", int45 == 70);
    }

    @Test
    public void test21554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long23 = dateTimeZone20.adjustOffset((long) 9, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2, dateTimeZone20);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.year();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.era();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test21555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21555");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("292275055");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test21556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21556");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean27 = localDateTime21.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds(327735);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.minusHours(37969097);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.withMillisOfDay(14);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test21557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime24.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay29 = dateTime24.toYearMonthDay();
        boolean boolean30 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime32 = dateTime2.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime2.plusSeconds((int) (byte) -1);
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0, chronology37);
        int int39 = dateTime38.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = dateTime38.withYear(10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime44.toMutableDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime44.minus((long) '#');
        org.joda.time.DateTime dateTime50 = dateTime44.withDayOfWeek(4);
        boolean boolean52 = dateTime44.equals((java.lang.Object) "eras");
        boolean boolean53 = dateTime38.isEqual((org.joda.time.ReadableInstant) dateTime44);
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("");
        java.lang.String str56 = locale55.getScript();
        java.util.Calendar calendar57 = dateTime44.toCalendar(locale55);
        java.util.TimeZone timeZone58 = calendar57.getTimeZone();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0, chronology60);
        int int62 = dateTime61.getSecondOfMinute();
        org.joda.time.DateTime dateTime64 = dateTime61.withYear(10);
        org.joda.time.DateTime dateTime66 = dateTime61.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property67 = dateTime61.millisOfSecond();
        org.joda.time.DateTime dateTime69 = dateTime61.plusMillis((int) (byte) 10);
        boolean boolean70 = calendar57.before((java.lang.Object) dateTime69);
        int int71 = dateTime69.getSecondOfDay();
        org.joda.time.DateTime dateTime72 = dateTime69.withEarlierOffsetAtOverlap();
        int int73 = property35.getDifference((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime75 = property35.addWrapFieldToCopy(37583828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 37920 + "'", int71 == 37920);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test21558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21558");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withDurationAdded(readableDuration27, 5436181);
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.minusMonths(5484306);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusYears(5869108);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test21559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21559");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 37920000, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond(5);
        int int6 = localTime5.size();
        org.joda.time.LocalTime localTime8 = localTime5.minusMinutes(37310608);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        int int16 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField20 = localTime18.getField(1);
        org.joda.time.LocalTime localTime22 = localTime18.withMinuteOfHour(50);
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.withMinimumValue();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale27 = java.util.Locale.UK;
        java.lang.String str28 = locale26.getDisplayName(locale27);
        java.lang.String str29 = property23.getAsShortText(locale27);
        java.lang.String str30 = property9.getAsShortText(locale27);
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleKeys();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 5481456);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(5848591);
        boolean boolean36 = strSet31.contains((java.lang.Object) 5848591);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "5" + "'", str30, "5");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test21560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21560");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime24.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime24.toDateTime(dateTimeZone30);
        int int33 = dateTimeZone30.getStandardOffset((long) 9);
        long long35 = dateTimeZone30.convertUTCToLocal(100L);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.plus(readableDuration44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int47 = dateTime45.get(dateTimeFieldType46);
        org.joda.time.DateTime dateTime48 = dateTime45.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime52 = dateTime45.toDateTime(dateTimeZone51);
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType39.getField(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.weekyear();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.halfdayOfDay();
        org.joda.time.DurationField durationField57 = chronology53.hours();
        org.joda.time.DurationField durationField58 = chronology53.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter38.withChronology(chronology53);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter38.withChronology(chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter38.withPivotYear(121);
        boolean boolean64 = dateTimeFormatter63.isParser();
        boolean boolean65 = dateTimeZone30.equals((java.lang.Object) boolean64);
        org.joda.time.DateTime dateTime66 = dateTime18.toDateTime(dateTimeZone30);
        java.lang.String str68 = dateTimeZone30.getName(1645455501950L);
        long long70 = dateTimeZone30.previousTransition(3277600020721000L);
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 37920000 + "'", int26 == 37920000);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37920000 + "'", int33 == 37920000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 37920100L + "'", long35 == 37920100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 37920000 + "'", int47 == 37920000);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+10:32" + "'", str68, "+10:32");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 3277600020721000L + "'", long70 == 3277600020721000L);
        org.junit.Assert.assertNotNull(localDate71);
    }

    @Test
    public void test21561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21561");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.LocalDate localDate18 = localDate2.withYearOfEra(53);
        org.joda.time.LocalDate localDate20 = localDate2.plusMonths((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (byte) 100);
        org.joda.time.LocalDate localDate25 = localDate20.withYear(23);
        org.joda.time.LocalDate localDate27 = localDate20.plusYears(5481456);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readableDuration37);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekOfWeekyear((int) (short) 10);
        int int41 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime40.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.plus(readableDuration44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withPeriodAdded(readablePeriod46, 37920);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.plus(readableDuration53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int56 = dateTime54.get(dateTimeFieldType55);
        org.joda.time.DateTime dateTime57 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime61 = dateTime54.toDateTime(dateTimeZone60);
        int int63 = dateTimeZone60.getStandardOffset((long) 9);
        long long65 = dateTimeZone60.convertUTCToLocal(100L);
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = null;
        org.joda.time.format.DateTimeParser dateTimeParser67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter66, dateTimeParser67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime((long) 0, chronology71);
        org.joda.time.DateTime.Property property73 = dateTime72.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.DateTime dateTime75 = dateTime72.plus(readableDuration74);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int77 = dateTime75.get(dateTimeFieldType76);
        org.joda.time.DateTime dateTime78 = dateTime75.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime82 = dateTime75.toDateTime(dateTimeZone81);
        org.joda.time.Chronology chronology83 = dateTime82.getChronology();
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType69.getField(chronology83);
        org.joda.time.DateTimeField dateTimeField85 = chronology83.weekyear();
        org.joda.time.DateTimeField dateTimeField86 = chronology83.halfdayOfDay();
        org.joda.time.DurationField durationField87 = chronology83.hours();
        org.joda.time.DurationField durationField88 = chronology83.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter68.withChronology(chronology83);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter68.withChronology(chronology90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter93 = dateTimeFormatter68.withPivotYear(121);
        boolean boolean94 = dateTimeFormatter93.isParser();
        boolean boolean95 = dateTimeZone60.equals((java.lang.Object) boolean94);
        org.joda.time.DateTime dateTime96 = dateTime48.toDateTime(dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight97 = localDate27.toDateMidnight(dateTimeZone60);
        org.joda.time.DateTime dateTime98 = localDate27.toDateTimeAtStartOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 37920000 + "'", int41 == 37920000);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 37920000 + "'", int56 == 37920000);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 37920000 + "'", int63 == 37920000);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 37920100L + "'", long65 == 37920100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 37920000 + "'", int77 == 37920000);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(durationField87);
        org.junit.Assert.assertNotNull(durationField88);
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
        org.junit.Assert.assertNotNull(dateTimeFormatter91);
        org.junit.Assert.assertNotNull(dateTimeFormatter93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(dateTime96);
        org.junit.Assert.assertNotNull(dateMidnight97);
        org.junit.Assert.assertNotNull(dateTime98);
    }

    @Test
    public void test21562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21562");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfCentury((int) '4');
        org.joda.time.DateTime.Property property19 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime20 = property19.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test21563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withSecondOfMinute(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readableDuration30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int33 = dateTime31.get(dateTimeFieldType32);
        org.joda.time.DateTime dateTime34 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime38 = dateTime31.toDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType25.getField(chronology39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withField(dateTimeFieldType42, 5);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusHours(23);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfYear();
        org.joda.time.LocalDateTime localDateTime50 = property49.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime52 = property49.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withMillisOfDay((int) (short) 1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.year();
        boolean boolean56 = localDateTime24.equals((java.lang.Object) localDateTime52);
        int int57 = localDateTime24.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37920000 + "'", int33 == 37920000);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test21564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21564");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("53");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays(50);
        int int4 = localDateTime3.getMillisOfSecond();
        org.joda.time.ReadablePartial readablePartial5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withFields(readablePartial5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test21565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21565");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean4 = dateTimeField2.isLeap((long) 9);
        boolean boolean5 = dateTimeField2.isSupported();
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.lang.String str7 = locale6.getDisplayScript();
        int int8 = dateTimeField2.getMaximumShortTextLength(locale6);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale6);
        calendar9.setLenient(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withField(dateTimeFieldType29, 5);
        int int32 = localDateTime28.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minusYears(6);
        org.joda.time.LocalDateTime.Property property35 = localDateTime28.dayOfWeek();
        org.joda.time.DateTime dateTime36 = localDateTime28.toDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime28.plusDays(33);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfWeek();
        boolean boolean40 = calendar9.after((java.lang.Object) localDateTime38);
        int[] intArray41 = localDateTime38.getValues();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645456079502,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=59,MILLISECOND=512,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5999502 + "'", int32 == 5999502);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[2022, 3, 27, 5999502]");
    }

    @Test
    public void test21566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime2.withWeekOfWeekyear(23);
        org.joda.time.Chronology chronology21 = dateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.minuteOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test21567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.LocalDate localDate17 = property12.setCopy("270");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate17.withDayOfWeek(377708);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 377708 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test21568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21568");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        java.util.Locale locale9 = dateTimeFormatter8.getLocale();
        boolean boolean10 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 37920000, dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone13);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test21569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21569");
        java.lang.String[] strArray8 = new java.lang.String[] { "1970-01-01", "millisOfDay", "", "minuteOfDay", "South Korea", "1970-01-01", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("");
        java.lang.String str19 = locale18.getScript();
        java.lang.String str20 = locale15.getDisplayLanguage(locale18);
        java.util.Set<java.lang.String> strSet21 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strSet21);
        boolean boolean23 = strSet9.removeAll((java.util.Collection<java.lang.String>) strSet21);
        java.util.stream.Stream<java.lang.String> strStream24 = strSet9.parallelStream();
        int int25 = strSet9.size();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test21570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21570");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        java.util.Locale locale9 = dateTimeFormatter8.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear((int) 'u');
        org.joda.time.Chronology chronology12 = dateTimeFormatter11.getChronology();
        boolean boolean13 = dateTimeFormatter11.isParser();
        java.util.Locale locale14 = dateTimeFormatter11.getLocale();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test21571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21571");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.clockhourOfDay();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.secondOfDay();
        int int22 = dateTimeField20.getMinimumValue(1645455808076L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test21572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        boolean boolean7 = dateTime6.isAfterNow();
        org.joda.time.DateTime dateTime8 = dateTime6.withLaterOffsetAtOverlap();
        java.util.Date date9 = dateTime8.toDate();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1976");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test21573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21573");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.millisOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = property28.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfMonth(1183);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1183 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test21574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long23 = dateTimeZone20.adjustOffset((long) 9, true);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2, dateTimeZone20);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withCenturyOfEra(6);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.dayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.dayOfMonth();
        org.joda.time.LocalDateTime.Property property32 = localDateTime27.year();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy(373);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(54799544);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54799544 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test21575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21575");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        int int6 = calendar0.getWeeksInWeekYear();
        int int8 = calendar0.getActualMaximum(6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        calendar0.setTimeInMillis((long) 37920097);
        int int12 = calendar0.getFirstDayOfWeek();
        calendar0.setFirstDayOfWeek(1917);
        calendar0.set(37292199, 0, 965, 99, 5488539, 58);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1176766379620798097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1917,minimalDaysInFirstWeek=1,ERA=1,YEAR=37292212,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=33,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=39,SECOND=58,MILLISECOND=107,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test21576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone15);
        org.joda.time.LocalDate.Property property17 = localDate16.weekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.centuryOfEra();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalDate localDate20 = property18.roundFloorCopy();
        org.joda.time.LocalDate localDate21 = property18.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, 37231208);
        org.joda.time.LocalDate.Property property25 = localDate21.yearOfEra();
        org.joda.time.LocalDate localDate27 = property25.addToCopy(778);
        boolean boolean28 = localDate13.equals((java.lang.Object) localDate27);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test21577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks(0);
        org.joda.time.Interval interval12 = localDate9.toInterval();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        int int27 = dateTimeZone24.getStandardOffset((long) 9);
        long long29 = dateTimeZone24.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime32.toMutableDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime32.minus((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime32.withDayOfWeek(4);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfHour();
        org.joda.time.DateTime dateTime41 = dateTime38.withCenturyOfEra(1);
        int int42 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime38);
        long long45 = dateTimeZone24.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime46 = localDate9.toDateTimeAtMidnight(dateTimeZone24);
        int int48 = dateTimeZone24.getOffset((long) 632);
        java.util.TimeZone timeZone49 = dateTimeZone24.toTimeZone();
        timeZone49.setRawOffset(49);
        java.time.ZoneId zoneId52 = timeZone49.toZoneId();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37920000 + "'", int27 == 37920000);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 37920100L + "'", long29 == 37920100L);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37920000 + "'", int42 == 37920000);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 37920000 + "'", int48 == 37920000);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertNotNull(zoneId52);
    }

    @Test
    public void test21578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21578");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.tz.NameProvider nameProvider3 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str9 = nameProvider3.getName(locale5, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime19 = dateTime15.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfMonth(2);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Calendar calendar23 = dateTime19.toCalendar(locale22);
        java.lang.String str26 = nameProvider3.getShortName(locale22, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTime dateTime44 = dateTime39.withWeekOfWeekyear((int) (short) 10);
        int int45 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone36);
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.lang.String str49 = dateTimeZone36.getShortName((long) 37920, locale48);
        java.lang.String str52 = nameProvider3.getName(locale48, "1970-01-01", "fr_CA");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider3);
        java.util.Locale locale56 = new java.util.Locale("13670", "halfdayOfDay");
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        java.lang.String str60 = nameProvider3.getShortName(locale56, "1982-01-07", "1969-12-29");
        java.lang.String str63 = nameProvider0.getName(locale56, "2022-02-21T01:05:57.151", "Feb 21, 2022 3:04:17 PM");
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("2022-02-22T00:05:05.982");
        java.lang.String str68 = nameProvider0.getName(locale65, "Nov 14, 104414 1:05:31 AM", "5767-02-22T00:05:35.898");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 37920000 + "'", int45 == 37920000);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+10:32" + "'", str49, "+10:32");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals(locale56.toString(), "13670_HALFDAYOFDAY");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test21579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21579");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder8 = builder0.setDate(20, (int) 'u', 37920197);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Calendar.Builder builder10 = builder8.setLocale(locale9);
        java.util.Calendar.Builder builder14 = builder10.setDate(37919999, 1, (int) (byte) 0);
        java.util.Calendar.Builder builder18 = builder10.setDate(30, 86399999, 26);
        java.util.Calendar calendar19 = builder18.build();
        java.util.Calendar.Builder builder23 = builder18.setDate(310355, (int) (short) 10, 105);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone24, locale26);
        timeZone24.setID("2022-02-22T00:05:00.504");
        timeZone24.setRawOffset(5440839);
        java.util.Calendar.Builder builder32 = builder23.setTimeZone(timeZone24);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=227153498860799990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7200177,MONTH=9,WEEK_OF_YEAR=44,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=302,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+01:30");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645456079746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"2022-02-22T00:05:00.504\",offset=5440839,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=59,MILLISECOND=756,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test21580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMinutes((int) 'u');
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(4);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        int int18 = dateTime16.getMillisOfSecond();
        org.joda.time.DateTime dateTime20 = dateTime16.plusYears(6);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime23 = dateTime16.withFieldAdded(durationFieldType21, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        org.joda.time.DateTime dateTime36 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime40 = dateTime33.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType27.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.weekyearOfCentury();
        boolean boolean46 = dateTimeFieldType26.isSupported(chronology41);
        boolean boolean47 = dateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.Chronology chronology48 = dateTime25.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.months();
        boolean boolean50 = dateTime13.equals((java.lang.Object) chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.minuteOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 37920000 + "'", int35 == 37920000);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test21581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(70);
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test21582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21582");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        calendar0.set(4, 14);
        java.lang.String str9 = calendar0.getCalendarType();
        int int10 = calendar0.getWeeksInWeekYear();
        calendar0.setTimeInMillis((-1994399360899885L));
        int int13 = calendar0.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(3161970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-1994399360899885,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=61230,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=97,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=31,SECOND=40,MILLISECOND=125,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gregory" + "'", str9, "gregory");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test21583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(540);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test21584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21584");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("37920100");
        org.joda.time.Instant instant3 = instant1.plus(3277245081540945L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology4.getDateTimeMillis(81840097L, 304608, 409, 247, 495);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 304608 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test21585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21585");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Corea del Sud");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test21586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21586");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime21 = dateTime14.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType8.getField(chronology22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withField(dateTimeFieldType25, 5);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(23);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.weekyear();
        org.joda.time.LocalDateTime localDateTime31 = property30.getLocalDateTime();
        int int32 = property30.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField34 = property30.getField();
        org.joda.time.LocalDateTime localDateTime35 = property30.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusHours((-292275054));
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusHours(5436181);
        java.util.Date date41 = new java.util.Date(197L);
        boolean boolean42 = localDateTime39.equals((java.lang.Object) date41);
        org.joda.time.Chronology chronology43 = localDateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.weekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter5.withChronology(chronology43);
        org.joda.time.DateTimeField dateTimeField46 = chronology43.dayOfMonth();
        int int47 = dateTimeField46.getMinimumValue();
        long long49 = dateTimeField46.roundCeiling(1650964353316L);
        int int50 = dateTimeField46.getMinimumValue();
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37920000 + "'", int16 == 37920000);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1651017600000L + "'", long49 == 1651017600000L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test21587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21587");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime2.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = dateTime2.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.plus(readableDuration24);
        org.joda.time.DateTime dateTime27 = dateTime22.withWeekOfWeekyear((int) (short) 10);
        int int28 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone19);
        org.joda.time.DateTime dateTime30 = dateTime9.withZone(dateTimeZone19);
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        boolean boolean38 = dateTimeField36.isLeap((long) 9);
        int int40 = dateTimeField36.getMaximumValue((long) 4);
        int int42 = dateTimeField36.get((long) 59);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = dateTimeField36.getAsText(37231208, locale44);
        java.lang.String str46 = dateTimeField36.getName();
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("+10:32");
        java.lang.String str50 = dateTimeField36.getAsText(5482514, locale49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType51.getField(chronology52);
        org.joda.time.ReadablePartial readablePartial54 = null;
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("");
        java.lang.String str58 = dateTimeField53.getAsShortText(readablePartial54, (int) (byte) 1, locale57);
        java.lang.String str59 = locale49.getDisplayLanguage(locale57);
        java.lang.String str60 = locale32.getDisplayCountry(locale57);
        java.lang.String str61 = dateTimeZone19.getShortName(1645455619291L, locale32);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime(dateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 37920000 + "'", int28 == 37920000);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertNotNull(charSet33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 86399999 + "'", int40 == 86399999);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37920059 + "'", int42 == 37920059);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "37231208" + "'", str45, "37231208");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "millisOfDay" + "'", str46, "millisOfDay");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "5482514" + "'", str50, "5482514");
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1" + "'", str58, "1");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+10:32" + "'", str61, "+10:32");
    }

    @Test
    public void test21588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21588");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate17 = localDate14.minusWeeks(59);
        int int18 = localDate14.getDayOfYear();
        int int19 = localDate14.getDayOfMonth();
        int int20 = localDate14.getDayOfYear();
        org.joda.time.LocalDate localDate22 = localDate14.minusMonths(5442811);
        org.joda.time.LocalDate.Property property23 = localDate22.monthOfYear();
        java.lang.String str24 = localDate22.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-451546-07-22" + "'", str24, "-451546-07-22");
    }

    @Test
    public void test21589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21589");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) 'u');
        org.joda.time.DateTime dateTime20 = dateTime16.minusSeconds(14);
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfMonth(2);
        org.joda.time.DateTime dateTime24 = dateTime16.minus((long) 1980);
        org.joda.time.DateTime dateTime26 = dateTime16.minusMonths(53);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime.Property property28 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime16.plusYears(2);
        org.joda.time.DateTime.Property property31 = dateTime16.monthOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test21590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21590");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((-9223372016611199989L), (-1));
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(5);
        org.joda.time.Chronology chronology24 = dateTime21.getChronology();
        org.joda.time.DateTime.Property property25 = dateTime21.yearOfCentury();
        boolean boolean26 = dateTime21.isBeforeNow();
        org.joda.time.Chronology chronology27 = dateTime21.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test21591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1991);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test21592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21592");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime6 = property4.addNoWrapToCopy(2);
        org.joda.time.LocalTime localTime7 = property4.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.withWeekOfWeekyear((int) (short) 10);
        int int19 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str22 = dateTimeZone10.getShortName(126000005L);
        long long24 = dateTimeZone10.convertUTCToLocal((-37919977L));
        long long27 = dateTimeZone10.adjustOffset((long) 7, true);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(dateTimeZone10);
        org.joda.time.tz.NameProvider nameProvider30 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.lang.String str36 = nameProvider30.getName(locale32, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.DateTime dateTime42 = property40.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime46 = dateTime42.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime48 = dateTime46.withDayOfMonth(2);
        java.util.Locale locale49 = java.util.Locale.FRANCE;
        java.util.Calendar calendar50 = dateTime46.toCalendar(locale49);
        java.lang.String str53 = nameProvider30.getShortName(locale49, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.lang.String str55 = locale54.getDisplayScript();
        java.lang.String str58 = nameProvider30.getShortName(locale54, "2022-02-21T01:05:05.325", "70");
        java.util.Set<java.lang.Character> charSet59 = locale54.getExtensionKeys();
        java.lang.String str60 = dateTimeZone10.getShortName(1645455558063L, locale54);
        java.lang.String str61 = property4.getAsShortText(locale54);
        org.joda.time.DurationField durationField62 = property4.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37920000 + "'", int19 == 37920000);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:32" + "'", str22, "+10:32");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 23L + "'", long24 == 23L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 7L + "'", long27 == 7L);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(nameProvider30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar50);
        org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(charSet59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+10:32" + "'", str60, "+10:32");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "37979097" + "'", str61, "37979097");
        org.junit.Assert.assertNotNull(durationField62);
    }

    @Test
    public void test21593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21593");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        java.lang.Object obj17 = null;
        boolean boolean18 = localDate2.equals(obj17);
        org.joda.time.LocalDate localDate20 = localDate2.minusYears(999);
        org.joda.time.LocalDate.Property property21 = localDate20.dayOfYear();
        org.joda.time.LocalDate.Property property22 = localDate20.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test21594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21594");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        calendar0.set(16, 37920000, (int) (byte) 1, (int) (byte) -1, 0, (-1));
        calendar0.set((int) 'u', 0, 0);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.lang.String str26 = locale25.getScript();
        java.lang.String str27 = locale22.getDisplayLanguage(locale25);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap30);
        java.lang.String[] strArray40 = new java.lang.String[] { "1970-01-01", "millisOfDay", "", "minuteOfDay", "South Korea", "1970-01-01", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.String str51 = locale50.getScript();
        java.lang.String str52 = locale47.getDisplayLanguage(locale50);
        java.util.Set<java.lang.String> strSet53 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strSet53);
        boolean boolean55 = strSet41.removeAll((java.util.Collection<java.lang.String>) strSet53);
        java.lang.String[] strArray59 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = strSet60.isEmpty();
        boolean boolean63 = strSet53.retainAll((java.util.Collection<java.lang.String>) strSet60);
        java.lang.String str64 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet53);
        boolean boolean65 = calendar0.before((java.lang.Object) languageRangeList31);
        boolean boolean66 = calendar0.isWeekDateSupported();
        calendar0.set(292278994, 5427565, 31, 6, 23, 48);
        calendar0.setLenient(true);
        calendar0.setTimeInMillis(50L);
        calendar0.set(5521327, 540, 678);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=5521327,MONTH=540,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=678,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=60,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test21595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21595");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.TAIWAN;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale2);
        java.lang.String str5 = calendar4.getCalendarType();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar4);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear(37530933);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds(732);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645456079937,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=7,SECOND=59,MILLISECOND=947,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test21596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21596");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withField(dateTimeFieldType34, 5);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusHours(23);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.plusDays(86399999);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withDayOfWeek(1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusHours(37214189);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withYearOfCentury(48);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusDays(5645036);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.plus(readablePeriod54);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test21597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21597");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((-9223372016611199989L), (-1));
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(5);
        org.joda.time.Chronology chronology24 = dateTime21.getChronology();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.now(chronology24);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test21598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21598");
        java.util.Date date5 = new java.util.Date(7216, 2, 121, 37969097, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Dec 26 17:10:00 GMT 13447");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test21599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime2.dayOfWeek();
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime2.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis(22);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.parse("1970-01-01");
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime32.toMutableDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime32.minus((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime32.withDayOfWeek(4);
        org.joda.time.LocalDate localDate39 = dateTime32.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.plus(readablePeriod40);
        org.joda.time.LocalDate.Property property42 = localDate41.weekyear();
        org.joda.time.LocalDate localDate43 = property42.withMinimumValue();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfEra();
        long long46 = chronology26.set((org.joda.time.ReadablePartial) localDate43, (long) 11);
        org.joda.time.DateTime dateTime47 = dateTime11.withChronology(chronology26);
        org.joda.time.DateTime.Property property48 = dateTime47.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int57 = dateTime55.get(dateTimeFieldType56);
        org.joda.time.DateTime dateTime58 = dateTime55.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime62 = dateTime55.toDateTime(dateTimeZone61);
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType49.getField(chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.weekyear();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.centuryOfEra();
        org.joda.time.DurationField durationField67 = chronology63.years();
        org.joda.time.DurationField durationField68 = chronology63.years();
        org.joda.time.DateTimeField dateTimeField69 = chronology63.hourOfDay();
        org.joda.time.DateTime dateTime70 = dateTime47.toDateTime(chronology63);
        org.joda.time.DateTimeField dateTimeField71 = chronology63.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime7.toMutableDateTime(chronology63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-9223372016611199989L) + "'", long46 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 37920000 + "'", int57 == 37920000);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
    }

    @Test
    public void test21600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21600");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        calendar0.set(16, 37920000, (int) (byte) 1, (int) (byte) -1, 0, (-1));
        calendar0.set((int) 'u', 0, 0);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean20 = timeZone19.observesDaylightTime();
        calendar0.setTimeZone(timeZone19);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("2022-02-21T01:05:30.347");
        boolean boolean24 = timeZone19.hasSameRules(timeZone23);
        java.time.ZoneId zoneId25 = timeZone23.toZoneId();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone(zoneId25);
        java.time.ZoneId zoneId27 = timeZone26.toZoneId();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone(zoneId27);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=117,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=0,DAY_OF_YEAR=15,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=-1,MINUTE=0,SECOND=-1,MILLISECOND=46,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test21601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21601");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T01:05:29.705");
        org.joda.time.Instant instant3 = instant1.withMillis((long) 5581099);
        org.joda.time.Instant instant6 = instant3.withDurationAdded((long) 5402999, (-473846));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 40440005);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test21602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21602");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime.Property property4 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime2.withMillis((long) (short) -1);
        org.joda.time.DateTime.Property property7 = dateTime2.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.minusWeeks(5419344);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test21603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21603");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(10);
        int int5 = timeZone1.getRawOffset();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.time.ZoneId zoneId8 = timeZone1.toZoneId();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("South Korea");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        timeZone11.setID("-1");
        timeZone11.setID("Thu");
        boolean boolean17 = timeZone1.hasSameRules(timeZone11);
        timeZone1.setRawOffset(5429188);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime24 = localTime21.withFields((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime29 = localTime26.withFields((org.joda.time.ReadablePartial) localTime28);
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime26);
        java.util.Locale locale32 = java.util.Locale.CANADA;
        java.lang.String str33 = localTime23.toString("1", locale32);
        java.util.Set<java.lang.String> strSet34 = locale32.getUnicodeLocaleKeys();
        java.lang.String str35 = locale32.toLanguageTag();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone1, locale32);
        java.time.Instant instant37 = calendar36.toInstant();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645456080063,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=8,SECOND=0,MILLISECOND=73,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en-CA" + "'", str35, "en-CA");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645456080063,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=38,SECOND=29,MILLISECOND=251,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant37);
    }

    @Test
    public void test21604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21604");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy(31);
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime8 = property2.addCopy(22);
        org.joda.time.LocalTime localTime9 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property2.roundFloorCopy();
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.LocalTime.Property property13 = localTime10.property(dateTimeFieldType12);
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property13.setCopy("hours");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hours\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test21605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21605");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMinutes((int) 'u');
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(4);
        java.lang.Object obj14 = null;
        boolean boolean15 = dateTime11.equals(obj14);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property18.setCopy(31);
        org.joda.time.LocalTime localTime22 = property18.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime24 = property18.addWrapFieldToCopy(1969);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime24.minus(readablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean28 = localTime26.isSupported(dateTimeFieldType27);
        boolean boolean29 = dateTime11.isSupported(dateTimeFieldType27);
        int int30 = dateTime11.getDayOfMonth();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test21606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21606");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.dayOfMonth();
        int int26 = property25.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test21607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        org.joda.time.LocalDate localDate12 = property11.withMinimumValue();
        org.joda.time.LocalDate localDate13 = property11.roundCeilingCopy();
        org.joda.time.LocalDate localDate15 = property11.addWrapFieldToCopy(5513416);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test21608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21608");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths(43);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTime dateTime26 = dateTime21.withWeekOfWeekyear((int) (short) 10);
        int int27 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight29 = localDate15.toDateMidnight(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.plus(readableDuration35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int38 = dateTime36.get(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime43 = dateTime36.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType30.getField(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.centuryOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = dateTime50.minus((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.withDayOfWeek(4);
        org.joda.time.LocalDate localDate57 = dateTime50.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDate localDate59 = localDate57.plus(readablePeriod58);
        org.joda.time.LocalDate.Property property60 = localDate59.weekyear();
        org.joda.time.LocalDate localDate61 = property60.withMinimumValue();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfEra();
        long long64 = chronology44.set((org.joda.time.ReadablePartial) localDate61, (long) 11);
        org.joda.time.DurationField durationField65 = chronology44.months();
        org.joda.time.DateTimeField dateTimeField66 = chronology44.year();
        java.lang.String str67 = chronology44.toString();
        org.joda.time.DateTimeField dateTimeField68 = chronology44.minuteOfHour();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((java.lang.Object) localDate15, chronology44);
        java.util.Date date70 = localDate69.toDate();
        date70.setMinutes(37310608);
        date70.setDate(625);
        int int75 = date70.getHours();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37920000 + "'", int27 == 37920000);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 37920000 + "'", int38 == 37920000);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-9223372016611199989L) + "'", long64 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ISOChronology[+10:32]" + "'", str67, "ISOChronology[+10:32]");
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Dec 23 03:28:00 GMT 2038");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
    }

    @Test
    public void test21609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21609");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        java.util.Date date25 = localDateTime23.toDate();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.dayOfWeek();
        int int29 = localDateTime23.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.minus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYearOfEra(3907596);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Jan 03 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test21610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21610");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        int int4 = localDate2.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField6 = localDate2.getField(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate2.plus(readablePeriod7);
        org.joda.time.LocalDate localDate10 = localDate2.plusDays(4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDate2.getFieldTypes();
        org.joda.time.LocalDate localDate13 = localDate2.minusWeeks(103921);
        org.joda.time.Interval interval14 = localDate13.toInterval();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval14);
    }

    @Test
    public void test21611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.seconds();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.minus((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime17.withDayOfWeek(4);
        org.joda.time.LocalDate localDate24 = dateTime17.toLocalDate();
        boolean boolean26 = localDate24.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate28 = localDate24.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone30);
        org.joda.time.LocalDate.Property property32 = localDate31.weekOfWeekyear();
        org.joda.time.LocalDate localDate33 = property32.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        org.joda.time.DateTime dateTime42 = dateTime36.withDayOfWeek(4);
        org.joda.time.LocalDate localDate43 = dateTime36.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate43.plus(readablePeriod44);
        org.joda.time.LocalDate.Property property46 = localDate45.weekyear();
        org.joda.time.LocalDate localDate47 = localDate33.withFields((org.joda.time.ReadablePartial) localDate45);
        int int48 = localDate28.compareTo((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate localDate50 = localDate28.minusWeeks(19);
        long long52 = chronology13.set((org.joda.time.ReadablePartial) localDate28, 32L);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDate localDate54 = localDate28.minus(readablePeriod53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime57.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime57.minus((long) '#');
        org.joda.time.DateTime dateTime63 = dateTime57.withDayOfWeek(4);
        org.joda.time.LocalDate localDate64 = dateTime57.toLocalDate();
        org.joda.time.LocalDate localDate66 = localDate64.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property68 = localDate66.property(dateTimeFieldType67);
        org.joda.time.LocalDate localDate69 = property68.roundCeilingCopy();
        org.joda.time.LocalDate localDate71 = localDate69.withYear(0);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) 0, chronology73);
        org.joda.time.DateTime.Property property75 = dateTime74.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.DateTime dateTime77 = dateTime74.plus(readableDuration76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int79 = dateTime77.get(dateTimeFieldType78);
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType78.getRangeDurationType();
        boolean boolean81 = localDate69.isSupported(dateTimeFieldType78);
        int int82 = localDate28.compareTo((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate.Property property83 = localDate28.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.LocalDate localDate85 = localDate28.plus(readablePeriod84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalDate localDate87 = localDate28.minus(readablePeriod86);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(localDate64);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 37920000 + "'", int79 == 37920000);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localDate85);
        org.junit.Assert.assertNotNull(localDate87);
    }

    @Test
    public void test21612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21612");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 5897775, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21613");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addWrapFieldToCopy((int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property20.getFieldType();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType23.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "monthOfYear" + "'", str24, "monthOfYear");
        org.junit.Assert.assertNotNull(durationFieldType25);
    }

    @Test
    public void test21614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        java.util.Date date9 = dateTime8.toDate();
        date9.setYear((int) (byte) 10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        int int14 = calendar12.getMaximum(11);
        int int16 = calendar12.getActualMinimum(3);
        boolean boolean17 = calendar12.isWeekDateSupported();
        calendar12.set(10, (int) (byte) 10, (-1), 1970, 9, 7);
        java.util.Date date31 = new java.util.Date((int) (short) 100, 4, 37920000, 8, (-1), 1);
        calendar12.setTime(date31);
        java.time.Instant instant33 = calendar12.toInstant();
        java.util.Date date34 = java.util.Date.from(instant33);
        java.util.Date date35 = java.util.Date.from(instant33);
        int int36 = date35.getTimezoneOffset();
        boolean boolean37 = date9.after(date35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 0, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime40.minus((long) '#');
        org.joda.time.DateTime dateTime46 = dateTime40.withDayOfWeek(4);
        org.joda.time.LocalDate localDate47 = dateTime40.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate49 = localDate47.plus(readablePeriod48);
        org.joda.time.LocalDate.Property property50 = localDate49.weekyear();
        int int51 = localDate49.size();
        org.joda.time.LocalDate localDate53 = localDate49.minusYears(37214189);
        org.joda.time.LocalDate localDate55 = localDate53.withWeekOfWeekyear(22);
        int int56 = localDate55.getYearOfCentury();
        org.joda.time.LocalDate.Property property57 = localDate55.yearOfCentury();
        java.util.Date date58 = localDate55.toDate();
        int int59 = date58.getDay();
        int int60 = date58.getSeconds();
        java.util.Date date62 = new java.util.Date((long) (byte) -1);
        java.util.Date date64 = new java.util.Date((long) (byte) -1);
        date64.setTime((long) ' ');
        boolean boolean67 = date62.after(date64);
        long long68 = date64.getTime();
        int int69 = date64.getDay();
        org.joda.time.LocalDate localDate70 = org.joda.time.LocalDate.fromDateFields(date64);
        int int71 = date64.getTimezoneOffset();
        boolean boolean72 = date58.before(date64);
        boolean boolean73 = date9.before(date64);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Dec 31 14:58:29 GMT 1910");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=3277245076111812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=105821,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=6,DAY_OF_YEAR=279,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=59,SECOND=1,MILLISECOND=0,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 23 + "'", int14 == 23);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals(date31.toString(), "Sat Oct 06 07:59:01 GMT 105821");
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Sat Oct 06 07:59:01 GMT 105821");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Oct 06 07:59:01 GMT 105821");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-90) + "'", int36 == (-90));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 19 + "'", int56 == 19);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu May 28 00:00:00 GMT 37212220");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 01:30:29 GMT 1970");
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 01:30:29 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 32L + "'", long68 == 32L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-90) + "'", int71 == (-90));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test21615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21615");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1645455670980L);
        int int2 = localDate1.getDayOfMonth();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("South Korea");
        int int6 = timeZone5.getRawOffset();
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        java.lang.String str9 = localDate1.toString("\u82f1\u6587\u82f1\u56fd)", locale7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((-2L), dateTimeZone11);
        int int13 = dateTime12.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) (short) 10);
        int int25 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(1);
        java.util.Date date30 = dateTime27.toDate();
        boolean boolean31 = dateTime12.equals((java.lang.Object) dateTime27);
        boolean boolean32 = localDate1.equals((java.lang.Object) dateTime12);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime35.minus((long) '#');
        org.joda.time.DateTime.Property property40 = dateTime35.minuteOfHour();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0, chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.plus(readableDuration45);
        org.joda.time.DateTime dateTime48 = dateTime43.withWeekOfWeekyear((int) (short) 10);
        long long49 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime43.withDurationAdded(readableDuration50, 12);
        org.joda.time.DateTime dateTime54 = dateTime43.minus(1645455579933L);
        org.joda.time.DateTime dateTime55 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645456080292,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=8,SECOND=0,MILLISECOND=292,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u82f1\u6587\u82f1\u56fd)" + "'", str9, "\u82f1\u6587\u82f1\u56fd)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Mar 05 01:30:29 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
    }

    @Test
    public void test21616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21616");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.DurationField durationField18 = dateTimeField17.getRangeDurationField();
        long long20 = dateTimeField17.roundHalfEven(1645456040950L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645450080000L + "'", long20 == 1645450080000L);
    }

    @Test
    public void test21617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21617");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("53");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekyear();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test21618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21618");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.LocalDate.Property property35 = localDate31.era();
        java.lang.String str37 = localDate31.toString("1970-01-01");
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 0, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.plus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime40.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime47 = dateTime40.minusMillis(100);
        org.joda.time.DateTime dateTime48 = localDate31.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDate localDate50 = localDate31.withYearOfEra(23);
        org.joda.time.LocalDate localDate52 = localDate50.minusWeeks((-43766));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-9223372016611199989L) + "'", long34 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test21619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2054);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 37663168);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test21620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = localTime3.toString("1", locale12);
        int int14 = localTime3.size();
        int int15 = localTime3.getHourOfDay();
        int int16 = localTime3.getHourOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test21621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21621");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime localTime14 = localTime10.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.minusHours(55);
        org.joda.time.DateTime dateTime21 = dateTime19.withCenturyOfEra(32770);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfHour();
        org.joda.time.DateTime.Property property23 = dateTime21.minuteOfHour();
        java.lang.String str24 = property23.getAsString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "32" + "'", str24, "32");
    }

    @Test
    public void test21622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder6 = builder4.addUnicodeLocaleAttribute("37920100");
        org.joda.time.tz.NameProvider nameProvider7 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.lang.String str13 = nameProvider7.getName(locale9, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime23 = dateTime19.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfMonth(2);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Calendar calendar27 = dateTime23.toCalendar(locale26);
        java.lang.String str30 = nameProvider7.getShortName(locale26, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        int int34 = dateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime36 = dateTime33.withYear(10);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime39.toMutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime39.minus((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.withDayOfWeek(4);
        boolean boolean47 = dateTime39.equals((java.lang.Object) "eras");
        boolean boolean48 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.String str51 = locale50.getScript();
        java.util.Calendar calendar52 = dateTime39.toCalendar(locale50);
        java.lang.String str55 = nameProvider7.getShortName(locale50, "SOUTH KOREA (1970-01-01)", "Chinese (China)");
        java.util.Locale.Builder builder56 = builder4.setLocale(locale50);
        java.util.Locale.Builder builder57 = builder4.clear();
        java.util.Locale.Builder builder58 = builder4.clear();
        java.util.Locale.Builder builder59 = builder4.clear();
        java.util.Locale.Builder builder60 = builder4.clearExtensions();
        java.util.Locale.Builder builder62 = builder60.addUnicodeLocaleAttribute("Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder65 = builder62.setExtension('#', "5767-02-22T00:05:50.397");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(nameProvider7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar27);
        org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(calendar52);
        org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test21623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21623");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        java.util.Date date16 = new java.util.Date((long) (byte) -1);
        date16.setTime((long) ' ');
        date16.setYear((int) 'u');
        int int21 = date16.getMonth();
        boolean boolean22 = localDate13.equals((java.lang.Object) int21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        boolean boolean36 = localDate27.equals((java.lang.Object) dateTime33);
        int int37 = localDate27.getWeekyear();
        boolean boolean38 = localDate13.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate40 = localDate27.withYear((int) ' ');
        org.joda.time.LocalDate localDate42 = localDate27.plusWeeks(5436181);
        java.util.Date date43 = localDate27.toDate();
        int int44 = date43.getDate();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Jan 01 01:30:29 GMT 2017");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 37920000 + "'", int35 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Mon Dec 29 00:00:00 GMT 1969");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 29 + "'", int44 == 29);
    }

    @Test
    public void test21624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21624");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime20 = dateTime16.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfMonth(2);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Calendar calendar24 = dateTime20.toCalendar(locale23);
        boolean boolean25 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime39 = dateTime32.toDateTime(dateTimeZone38);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType26.getField(chronology40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withField(dateTimeFieldType43, 5);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusHours(23);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        org.joda.time.LocalDateTime localDateTime52 = property50.addToCopy((int) (byte) 100);
        java.lang.String str53 = property50.toString();
        org.joda.time.LocalDateTime localDateTime54 = property50.withMinimumValue();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minus(readableDuration55);
        org.joda.time.DateTime dateTime57 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.DateTime.Property property58 = dateTime57.millisOfDay();
        java.lang.String str59 = property58.getAsString();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 37920000 + "'", int34 == 37920000);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Property[dayOfYear]" + "'", str53, "Property[dayOfYear]");
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "3900388" + "'", str59, "3900388");
    }

    @Test
    public void test21625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long4 = dateTimeZone1.adjustOffset((long) 9, true);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        org.joda.time.ReadablePartial readablePartial10 = null;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.lang.String str14 = dateTimeField9.getAsShortText(readablePartial10, (int) (byte) 1, locale13);
        java.lang.String str15 = dateTimeZone1.getShortName(20L, locale13);
        java.util.TimeZone timeZone16 = dateTimeZone1.toTimeZone();
        long long19 = dateTimeZone1.adjustOffset(1645455910794L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455910794L + "'", long19 == 1645455910794L);
    }

    @Test
    public void test21626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21626");
        java.util.Date date1 = new java.util.Date(22L);
        java.util.Date date7 = new java.util.Date(32770, 37969097, 37291000, 37969097, 33);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        date7.setMonth(37417252);
        date7.setYear(5687961);
        boolean boolean13 = date1.before(date7);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 01:30:29 GMT 1970");
        org.junit.Assert.assertEquals(date7.toString(), "Sun May 12 17:33:00 GMT 5689861");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test21627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21627");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder4 = builder2.setLenient(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test21628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21628");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy(31);
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime8 = property2.addCopy(22);
        org.joda.time.LocalTime localTime9 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime15 = localTime13.plusMillis(5511939);
        int int16 = localTime13.getMillisOfSecond();
        org.joda.time.LocalTime.Property property17 = localTime13.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test21629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21629");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        int int18 = dateTime2.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime2.withWeekOfWeekyear(23);
        org.joda.time.Chronology chronology21 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.secondOfMinute();
        org.joda.time.DurationField durationField23 = chronology21.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.millisOfSecond();
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField25.getAsShortText(37920097L, locale27);
        long long30 = dateTimeField25.roundCeiling((long) 453314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920 + "'", int18 == 37920);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "97" + "'", str28, "97");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 453314L + "'", long30 == 453314L);
    }

    @Test
    public void test21630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21630");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime15.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime15.minus(readablePeriod23);
        long long25 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DurationField durationField26 = property9.getLeapDurationField();
        org.joda.time.LocalTime localTime27 = property9.getLocalTime();
        org.joda.time.LocalTime localTime28 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime29 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime31 = localTime29.plusHours((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localTime29.toString("2022-02-22T00:05:46.939");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 632L + "'", long25 == 632L);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test21631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21631");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        long long8 = dateTimeField2.roundCeiling(1L);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale10.getDisplayVariant(locale15);
        int int18 = dateTimeField2.getMaximumTextLength(locale10);
        long long21 = dateTimeField2.getDifferenceAsLong((long) (byte) -1, (long) 70);
        int int23 = dateTimeField2.get((long) 5848591);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-71L) + "'", long21 == (-71L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 43768591 + "'", int23 == 43768591);
    }

    @Test
    public void test21632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21632");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        calendar0.setLenient(true);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        java.lang.String str19 = dateTimeField18.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-50641802399450,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=365,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=82,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=10,SECOND=29,MILLISECOND=738,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[minuteOfHour]" + "'", str19, "DateTimeField[minuteOfHour]");
    }

    @Test
    public void test21633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21633");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) ' ');
        int int2 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime.Property property3 = dateTime1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime1.toYearMonthDay();
        org.joda.time.DateTime.Property property5 = dateTime1.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime1.minusMillis(50400000);
        int int8 = dateTime1.getSecondOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37920 + "'", int2 == 37920);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920 + "'", int8 == 37920);
    }

    @Test
    public void test21634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21634");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        boolean boolean18 = dateTime10.equals((java.lang.Object) "eras");
        int int19 = dateTime10.getWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime10.plusYears((int) (byte) 10);
        int int22 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTime dateTime23 = dateTime10.toDateTime();
        boolean boolean24 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime26 = dateTime6.minusDays(778);
        int int27 = dateTime26.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 632 + "'", int22 == 632);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 73 + "'", int27 == 73);
    }

    @Test
    public void test21635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21635");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTime dateTime20 = dateTime13.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone22);
        int int24 = localDate23.getDayOfMonth();
        int int25 = localDate23.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField27 = localDate23.getField(0);
        org.joda.time.DateTime dateTime28 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean29 = dateTime13.equals((java.lang.Object) dateTime28);
        org.joda.time.DateTime dateTime30 = dateTime13.toDateTime();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        org.joda.time.DateTime dateTime36 = property34.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime40 = dateTime36.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime36.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 0, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime45.plus(readableDuration47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int50 = dateTime48.get(dateTimeFieldType49);
        org.joda.time.DateTime dateTime51 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime55 = dateTime48.toDateTime(dateTimeZone54);
        org.joda.time.Chronology chronology56 = dateTime55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType42.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField58 = chronology56.weekyear();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime36.toMutableDateTime(chronology56);
        org.joda.time.DateTimeField dateTimeField61 = chronology56.millisOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology56.hourOfHalfday();
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.now(chronology56);
        org.joda.time.LocalDate.Property property64 = localDate63.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType65.getRangeDurationType();
        java.lang.String str67 = durationFieldType66.toString();
        boolean boolean68 = localDate63.isSupported(durationFieldType66);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDate localDate70 = localDate63.plus(readablePeriod69);
        org.joda.time.DateTime dateTime71 = dateTime13.withFields((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone73);
        int int75 = localDate74.getDayOfMonth();
        int int76 = localDate74.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField78 = localDate74.getField(0);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDate localDate80 = localDate74.plus(readablePeriod79);
        org.joda.time.LocalDate.Property property81 = localDate80.era();
        org.joda.time.LocalDate localDate83 = localDate80.plusWeeks(342729);
        org.joda.time.LocalDate localDate84 = localDate70.withFields((org.joda.time.ReadablePartial) localDate80);
        org.joda.time.LocalDate.Property property85 = localDate70.yearOfEra();
        org.joda.time.LocalDate.Property property86 = localDate70.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 19 + "'", int25 == 19);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 37920000 + "'", int50 == 37920000);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "days" + "'", str67, "days");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 19 + "'", int76 == 19);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(localDate83);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test21636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21636");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(4);
        org.joda.time.Chronology chronology10 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType15.getField(chronology16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        int int21 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime23 = localTime19.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property24 = localTime23.minuteOfHour();
        org.joda.time.LocalTime localTime26 = property24.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTime dateTime35 = dateTime30.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime37 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime30.minus(readablePeriod38);
        long long40 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.LocalTime localTime41 = property24.withMaximumValue();
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay(632L, chronology42);
        org.joda.time.DateTime dateTime44 = localTime43.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime43.plus(readablePeriod45);
        int int47 = localTime43.getMinuteOfHour();
        org.joda.time.LocalTime localTime49 = localTime43.minusSeconds(292269054);
        int int50 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localTime43);
        int int51 = localTime43.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 632L + "'", long40 == 632L);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 632 + "'", int51 == 632);
    }

    @Test
    public void test21637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21637");
        java.util.Date date1 = new java.util.Date(1645455552039L);
        date1.setDate(346251);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime localTime6 = localTime4.minusMillis((int) (byte) -1);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(19045);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Feb 01 16:29:41 GMT 2970");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test21638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21638");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        int int5 = calendar0.getWeekYear();
        boolean boolean6 = calendar0.isWeekDateSupported();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.eras();
        java.lang.String str8 = durationFieldType7.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField27 = chronology23.year();
        org.joda.time.DurationField durationField28 = durationFieldType7.getField(chronology23);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property31.setCopy(31);
        org.joda.time.LocalTime localTime35 = property31.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime37 = property31.addCopy(22);
        org.joda.time.LocalTime localTime38 = property31.withMinimumValue();
        org.joda.time.LocalTime localTime39 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property31.roundHalfFloorCopy();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime43.toMutableDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime43.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTime();
        int int49 = dateTime43.getMonthOfYear();
        org.joda.time.DateTime dateTime51 = dateTime43.plus((long) 1970);
        int int52 = dateTime43.getEra();
        int int53 = property31.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.Chronology chronology54 = dateTime43.getChronology();
        boolean boolean55 = durationFieldType7.isSupported(chronology54);
        boolean boolean56 = calendar0.before((java.lang.Object) durationFieldType7);
        calendar0.set(37265524, 292275055, 25);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=37265524,MONTH=292275055,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=38,SECOND=29,MILLISECOND=847,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "eras" + "'", str8, "eras");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37920000 + "'", int17 == 37920000);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 37920 + "'", int53 == 37920);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test21639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21639");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.DurationField durationField19 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test21640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21640");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime3.minus(readablePeriod11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        long long18 = dateTimeField15.set((long) 6, "1");
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property21.setCopy(31);
        org.joda.time.LocalTime localTime25 = property21.addWrapFieldToCopy(37920000);
        int int26 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.minusHours(889);
        org.joda.time.LocalTime localTime29 = localTime12.withFields((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime12.minus(readablePeriod30);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime37 = property35.setCopy(31);
        org.joda.time.LocalTime localTime39 = property35.addWrapFieldToCopy(37920000);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology40.add(readablePeriod41, (long) 53, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.weekyearOfCentury();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.DateTime.Property property51 = dateTime50.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.plus(readableDuration52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int55 = dateTime53.get(dateTimeFieldType54);
        org.joda.time.LocalTime.Property property56 = localTime47.property(dateTimeFieldType54);
        java.lang.String str57 = property56.getName();
        java.util.Locale locale58 = java.util.Locale.UK;
        java.lang.String str59 = property56.getAsShortText(locale58);
        org.joda.time.LocalTime localTime60 = property56.getLocalTime();
        org.joda.time.LocalTime localTime61 = property56.roundCeilingCopy();
        org.joda.time.LocalTime localTime63 = property56.addCopy((long) 292278993);
        java.util.Locale locale65 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str66 = dateTimeField45.getAsText((org.joda.time.ReadablePartial) localTime63, 5486272, locale65);
        java.lang.String str67 = localTime31.toString("10:32:00.005", locale65);
        java.util.Locale.setDefault(locale65);
        java.lang.String str69 = locale65.getISO3Country();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-37919999L) + "'", long18 == (-37919999L));
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 86399999 + "'", int26 == 86399999);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 53L + "'", long44 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 37920000 + "'", int55 == 37920000);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "millisOfDay" + "'", str57, "millisOfDay");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "37920001" + "'", str59, "37920001");
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "5486272" + "'", str66, "5486272");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "10:32:00.005" + "'", str67, "10:32:00.005");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CHN" + "'", str69, "CHN");
    }

    @Test
    public void test21641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21641");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean20 = calendar0.after((java.lang.Object) property17);
        int int21 = property17.get();
        org.joda.time.DateTime dateTime22 = property17.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property17.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.plus(readableDuration29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime37 = dateTime30.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType24.getField(chronology38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withField(dateTimeFieldType41, 5);
        int int44 = localDateTime43.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusMonths(44940);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekOfWeekyear();
        java.util.Calendar.Builder builder48 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder52 = builder48.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder56 = builder48.setDate(37920000, (-1), 37920);
        java.util.Locale locale57 = java.util.Locale.CANADA;
        java.lang.String str58 = locale57.getDisplayScript();
        java.util.Calendar.Builder builder59 = builder56.setLocale(locale57);
        java.util.Locale locale60 = locale57.stripExtensions();
        java.lang.String str61 = property47.getAsText(locale60);
        java.util.Set<java.lang.Character> charSet62 = locale60.getExtensionKeys();
        int int63 = property17.getMaximumTextLength(locale60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime65 = property17.setCopy("2022-02-22T00:05:38.781");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T00:05:38.781\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=365,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=1970,MINUTE=10,SECOND=29,MILLISECOND=908,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 70 + "'", int21 == 70);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 37920000 + "'", int32 == 37920000);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "8" + "'", str61, "8");
        org.junit.Assert.assertNotNull(charSet62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test21642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21642");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean20 = calendar0.after((java.lang.Object) property17);
        org.joda.time.DateTime dateTime21 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.plus(1645455633000L);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.minus(readablePeriod24);
        org.joda.time.Chronology chronology26 = dateTime23.getChronology();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=5429188,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=365,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=1970,MINUTE=10,SECOND=29,MILLISECOND=925,ZONE_OFFSET=5429188,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test21643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21643");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((-9223372016611199989L));
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = dateTime4.withYear(10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        boolean boolean18 = dateTime10.equals((java.lang.Object) "eras");
        boolean boolean19 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("");
        java.lang.String str22 = locale21.getScript();
        java.util.Calendar calendar23 = dateTime10.toCalendar(locale21);
        org.joda.time.DateTime.Property property24 = dateTime10.millisOfSecond();
        org.joda.time.DateTime dateTime26 = property24.setCopy((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = instant1.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant1.withDurationAdded(readableDuration29, 53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant33 = instant31.minus(19880632624692L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -9223372016611199989 + -19880632624692");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test21644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21644");
        java.util.Date date1 = new java.util.Date((long) 638);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 01:30:29 GMT 1970");
    }

    @Test
    public void test21645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3117);
        long long3 = dateTimeZone1.previousTransition((long) 101834);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101834L + "'", long3 == 101834L);
    }

    @Test
    public void test21646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21646");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 22896071L, 336973);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21647");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(24L);
        long long2 = instant1.getMillis();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.minus(readableDuration3);
        long long5 = instant1.getMillis();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24L + "'", long5 == 24L);
    }

    @Test
    public void test21648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21648");
        java.util.Date date6 = new java.util.Date(50, 40, 5452468, (int) (short) 100, (int) (short) -1, 24);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.LocalDate localDate9 = localDate7.minusDays(5590967);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate7.withEra((-5458174));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5458174 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Mon Sep 08 03:59:24 GMT 16881");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test21649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test21649");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder8 = builder0.setDate(37920000, (-1), 37920);
        java.util.Calendar.Builder builder12 = builder8.setDate(37273589, 86399999, 0);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone14);
        java.lang.String str17 = timeZone14.getID();
        java.lang.String str18 = timeZone14.getID();
        java.util.TimeZone.setDefault(timeZone14);
        java.util.Calendar.Builder builder20 = builder12.setTimeZone(timeZone14);
        java.util.Locale locale24 = new java.util.Locale("", "South Korea", "1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime29 = localTime26.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime34 = localTime31.withFields((org.joda.time.ReadablePartial) localTime33);
        int int35 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime31);
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = localTime28.toString("1", locale37);
        java.lang.String str39 = locale24.getDisplayScript(locale37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = property43.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime49 = dateTime45.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime51 = dateTime49.withDayOfMonth(2);
        java.util.Locale locale52 = java.util.Locale.FRANCE;
        java.util.Calendar calendar53 = dateTime49.toCalendar(locale52);
        java.lang.String str54 = locale24.getDisplayLanguage(locale52);
        java.util.Set<java.lang.String> strSet55 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str56 = locale24.toLanguageTag();
        java.util.Locale locale57 = java.util.Locale.ITALY;
        java.util.Locale locale61 = new java.util.Locale("Greenwich Mean Time", "ISOChronology[+10:32]", "en_CA");
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType62.getField(chronology63);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property67 = localTime66.secondOfMinute();
        int int68 = dateTimeField64.getMinimumValue((org.joda.time.ReadablePartial) localTime66);
        boolean boolean69 = dateTimeField64.isSupported();
        long long72 = dateTimeField64.add((long) 631, 1645455491851L);
        java.util.Locale locale74 = new java.util.Locale("37920001");
        int int75 = dateTimeField64.getMaximumShortTextLength(locale74);
        java.lang.String str76 = locale61.getDisplayLanguage(locale74);
        java.lang.String str77 = locale57.getDisplayLanguage(locale61);
        java.util.Set<java.lang.String> strSet78 = locale61.getUnicodeLocaleKeys();
        boolean boolean79 = locale61.hasExtensions();
        java.lang.String str80 = locale24.getDisplayName(locale61);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone14, locale24);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645456080815,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=8,SECOND=0,MILLISECOND=815,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GMT" + "'", str17, "GMT");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GMT" + "'", str18, "GMT");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals(locale24.toString(), "_SOUTH KOREA_1970-01-01");
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar53);
        org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "und" + "'", str56, "und");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale61.toString(), "greenwich mean time_ISOCHRONOLOGY[+10:32]_en_CA");
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1645455492482L + "'", long72 == 1645455492482L);
        org.junit.Assert.assertEquals(locale74.toString(), "37920001");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "greenwich mean time" + "'", str76, "greenwich mean time");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Italian" + "'", str77, "Italian");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "SOUTH KOREA (1970-01-01)" + "'", str80, "SOUTH KOREA (1970-01-01)");
        org.junit.Assert.assertNotNull(calendar81);
// flaky:         org.junit.Assert.assertEquals(calendar81.toString(), "java.util.GregorianCalendar[time=1645456080816,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=8,SECOND=0,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
    }
}
