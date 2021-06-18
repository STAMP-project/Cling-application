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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        java.lang.String str6 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12" + "'", str3, "12");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        boolean boolean5 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime12.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime12.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property2.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "664" + "'", str4, "664");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272834354L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDateTime11.toString(dateTimeFormatter12);
        java.lang.String str14 = localDateTime11.toString();
        int int15 = localDateTime11.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus(readableDuration16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        long long19 = property18.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "744" + "'", str6, "744");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10071-10-20T05:52:07.098" + "'", str13, "10071-10-20T05:52:07.098");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10071-10-20T05:52:07.098" + "'", str14, "10071-10-20T05:52:07.098");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 21127098L + "'", long19 == 21127098L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusMonths((int) (short) 0);
        int int10 = localDateTime9.getWeekyear();
        java.lang.String str12 = localDateTime9.toString("953");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1901 + "'", int10 == 1901);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "953" + "'", str12, "953");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withHourOfDay(11);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks(10440316);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minus(readablePeriod10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime6.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.DurationField durationField27 = property25.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property25.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property2.getLocalDateTime();
        java.lang.String str11 = localDateTime9.toString("466");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime9.toDateTime(dateTimeZone12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "30" + "'", str6, "30");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "466" + "'", str11, "466");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMillis(342);
        int int6 = localDateTime5.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withPeriodAdded(readablePeriod7, 337);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        int int25 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime11.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime11.withPeriodAdded(readablePeriod27, 100);
        int int30 = localDateTime29.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMillis(0);
        java.util.Date date38 = localDateTime37.toDate();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromDateFields(date38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime29.withFields((org.joda.time.ReadablePartial) localDateTime39);
        java.lang.String str43 = localDateTime39.toString("950");
        int int44 = localDateTime39.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime45, chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMillis(20);
        boolean boolean50 = localDateTime39.isAfter((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = localDateTime51.toString(dateTimeFormatter52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.year();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.withFields((org.joda.time.ReadablePartial) localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 58 + "'", int17 == 58);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:58:13 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "950" + "'", str43, "950");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 48 + "'", int44 == 48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2020-11-25T02:58:13.084" + "'", str53, "2020-11-25T02:58:13.084");
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        boolean boolean7 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundCeilingCopy();
        int int9 = localDateTime8.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMillisOfDay(10475022);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readableDuration12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime1.getFields();
        int int5 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMonths(292278993);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime9.getMinuteOfHour();
        int int16 = localDateTime9.getYearOfCentury();
        int int17 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.era();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withCenturyOfEra(0);
        int int31 = localDateTime25.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withCenturyOfEra(0);
        int int39 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime.Property property40 = localDateTime25.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime25.withPeriodAdded(readablePeriod41, 100);
        int int44 = localDateTime25.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime25.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfSecond();
        boolean boolean57 = localDateTime46.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        boolean boolean58 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.secondOfMinute();
        java.lang.String str62 = property61.getAsString();
        org.joda.time.DurationField durationField63 = property61.getDurationField();
        org.joda.time.LocalDateTime localDateTime64 = property61.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minus(readablePeriod65);
        org.joda.time.DurationFieldType durationFieldType67 = null;
        boolean boolean68 = localDateTime66.isSupported(durationFieldType67);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(100L);
        int int71 = localDateTime70.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.era();
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(100L);
        int int75 = localDateTime74.getSecondOfMinute();
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime70.withFields((org.joda.time.ReadablePartial) localDateTime74);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime81 = property80.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusSeconds((int) (byte) 100);
        int int84 = localDateTime81.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property85 = localDateTime81.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property85.getFieldType();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime74.withField(dateTimeFieldType86, 10);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime66.withField(dateTimeFieldType86, 10473582);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime23.withField(dateTimeFieldType86, 10466854);
        boolean boolean93 = localDateTime9.isSupported(dateTimeFieldType86);
        int int94 = localDateTime1.get(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 58 + "'", int15 == 58);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 377 + "'", int17 == 377);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 58 + "'", int31 == 58);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2020 + "'", int44 == 2020);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "13" + "'", str62, "13");
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 291 + "'", int94 == 291);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusYears((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDateTime5.isSupported(durationFieldType8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.weekOfWeekyear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10693599 + "'", int2 == 10693599);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property2.getFieldType();
        java.lang.String str17 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[millisOfSecond]" + "'", str17, "Property[millisOfSecond]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(858);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.plusYears(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withMonthOfYear(10663882);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10663882 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology40 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime29.minusMonths(568);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localDateTime42.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField45 = localDateTime42.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10693727 + "'", int2 == 10693727);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:13.727" + "'", str6, "2011-11-25T02:58:13.727");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        int int11 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime13.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime25 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime24);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusYears(10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withDayOfYear(48);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13" + "'", str3, "13");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        java.lang.String str4 = localDateTime1.toString("685");
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "685" + "'", str4, "685");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        java.lang.String str9 = property2.getName();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsShortText(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "47" + "'", str11, "47");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("387");
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDateTime3.getFields();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusDays((int) (short) 10);
        boolean boolean9 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property10 = localDateTime3.secondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusYears((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDateTime5.isSupported(durationFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.secondOfMinute();
        java.lang.String str13 = property12.getAsString();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localDateTime17.isSupported(durationFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusSeconds((int) (byte) 100);
        int int35 = localDateTime32.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime25.withField(dateTimeFieldType37, 10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime17.withField(dateTimeFieldType37, 10473582);
        boolean boolean42 = localDateTime5.isSupported(dateTimeFieldType37);
        org.joda.time.LocalDateTime.Property property43 = localDateTime5.dayOfMonth();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10694159 + "'", int2 == 10694159);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "14" + "'", str13, "14");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime(dateTimeZone2);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime1.getFields();
        int int5 = localDateTime1.getMillisOfSecond();
        java.util.Locale locale7 = null;
        java.lang.String str8 = localDateTime1.toString("484", locale7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "484" + "'", str8, "484");
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        int int3 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMonths(100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.dayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime6.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime6.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime18 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime4.minus(readablePeriod19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusDays(0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withYearOfCentury(9);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime9.withYear(544);
        java.util.Locale locale21 = null;
        java.lang.String str22 = localDateTime9.toString("38", locale21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime9.plusHours(10572373);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "38" + "'", str22, "38");
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMillis(10442665);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withMillisOfDay(20);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        long long20 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime21 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField22 = property5.getField();
        java.lang.String str23 = property5.getAsString();
        int int24 = property5.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-6940L) + "'", long20 == (-6940L));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.addWrapFieldToCopy(0);
        int int9 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10441839);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusSeconds((int) '4');
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        int int9 = property2.getMinimumValue();
        org.joda.time.DurationField durationField10 = property2.getDurationField();
        org.joda.time.DurationField durationField11 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "623" + "'", str6, "623");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMillis(342);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        boolean boolean18 = property2.equals((java.lang.Object) "2011-11-25T02:55:39.964");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "671" + "'", str6, "671");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusYears(10595912);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, 10485801);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        int int9 = localDateTime8.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(10440316);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:14 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10694770 + "'", int9 == 10694770);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusDays(10481886);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withPeriodAdded(readablePeriod15, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfYear(19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        int int19 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273094753L + "'", long16 == 1606273094753L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDateTime localDateTime14 = property2.setCopy("970");
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.era();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100L);
        int int38 = localDateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusSeconds((int) (byte) 100);
        int int47 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime37.withField(dateTimeFieldType49, 10);
        int int52 = localDateTime31.get(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime17.withField(dateTimeFieldType49, 0);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime17.minusMinutes(0);
        boolean boolean57 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = localDateTime14.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "903" + "'", str6, "903");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2020 + "'", int52 == 2020);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withSecondOfMinute(10645801);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10645801 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14" + "'", str3, "14");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 10440316);
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withDayOfWeek(25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:15.069" + "'", str10, "2001-11-25T02:58:15.069");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = property9.setCopy(10561614);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekyear(21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfCentury(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1900" + "'", str10, "1900");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        java.lang.Class<?> wildcardClass16 = localDateTime15.getClass();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10535036, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) 'a');
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusYears(10630818);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        int int5 = localDateTime3.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 329 + "'", int5 == 329);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDateTime11.isSupported(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:15 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.hourOfDay();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(25);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(28, 11, 52, 10591595, 377, (int) (byte) -1, 79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10591595 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
        int int2 = localDateTime1.getWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) "728", dateTimeZone1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMonths(11);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(100L);
        int int31 = localDateTime30.getSecondOfMinute();
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime();
        long long33 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        int int51 = property28.compareTo((org.joda.time.ReadableInstant) dateTime48);
        int int52 = property22.compareTo((org.joda.time.ReadableInstant) dateTime48);
        int int53 = property7.getDifference((org.joda.time.ReadableInstant) dateTime48);
        int int54 = property7.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime55 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 11651L + "'", long33 == 11651L);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273095774L + "'", long50 == 1606273095774L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 50 + "'", int53 == 50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 292278993 + "'", int54 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272834354L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        int int25 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime11.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime11.withPeriodAdded(readablePeriod27, 100);
        int int30 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime11.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime40);
        int int42 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.dayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "41" + "'", str6, "41");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 58 + "'", int17 == 58);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2020 + "'", int30 == 2020);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime1.minusMonths((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withSecondOfMinute(24);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime1.withEra(148);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 148 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMinutes(35);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths(30);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusHours(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays(10519633);
        java.lang.String str19 = localDateTime18.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-26781-02-13T02:58:16.261" + "'", str19, "-26781-02-13T02:58:16.261");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        int int8 = localDateTime5.getEra();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withFieldAdded(durationFieldType9, 1006938675);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        int int10 = property9.getMaximumValueOverall();
        int int11 = property9.getLeapAmount();
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeField dateTimeField14 = property9.getField();
        org.joda.time.Interval interval15 = property9.toInterval();
        int int16 = property9.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy((long) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withCenturyOfEra(0);
        int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime24);
        int int32 = localDateTime24.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withCenturyOfEra(0);
        int int40 = localDateTime34.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withCenturyOfEra(0);
        int int48 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime.Property property49 = localDateTime34.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime34.withPeriodAdded(readablePeriod50, 100);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant56 = null;
        int int57 = property55.getDifference(readableInstant56);
        long long58 = property55.remainder();
        org.joda.time.LocalDateTime localDateTime59 = property55.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(100L);
        int int62 = localDateTime61.getSecondOfMinute();
        org.joda.time.DateTime dateTime63 = localDateTime61.toDateTime();
        org.joda.time.DateTime dateTime64 = localDateTime59.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime65 = localDateTime52.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime66 = localDateTime24.toDateTime((org.joda.time.ReadableInstant) dateTime64);
        int int67 = property7.getDifference((org.joda.time.ReadableInstant) dateTime66);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 58 + "'", int40 == 58);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMonths(10546802);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology4);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("46");
        java.lang.String str2 = localDateTime1.toString();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0046-01-01T00:00:00.000" + "'", str2, "0046-01-01T00:00:00.000");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.Chronology chronology4 = localDateTime3.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusSeconds(476);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property2.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy(376);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16" + "'", str3, "16");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        java.lang.String str5 = property2.getAsText();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        int int16 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withYear(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 10443559, chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property24 = localDateTime11.property(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "866" + "'", str4, "866");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "866" + "'", str5, "866");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "866" + "'", str6, "866");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:16 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(10424228);
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(10443559);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(10654710);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withWeekyear(10168000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273096881L + "'", long16 == 1606273096881L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDurationAdded(readableDuration3, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfYear(329);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears(10485801);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusMinutes(10528442);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withSecondOfMinute(10638070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10638070 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272836594L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMonthOfYear((int) (short) 1);
        boolean boolean14 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        int int15 = localDateTime2.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.plus(readablePeriod16);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:17 UTC 2020");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10436594 + "'", int15 == 10436594);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272834354L);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withCenturyOfEra(291);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "171" + "'", str6, "171");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDateTime7.isSupported(durationFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(100L);
        int int16 = localDateTime15.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds((int) (byte) 100);
        int int25 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime15.withField(dateTimeFieldType27, 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime7.withField(dateTimeFieldType27, 10473582);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime7.withMinuteOfHour(10668982);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10668982 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = localDateTime4.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plus(readablePeriod6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.LocalDateTime localDateTime10 = property7.withMinimumValue();
        java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        int int5 = localDateTime4.getYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusYears(784);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusMillis(342);
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        int int19 = property2.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "388" + "'", str6, "388");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "388" + "'", str8, "388");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = property2.getFieldType();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.hourOfDay();
        java.lang.String str26 = property25.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Property[hourOfDay]" + "'", str26, "Property[hourOfDay]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("879");
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        boolean boolean18 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusDays(54);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfDay(100);
        boolean boolean29 = localDateTime17.equals((java.lang.Object) localDateTime25);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime17.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime17.plusYears(10443559);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        long long52 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DurationField durationField53 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273097569L + "'", long50 == 1606273097569L);
        org.junit.Assert.assertNotNull(dateTime51);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1606273097568L + "'", long52 == 1606273097568L);
        org.junit.Assert.assertNotNull(durationField53);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.secondOfMinute();
        java.lang.String str27 = property26.getAsString();
        org.joda.time.DurationField durationField28 = property26.getDurationField();
        org.joda.time.LocalDateTime localDateTime29 = property26.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime42.withCenturyOfEra(0);
        int int48 = localDateTime42.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withCenturyOfEra(0);
        int int56 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime40.withFields((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime40.minus(readablePeriod58);
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.minusDays(376);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "17" + "'", str27, "17");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 58 + "'", int48 == 58);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(localDateTime63);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) "10071-10-20T05:50:07.226");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMillis(342);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusYears(10466854);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        boolean boolean9 = localDateTime1.isSupported(durationFieldType8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272836594L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMonthOfYear((int) (short) 1);
        boolean boolean14 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        java.lang.String str15 = localDateTime2.toString();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.withYear(593);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime2.plusWeeks(13);
        int int20 = localDateTime2.getYear();
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:18 UTC 2020");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T02:53:56.594" + "'", str15, "2020-11-25T02:53:56.594");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury(21);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime6.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime6.getFieldType(10535036);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10535036");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        java.util.Date date7 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Nov 25 02:58:18 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(20);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withPeriodAdded(readablePeriod5, 12);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean21 = localDateTime12.isAfter((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property22 = localDateTime15.era();
        int int23 = localDateTime15.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(375, 7, 376, 10526854, 10580902, 48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10526854 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime29.withHourOfDay(0);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime29.withDurationAdded(readableDuration42, 161);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plus(readableDuration45);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10698403 + "'", int2 == 10698403);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:18.403" + "'", str6, "2011-11-25T02:58:18.403");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(10424228);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        java.lang.String str24 = localDateTime20.toString("433");
        int int25 = localDateTime20.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withEra(10168000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10168000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273098373L + "'", long16 == 1606273098373L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "433" + "'", str24, "433");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 28 + "'", int25 == 28);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear(10523665);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusYears(10477381);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusDays(10442665);
        int int15 = localDateTime14.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfSecond((int) 'a');
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        int int9 = localDateTime5.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "18" + "'", str3, "18");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusWeeks(70);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.era();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds((int) (byte) 100);
        int int23 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime13.withField(dateTimeFieldType25, 10);
        int int28 = localDateTime1.get(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(3);
        int int12 = localDateTime9.getYearOfEra();
        boolean boolean13 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.plus(readableDuration14);
        int[] intArray16 = localDateTime15.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2020, 11, 25, 10698765]");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withSecondOfMinute(291);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 291 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:18 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        boolean boolean8 = property7.isLeap();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusDays((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusMillis(10622104);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfDay(100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        java.util.Locale locale11 = null;
        java.lang.String str12 = localDateTime9.toString("659", locale11);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10698924 + "'", int2 == 10698924);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "659" + "'", str12, "659");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 10440316);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 784);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        java.lang.String str5 = property2.getAsText();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        int int16 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withYear(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = localDateTime18.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -961 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "39" + "'", str4, "39");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "39" + "'", str5, "39");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "39" + "'", str6, "39");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:19 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusWeeks(10433438);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.plusMillis(10477381);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.plusWeeks(10565113);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272828765L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths((int) (byte) 0);
        int int5 = localDateTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10428765 + "'", int5 == 10428765);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(858);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withWeekyear(342);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime18.property(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 16, 0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        boolean boolean19 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273099333L + "'", long16 == 1606273099333L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withCenturyOfEra(0);
        int int27 = localDateTime21.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withCenturyOfEra(0);
        int int35 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime19.minus(readablePeriod37);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        java.lang.String str40 = localDateTime38.toString();
        boolean boolean41 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "569" + "'", str6, "569");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 58 + "'", int27 == 58);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(chronology39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0020-11-25T02:58:19.569" + "'", str40, "0020-11-25T02:58:19.569");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusDays(10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        long long10 = property7.remainder();
        java.lang.String str11 = property7.getAsShortText();
        org.joda.time.DurationField durationField12 = property7.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime13 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property7.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(3);
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime19 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "690" + "'", str11, "690");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(3);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour((int) '4');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = property14.getDifference(readableInstant15);
        long long17 = property14.remainder();
        java.lang.String str18 = property14.getAsShortText();
        org.joda.time.DurationField durationField19 = property14.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime20 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.year();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minus(readablePeriod22);
        int int24 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.minuteOfHour();
        java.util.Locale locale36 = null;
        int int37 = property35.getMaximumTextLength(locale36);
        org.joda.time.LocalDateTime localDateTime38 = property35.roundHalfFloorCopy();
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime30, chronology39);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 50, chronology39);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime23, chronology39);
        int int45 = localDateTime23.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "783" + "'", str18, "783");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 25 + "'", int45 == 25);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMillis(342);
        int int6 = localDateTime5.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withPeriodAdded(readablePeriod7, 337);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        int int25 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime11.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime11.withPeriodAdded(readablePeriod27, 100);
        int int30 = localDateTime29.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMillis(0);
        java.util.Date date38 = localDateTime37.toDate();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromDateFields(date38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime29.withFields((org.joda.time.ReadablePartial) localDateTime39);
        java.lang.String str43 = localDateTime39.toString("950");
        int int44 = localDateTime39.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime45, chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMillis(20);
        boolean boolean50 = localDateTime39.isAfter((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime.Property property52 = localDateTime47.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField54 = localDateTime47.getField(3397);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3397");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 58 + "'", int17 == 58);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:58:19 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "950" + "'", str43, "950");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 48 + "'", int44 == 48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withHourOfDay(11);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(112);
        java.util.Date date10 = localDateTime7.toDate();
        int int11 = localDateTime7.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 11:58:20 UTC 2020");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMillis(10442665);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusWeeks(10424228);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.minus(readablePeriod16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withDurationAdded(readableDuration18, 10691104);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.Interval interval5 = property2.toInterval();
        boolean boolean7 = property2.equals((java.lang.Object) (short) 100);
        java.lang.String str8 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime10.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        long long22 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DurationField durationField23 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        java.util.Date date26 = localDateTime25.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfCentury(1);
        int int32 = localDateTime25.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTime dateTime33 = localDateTime28.toDateTime();
        int int34 = property2.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "43" + "'", str8, "43");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 172800000L + "'", long22 == 172800000L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Nov 25 02:58:20 UTC 2020");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property2.addWrapFieldToCopy((int) (byte) 0);
        int int19 = localDateTime18.getEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minus(readableDuration20);
        int int22 = localDateTime18.size();
        int int23 = localDateTime18.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2020 + "'", int23 == 2020);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumTextLength(locale10);
        org.joda.time.LocalDateTime localDateTime12 = property9.roundHalfFloorCopy();
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("879");
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime12 = property2.addToCopy(10671780);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 10440316);
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(999);
        int int10 = localDateTime7.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 329 + "'", int10 == 329);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(1970);
        java.lang.Class<?> wildcardClass14 = localDateTime11.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(12);
        int int13 = localDateTime12.getYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        boolean boolean22 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusDays(54);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withMillisOfDay(100);
        boolean boolean33 = localDateTime21.equals((java.lang.Object) localDateTime29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime21);
        int int35 = localDateTime21.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "659" + "'", str6, "659");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "659" + "'", str8, "659");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 659 + "'", int35 == 659);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(3);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMinutes(10433438);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy(329);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks((int) (byte) 0);
        boolean boolean19 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 10442665);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        int int6 = property5.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2922789 + "'", int6 == 2922789);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusMonths(0);
        java.util.Date date33 = localDateTime32.toDate();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10700846 + "'", int2 == 10700846);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:20.846" + "'", str6, "2011-11-25T02:58:20.846");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed Nov 25 02:58:20 UTC 2020");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(10547595);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10547595 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withCenturyOfEra(10);
        int int4 = localDateTime3.getYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1020 + "'", int4 == 1020);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusSeconds(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfMonth(10660386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10660386 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "21" + "'", str3, "21");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("407", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        boolean boolean3 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime5 = property2.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = property2.addToCopy((long) 18);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfDay(10475022);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMinutes(2020);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusDays((int) (short) 0);
        boolean boolean17 = property2.equals((java.lang.Object) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = property18.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.lang.String str8 = property6.getAsText();
        org.joda.time.DurationField durationField9 = property6.getDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "21" + "'", str3, "21");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wednesday" + "'", str8, "Wednesday");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        long long30 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime32 = property2.addToCopy((long) 54);
        int int33 = property2.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((long) 10440316);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYearOfEra((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withPeriodAdded(readablePeriod41, 784);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withYearOfEra((int) '#');
        int int46 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 172800000L + "'", long30 == 172800000L);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 999 + "'", int33 == 999);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        long long20 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        int int21 = property5.getMinimumValueOverall();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property5.getFieldType();
        long long23 = property5.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-6940L) + "'", long20 == (-6940L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10701373L + "'", long23 == 10701373L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.getLeapAmount();
        int int13 = property11.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 292278993 + "'", int13 == 292278993);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, (int) (short) 10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readableDuration12);
        int int14 = localDateTime13.size();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj0, chronology15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDurationAdded(readableDuration4, 10485801);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        int int9 = localDateTime8.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(10440316);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusDays(51);
        int int18 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime1.minusSeconds(126);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:21 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10701658 + "'", int9 == 10701658);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(858);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withWeekyear(342);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumTextLength(locale27);
        org.joda.time.LocalDateTime localDateTime29 = property25.withMinimumValue();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        int int31 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        java.util.Locale locale35 = null;
        int int36 = property34.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime37 = property34.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime38 = property34.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMillis(10518773);
        boolean boolean41 = localDateTime29.isEqual((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withMillisOfDay(10664458);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 16, 0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 968, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime2.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        int int10 = localDateTime5.get(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withCenturyOfEra(0);
        int int18 = localDateTime12.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withCenturyOfEra(0);
        int int26 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property27 = localDateTime12.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.withPeriodAdded(readablePeriod28, 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(100L);
        int int40 = localDateTime39.getSecondOfMinute();
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime45 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withDurationAdded(readableDuration54, (int) (short) 10);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.minus(readableDuration57);
        int int59 = localDateTime58.size();
        org.joda.time.Chronology chronology60 = localDateTime58.getChronology();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(chronology60);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime45, chronology60);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 330 + "'", int10 == 330);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertNotNull(chronology60);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant28 = null;
        long long29 = property27.getDifferenceAsLong(readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100L);
        int int38 = localDateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime();
        long long40 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        long long41 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        int int42 = property19.compareTo((org.joda.time.ReadableInstant) dateTime39);
        int int43 = property13.compareTo((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale44 = null;
        java.lang.String str45 = property13.getAsShortText(locale44);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 11651L + "'", long40 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1606273101865L + "'", long41 == 1606273101865L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "35" + "'", str45, "35");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        int int4 = localDateTime1.getSecondOfMinute();
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime1.toString("", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        java.lang.String str9 = property2.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra(0);
        int int17 = localDateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        int int25 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property26 = localDateTime11.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime11.withPeriodAdded(readablePeriod27, 100);
        int int30 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime11.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime32.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy(10457089);
        org.joda.time.LocalDateTime localDateTime45 = property42.withMaximumValue();
        int int46 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22" + "'", str3, "22");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 58 + "'", int17 == 58);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2020 + "'", int30 == 2020);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.withMaximumValue();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMinutes((-1));
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField20 = localDateTime18.getField(323);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 323");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "263" + "'", str6, "263");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "263" + "'", str8, "263");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withMillisOfDay((int) (short) 100);
        int int17 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        int int7 = property2.getMaximumValue();
        int int8 = property2.getMaximumValueOverall();
        int int9 = property2.get();
        int int10 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 999 + "'", int7 == 999);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999 + "'", int8 == 999);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 398 + "'", int9 == 398);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 999 + "'", int10 == 999);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumTextLength(locale3);
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        boolean boolean19 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusDays(0);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        int int27 = localDateTime22.indexOf(dateTimeFieldType26);
        int int28 = localDateTime8.indexOf(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, 48);
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(3);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, chronology16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy(1);
        int int16 = property13.getLeapAmount();
        java.util.Locale locale18 = null;
        org.joda.time.LocalDateTime localDateTime19 = property13.setCopy("35", locale18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYearOfCentury(0);
        boolean boolean28 = localDateTime26.equals((java.lang.Object) 0.0d);
        int int29 = property13.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusMinutes(10538999);
        int int33 = localDateTime30.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T00:00:00.100" + "'", str10, "2001-11-25T00:00:00.100");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology40 = localDateTime29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) chronology40, dateTimeZone41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10702630 + "'", int2 == 10702630);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:22.630" + "'", str6, "2011-11-25T02:58:22.630");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        int int10 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYearOfCentury(11);
        java.lang.String str14 = localDateTime13.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withCenturyOfEra(0);
        int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property31 = localDateTime16.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime16.withPeriodAdded(readablePeriod32, 100);
        int int35 = localDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime16.minus(readablePeriod36);
        boolean boolean38 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime7.minus(readableDuration40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = localDateTime41.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10702690 + "'", int10 == 10702690);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2011-11-25T02:58:22.690" + "'", str14, "2011-11-25T02:58:22.690");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 48 + "'", int35 == 48);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray42);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.withMaximumValue();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusMinutes((-1));
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minus(readableDuration15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.dayOfYear();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsText(locale18);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "775" + "'", str6, "775");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "775" + "'", str8, "775");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "330" + "'", str19, "330");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 10440316);
        org.joda.time.LocalDateTime localDateTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property2.addToCopy(966);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusDays(0);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plus(readableDuration14);
        int int16 = localDateTime9.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.plusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDayOfMonth(10679518);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10679518 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime16 = property2.roundHalfEvenCopy();
        java.lang.String str17 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime18 = property2.roundCeilingCopy();
        int int19 = localDateTime18.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.era();
        int int24 = property23.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime25 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        boolean boolean28 = localDateTime18.isSupported(dateTimeFieldType27);
        int int29 = localDateTime18.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime18.withPeriodAdded(readablePeriod30, 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "956" + "'", str17, "956");
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 58 + "'", int19 == 58);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.Interval interval4 = property3.toInterval();
        int int5 = property3.getMinimumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10703027 + "'", int2 == 10703027);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withSecondOfMinute((int) (short) 0);
        boolean boolean16 = property2.equals((java.lang.Object) (short) 0);
        org.joda.time.DurationField durationField17 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime19 = property2.addWrapFieldToCopy(10630818);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = property13.addToCopy((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMonths(10478634);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(264, 681, 10518773, 51, 10648162);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        int int11 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime13.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime25 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime10.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addToCopy(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear(999);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withWeekyear((-292275054));
        org.joda.time.DurationFieldType durationFieldType21 = null;
        boolean boolean22 = localDateTime6.isSupported(durationFieldType21);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localDateTime6.isSupported(durationFieldType23);
        int int25 = localDateTime6.getYear();
        java.util.Date date26 = localDateTime6.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:23 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Nov 25 02:58:23 UTC 2020");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localDateTime4.toString(dateTimeFormatter5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMonths(126);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        java.lang.String str15 = property11.getAsShortText();
        org.joda.time.DurationField durationField16 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusSeconds(12);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.secondOfMinute();
        java.lang.String str26 = property25.getAsString();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property25.roundFloorCopy();
        org.joda.time.Interval interval29 = property25.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        boolean boolean31 = localDateTime22.isSupported(dateTimeFieldType30);
        boolean boolean32 = localDateTime17.isSupported(dateTimeFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime4.withField(dateTimeFieldType30, 10698403);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698403 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:00.116" + "'", str6, "1970-01-01T00:00:00.116");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "653" + "'", str15, "653");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "23" + "'", str26, "23");
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy(134);
        int int11 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 415, dateTimeZone13);
        int int15 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23" + "'", str3, "23");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606273067773L);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property6.getAsShortText(locale8);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23" + "'", str3, "23");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "913" + "'", str9, "913");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(1606272836386L, chronology12);
        int int14 = property10.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        java.lang.String str15 = property10.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMillis(10595912);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        boolean boolean12 = property5.isLeap();
        int int13 = property5.getMinimumValue();
        org.joda.time.DurationField durationField14 = property5.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property5.roundHalfCeilingCopy();
        java.util.Locale locale16 = null;
        int int17 = property5.getMaximumShortTextLength(locale16);
        org.joda.time.DurationField durationField18 = property5.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plus(readableDuration11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear(10568130);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10568130 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:24 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime4.toDateTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withMonthOfYear(10679525);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10679525 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withCenturyOfEra(0);
        int int13 = localDateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra(0);
        int int21 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property22 = localDateTime7.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime7.withPeriodAdded(readablePeriod23, 100);
        int int26 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime7.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        boolean boolean39 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        boolean boolean40 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime28);
        java.util.Date date41 = localDateTime28.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 58 + "'", int13 == 58);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2020 + "'", int26 == 2020);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Tue Nov 24 02:58:24 UTC 2020");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        int int9 = localDateTime8.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfMonth(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24" + "'", str3, "24");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10739605 + "'", int9 == 10739605);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property7.addToCopy((long) 10531414);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("956");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes(54);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusHours(10436594);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        boolean boolean12 = property5.isLeap();
        int int13 = property5.getMinimumValue();
        org.joda.time.DurationField durationField14 = property5.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusSeconds((int) (byte) 100);
        int int31 = localDateTime28.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime21.withField(dateTimeFieldType33, 10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime21.plusSeconds(29);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfCentury(0);
        boolean boolean8 = localDateTime6.equals((java.lang.Object) 0.0d);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(10469775);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.weekOfWeekyear();
        int int12 = property11.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime9 = property2.addWrapFieldToCopy(10433438);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property2.getFieldType();
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        int int6 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.year();
        int int17 = property16.getMaximumValueOverall();
        int int18 = property16.getLeapAmount();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property16.getField();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusMillis(0);
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime();
        int int31 = property16.getDifference((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property2.compareTo((org.joda.time.ReadableInstant) dateTime30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = property2.setCopy(10477381);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10477381 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.era();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100L);
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusSeconds((int) (byte) 100);
        int int39 = localDateTime36.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime29.withField(dateTimeFieldType41, 10);
        int int44 = localDateTime23.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime9.withField(dateTimeFieldType41, 0);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime5.withField(dateTimeFieldType41, 20);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime5.minusMonths((int) 'a');
        org.joda.time.ReadablePartial readablePartial51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withFields(readablePartial51);
        int int53 = localDateTime52.getWeekyear();
        int int54 = localDateTime52.getYear();
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2020 + "'", int44 == 2020);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-10) + "'", int53 == (-10));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-10) + "'", int54 == (-10));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("797");
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis(858);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.plusYears(56);
        java.lang.Class<?> wildcardClass13 = localDateTime12.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = property21.getDifference(readableInstant22);
        long long24 = property21.remainder();
        java.lang.String str25 = property21.getAsShortText();
        org.joda.time.DurationField durationField26 = property21.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime27 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = property31.getDifference(readableInstant32);
        long long34 = property31.remainder();
        org.joda.time.LocalDateTime localDateTime35 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100L);
        int int38 = localDateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime();
        org.joda.time.DateTime dateTime40 = localDateTime35.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        long long42 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime41);
        java.util.Locale locale43 = null;
        java.lang.String str44 = property2.getAsShortText(locale43);
        java.util.Locale locale45 = null;
        java.lang.String str46 = property2.getAsText(locale45);
        java.util.Locale locale47 = null;
        java.lang.String str48 = property2.getAsText(locale47);
        int int49 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273105684L + "'", long16 == 1606273105684L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "784" + "'", str25, "784");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "784" + "'", str44, "784");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "784" + "'", str46, "784");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "784" + "'", str48, "784");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 999 + "'", int49 == 999);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMillis(342);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        int int16 = property2.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DurationField durationField17 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "997" + "'", str6, "997");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfCentury(11);
        java.lang.String str16 = localDateTime15.toString();
        int[] intArray17 = localDateTime15.getValues();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours(0);
        boolean boolean23 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime19.minusDays(112);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = localDateTime19.toString(dateTimeFormatter27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10706064 + "'", int12 == 10706064);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2011-11-25T02:58:26.064" + "'", str16, "2011-11-25T02:58:26.064");
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2011, 11, 25, 10706064]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2020-11-25T02:58:26.064" + "'", str28, "2020-11-25T02:58:26.064");
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfDay(100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime22.toDateTime(dateTimeZone26);
        long long28 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime29 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273106041L + "'", long16 == 1606273106041L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 599615999999L + "'", long28 == 599615999999L);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(12);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.era();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra(0);
        int int19 = localDateTime13.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withCenturyOfEra(0);
        int int27 = localDateTime13.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime.Property property28 = localDateTime13.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime13.withPeriodAdded(readablePeriod29, 100);
        int int32 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime13.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfSecond();
        boolean boolean45 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime43);
        boolean boolean46 = localDateTime11.isAfter((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDateTime34.getFieldType((int) (short) 1);
        boolean boolean49 = localDateTime0.isSupported(dateTimeFieldType48);
        int int50 = localDateTime0.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 58 + "'", int19 == 58);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2020 + "'", int32 == 2020);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        int int16 = localDateTime11.get(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withField(dateTimeFieldType15, 19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfSecond(10572157);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10572157 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 330 + "'", int16 == 330);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        int int2 = localDateTime0.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "26" + "'", str3, "26");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusSeconds(78);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.withPeriodAdded(readablePeriod20, 329);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusHours(10424228);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime10 = property2.addToCopy((long) 10565113);
        org.joda.time.LocalDateTime localDateTime12 = property2.setCopy(48);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "769" + "'", str6, "769");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        int int16 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withCenturyOfEra(39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 330 + "'", int16 == 330);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.setCopy(19);
        org.joda.time.LocalDateTime localDateTime21 = property2.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMonthOfYear(966);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 966 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273106857L + "'", long16 == 1606273106857L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(100L);
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withCenturyOfEra(0);
        int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property31 = localDateTime16.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime16.withPeriodAdded(readablePeriod32, 100);
        int int35 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime16.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        boolean boolean48 = localDateTime37.isBefore((org.joda.time.ReadablePartial) localDateTime46);
        boolean boolean49 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.secondOfMinute();
        java.lang.String str53 = property52.getAsString();
        org.joda.time.DurationField durationField54 = property52.getDurationField();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minus(readablePeriod56);
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = localDateTime57.isSupported(durationFieldType58);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(100L);
        int int62 = localDateTime61.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property63 = localDateTime61.era();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(100L);
        int int66 = localDateTime65.getSecondOfMinute();
        org.joda.time.DateTime dateTime67 = localDateTime65.toDateTime();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime61.withFields((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime72 = property71.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusSeconds((int) (byte) 100);
        int int75 = localDateTime72.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property76 = localDateTime72.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property76.getFieldType();
        org.joda.time.LocalDateTime localDateTime79 = localDateTime65.withField(dateTimeFieldType77, 10);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime57.withField(dateTimeFieldType77, 10473582);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime14.withField(dateTimeFieldType77, 10466854);
        boolean boolean84 = localDateTime7.isSupported(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2020 + "'", int35 == 2020);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "27" + "'", str53, "27");
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(10424228);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withFields(readablePartial21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273107146L + "'", long16 == 1606273107146L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(12);
        java.lang.String str14 = localDateTime10.toString("31");
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusMinutes(10475022);
        int int17 = localDateTime10.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "290" + "'", str6, "290");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "290" + "'", str8, "290");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "31" + "'", str14, "31");
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27 + "'", int17 == 27);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        int int6 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.year();
        int int17 = property16.getMaximumValueOverall();
        int int18 = property16.getLeapAmount();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumShortTextLength(locale19);
        org.joda.time.DateTimeField dateTimeField21 = property16.getField();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusMillis(0);
        org.joda.time.DateTime dateTime30 = localDateTime26.toDateTime();
        int int31 = property16.getDifference((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property2.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeField dateTimeField33 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime7.monthOfYear();
        int int14 = localDateTime7.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T00:00:00.100" + "'", str10, "2001-11-25T00:00:00.100");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 'a', chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(19);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime10, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withPeriodAdded(readablePeriod15, 10465630);
        boolean boolean18 = property2.equals((java.lang.Object) localDateTime10);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27" + "'", str3, "27");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        int int10 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYearOfCentury(11);
        java.lang.String str14 = localDateTime13.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withCenturyOfEra(0);
        int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property31 = localDateTime16.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime16.withPeriodAdded(readablePeriod32, 100);
        int int35 = localDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime16.minus(readablePeriod36);
        boolean boolean38 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withDurationAdded(readableDuration48, (int) (short) 10);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.minus(readableDuration51);
        int int53 = localDateTime52.size();
        org.joda.time.Chronology chronology54 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime37, chronology54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType57 = localDateTime55.getFieldType(10639426);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10639426");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10707632 + "'", int10 == 10707632);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2011-11-25T02:58:27.632" + "'", str14, "2011-11-25T02:58:27.632");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 48 + "'", int35 == 48);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusWeeks((int) (short) -1);
        int int18 = localDateTime17.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withCenturyOfEra(10483593);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10483593 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272834354L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDateTime11.toString(dateTimeFormatter12);
        java.lang.String str14 = localDateTime11.toString();
        int int15 = localDateTime11.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus(readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withCenturyOfEra(0);
        int int32 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withCenturyOfEra(0);
        int int40 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime24.minus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(100L);
        int int46 = localDateTime45.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.era();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(100L);
        int int50 = localDateTime49.getSecondOfMinute();
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds((int) (byte) 100);
        int int59 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property60.getFieldType();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime49.withField(dateTimeFieldType61, 10);
        boolean boolean64 = localDateTime24.isSupported(dateTimeFieldType61);
        int int65 = localDateTime11.get(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property66 = localDateTime11.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime68 = localDateTime11.withMillisOfSecond(10528442);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10528442 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "838" + "'", str6, "838");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10071-10-20T05:52:22.192" + "'", str13, "10071-10-20T05:52:22.192");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10071-10-20T05:52:22.192" + "'", str14, "10071-10-20T05:52:22.192");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 58 + "'", int32 == 58);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10071 + "'", int65 == 10071);
        org.junit.Assert.assertNotNull(property66);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusMinutes(10433438);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = property4.addWrapFieldToCopy(329);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfCentury(0);
        boolean boolean8 = localDateTime6.equals((java.lang.Object) 0.0d);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusSeconds(10469775);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withEra(10687234);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10687234 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        long long30 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale32 = null;
        org.joda.time.LocalDateTime localDateTime33 = property2.setCopy("879", locale32);
        int int34 = localDateTime33.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 172800000L + "'", long30 == 172800000L);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 879 + "'", int34 == 879);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        int int16 = localDateTime11.get(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withField(dateTimeFieldType15, 19);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 330 + "'", int16 == 330);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "430" + "'", str6, "430");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "430" + "'", str8, "430");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusYears(78);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMinutes(48);
        int int23 = localDateTime22.getDayOfYear();
        int int24 = localDateTime22.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273108398L + "'", long16 == 1606273108398L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 329 + "'", int23 == 329);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        boolean boolean7 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundCeilingCopy();
        int int9 = localDateTime8.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy((-292275054));
        org.joda.time.LocalDateTime localDateTime15 = property12.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(10424228);
        int int21 = localDateTime20.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(10443559);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(10654710);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plus(readableDuration27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273108585L + "'", long16 == 1606273108585L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(25);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localDateTime7.toString(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2100-01-01T00:00:00.000" + "'", str9, "2100-01-01T00:00:00.000");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMillis(19);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime2, chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime2.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.minusMillis(10473582);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.plus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMonths((-292275054));
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime11, dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        int int7 = localDateTime4.size();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusWeeks((-2));
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime(dateTimeZone12);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime11.getFields();
        int int15 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusMonths(292278993);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = property20.getDifference(readableInstant21);
        long long23 = property20.remainder();
        java.lang.String str24 = property20.getAsShortText();
        org.joda.time.Interval interval25 = property20.toInterval();
        java.lang.String str26 = property20.getAsShortText();
        int int27 = property20.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime28 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property20.withMaximumValue();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusMinutes((-1));
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.minus(readableDuration33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.secondOfMinute();
        java.lang.String str38 = property37.getAsString();
        org.joda.time.DurationField durationField39 = property37.getDurationField();
        org.joda.time.LocalDateTime localDateTime40 = property37.roundFloorCopy();
        org.joda.time.Interval interval41 = property37.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        int int43 = localDateTime29.get(dateTimeFieldType42);
        int int44 = localDateTime17.get(dateTimeFieldType42);
        int int45 = localDateTime9.get(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(100L);
        int int54 = localDateTime53.getSecondOfMinute();
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime();
        long long56 = property51.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.LocalDateTime localDateTime57 = property51.roundCeilingCopy();
        int int58 = localDateTime57.getWeekyear();
        boolean boolean59 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime57);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "897" + "'", str24, "897");
        org.junit.Assert.assertNotNull(interval25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "897" + "'", str26, "897");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "28" + "'", str38, "28");
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 28 + "'", int43 == 28);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 28 + "'", int45 == 28);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 11651L + "'", long56 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2001 + "'", int58 == 2001);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        int[] intArray14 = localDateTime13.getValues();
        int int15 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekyear(58);
        int int19 = localDateTime13.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 16, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2001 + "'", int15 == 2001);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = localDateTime5.withTime(23, 10655851, 10526854, 10638070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10655851 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10709274 + "'", int2 == 10709274);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:29.274" + "'", str6, "2011-11-25T02:58:29.274");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes(54);
        int int26 = localDateTime23.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.weekyear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withMillisOfDay(10668982);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 29 + "'", int26 == 29);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 476, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfEra(681);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime2.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime2.getField(10567046);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10567046");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusDays((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withWeekOfWeekyear(9);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime13.toDateTime(dateTimeZone21);
        int int23 = localDateTime13.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 16, 0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2001 + "'", int23 == 2001);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusYears(78);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        long long26 = property23.remainder();
        java.lang.String str27 = property23.getAsShortText();
        org.joda.time.DurationField durationField28 = property23.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime30 = property23.addToCopy(1606272834354L);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withCenturyOfEra((int) (short) 100);
        int int33 = localDateTime30.getCenturyOfEra();
        int int34 = localDateTime30.getMonthOfYear();
        boolean boolean35 = localDateTime20.equals((java.lang.Object) localDateTime30);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = localDateTime20.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273109664L + "'", long16 == 1606273109664L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "764" + "'", str27, "764");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray36);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("746", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2001-11-25T02:53:55.834", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime29.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusYears(48);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays(10664100);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10710041 + "'", int2 == 10710041);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:30.041" + "'", str6, "2011-11-25T02:58:30.041");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withSecondOfMinute(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMinuteOfHour(10668866);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10668866 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:30 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        long long30 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime32 = property2.addToCopy((long) 54);
        int int33 = property2.getMaximumValue();
        int int34 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 172800000L + "'", long30 == 172800000L);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 999 + "'", int33 == 999);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime10 = property7.addToCopy((long) '#');
        java.lang.String str11 = property7.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property7.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609111000L + "'", long8 == 28609111000L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020" + "'", str11, "2020");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        int int20 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMonths((int) (short) 10);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        java.util.Locale locale14 = null;
        int int15 = property5.getMaximumTextLength(locale14);
        java.util.Locale locale16 = null;
        java.lang.String str17 = property5.getAsShortText(locale16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sun" + "'", str17, "Sun");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        int[] intArray14 = localDateTime13.getValues();
        int int15 = localDateTime13.getWeekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withWeekyear(58);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 16, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2001 + "'", int15 == 2001);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) (short) 10);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minus(readableDuration11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 10538999);
        int int16 = localDateTime12.getDayOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 329 + "'", int16 == 329);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(10424228);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plus(readablePeriod22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273110635L + "'", long16 == 1606273110635L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property7.addWrapFieldToCopy((-1));
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        long long12 = property11.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10711000L + "'", long12 == 10711000L);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime1.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = localDateTime1.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(20);
        int int5 = localDateTime4.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours(10440316);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime4.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime4.toDateTime(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.setCopy(19);
        org.joda.time.LocalDateTime localDateTime21 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = property2.roundFloorCopy();
        java.lang.String str23 = property2.toString();
        int int24 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = property27.getDifference(readableInstant28);
        long long30 = property27.remainder();
        java.lang.String str31 = property27.getAsShortText();
        org.joda.time.DurationField durationField32 = property27.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime33 = property27.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        int int37 = property27.compareTo((org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = property2.getDifference((org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 54590381911026");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273110926L + "'", long16 == 1606273110926L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Property[millisOfSecond]" + "'", str23, "Property[millisOfSecond]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "26" + "'", str31, "26");
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 10, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusSeconds(78);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.minusHours(322);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = localDateTime1.toString(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T02:58:31.178" + "'", str23, "2020-11-25T02:58:31.178");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime21 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays(10);
        int[] intArray24 = localDateTime23.getValues();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusDays((int) '#');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withMillisOfDay(858);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withWeekyear(342);
        boolean boolean33 = localDateTime9.isEqual((org.joda.time.ReadablePartial) localDateTime28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2001, 11, 16, 0]");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusYears(10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(10478634);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localDateTime13.toString(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2031-03-26T06:43:54.100" + "'", str17, "2031-03-26T06:43:54.100");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusDays(2020);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy(134);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusMillis(342);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minusYears(10466854);
        int int19 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withHourOfDay(12);
        java.lang.String str30 = localDateTime27.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime27.toDateTime(dateTimeZone31);
        boolean boolean33 = localDateTime12.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        java.lang.String str34 = localDateTime12.toString();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31" + "'", str3, "31");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2001-11-25T00:00:00.100" + "'", str30, "2001-11-25T00:00:00.100");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T02:58:31.464" + "'", str34, "2020-11-25T02:58:31.464");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime4.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((long) 48);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withHourOfDay(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime5.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plus(readablePeriod9);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        int int6 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31" + "'", str3, "31");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear(12);
        int int13 = localDateTime12.getYear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMonths(26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "820" + "'", str6, "820");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "820" + "'", str8, "820");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusYears(3);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMinuteOfHour(11);
        int int12 = localDateTime11.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020" + "'", str10, "2020");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272836594L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMonthOfYear((int) (short) 1);
        boolean boolean14 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        java.lang.String str15 = localDateTime2.toString();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime2.minusMonths(0);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:32 UTC 2020");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T02:53:56.594" + "'", str15, "2020-11-25T02:53:56.594");
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withMillisOfDay(10475022);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes(2020);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDateTime5.getFields();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks(337);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime10 = property7.addToCopy((long) '#');
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property18.roundCeilingCopy();
        org.joda.time.Interval interval21 = property18.toInterval();
        boolean boolean23 = property18.equals((java.lang.Object) (short) 100);
        java.lang.String str24 = property18.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localDateTime26.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        long long38 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        int int39 = property7.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609113000L + "'", long8 == 28609113000L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 50L + "'", long15 == 50L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "139" + "'", str24, "139");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 172799999L + "'", long38 == 172799999L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, 48);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMillis(10561614);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(18, 10575200, 10436594, 10599930, 10672280, 784, 376);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10599930 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfCentury(11);
        java.lang.String str16 = localDateTime15.toString();
        int[] intArray17 = localDateTime15.getValues();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours(0);
        boolean boolean23 = localDateTime15.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plus(readablePeriod25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10712398 + "'", int12 == 10712398);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2011-11-25T02:58:32.398" + "'", str16, "2011-11-25T02:58:32.398");
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2011, 11, 25, 10712398]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        int int10 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYearOfCentury(11);
        java.lang.String str14 = localDateTime13.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime16.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withCenturyOfEra(0);
        int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property31 = localDateTime16.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime16.withPeriodAdded(readablePeriod32, 100);
        int int35 = localDateTime16.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime16.minus(readablePeriod36);
        boolean boolean38 = localDateTime13.isEqual((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime7.minusMillis(10536366);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = localDateTime41.toString(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10712456 + "'", int10 == 10712456);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2011-11-25T02:58:32.456" + "'", str14, "2011-11-25T02:58:32.456");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 48 + "'", int35 == 48);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2001-11-25T00:02:56.090" + "'", str43, "2001-11-25T00:02:56.090");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addWrapFieldToCopy(10567046);
        org.joda.time.LocalDateTime localDateTime22 = property18.addToCopy((long) 421);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property18.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) (short) 10);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.minus(readableDuration11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 10538999);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withCenturyOfEra(476);
        int int18 = localDateTime17.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        int int4 = property3.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute((int) (short) 0);
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusDays(10546189);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = property10.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMinutes(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime2.getFields();
        int int6 = localDateTime2.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withYear(10597129);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusSeconds(6);
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfDay();
        int int13 = localDateTime6.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekOfWeekyear();
        boolean boolean22 = localDateTime9.equals((java.lang.Object) localDateTime20);
        int int23 = localDateTime9.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(1606272836386L, chronology12);
        int int14 = property10.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        java.lang.String str15 = property10.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[weekOfWeekyear]" + "'", str15, "Property[weekOfWeekyear]");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusSeconds(78);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.withPeriodAdded(readablePeriod20, 329);
        org.joda.time.Chronology chronology23 = localDateTime1.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusDays(134);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        long long30 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime32 = property2.addToCopy((long) 54);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 172800000L + "'", long30 == 172800000L);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property7.addWrapFieldToCopy((-1));
        boolean boolean11 = property7.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.joda.time.LocalDateTime localDateTime12 = property9.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property9.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        int int9 = property2.getMinimumValue();
        org.joda.time.DurationField durationField10 = property2.getDurationField();
        java.lang.String str11 = property2.toString();
        int int12 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.LocalDateTime localDateTime18 = property15.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        boolean boolean22 = localDateTime20.isSupported(durationFieldType21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.era();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(100L);
        int int29 = localDateTime28.getSecondOfMinute();
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds((int) (byte) 100);
        int int38 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime28.withField(dateTimeFieldType40, 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime20.withField(dateTimeFieldType40, 10473582);
        int int45 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        int int46 = localDateTime20.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "597" + "'", str6, "597");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[millisOfSecond]" + "'", str11, "Property[millisOfSecond]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 999 + "'", int12 == 999);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "33" + "'", str16, "33");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10713000 + "'", int46 == 10713000);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property2.roundCeilingCopy();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        java.lang.String str11 = property2.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = property22.withMaximumValue();
        int int24 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime25 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33" + "'", str3, "33");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "33" + "'", str10, "33");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusSeconds(78);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.withPeriodAdded(readablePeriod20, 329);
        int int23 = localDateTime1.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2020 + "'", int23 == 2020);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.Chronology chronology40 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime29.minusMonths(568);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withMinuteOfHour(968);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 968 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10713933 + "'", int2 == 10713933);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:33.933" + "'", str6, "2011-11-25T02:58:33.933");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        int int7 = localDateTime6.getEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusSeconds((int) (short) 1);
        java.util.Date date10 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays((int) (short) 0);
        java.lang.String str14 = localDateTime13.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 02:58:34 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2020-11-25T02:58:34.000" + "'", str14, "2020-11-25T02:58:34.000");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(18, 10466854, 104242, 1606272898, 10651587, 2022, 375);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1606272898 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        java.util.Date date11 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withSecondOfMinute(45);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDateTime12.getFields();
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Apr 06 02:58:34 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(10570282, 10712456, 31, 3397, 8, 1006938675);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3397 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        int int13 = localDateTime12.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYearOfCentury(375);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 375 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("291");
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMonthOfYear(10630818);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10630818 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (-157));
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minus(readablePeriod13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, 48);
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(100L);
        int int27 = localDateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime();
        long long29 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int31 = property2.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDateTime localDateTime32 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34" + "'", str3, "34");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11651L + "'", long29 == 11651L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime6.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(100L);
        int int28 = localDateTime27.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.era();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(100L);
        int int32 = localDateTime31.getSecondOfMinute();
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds((int) (byte) 100);
        int int41 = localDateTime38.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property42 = localDateTime38.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime31.withField(dateTimeFieldType43, 10);
        boolean boolean46 = localDateTime6.isSupported(dateTimeFieldType43);
        int int47 = localDateTime6.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        java.lang.String str10 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime12 = property2.addWrapFieldToCopy(10478114);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "774" + "'", str6, "774");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNull(durationField9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "774" + "'", str10, "774");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays(10424228);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localDateTime17.toString(dateTimeFormatter18);
        int int20 = localDateTime17.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-28441-06-02T02:58:35.841" + "'", str19, "-28441-06-02T02:58:35.841");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 284 + "'", int20 == 284);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMillis((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant16 = null;
        long long17 = property15.getDifferenceAsLong(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime30 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime31 = property15.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYearOfEra(10424228);
        int int34 = localDateTime33.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.yearOfEra();
        int int36 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        int int37 = localDateTime33.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "895" + "'", str6, "895");
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "895" + "'", str9, "895");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11651L + "'", long28 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606273114795L + "'", long29 == 1606273114795L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 25 + "'", int34 == 25);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, 48);
        int int10 = localDateTime9.getDayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(3);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9, chronology16);
        int int18 = localDateTime17.getMinuteOfHour();
        int int19 = localDateTime17.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withField(dateTimeFieldType11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(dateTimeZone15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute((int) (short) 0);
        int int9 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusDays(10546189);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(10481380);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusSeconds(10433438);
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime15.toString("Property[minuteOfHour]", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withCenturyOfEra(0);
        int int13 = localDateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra(0);
        int int21 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime.Property property22 = localDateTime7.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime7.withPeriodAdded(readablePeriod23, 100);
        int int26 = localDateTime7.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime7.minusDays((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMonths((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        boolean boolean39 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        boolean boolean40 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        java.lang.String str44 = property43.getAsString();
        org.joda.time.DurationField durationField45 = property43.getDurationField();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readablePeriod47);
        org.joda.time.DurationFieldType durationFieldType49 = null;
        boolean boolean50 = localDateTime48.isSupported(durationFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(100L);
        int int53 = localDateTime52.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.era();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(100L);
        int int57 = localDateTime56.getSecondOfMinute();
        org.joda.time.DateTime dateTime58 = localDateTime56.toDateTime();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime63 = property62.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.plusSeconds((int) (byte) 100);
        int int66 = localDateTime63.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property67 = localDateTime63.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property67.getFieldType();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime56.withField(dateTimeFieldType68, 10);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime48.withField(dateTimeFieldType68, 10473582);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime5.withField(dateTimeFieldType68, 10466854);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime5.minusHours(681);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plusDays(24);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.withYearOfEra(10595110);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minusMillis(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 58 + "'", int13 == 58);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2020 + "'", int26 == 2020);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "35" + "'", str44, "35");
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        boolean boolean3 = property2.isLeap();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy((long) (-10));
        java.lang.String str7 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMonthOfYear(5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272828765L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay(10428765);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusSeconds(78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime1.withMinuteOfHour(10535036);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10535036 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant28 = null;
        long long29 = property27.getDifferenceAsLong(readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100L);
        int int38 = localDateTime37.getSecondOfMinute();
        org.joda.time.DateTime dateTime39 = localDateTime37.toDateTime();
        long long40 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        long long41 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        int int42 = property19.compareTo((org.joda.time.ReadableInstant) dateTime39);
        int int43 = property13.compareTo((org.joda.time.ReadableInstant) dateTime39);
        int int44 = property13.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime46 = property13.addToCopy(126);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withHourOfDay(924);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 924 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 11651L + "'", long40 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1606273115583L + "'", long41 == 1606273115583L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 59 + "'", int44 == 59);
        org.junit.Assert.assertNotNull(localDateTime46);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury(11);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property23 = localDateTime8.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime8.withPeriodAdded(readablePeriod24, 100);
        int int27 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.minus(readablePeriod28);
        boolean boolean30 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        long long36 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime37 = property33.roundHalfCeilingCopy();
        int int38 = localDateTime37.getYear();
        int int39 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime29.withHourOfDay(0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusYears(48);
        int int44 = localDateTime41.getMillisOfDay();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10715781 + "'", int2 == 10715781);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2011-11-25T02:58:35.781" + "'", str6, "2011-11-25T02:58:35.781");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3515782 + "'", int44 == 3515782);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Locale locale10 = null;
        java.lang.String str11 = localDateTime8.toString("966", locale10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime8.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withDate(550, 235, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 235 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "966" + "'", str11, "966");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusSeconds(330);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDateTime8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withSecondOfMinute((int) '#');
        boolean boolean22 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.plus(readablePeriod23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMillisOfSecond(10663430);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10663430 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfFloorCopy();
        org.joda.time.Chronology chronology14 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 50, chronology14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272975481L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(10706064);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property8.getDifference(readableInstant9);
        long long11 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean20 = property2.equals((java.lang.Object) 10539873L);
        java.util.Locale locale21 = null;
        int int22 = property2.getMaximumShortTextLength(locale21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1606273115 + "'", int18 == 1606273115);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = property2.withMaximumValue();
        java.lang.String str12 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime13 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusSeconds(10667481);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "125" + "'", str6, "125");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "125" + "'", str8, "125");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "125" + "'", str12, "125");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumTextLength(locale3);
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfEvenCopy();
        java.lang.String str8 = property2.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property2.setCopy("760");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 760 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumTextLength(locale3);
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(chronology6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(20);
        java.lang.String str5 = localDateTime2.toString();
        int int6 = localDateTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01T00:00:00.000" + "'", str5, "1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property2.roundCeilingCopy();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        java.lang.String str11 = property2.toString();
        int int12 = property2.getMinimumValue();
        org.joda.time.DurationField durationField13 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "36" + "'", str10, "36");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusSeconds(330);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property6.addToCopy((long) 30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 12, chronology1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = localDateTime2.toString("571", locale4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMillisOfDay(629);
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.setCopy("441");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 441 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "571" + "'", str5, "571");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272834354L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDateTime11.toString(dateTimeFormatter12);
        java.lang.String str14 = localDateTime11.toString();
        int int15 = localDateTime11.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus(readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withCenturyOfEra(0);
        int int32 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withCenturyOfEra(0);
        int int40 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime24.minus(readablePeriod42);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(100L);
        int int46 = localDateTime45.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property47 = localDateTime45.era();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(100L);
        int int50 = localDateTime49.getSecondOfMinute();
        org.joda.time.DateTime dateTime51 = localDateTime49.toDateTime();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds((int) (byte) 100);
        int int59 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property60.getFieldType();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime49.withField(dateTimeFieldType61, 10);
        boolean boolean64 = localDateTime24.isSupported(dateTimeFieldType61);
        int int65 = localDateTime11.get(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property66 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime.Property property67 = localDateTime11.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime69.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime();
        boolean boolean76 = localDateTime74.isBefore((org.joda.time.ReadablePartial) localDateTime75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime74.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property79 = localDateTime74.yearOfEra();
        org.joda.time.LocalDateTime localDateTime81 = localDateTime74.plusWeeks(10433438);
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.dayOfYear();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime81.withWeekyear(55);
        org.joda.time.LocalDateTime.Property property85 = localDateTime84.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime86 = property85.roundCeilingCopy();
        int int87 = property85.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone88 = null;
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime(dateTimeZone88);
        java.util.Date date90 = localDateTime89.toDate();
        org.joda.time.DateTimeZone dateTimeZone91 = null;
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(dateTimeZone91);
        org.joda.time.LocalDateTime.Property property93 = localDateTime92.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime95 = localDateTime92.withYearOfCentury(1);
        int int96 = localDateTime89.compareTo((org.joda.time.ReadablePartial) localDateTime92);
        org.joda.time.DateTime dateTime97 = localDateTime92.toDateTime();
        int int98 = property85.compareTo((org.joda.time.ReadableInstant) dateTime97);
        int int99 = property67.compareTo((org.joda.time.ReadableInstant) dateTime97);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "646" + "'", str6, "646");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10071-10-20T05:52:31.000" + "'", str13, "10071-10-20T05:52:31.000");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10071-10-20T05:52:31.000" + "'", str14, "10071-10-20T05:52:31.000");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 58 + "'", int32 == 58);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10071 + "'", int65 == 10071);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2922789 + "'", int87 == 2922789);
        org.junit.Assert.assertNotNull(date90);
// flaky:         org.junit.Assert.assertEquals(date90.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(localDateTime95);
// flaky:         org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(dateTime97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        long long20 = property19.remainder();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        java.util.Locale locale25 = null;
        int int26 = property23.getMaximumTextLength(locale25);
        int int27 = property23.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minus(readablePeriod29);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(100L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime35 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DurationField durationField37 = property23.getDurationField();
        org.joda.time.LocalDateTime localDateTime38 = property23.withMinimumValue();
        int int39 = property19.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusMillis(10592795);
        int int42 = localDateTime41.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3516845L + "'", long20 == 3516845L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 123205 + "'", int42 == 123205);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("54", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusHours(50);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = property18.getDifference(readableInstant19);
        long long21 = property18.remainder();
        java.lang.String str22 = property18.getAsShortText();
        org.joda.time.DurationField durationField23 = property18.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime24 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = property18.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusDays(3);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        long long30 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:37 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "51" + "'", str22, "51");
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-7320L) + "'", long30 == (-7320L));
    }
}
