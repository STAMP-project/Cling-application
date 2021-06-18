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
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime28 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property13.withMaximumValue();
        int int30 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime10.withWeekyear(7);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = localDateTime10.getFields();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:03 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606272303009L + "'", long27 == 1606272303009L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldArray33);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = property7.roundHalfFloorCopy();
        long long23 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property7.setCopy(19);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(1606272019785L, chronology26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(1606272040300L, chronology26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMillis(9670056);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusWeeks(302);
        org.joda.time.LocalDateTime.Property property34 = localDateTime29.hourOfDay();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606272303154L + "'", long21 == 1606272303154L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusMonths(9645674);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMinutes(533);
        java.lang.String str15 = localDateTime12.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "803907-01-25T02:45:03.322" + "'", str15, "803907-01-25T02:45:03.322");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (byte) 10);
        java.lang.String str13 = localDateTime9.toString("116");
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfDay(100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = property24.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        int int37 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusSeconds((int) (byte) 100);
        int int47 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        boolean boolean50 = localDateTime33.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime21.withField(dateTimeFieldType49, (int) 'a');
        boolean boolean53 = localDateTime9.isSupported(dateTimeFieldType49);
        boolean boolean54 = localDateTime8.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusSeconds((int) (byte) 100);
        int int62 = localDateTime59.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.plusMinutes(9730272);
        boolean boolean65 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime64);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "116" + "'", str13, "116");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:45:03 UTC 2020");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272024238L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(19);
        int int14 = localDateTime9.getEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusHours(37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "666" + "'", str6, "666");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withYear((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.plusMonths(9645528);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.millisOfSecond();
        org.joda.time.DurationField durationField21 = property20.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withDayOfMonth((-6940));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6940 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:03 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime();
        long long11 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant15 = null;
        long long16 = property14.getDifferenceAsLong(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime();
        long long27 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        long long28 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int29 = property6.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDateTime localDateTime30 = property6.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.secondOfMinute();
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
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        long long52 = property36.remainder();
        org.joda.time.LocalDateTime localDateTime54 = property36.setCopy(19);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime32, chronology55);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime30, chronology55);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 9642412, chronology55);
        java.util.Date date60 = localDateTime59.toDate();
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.fromDateFields(date60);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withFieldAdded(durationFieldType62, 9746683);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11651L + "'", long11 == 11651L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11651L + "'", long27 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1606272303746L + "'", long28 == 1606272303746L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606272303746L + "'", long50 == 1606272303746L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 02:40:42 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        int int2 = localDateTime1.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMonths(9653183);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.hourOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.yearOfEra();
        java.lang.String str8 = property7.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[yearOfEra]" + "'", str8, "Property[yearOfEra]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        boolean boolean9 = property8.isLeap();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfCeilingCopy();
        int int11 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.centuryOfEra();
        int int5 = property4.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 20);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusYears(513);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays(517);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime21.getFields();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusSeconds(9624412);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        java.util.Date date27 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromDateFields(date27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime33 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        java.util.Date date38 = localDateTime37.toDate();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        int int44 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusSeconds((int) (byte) 100);
        int int54 = localDateTime51.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        boolean boolean57 = localDateTime40.isSupported(dateTimeFieldType56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime28.withField(dateTimeFieldType56, 563);
        int int60 = localDateTime24.indexOf(dateTimeFieldType56);
        int int61 = localDateTime19.get(dateTimeFieldType56);
        boolean boolean62 = localDateTime9.isSupported(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2532 + "'", int61 == 2532);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime20.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfFloorCopy();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumTextLength(locale7);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withSecondOfMinute(534);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 534 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy(224);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "509" + "'", str6, "509");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = property7.roundHalfFloorCopy();
        long long23 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property7.setCopy(19);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(1606272019785L, chronology26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(1606272040300L, chronology26);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYearOfCentury(682);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 682 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606272304461L + "'", long21 == 1606272304461L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy((long) 378);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(9699930);
        int int8 = localDateTime7.getYearOfCentury();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 78 + "'", int8 == 78);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(28608032000L);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.Interval interval9 = property4.toInterval();
        boolean boolean10 = localDateTime1.equals((java.lang.Object) property4);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDateTime1.toDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withMillisOfSecond(9887796);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9887796 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "699" + "'", str8, "699");
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        int int14 = localDateTime13.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
            int int10 = localDateTime1.getValue(9672625);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9672625");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minus(readableDuration8);
        int int10 = localDateTime1.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withTime(30, 795, 181, 9765981);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusSeconds(204);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        int int19 = localDateTime18.getSecondOfMinute();
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean22 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime16);
        int int23 = localDateTime13.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.minusHours(560);
        int int26 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 28 + "'", int23 == 28);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(204);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDateTime0.toString(dateTimeFormatter6);
        int int8 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withYear(9645528);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant23 = null;
        long long24 = property22.getDifferenceAsLong(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(100L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        long long35 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) 0, chronology40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.plusSeconds(204);
        int int47 = localDateTime42.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = localDateTime42.toString(dateTimeFormatter48);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime41.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime42.withMillisOfDay(36);
        java.util.Date date53 = localDateTime42.toDate();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime42.withCenturyOfEra(682);
        org.joda.time.LocalDateTime.Property property56 = localDateTime42.year();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime58.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime();
        boolean boolean65 = localDateTime63.isBefore((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime70 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        java.util.Date date75 = localDateTime74.toDate();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYearOfCentury(1);
        int int81 = localDateTime74.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime72.withFields((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime(dateTimeZone85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = property87.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plusSeconds((int) (byte) 100);
        int int91 = localDateTime88.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property92 = localDateTime88.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property92.getFieldType();
        boolean boolean94 = localDateTime77.isSupported(dateTimeFieldType93);
        boolean boolean95 = localDateTime64.isSupported(dateTimeFieldType93);
        int int96 = localDateTime42.indexOf(dateTimeFieldType93);
        boolean boolean97 = localDateTime0.equals((java.lang.Object) dateTimeFieldType93);
        org.joda.time.LocalDateTime.Property property98 = localDateTime0.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 963 + "'", int5 == 963);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T02:45:04.963" + "'", str7, "2020-11-25T02:45:04.963");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 963 + "'", int8 == 963);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11651L + "'", long35 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1606272304863L + "'", long36 == 1606272304863L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 964 + "'", int47 == 964);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2020-11-25T02:45:04.964" + "'", str49, "2020-11-25T02:45:04.964");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(date53);
// flaky:         org.junit.Assert.assertEquals(date53.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed Nov 25 02:45:04 UTC 2020");
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(property98);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.joda.time.LocalDateTime localDateTime21 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime22.getFields();
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
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 2);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.LocalDateTime localDateTime19 = property16.addToCopy((long) 'a');
        java.lang.String str20 = localDateTime19.toString();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumTextLength(locale26);
        int int28 = property24.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        long long37 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withCenturyOfEra((int) (byte) 10);
        java.lang.String str43 = localDateTime39.toString("116");
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withMillisOfDay(100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime56 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        java.util.Date date61 = localDateTime60.toDate();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYearOfCentury(1);
        int int67 = localDateTime60.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime58.withFields((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = property73.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusSeconds((int) (byte) 100);
        int int77 = localDateTime74.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property78 = localDateTime74.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property78.getFieldType();
        boolean boolean80 = localDateTime63.isSupported(dateTimeFieldType79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime51.withField(dateTimeFieldType79, (int) 'a');
        boolean boolean83 = localDateTime39.isSupported(dateTimeFieldType79);
        int int84 = localDateTime19.indexOf(dateTimeFieldType79);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = localDateTime19.toDateTime(dateTimeZone86);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5" + "'", str17, "5");
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T02:46:42.232" + "'", str20, "2020-11-25T02:46:42.232");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "116" + "'", str43, "116");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed Nov 25 02:45:05 UTC 2020");
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(dateTime87);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfSecond();
        long long5 = property4.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        int int7 = property4.getMinimumValue();
        int int8 = property4.getMinimumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 460 + "'", int2 == 460);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, chronology1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readablePeriod4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusSeconds(204);
        int int8 = localDateTime3.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime3.toString(dateTimeFormatter9);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withMillisOfDay(36);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.withYearOfCentury((int) (byte) 1);
        java.lang.String str16 = localDateTime15.toString();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.dayOfYear();
        int int18 = property17.getMinimumValueOverall();
        boolean boolean19 = property17.isLeap();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 510 + "'", int8 == 510);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:45:05.510" + "'", str10, "2020-11-25T02:45:05.510");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2001-11-25T02:45:05.510" + "'", str16, "2001-11-25T02:45:05.510");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = property7.roundHalfFloorCopy();
        long long23 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property7.setCopy(19);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 36, chronology26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 51, chronology26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear(357);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusHours((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = localDateTime31.withDate(535, 2922789, 9760490);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606272305543L + "'", long21 == 1606272305543L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        java.lang.String str6 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths(9642412);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readableDuration11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusHours(197);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDayOfWeek(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minus(readableDuration8);
        java.util.Date date10 = localDateTime9.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withWeekOfWeekyear(921);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 921 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 02:45:05 UTC 2020");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(9616690);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(204);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusWeeks(26);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property26 = localDateTime18.hourOfDay();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalDateTime localDateTime28 = property26.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        int int37 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) (byte) 100);
        int int46 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime39.withField(dateTimeFieldType48, 10);
        int int51 = property26.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        boolean boolean52 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 02:45:06 UTC 2020");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:45:06 UTC 2020");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        org.joda.time.LocalDateTime localDateTime15 = property5.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(7);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusMonths(712);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = property7.roundHalfFloorCopy();
        long long23 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime25 = property7.setCopy(19);
        org.joda.time.Chronology chronology26 = localDateTime25.getChronology();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 36, chronology26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 51, chronology26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear(357);
        int int32 = localDateTime29.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withDayOfYear((int) 'a');
        int int40 = localDateTime34.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime34.minus(readablePeriod41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMonths(878);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfYear();
        int int46 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = localDateTime29.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1606272306198L + "'", long21 == 1606272306198L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 51 + "'", int32 == 51);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(9624412);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusYears(926);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant17 = null;
        long long18 = property16.getDifferenceAsLong(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(100L);
        int int27 = localDateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime();
        long long29 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        long long30 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDateTime localDateTime31 = property16.roundHalfFloorCopy();
        long long32 = property16.remainder();
        org.joda.time.LocalDateTime localDateTime34 = property16.setCopy(19);
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, chronology35);
        boolean boolean37 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        java.util.Date date40 = localDateTime39.toDate();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfCentury(1);
        int int46 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusYears((int) (byte) 10);
        int int49 = localDateTime48.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.secondOfMinute();
        java.lang.String str53 = property52.getAsString();
        org.joda.time.DurationField durationField54 = property52.getDurationField();
        org.joda.time.LocalDateTime localDateTime55 = property52.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime57 = property56.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = property60.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime62 = property60.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(dateTimeZone65);
        java.util.Date date67 = localDateTime66.toDate();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withYearOfCentury(1);
        int int73 = localDateTime66.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime64.withFields((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(dateTimeZone77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime80 = property79.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.plusSeconds((int) (byte) 100);
        int int83 = localDateTime80.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property84 = localDateTime80.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = property84.getFieldType();
        boolean boolean86 = localDateTime69.isSupported(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime57.property(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property88 = localDateTime48.property(dateTimeFieldType85);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime8.withField(dateTimeFieldType85, 9646239);
        org.joda.time.LocalDateTime.Property property91 = localDateTime6.property(dateTimeFieldType85);
        org.joda.time.LocalDateTime localDateTime93 = localDateTime6.minusSeconds(696);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11651L + "'", long29 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1606272306377L + "'", long30 == 1606272306377L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Wed Nov 25 02:45:06 UTC 2020");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2030 + "'", int49 == 2030);
        org.junit.Assert.assertNotNull(property52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "6" + "'", str53, "6");
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(date67);
// flaky:         org.junit.Assert.assertEquals(date67.toString(), "Wed Nov 25 02:45:06 UTC 2020");
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(dateTimeFieldType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(localDateTime93);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property7.addToCopy((long) 52);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusHours(901);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDateTime11.toString(dateTimeFormatter14);
        int[] intArray16 = localDateTime11.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-04-06T02:45:06.921" + "'", str15, "2020-04-06T02:45:06.921");
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2020, 4, 6, 9906921]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(204);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDateTime0.toString(dateTimeFormatter6);
        int int8 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withYear(9645528);
        int int11 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusSeconds(9624412);
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withMillisOfDay(181);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withDurationAdded(readableDuration20, 9658357);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime10.minuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 935 + "'", int5 == 935);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T02:45:06.935" + "'", str7, "2020-11-25T02:45:06.935");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 935 + "'", int8 == 935);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 47 + "'", int11 == 47);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withWeekyear(329);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = localDateTime24.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = localDateTime24.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -965 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606272306935L + "'", long16 == 1606272306935L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.minusMinutes(9739766);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.minusSeconds(9865418);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        java.util.Locale locale11 = null;
        org.joda.time.LocalDateTime localDateTime12 = property2.setCopy("12", locale11);
        org.joda.time.LocalDateTime localDateTime14 = property2.addToCopy(100);
        org.joda.time.LocalDateTime localDateTime16 = property2.addToCopy(10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYearOfEra(848);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime18.getFieldType(162);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 162");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "259" + "'", str6, "259");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "259" + "'", str9, "259");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (short) 0, chronology2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusSeconds(204);
        int int9 = localDateTime4.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime4.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime4.withMillisOfDay(36);
        java.util.Date date15 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.withCenturyOfEra(682);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant22 = null;
        long long23 = property21.getDifferenceAsLong(readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(100L);
        int int32 = localDateTime31.getSecondOfMinute();
        org.joda.time.DateTime dateTime33 = localDateTime31.toDateTime();
        long long34 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        long long35 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDateTime localDateTime36 = property21.roundHalfFloorCopy();
        long long37 = property21.remainder();
        org.joda.time.LocalDateTime localDateTime39 = property21.setCopy(19);
        org.joda.time.Chronology chronology40 = localDateTime39.getChronology();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) (-6940L), chronology40);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, chronology40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 197, chronology40);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 305 + "'", int9 == 305);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T02:45:07.305" + "'", str11, "2020-11-25T02:45:07.305");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:45:07 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11651L + "'", long34 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1606272307206L + "'", long35 == 1606272307206L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        long long12 = property11.remainder();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDurationAdded(readableDuration8, 9646239);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime28 = property13.roundHalfFloorCopy();
        long long29 = property13.remainder();
        org.joda.time.LocalDateTime localDateTime31 = property13.setCopy(19);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withWeekyear(329);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = localDateTime35.getFieldTypes();
        boolean boolean37 = localDateTime5.isEqual((org.joda.time.ReadablePartial) localDateTime35);
        java.lang.Class<?> wildcardClass38 = localDateTime5.getClass();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7" + "'", str3, "7");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T02:46:44.515" + "'", str6, "2020-11-25T02:46:44.515");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606272307415L + "'", long27 == 1606272307415L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime28 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property13.withMaximumValue();
        int int30 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = localDateTime29.getFieldTypes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = localDateTime29.toString(dateTimeFormatter32);
        int int34 = localDateTime29.getWeekyear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:07 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606272307506L + "'", long27 == 1606272307506L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2020-11-25T02:45:07.999" + "'", str33, "2020-11-25T02:45:07.999");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2020 + "'", int34 == 2020);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.plusHours(3);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = localDateTime22.getFields();
        int int24 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime();
        long long11 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant15 = null;
        long long16 = property14.getDifferenceAsLong(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime();
        long long27 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        long long28 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        int int29 = property6.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDateTime localDateTime30 = property6.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.secondOfMinute();
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
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        long long52 = property36.remainder();
        org.joda.time.LocalDateTime localDateTime54 = property36.setCopy(19);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime32, chronology55);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now(chronology55);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime30, chronology55);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 9642412, chronology55);
        int int60 = localDateTime59.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.minusYears(0);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.hourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = property71.addWrapFieldToCopy((int) '4');
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withDurationAdded(readableDuration74, 2);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime59.withFields((org.joda.time.ReadablePartial) localDateTime73);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime77.withWeekyear(292278993);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11651L + "'", long11 == 11651L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11651L + "'", long27 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1606272307759L + "'", long28 == 1606272307759L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606272307759L + "'", long50 == 1606272307759L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 40 + "'", int60 == 40);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(localDateTime79);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        java.lang.String str9 = property7.getAsShortText();
        org.joda.time.Interval interval10 = property7.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020" + "'", str9, "2020");
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfSecond();
        long long5 = property4.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        int int7 = localDateTime6.size();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350 + "'", int2 == 350);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy(1);
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        java.lang.String str6 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property2.setCopy("9724384");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9724384 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusSeconds(2020);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:45:08 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        long long19 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDateTime localDateTime30 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        boolean boolean33 = localDateTime8.equals((java.lang.Object) property32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime.Property property35 = localDateTime8.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11651L + "'", long19 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-6940L) + "'", long29 == (-6940L));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 2);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.LocalDateTime localDateTime19 = property16.addToCopy((long) 'a');
        java.lang.String str20 = localDateTime19.toString();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumTextLength(locale26);
        int int28 = property24.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        long long37 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withCenturyOfEra((int) (byte) 10);
        java.lang.String str43 = localDateTime39.toString("116");
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withMillisOfDay(100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime56 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        java.util.Date date61 = localDateTime60.toDate();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(dateTimeZone62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withYearOfCentury(1);
        int int67 = localDateTime60.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime58.withFields((org.joda.time.ReadablePartial) localDateTime63);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = property73.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.plusSeconds((int) (byte) 100);
        int int77 = localDateTime74.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property78 = localDateTime74.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property78.getFieldType();
        boolean boolean80 = localDateTime63.isSupported(dateTimeFieldType79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime51.withField(dateTimeFieldType79, (int) 'a');
        boolean boolean83 = localDateTime39.isSupported(dateTimeFieldType79);
        int int84 = localDateTime19.indexOf(dateTimeFieldType79);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property86 = localDateTime19.centuryOfEra();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8" + "'", str17, "8");
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2020-11-25T02:46:45.874" + "'", str20, "2020-11-25T02:46:45.874");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "116" + "'", str43, "116");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Wed Nov 25 02:45:08 UTC 2020");
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(204);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        java.util.Date date8 = localDateTime7.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds((int) (byte) 100);
        int int23 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime16.withField(dateTimeFieldType25, 10);
        int int28 = localDateTime0.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.secondOfMinute();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.DurationField durationField33 = property31.getDurationField();
        org.joda.time.LocalDateTime localDateTime34 = property31.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.roundFloorCopy();
        int int38 = property35.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.weekOfWeekyear();
        int int50 = localDateTime46.getDayOfMonth();
        int int51 = property35.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        boolean boolean52 = localDateTime0.equals((java.lang.Object) property35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime54 = localDateTime0.withDayOfMonth(448);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 448 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 180 + "'", int5 == 180);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:45:09 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "9" + "'", str32, "9");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 25 + "'", int50 == 25);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute(39);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays((int) (short) 0);
        int int19 = localDateTime16.getMinuteOfHour();
        boolean boolean20 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime8.minusMonths(50);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime8.minusMinutes(800);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant32 = null;
        long long33 = property31.getDifferenceAsLong(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(100L);
        int int42 = localDateTime41.getSecondOfMinute();
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime();
        long long44 = property39.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        long long45 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime46 = property31.roundHalfFloorCopy();
        long long47 = property31.remainder();
        org.joda.time.LocalDateTime localDateTime49 = property31.setCopy(19);
        org.joda.time.Chronology chronology50 = localDateTime49.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime27, chronology50);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 10, chronology50);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime8.minusYears(176);
        int int57 = localDateTime8.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 11651L + "'", long44 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1606272309202L + "'", long45 == 1606272309202L);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20 + "'", int57 == 20);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        int int14 = localDateTime13.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYear(0);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        int int18 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.plusWeeks(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        long long19 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalDateTime localDateTime30 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        boolean boolean33 = localDateTime8.equals((java.lang.Object) property32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime8.plusSeconds(9681625);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime8.plusMinutes(9642412);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11651L + "'", long19 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-6940L) + "'", long29 == (-6940L));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundFloorCopy();
        int int9 = property6.getMinimumValueOverall();
        java.util.Locale locale10 = null;
        int int11 = property6.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9" + "'", str3, "9");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.joda.time.LocalDateTime localDateTime15 = property5.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks(7);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy(9754118);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property9.getDifferenceAsLong(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        long long22 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        long long23 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDateTime localDateTime24 = property9.roundHalfFloorCopy();
        long long25 = property9.remainder();
        org.joda.time.LocalDateTime localDateTime27 = property9.setCopy(19);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime5, chronology28);
        boolean boolean30 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime1.minusHours(9646239);
        org.joda.time.LocalDateTime.Property property34 = localDateTime1.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime1.minus(readablePeriod35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime1.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 11651L + "'", long22 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1606272310221L + "'", long23 == 1606272310221L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(chronology28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readablePeriod13);
        int int15 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusMinutes(2020);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(635);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 635 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes(890);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMinutes(99);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMinuteOfHour(243);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 243 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property22.setCopy(37);
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime26 = property22.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606272311101L + "'", long16 == 1606272311101L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusMonths(86399999);
        int int5 = localDateTime4.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        java.util.Locale locale10 = null;
        int int11 = property8.getMaximumTextLength(locale10);
        org.joda.time.LocalDateTime localDateTime12 = property8.withMinimumValue();
        int int13 = localDateTime12.getEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plus(readablePeriod16);
        boolean boolean18 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2020-11-25T02:42:24.513");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusSeconds(9754118);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfDay(9660315);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        int int4 = localDateTime3.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, 38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = localDateTime3.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -271 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.joda.time.LocalDateTime localDateTime14 = property5.withMaximumValue();
        int int15 = property5.get();
        org.joda.time.LocalDateTime localDateTime17 = property5.addToCopy((int) '#');
        org.joda.time.DurationField durationField18 = property5.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        int int8 = property6.getMinimumValue();
        java.util.Locale locale9 = null;
        int int10 = property6.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(100L);
        int int28 = localDateTime27.getSecondOfMinute();
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime();
        long long30 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime31 = property25.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minus(readablePeriod33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(100L);
        int int37 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        long long40 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.LocalDateTime localDateTime41 = property25.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime42 = property25.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        boolean boolean44 = localDateTime19.equals((java.lang.Object) property43);
        java.lang.String str45 = property43.getAsText();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        boolean boolean54 = localDateTime52.isBefore((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property57 = localDateTime52.yearOfEra();
        org.joda.time.DurationField durationField58 = property57.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime67 = localDateTime60.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant71 = null;
        long long72 = property70.getDifferenceAsLong(readableInstant71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime74.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(100L);
        int int81 = localDateTime80.getSecondOfMinute();
        org.joda.time.DateTime dateTime82 = localDateTime80.toDateTime();
        long long83 = property78.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime82);
        long long84 = property70.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime85 = localDateTime67.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        int int86 = property57.getDifference((org.joda.time.ReadableInstant) dateTime82);
        int int87 = property43.getDifference((org.joda.time.ReadableInstant) dateTime82);
        int int88 = property6.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12" + "'", str3, "12");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11651L + "'", long30 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-6940L) + "'", long40 == (-6940L));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2001" + "'", str45, "2001");
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNull(durationField58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 11651L + "'", long83 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1606272312022L + "'", long84 == 1606272312022L);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 50 + "'", int86 == 50);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 31 + "'", int87 == 31);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(100L);
        int int17 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = localDateTime16.toDateTime();
        long long19 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = property14.roundCeilingCopy();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property14.getAsText(locale21);
        org.joda.time.LocalDateTime localDateTime24 = property14.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusWeeks(7);
        int int27 = localDateTime26.getSecondOfMinute();
        int int28 = localDateTime26.getSecondOfMinute();
        boolean boolean29 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime26);
        int int30 = localDateTime8.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12" + "'", str3, "12");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T02:46:49.830" + "'", str6, "2020-11-25T02:46:49.830");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 11651L + "'", long19 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Sunday" + "'", str22, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }
}
